package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softcmpus.beans.DataBean;

@Controller
public class TestController {
	
	// 자동 주입
	@PostMapping("/test1")
	public String test1(@ModelAttribute DataBean bean1) {
		System.out.println("[data1]"+bean1.getData1());
		System.out.println("[data2]"+bean1.getData2());
		
		return "test1"; 
	}
	
}
