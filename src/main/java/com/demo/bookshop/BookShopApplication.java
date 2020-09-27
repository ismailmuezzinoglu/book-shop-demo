package com.demo.bookshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookShopApplication {

	private static Logger logger = LoggerFactory.getLogger(BookShopApplication.class);

	public static void main(String[] args) {
		logger.info("Application starting ...");
		SpringApplication.run(BookShopApplication.class, args);
	}
}
