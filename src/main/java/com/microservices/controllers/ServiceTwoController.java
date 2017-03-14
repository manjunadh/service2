package com.microservices.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {
	@RequestMapping("/hi")
	public String hi() {
		return "hi";
	}
}
