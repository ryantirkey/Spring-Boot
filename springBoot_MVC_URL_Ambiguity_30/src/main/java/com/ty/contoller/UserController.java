package com.ty.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user") // we can use @RequestMapping to specify which controller has control 
// this is class level as well as method level annotation
// before spring 2.5 this was used for url mapping for methods as well but later @Get and @Post and other are introduced
public class UserController {
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		String msg="Good Night";
		model.addAttribute("msg", msg);
		return "index";
	}
	
//	@GetMapping(value = {"/welcome","/greet"}) // we cam map one method to multiple url using value attribute with array 
//	public String getWelMsg(Model model) {
//		String msg="Good Night";
//		model.addAttribute("msg", msg);
//		return "index";
//	}

}
