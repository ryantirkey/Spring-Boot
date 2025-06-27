package com.ty.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ty.binding.Student;
import com.ty.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String loadingPage(Model model) {
		
//		Student s= new Student();
//		s.setName("ryan");   //I can set data in student object and then add it in model to populate form with data from controller
//		model.addAttribute("student", s);
		
		/*List<String> courseOption= new ArrayList<String>(); 
		courseOption.add("Java");
		courseOption.add("Python");
		courseOption.add("ReactJs"); */
		
//		model.addAttribute("courses", service.getCourse() /*courseOption*/ /* OR Arrays.asList("Java", "Python", "ReactJs")*/);
		// we can also create a method for list of items and then call it.
//		model.addAttribute("timings", service.getTimings());
		
		init(model);
		
		return "index";
	}
	
	@PostMapping("/save")
	public String saveData(Student st,Model model) {
		
		System.out.println(st); // to display form details in console
		
		boolean status=service.saveData(st);
		if(status) {
			
		model.addAttribute("msg", "Data saved Successfull"); // to send data from controller to UI
		}
//		Receiving error becoz when we submit it is returning index page again 
//      but we had set values for course and timings fields when page first time load that why it is unable to find value again,
//		to resolve that we need to set modelattribute again leading in repeated code. 
//		we can see code is repeated in loadingpage()  and saveData() for better approach is to create a function/method and place all repeated code there and call it.
		
//		Student s= new Student();
//		model.addAttribute("student", s);
//		model.addAttribute("courses", service.getCourse());
//		model.addAttribute("timings", service.getTimings());
		
		init(model);

		
		return "index";
	}
	
	private void init(Model model) {
//		Student s= new Student();
		model.addAttribute("student", new Student() /*OR s*/);
		model.addAttribute("courses", service.getCourse());
		model.addAttribute("timings", service.getTimings());
	}
	

}
