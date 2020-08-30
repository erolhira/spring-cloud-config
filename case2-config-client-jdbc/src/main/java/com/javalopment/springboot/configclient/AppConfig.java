package com.javalopment.springboot.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/*
 * Changes are propagated to beans in Spring Cloud in 2 ways (@ConfigurationProperties and @RefreshScope)
 * So here, we do not need to use @RefreshScope, since @ConfigurationProperties is already there. 
 * 
 * Warning; @RefreshScope causes Jackson to infinite loop; 
 * Do not use beans annotated with @RefreshScope as a rest response. 
 */
@Component
@ConfigurationProperties
@Getter @Setter
public class AppConfig {		
		
	private String prop1;	
	private String prop2;
	private String prop3;
	
	@Value("prop-4") //@Value also does not need @RefreshScope; since of @ConfigurationProperties
	private String prop4;
	private String prop5;		
}
