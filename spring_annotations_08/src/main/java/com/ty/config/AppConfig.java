package com.ty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ty.bean.Engine;

@Configuration
@ComponentScan(basePackages = "com.ty")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig: Constructor");
	}
	
	@Bean
	public Engine getEngine() {
		Engine eng= new Engine();
		return eng;
	}
	
	

}
