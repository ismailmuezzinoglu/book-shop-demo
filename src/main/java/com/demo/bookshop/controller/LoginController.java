package com.demo.bookshop.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.bookshop.security.SecurityConfig;
import com.demo.bookshop.service.serviceinterface.IBookService;

/**
 * Authentication control
 */

@Controller
public class LoginController {

	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private IBookService bookService;

	/**
	 * 
	 * 
	 * @param principal is the value of credentials
	 * @return forward path name of name of string value
	 */
	@GetMapping(value = { "/", "/login" })
	public String login(Principal principal) {
		if (principal == null) {
			logger.info("mapping login page");
			return "loginPage";
		}

		logger.info(principal.getName(), " Logged in");
		return "redirect:/index";
	}

	/**
	 * 
	 * @see SecurityConfig manages redirection of /login-error path
	 * 
	 * @param model is the boolean value which is forwarding to login page. If true
	 *              there is an info appears on the login page.
	 * 
	 * @return forward path name of string value
	 */
	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		logger.info("login-error mapping login page");
		return "loginPage";
	}

	/**
	 * Forwarding to home page path
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/index")
	public String index(Model model) {
		
		model.addAttribute("books", bookService.findAll());
		
		logger.info("index");
		return "index";
	}

}
