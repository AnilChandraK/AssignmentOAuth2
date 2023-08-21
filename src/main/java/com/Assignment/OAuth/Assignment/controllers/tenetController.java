package com.Assignment.OAuth.Assignment.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tenetController {
	@RequestMapping("/tenet/{name}")
	public String hi(@PathVariable("name") String name) {
		return "hi " + name;

	}
}
