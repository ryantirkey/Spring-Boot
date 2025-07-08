package com.ty.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	private Logger logger= LoggerFactory.getLogger(MsgController.class);
	
	@GetMapping("/")
	public String errorMsg(Model model) {
//		int a= 10/0;
		String s= null;
		s.length();
		model.addAttribute("msg", "Everything works fine");
		return "index";
	}
	
//  when we define  @ExceptionHandler within same controller it becomes Local Exception handling
// To make this as a Global Exception Handling we follow AOP. we write primart logic and secondary loogic separate
	
//	@ExceptionHandler(value = ArithmeticException.class)// we can write Exception.class super most exception if we want to handle all exception
//	public String handleException(ArithmeticException ae) { // but if we want specific exception to be handled we need write that exception only 
//		String msg= ae.getMessage();
//		logger.error(msg);
//		return "errorpage";
//	}

}
