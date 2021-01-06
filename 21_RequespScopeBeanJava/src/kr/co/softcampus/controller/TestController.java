package kr.co.softcampus.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.softcampus.beans.DataBean1;
import kr.co.softcampus.beans.DataBean2;
import kr.co.softcampus.beans.DataBean3;
import kr.co.softcampus.beans.DataBean4;

@Controller
public class TestController {
	public static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	@Lazy
	DataBean1 requestBean1;
	
	@Resource(name = "requestBean2")
	@Lazy
	DataBean2 requestBean2;
	
	@Autowired
	@Lazy
	DataBean3 requestBean3;

	@Resource(name = "requestBean4")
	@Lazy
	DataBean4 requestBean4;
	
	@RequestMapping(value="/test1", method = {RequestMethod.GET,RequestMethod.POST})
	public String test1() {
		requestBean1.setData1("문자열1");
		requestBean1.setData2("문자열2");
		
		requestBean2.setData3("문자열3");
		requestBean2.setData4("문자열4");
		
		requestBean3.setData5("문자열5");
		requestBean3.setData6("문자열6");

		requestBean4.setData7("문자열7");
		requestBean4.setData8("문자열8");
		
		return "forward:/result1";
	}
	
	@RequestMapping(value="/result1", method = {RequestMethod.GET,RequestMethod.POST})
	public String result1(Model model) {
		model.addAttribute("requestBean1",requestBean1);
		model.addAttribute("requestBean2",requestBean2);
		model.addAttribute("requestBean3",requestBean3);
		model.addAttribute("requestBean4",requestBean4);
		
		return "result1";
	}
}