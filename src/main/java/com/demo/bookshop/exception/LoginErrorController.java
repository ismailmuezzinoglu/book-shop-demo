package com.demo.bookshop.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * AOP style exception handling
 *
 */
@ControllerAdvice
public class LoginErrorController {

	private static Logger logger = LoggerFactory.getLogger(LoginErrorController.class);

	/**
	 * Catching the INTERNAL_SERVER_ERROR exception
	 * 
	 * @param throwable
	 * @param model
	 * @return forward path name of string value
	 */
	@ExceptionHandler(Throwable.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public String exception(final Throwable throwable, final Model model) {
		logger.error("Exception during execution of SpringSecurity application", throwable);
		String errorMessage = (throwable != null ? throwable.getMessage() : "Unknown error");
		model.addAttribute("errorMessage", errorMessage);
		return "error";
	}

}