package kr.co.softcampus.controller;


import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");
		String data2 = request.getParameter("data2");
		System.out.println("[data2]"+data2);
		
		request.setAttribute("data2", data2);
		return "test1"; 
	}
	@GetMapping("/test3")
	public String test3(Model model){
		model.addAttribute("data1",100);
		model.addAttribute("data2","당");
		
		return "test3"; 
	}
}
