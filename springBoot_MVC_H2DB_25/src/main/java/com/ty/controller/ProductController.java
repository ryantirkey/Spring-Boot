package com.ty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ty.entity.Product;
import com.ty.repo.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping("/")
	public String loadForm(Model model) {
		
		model.addAttribute("product", new Product());
		return "index";
	}
	
	@PostMapping("/save")
	public String handleFormData(@ModelAttribute("product") Product pro,Model model) {
		
		pro =repo.save(pro);
		if(pro.getPid()!=null) {
			model.addAttribute("msg", "Data Saved");
		}
		return "index";
	}
	
	@GetMapping("/data")
	public String displayRecords(Model model) {
		model.addAttribute("product", repo.findAll());
		return "records";
	}
	

}
