package com.demo.bookshop.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.bookshop.exception.LoginErrorController;

/**
 * Authentication control
 */

@Controller
public class LoginController {

	private static Logger logger = LoggerFactory.getLogger(LoginErrorController.class);
	
	@GetMapping(value = { "/", "/login" })
	public String login(Principal principal) {
		
		if (principal == null) {
			return "loginPage";
		}
		logger.info(principal.getName(), " Logged in");
		return "redirect:/index";
	}

	// Login form with error
	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		logger.info("login-error");
		return "loginPage";
	}
	
	

}
