package com.ty.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.ty.entity.Book;
import com.ty.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
//	@GetMapping("/book")
//	public ModelAndView getBookRecord(@RequestParam("id") int id) {
//		ModelAndView mav= new ModelAndView();
//		
//		System.out.println("ID : "+ id);
//		Optional<Book> findbyID=repo.findById(id);
//		if(findbyID.isPresent()) {
//			System.out.println("Book ID: " + findbyID);
//			Book b=findbyID.get();
//			mav.addObject("book", b);
//			mav.setViewName("index");
//		}
//		return mav;
//	}
//	                          OR
	@GetMapping("/book")
	public String getBookRecord(@RequestParam("id") int id, Model model) {
		
		Optional<Book> findbyID=repo.findById(id);
		if(findbyID.isPresent()) {
			Book bookObj=findbyID.get();
			model.addAttribute("book", bookObj);
		}
		return "index";
	}
}
