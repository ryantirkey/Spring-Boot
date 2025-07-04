package com.ty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		String msg="You are Welcome";
		model.addAttribute("msg", msg);
		return "index";
	}
	
	@GetMapping("/greet")
	@ResponseBody
	public String getGreetMsg(Model model) {
		String msg="Good Evening";
		return msg;
	}
	// @ResponseBody is used to send response directly from controller, 
	// if I don't use this @ResponseBody controller will treat this return as a view name.
	// @ResponseBody is a  class level and method level annotation
	// if i use this at class level every method will return response where as at method level only method with which it is specified that method will only give response. 
	// @Controller + @ResponseBody = @RestController

}
