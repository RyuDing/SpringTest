package kr.co.softcampus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softcmpus.beans.DataBean;

@Controller
public class TestController {
	public static Logger logger = LoggerFactory.getLogger(TestController.class);
	// 자동 주입
	@PostMapping("/test1")
	// ModelAttribute는 생략 가능.
	public String test1(@ModelAttribute(name = "zz") DataBean bean1) { // DataBean -> dataBean으로 jsp에 전달됨.
		System.out.println("[data1]"+bean1.getData1());
		System.out.println("[data2]"+bean1.getData2());
		
		return "test1"; 
	}
}