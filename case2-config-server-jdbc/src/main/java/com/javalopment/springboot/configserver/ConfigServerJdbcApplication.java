package com.javalopment.springboot.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerJdbcApplication.class, args);
	}

}
