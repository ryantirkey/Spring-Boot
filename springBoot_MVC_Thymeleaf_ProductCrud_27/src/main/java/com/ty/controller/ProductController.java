package com.ty.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ty.entity.Product;
import com.ty.repo.ProductRepo;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepo repo;
	
	@GetMapping("/")
	public String loadFormPage(Model model) {
		model.addAttribute("product", new Product());
		return "index";
	}
	
	@PostMapping("/save")
	public String saveData(@Validated Product prod, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "index";
		}
		
		prod=repo.save(prod);
		if(prod.getPid()!=null) {
			model.addAttribute("msg", "Data Saved");
			model.addAttribute("product", new Product());
		}
		return "index";
	}
	
	@GetMapping("/data")
	public String readData(Model model) {
		List<Product> allData= repo.findAll();
		if(allData.isEmpty()) {
			model.addAttribute("msg", "No record found");
		}
		model.addAttribute("records", allData);
		return "display";
	}
	
	@GetMapping("/delete")
	public String deleteData(@RequestParam("id") Integer pid,Model model) {
		
		repo.deleteById(pid);
		model.addAttribute("delmsg", "Data Deleted..!!");
		model.addAttribute("records", repo.findAll());
		return "display";
	}
	
	@GetMapping("/edit")
	public String editData( @RequestParam("id") Integer pid,Model model) {
		Optional<Product> findbyId=repo.findById(pid);
		if(findbyId.isPresent()) {
			Product p= new Product();
			p=findbyId.get();
			model.addAttribute("product", p);
		}
		return "index";
	}

}
