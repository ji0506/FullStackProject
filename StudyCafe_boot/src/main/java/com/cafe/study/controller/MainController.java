package com.cafe.study.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/main/*")
@AllArgsConstructor
public class MainController {

	

	@RequestMapping("/main.do")
	public String main(Model model, HttpServletRequest request, HttpServletResponse response)throws Exception {

		/*
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
		}*/
		return "main/main";
	}

}