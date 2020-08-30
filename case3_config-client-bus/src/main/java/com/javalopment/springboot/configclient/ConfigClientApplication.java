package com.javalopment.springboot.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.event.EventListener;

/*
 * curl -H "Content-Type: application/json" -d {} http://localhost:8080/actuator/refresh
 */
@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
	@EventListener({EnvironmentChangeEvent.class})
	public void onRefresh() {
		System.out.println("environment Changed..");
	}

}
