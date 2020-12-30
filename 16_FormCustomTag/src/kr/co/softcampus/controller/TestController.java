package kr.co.softcampus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import kr.co.softcmpus.beans.UserDataBean;

@Controller
public class TestController {
	public static Logger logger = LoggerFactory.getLogger(TestController.class);
	@GetMapping("/test1")
	public String test1(@ModelAttribute("UserDataBean") UserDataBean bean) {
		
		bean.setUser_name("홍길동");
		bean.setUser_addr1("주소1 입니다. ");
		bean.setUser_addr2("주소2 입니다. ");
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(@ModelAttribute("UserDataBean") UserDataBean bean) {
		
		bean.setUser_name("홍길동");
		bean.setUser_pw("1234");
		bean.setUser_addr1("주소3 입니다. ");
		bean.setUser_addr2("주소4 입니다. ");
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(Model model) {
		UserDataBean bean = new UserDataBean();
		bean.setUser_name("홍길동");
		bean.setUser_pw("1234");
		bean.setUser_addr1("주소5 입니다. ");
		bean.setUser_addr2("주소6 입니다. ");
		
		model.addAttribute("test_user",bean);
		return "test3";
	}
}