package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
@RequestMapping(method=RequestMethod.GET)
public ModelAndView hello() {
	ModelAndView m=new ModelAndView("welcome");
	m.addObject("message", "HELLO SPRING");
	return m;
	
}
}
