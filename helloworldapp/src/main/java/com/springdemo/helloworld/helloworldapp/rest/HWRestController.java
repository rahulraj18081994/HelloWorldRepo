package com.springdemo.helloworld.helloworldapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HWRestController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
}
