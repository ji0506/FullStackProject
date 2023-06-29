package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.Kategorie;
import org.zerock.service.AdminService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/admin/*")
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	
	
	
//	@RequestMapping("/main.do")
//	public String list() {
//		
//		return "/notice/";
//	}

	@RequestMapping("/list.do")
	public String admin_list() {
		return "/notices/admin_list";
	}
	
	@GetMapping("/memberlist.do")
	public String listmembers(Model model) {
		
		
		model.addAttribute("list", service.getUserList());
		
		return "/member/listMembers";
	}
	
	@GetMapping("/kate.do")
	public String kate(Model model) {
		
		
		List<Kategorie> list =service.getKateList();
		model.addAttribute("list", list);
		return "/notices/kate";
	}
	
	@RequestMapping("/add.do")
	public String add() {
		return "redirect:/admin/list.do";
	}
	
	@RequestMapping("/katadd.do")
	public String kateadd() {
		return "redirect:/admin/kate.do";
	}
	
	@RequestMapping("/view.do")
	public String admin_view() {
		return "/notices/admin_view";
	}
	
	
	
	@RequestMapping("/remove2.do")
	public String remove2() {
		return "redirect:/admin/memberlist.do";
	}
	
	@RequestMapping("/remove3.do")
	public String remove3() {
		return "redirect:/admin/kate.do";
	}
	
	@RequestMapping("/katmod.do")
	public String katmod() {		//ajax 활용
		return "/admin/kate.do";	//?
	}
	
	@RequestMapping("/katsave.do")
	public String katsave() {
		return "redirect:/admin/kate.do";
	}
	
	@RequestMapping("/addReply.do")
	public String addReply() {
		return "";		//?
	}

}
