package com.zachgaddy.displaydate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

@Controller
public class DisplayDateController {

    @RequestMapping("/")
    public String index() {
        return "Dashboard.jsp";
    }
    
    @RequestMapping("/date")
    public String date(Model model) {
    		Date date = new Date();
    		model.addAttribute("date", date);
    		return "displayDate.jsp";
    	}
    
    @RequestMapping("/time")
    public String time(Model model) {
    	Date time = new Date();
    	model.addAttribute("time", time);
    	return "displayTime.jsp";
    }
    
   }




