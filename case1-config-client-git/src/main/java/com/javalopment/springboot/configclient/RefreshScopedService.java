package com.javalopment.springboot.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;

@Service
@RefreshScope
@Getter @Setter
public class RefreshScopedService {

	@Value("#{'yes'.equals('${prop-6:false}')}")
	private Boolean prop6;

	@Value("${tps}")
	Integer tps;
	String responseMessage;

	@PostConstruct
	public void refresh(){
		responseMessage = responseMessage = "Service is running with tps: " + tps;
	}


}
