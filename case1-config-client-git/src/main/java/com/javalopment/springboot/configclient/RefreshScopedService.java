package com.javalopment.springboot.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Service @RefreshScope @Getter @Setter
public class RefreshScopedService {

	@Value("#{new Boolean(new String('yes').equals('${prop-6:false}'))}")
	private Boolean prop6;
}
