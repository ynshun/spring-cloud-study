package com.ynshun.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {
	@Autowired
	private Environment env;
//	@Autowired
//	private RestTemplate restTemplate;
	
	
	@Value("${spring.application.name}")
	private String appName;

	@RequestMapping("/app-name")
	public String getAppName() {
		return appName;
	}

	@RequestMapping("/config/{key}")
	public String getConfig(@PathVariable("key") String key) {
		return env.getProperty(key, "niubihonghong");
	}
	
//	@RequestMapping("/eureka/config/{key}")
//	public String getEurekaConfig(@PathVariable("key") String key) {
//		return restTemplate.getForEntity("http://CONFIG-SERVER/add?a=10&b=20", String.class).getBody();
//	}
	
}
