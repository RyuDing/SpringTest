package kr.co.softcampus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softcampus.beans.DataBean1;

@Controller
public class TestController {
	public static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("[test1 method()]");
		request.setAttribute("data1", "data1");
		return "redirect:/result1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("[test2 method()]");
		request.setAttribute("data1", "data1");
		return "forward:/result1";
	}
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("[result1 method()]");
		String data1 = (String) request.getAttribute("data1");
		String data2 = (String) request.getParameter("data2");
		System.out.println("[data1]"+data1);
		System.out.println("[data2]"+data2);
		
		request.setAttribute("data3", "data3");
		
		return "result1";
	}
	/////////////////////////////////////////////////////////////////
	/***************************************************************/
	/////////////////////////////////////////////////////////////////
	@GetMapping("/test3")
	public String test3(Model model) {
		
		model.addAttribute("data2","문자열2");
		
		return "forward:/result2";
	} 
	
	/* test3(Model model)에서 Model에 넣었을 경우 request 영역에 저장이 되기 때문에 Model은 전달이 되지 않음.
	 * So. HttpServletRequest로 전달을 받아야함. 
	@GetMapping("/result2")
	public String result2(Model model) {
		String data2 = (String)model.getAttribute("data2");
		
		System.out.println("[data2]"+data2);
		
		return "result2";
	}
	*/
	// 
	@GetMapping("/result2")	
	public String result2(HttpServletRequest request) {
		String data2 = (String)request.getAttribute("data2");
		
		System.out.println("[data2]"+data2);
		
		return "result2";
	}
	
	/////////////////////////////////////////////////////////////////
	/***************************************************************/
	/////////////////////////////////////////////////////////////////
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		mv.addObject("data3","문자열3");
		mv.setViewName("forward:/result3");
		return mv;
	}
	
	@RequestMapping(value="/result3" , method = {RequestMethod.GET, RequestMethod.POST})
	public String reesult3(HttpServletRequest request) {
		String data3 = (String)request.getAttribute("data3");
		System.out.println("[data3]"+data3);
		
		return "result3";
	}
	
	/////////////////////////////////////////////////////////////////
	/***************************************************************/
	/////////////////////////////////////////////////////////////////	
	@GetMapping("/test5")
	public String test5(Model model) {
		DataBean1 bean1 = new DataBean1();
		bean1.setData1("문자열3");
		bean1.setData2("문자열4");
		
		model.addAttribute("bean1",bean1);
		
		return "forward:/result4";
	}
	
	@GetMapping("/result4")
	public String result4(HttpServletRequest request) {
		DataBean1 bean1 = (DataBean1)request.getAttribute("bean1");
		System.out.println("[data1]"+bean1.getData1());
		System.out.println("[data2]"+bean1.getData2());
		return "result4";
	}
	/////////////////////////////////////////////////////////////////
	/***************************************************************/
	/////////////////////////////////////////////////////////////////
	// 자동주입되서 request 영역에 저장됨.
	@GetMapping("/test6")
	public String test6(@ModelAttribute(name = "DataBean1") DataBean1 bean1) { 
		
		return "forward:/result5";
		
	}
	
	@GetMapping("/result5")
	public String result5(HttpServletRequest request) {
		DataBean1 bean1 = (DataBean1)request.getAttribute("DataBean1");
		System.out.println("[data1]"+bean1.getData1());
		System.out.println("[data2]"+bean1.getData2());
		return "result5";
	}
	
	
	
	
	

}