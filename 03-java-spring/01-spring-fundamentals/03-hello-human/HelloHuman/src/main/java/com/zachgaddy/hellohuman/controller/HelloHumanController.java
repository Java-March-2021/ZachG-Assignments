package com.zachgaddy.hellohuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloHumanController {
	
	@RequestMapping("/")
	public String index() {
		return "/default.jsp";
	}
	
	@RequestMapping("/{fname}{lname}")
	public String nameIndex(@PathVariable("fname") String fname, @PathVariable("lname") String lname) {
		return "/index.jsp";
		
	}

}
