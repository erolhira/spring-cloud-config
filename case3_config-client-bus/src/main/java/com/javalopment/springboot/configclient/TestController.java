package com.javalopment.springboot.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements ApplicationListener<EnvironmentChangeEvent> {

	@Autowired
	private AppConfig appConfig;
	
	@RequestMapping(path = "/config", method = RequestMethod.GET)
	public AppConfig printConfig() {
		return appConfig;
	}

	@Override
	public void onApplicationEvent(EnvironmentChangeEvent event) {
		
		if(event.getKeys().contains("prop-4")) {
			System.out.println("prop-4 is updated: " + appConfig.getProp4());
		}
	}
}

