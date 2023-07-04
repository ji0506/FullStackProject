package org.zerock.controller;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.Board;
import org.zerock.domain.Kategorie;
import org.zerock.domain.Seat;
import org.zerock.service.BoardService;
import org.zerock.service.KateService;
import org.zerock.service.SeatService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/main/*")
@AllArgsConstructor
public class MainController {

	@Autowired
	private KateService kateService;
	
	@Autowired
	private BoardService boardservice;
	
	@Autowired
	private SeatService seatservice;
	

	@RequestMapping("/main.do")
	public String main(Model model, HttpServletRequest request, HttpServletResponse response)throws Exception {
		System.out.println(request.getSession().getAttribute("userId"));
		if (request.getSession().getAttribute("userId") == null) {
		//return "/member/main";
		}
		
		List<Kategorie> katlist = kateService.getKateList(null);
		model.addAttribute("katlist", katlist);
		model.addAttribute("katTargetNo", 0);
		model.addAttribute("katTargetName", "Dashboard");
		System.out.println(katlist);
		String action = request.getPathInfo();

		try {
			if (action == null) {

				List<Seat> list = seatservice.getSeatList(); // 좌석 정보 가져오기 seatDao로들어가고 select all
				model.addAttribute("list", list); // VIEW에 좌석 정보 세팅
				List<Board> viewlist = boardservice.getBoardViewList(); // 최신글 가져오기 boarddao selsect Main viewlist
				model.addAttribute("viewlist", viewlist); // 최신글 세팅
				Map<String, Integer> statis = seatservice.getSeatCount();//seatDao slelctSeatcoun
				model.addAttribute("statis", statis);

				return "/main/main";

			} else if ("/main.do".equals(action)) {
				List<Seat> list = seatservice.getSeatList();// 좌석 정보 가져오기
				model.addAttribute("list", list);// VIEW에 좌석 정보 세팅

				List<Board> viewlist = boardservice.getBoardViewList(); // 최신글 가져오기
				model.addAttribute("viewlist", viewlist); // 최신글 세팅
				Map<String, Integer> statis = seatservice.getSeatCount(); // 좌석 카운트 가져오기
				model.addAttribute("statis", statis); // 좌석 가운트 세팅
				return "/main/main";
				
			} else if (action.equals("/change.do")) {

				PrintWriter out = response.getWriter();

				// 좌석 정보 세팅
				Seat seat = new Seat();
				//이건 vo만든거라서 신경씊필요가없고
				String userId = request.getParameter("userId");
				//이쪽도 조금 손봐야할듯 getparameter쓸필요없을꺼같은데
				seat.setUserId(userId);
				seat.setSeatNo(request.getParameter("SeatNo"));
				seat.setSeatComment("02");

				// 저장
				seatservice.SeatUpdate(seat);//seatDAo update
				
				out.print("success");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/main/main";
	}

}
