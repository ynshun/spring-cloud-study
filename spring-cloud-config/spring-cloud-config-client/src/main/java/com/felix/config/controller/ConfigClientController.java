package com.felix.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
	@Autowired
	private Environment env;
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
}
