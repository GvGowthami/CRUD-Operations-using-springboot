package com.DailyCodeBuffer.Code_demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/")
	public String hello() {
		return "Welcome to SpringBoot Application";
	}
}
