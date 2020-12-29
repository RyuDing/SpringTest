package kr.co.softcampus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request,HttpServletResponse response) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3[] = request.getParameterValues("data3");
		
		System.out.println("[data1]"+data1);
		System.out.println("[data2]"+data2);
		for(String a : data3) {
			System.out.println("[data3]"+a);
		}
		System.out.println("-------------------------");
		return "result";
	}
	
	@PostMapping("/test2")
	public String test2(HttpServletRequest request,HttpServletResponse response) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3[] = request.getParameterValues("data3");
		
		System.out.println("[data1]"+data1);
		System.out.println("[data2]"+data2);
		for(String a : data3) {
			System.out.println("[data3]"+a);
		}
		System.out.println("-------------------------");
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(WebRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3[] = request.getParameterValues("data3");
		
		System.out.println("[data1]"+data1);
		System.out.println("[data2]"+data2);
		for(String a : data3) {
			System.out.println("[data3]"+a);
		}
		System.out.println("-------------------------");
		return "result";
	}
	
	@GetMapping("/test4/{data1}/{data2}/{data3}")
	public String test4(@PathVariable String data1,
						@PathVariable String data2,
						@PathVariable String data3) {
		System.out.println("[data1]"+data1);
		System.out.println("[data2]"+data2);
		System.out.println("[data3]"+data3);
		return "result";
	}
	@GetMapping("/test5")
	public String test5(@RequestParam String data1
						,@RequestParam String data2
						,@RequestParam String[] data3) {
		System.out.println("[data1]"+data1);
		System.out.println("[data2]"+data2);
		for(String a : data3) {
			System.out.println("[data3]"+a);
		}
		return "result";
	}
	
	@GetMapping("/test6")
	public String test6(@RequestParam( value = "data1") String value1
						,@RequestParam( value = "data2") String value2
						,@RequestParam( value = "data3") String[] value3) {
		System.out.println("[value1]"+value1);
		System.out.println("[value2]"+value2);
		for(String a : value3) {
			System.out.println("[value3]"+a);
		}
		return "result";
	}
	
	// data1이 넘어오지 않았을 때 : null 주입
	// data2가 넘어오지 않았을 때 : default로 설정한 값을 주입함.
	@GetMapping("/test7")
	public String test7(@RequestParam(required = false) String data1
						,@RequestParam(required = false) String data2
						,@RequestParam(defaultValue = "") String data3) {
		System.out.println("[data1]"+data1);
		System.out.println("[data2]"+data2);
		System.out.println("[data3]"+data3);
		return "result";
	}
}
