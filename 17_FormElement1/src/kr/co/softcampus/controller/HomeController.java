package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	// 첫화면 세팅
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String home() {
		System.out.println("[GET] home() ");
		return "index";
	}
	
}