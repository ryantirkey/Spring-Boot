package com.ty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	@GetMapping("/")
	public String showMsg(Model model) {
		model.addAttribute("msg", "This is Consistency");
		return "index";
	}

}
