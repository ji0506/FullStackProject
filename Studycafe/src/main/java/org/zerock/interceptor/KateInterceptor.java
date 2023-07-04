package org.zerock.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.zerock.domain.Kategorie;
import org.zerock.service.BoardService;

public class KateInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private BoardService brdService;	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		try {
			
			List<Kategorie> katlist  = brdService.getMenu();
			request.setAttribute("katlist", katlist);
			String strKatNo = request.getParameter("katNo");
			int katNo = -1;
			if(strKatNo != null) {
				katNo = Integer.parseInt(strKatNo);
				request.setAttribute("katTargetNo", katNo);
			}
			
				
			for(Kategorie kat : katlist)
				if(katNo == kat.getKateNo())
					request.setAttribute("katTargetName", kat.getKateName());

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

}
