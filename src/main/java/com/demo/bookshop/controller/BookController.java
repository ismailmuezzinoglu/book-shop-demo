package com.demo.bookshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@GetMapping("/addbook")
	public String addbook() {
		return "book/add-book";
	}
	
}
