package com.ynshun.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ynshun.consumer.service.ComputeService;

@RestController
public class ConsumerController {
	@Autowired
	private ComputeService computeService;

	@RequestMapping(value = "/hystrix/add", method = RequestMethod.GET)
	public String add() {
		return computeService.addService();
	}
}