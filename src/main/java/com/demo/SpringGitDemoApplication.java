package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGitDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringGitDemoApplication.class);

	public static void main(String[] args) {
		logger.info("class loaded");
		SpringApplication.run(SpringGitDemoApplication.class, args);
	}

}
