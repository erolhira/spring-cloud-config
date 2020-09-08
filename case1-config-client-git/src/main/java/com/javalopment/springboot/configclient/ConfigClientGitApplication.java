package com.javalopment.springboot.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigClientGitApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(ConfigClientGitApplication.class, args);
		
		System.out.println("started.");
	}

}
