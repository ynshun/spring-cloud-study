package com.ynshun.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {

	@GetMapping("add")
	public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
		return a + b;
	}
}