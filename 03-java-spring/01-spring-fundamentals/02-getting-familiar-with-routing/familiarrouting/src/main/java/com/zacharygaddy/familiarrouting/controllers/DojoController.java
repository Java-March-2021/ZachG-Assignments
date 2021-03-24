package com.zacharygaddy.familiarrouting.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

		@RequestMapping("/dojo")
		public String dojo() {
			return "The Dojo is awesome";
		}
		@RequestMapping("/dojo/{name}")
		public String dojoOption(@PathVariable("name") String name) {
			switch(name) {
			case "burbank":
				return "Burbank Dojo is located in Southern California";
			case "san-jose":	
				return "SJ dojo is the headquarters";
			default:
				return String.format("%s is pretty sweet!", name);
			}
		}
}
