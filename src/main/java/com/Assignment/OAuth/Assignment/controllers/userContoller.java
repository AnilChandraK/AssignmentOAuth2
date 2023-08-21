package com.Assignment.OAuth.Assignment.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userContoller {
	@RequestMapping("/user/{name}")
	public String user(@PathVariable("name") String name) {
		return "Hello " + name;

	}
}
