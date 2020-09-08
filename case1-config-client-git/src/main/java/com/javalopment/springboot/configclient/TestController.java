package com.javalopment.springboot.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping(method = RequestMethod.GET)
public class TestController implements ApplicationListener<EnvironmentChangeEvent> {

	@Autowired AppConfig appConfig;	
	@Autowired RefreshScopedService refreshScopedService;

	@RequestMapping(path = "/config")
	public AppConfig printConfig() {
		return appConfig;
	}

	@RequestMapping(path = "/print")
	public void printRefreshScopeTest() {
		System.out.println("prop-6: " + refreshScopedService.getProp6());
	}

	@RequestMapping(path = "/tps")
	public String printTps(){
		return refreshScopedService.getResponseMessage();
	}

	@Override
	public void onApplicationEvent(EnvironmentChangeEvent event) {
		
		if(event.getKeys().contains("tps")) {
			refreshScopedService.refresh();
		}
	}
}

