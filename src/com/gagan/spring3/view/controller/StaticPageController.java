package com.gagan.spring3.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/Static/*")
public class StaticPageController {

	@RequestMapping
	public String defaultCall(){
		return "home";
	}

	/*
	 *  Since the class level uses the /Static/ URL, "/" is not required in value attribute.
	 */
	@RequestMapping(value ="PictureGallery", method = RequestMethod.GET)
	public String picturesGallery(){
		return "pictureGallery";
	}
	
	@RequestMapping(value ="Map", method = RequestMethod.GET)
	public String map(){
		return "map";
	}

}
