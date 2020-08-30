package com.javalopment.springboot.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyRefreshRemoteApplicationEvent implements ApplicationListener<RefreshRemoteApplicationEvent> {
	
	@Autowired
	Environment env;
	
	/*
	 * RefreshRemoteApplicationEvent is catched before refreshment of environment.
	 * So here the old value of prop4 is printed.
	 */
	@Override
	public void onApplicationEvent(RefreshRemoteApplicationEvent event) {
		
		System.out.println("prop4 from env: " + env.getProperty("prop4"));
	}

}