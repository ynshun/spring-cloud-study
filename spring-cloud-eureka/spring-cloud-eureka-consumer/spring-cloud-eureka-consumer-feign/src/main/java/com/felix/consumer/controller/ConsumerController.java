package com.felix.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.felix.consumer.service.ComputeClient;

@RestController
public class ConsumerController {

	@Autowired
	private ComputeClient computeClient;

	@RequestMapping(value = "/feign/add", method = RequestMethod.GET)
	public Integer add() {
		return computeClient.add(10, 20);
	}

}