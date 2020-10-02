package com.demo.bookshop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.bookshop.entity.Book;
import com.demo.bookshop.entity.Publisher;
import com.demo.bookshop.service.serviceinterface.IAuthorService;
import com.demo.bookshop.service.serviceinterface.IBookService;
import com.demo.bookshop.service.serviceinterface.IPublisherService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private IBookService bookService;

	@Autowired
	private IAuthorService authorService;

	@Autowired
	private IPublisherService publisherService;

	@GetMapping("/addbook")
	public String goToAddBook(Model model) {
		model.addAttribute("book", new Book());
		model.addAttribute("authors", authorService.findAll());

		return "book/add-book";
	}

	@GetMapping("/list")
	public String showUpdateForm() {
		return "index";
	}

	@PostMapping("/add")
	public String addBook(@ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "book/add-book";
		}
		System.out.println(book.getTitle());
		bookService.save(book);
		return "redirect:list";
	}

}
