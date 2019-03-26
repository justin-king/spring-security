package com.xm.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/index.action")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/failure.action")
	public String failure(){
		System.out.println("failure");
		return "failure";
	}
	
}
