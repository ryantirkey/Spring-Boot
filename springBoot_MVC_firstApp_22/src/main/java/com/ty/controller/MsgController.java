package com.ty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView modelAndView= new ModelAndView();
		
		modelAndView.addObject("msg", "!!>>Welcome Buddies<<!!");
		modelAndView.setViewName("message");
		return modelAndView;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg","How are you..!!");
		mav.setViewName("message");
		return mav;
	}

}
