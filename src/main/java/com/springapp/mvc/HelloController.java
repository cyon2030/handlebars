package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("hello", "Hello world!");
		return mav;
	}

}