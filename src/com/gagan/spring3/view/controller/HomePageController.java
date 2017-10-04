package com.gagan.spring3.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HomePageController {

	/* 
	 * Default method.
	 * This handler method also uses the @RequestMapping annotation, but in this case lacks a URL
	 * value. Since the class level uses the /* URL wildcard, this handler method is executed as a catchall.
	 * So any URL request (e.g., /randomroute or /StaticPage/abcdefg) triggers this method.
	 * But it will not responde to /StaticPage
	 * @RequestMapping also lacks method type. Since the default method type is RequestMethod.GET
	**/
	@RequestMapping
	public String defaultCall(){
		return "home";
	}
	
	@RequestMapping(value = {"Home", "Locale"})
	public String homePage(){
		return "home";
	}
	
	/*
	 * Default method type is RequestMethod.GET
	 */
	@RequestMapping(value = "AboutUs")
	public String aboutUs(){
		return "aboutUs";
	}

	@RequestMapping(value = "Contact", method = RequestMethod.GET)
	public String contact(){
		return "contact";
	}
}
