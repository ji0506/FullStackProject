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
		if (request.getSession().getAttribute("userId") == null) {
		//return "/member/main";
		}
		
		String action = request.getPathInfo();

		try {
			if (action == null) {

				List<Seat> list = seatservice.getSeatList(); // �¼� ���� �������� seatDao�ε��� select all
				model.addAttribute("list", list); // VIEW�� �¼� ���� ����
				List<Board> viewlist = boardservice.getBoardViewList(); // �ֽű� �������� boarddao selsect Main viewlist
				model.addAttribute("viewlist", viewlist); // �ֽű� ����
				Map<String, Integer> statis = seatservice.getSeatCount();//seatDao slelctSeatcoun
				model.addAttribute("statis", statis);

				return "/main/main";

			} else if ("/main.do".equals(action)) {
				List<Seat> list = seatservice.getSeatList();// �¼� ���� ��������
				model.addAttribute("list", list);// VIEW�� �¼� ���� ����

				List<Board> viewlist = boardservice.getBoardViewList(); // �ֽű� ��������
				model.addAttribute("viewlist", viewlist); // �ֽű� ����
				Map<String, Integer> statis = seatservice.getSeatCount(); // �¼� ī��Ʈ ��������
				model.addAttribute("statis", statis); // �¼� ����Ʈ ����
				return "/main/main";
				
			} else if (action.equals("/change.do")) {

				PrintWriter out = response.getWriter();

				// �¼� ���� ����
				Seat seat = new Seat();
				//�̰� vo����Ŷ� �Ű杢�ʿ䰡����
				String userId = request.getParameter("userId");
				//���ʵ� ���� �պ����ҵ� getparameter���ʿ������������
				seat.setUserId(userId);
				seat.setSeatNo(request.getParameter("SeatNo"));
				seat.setSeatComment("02");

				// ����
				seatservice.SeatUpdate(seat);//seatDAo update
				
				out.print("success");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/main/main";
	}

}
