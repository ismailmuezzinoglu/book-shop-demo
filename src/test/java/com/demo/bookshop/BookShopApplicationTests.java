package com.demo.bookshop;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.bookshop.controller.DemoController;

@SpringBootTest
class BookShopApplicationTests {
	
	@Autowired
	private DemoController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
