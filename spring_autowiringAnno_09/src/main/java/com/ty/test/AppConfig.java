package com.ty.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ty")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig : Constructor");
	}
	
	

}
