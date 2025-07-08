package com.ty.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		String msg="You are Welcome";
		model.addAttribute("msg", msg);
		return "index";
	}
	
//	@GetMapping("/welcome") // we cannont have same Url pattern in two or more method it should be unique else it will give ambiguity
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		String msg="Good Evening";
		model.addAttribute("msg", msg);
		return "index";
	}
	
	@PostMapping("/greet") // Different Request tyoe can have same url pattern, by default springboot send Get request.
	public String getHellotMsg(Model model) {
		String msg="Hello Buddies..!!";
		model.addAttribute("msg", msg);
		return "index";
	}

}
