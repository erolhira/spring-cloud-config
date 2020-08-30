package com.javalopment.springboot.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * The Environment can change at runtime and Spring Cloud does this for you using RefreshEvent; 
 * so no need to use @RefreshScope.
 */
@RestController
@RequestMapping(method = RequestMethod.GET)
public class TestController implements ApplicationListener<EnvironmentChangeEvent> {

	@Autowired AppConfig appConfig;
	@Autowired Environment environment;
	
	@RequestMapping("/config")
	public AppConfig printConfig() {
		return appConfig;
	}
	
	@RequestMapping("/print")
	public void printConfigViaEnvironment() {
		System.out.println("prop-1: " + environment.getProperty("prop-1"));
		System.out.println("prop-2: " + environment.getProperty("prop-2"));
		System.out.println("prop-3: " + environment.getProperty("prop-3"));
		System.out.println("prop-4: " + environment.getProperty("prop-4"));
		System.out.println("prop-5: " + environment.getProperty("prop-5"));
	}

	@Override
	public void onApplicationEvent(EnvironmentChangeEvent event) {
		
		if(event.getKeys().contains("prop-4")) {
			System.out.println("prop-4 is updated: " + appConfig.getProp4());
		}
	}
}

