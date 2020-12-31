package kr.co.softcampus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	public static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/test1")
	public String test1() {
		return "redirect:/sub1";
	}
	@GetMapping("/test2")
	public String test2() {
		return "forward:/sub1";
	}
	@GetMapping("/sub1")
	public String sub1() {
		return "sub1";
	}
}