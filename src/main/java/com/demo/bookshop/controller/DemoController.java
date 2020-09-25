package com.demo.bookshop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.bookshop.exception.LoginErrorController;

@Controller
public class DemoController {
	
	private static Logger logger = LoggerFactory.getLogger(LoginErrorController.class);
	

	@GetMapping("/hello")
	public String hello(Model theModel) {
		logger.info("heloooo");
		theModel.addAttribute("theDate", new java.util.Date());

		return "fragments/header";
		
		// return "helloworld";
	}
	
	@GetMapping("/index")
	public String index(Model theModel) {
		logger.info("indeeeex");
		theModel.addAttribute("theDate", new java.util.Date());
		return "index";
	}

}
