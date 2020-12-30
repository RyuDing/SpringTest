package kr.co.softcampus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import kr.co.softcmpus.beans.DataBean;

@Controller
public class TestController {
	public static Logger logger = LoggerFactory.getLogger(TestController.class);
	@GetMapping("/test1")
	public String test1(@ModelAttribute(name = "DataBean") DataBean bean) {
		bean.setA1("data1");
		bean.setA2("data2");
		bean.setA3("password123!");
		bean.setA4("data4");
		return "test1";
	}
}