package com.ty;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class AnnotationApp {
	@PostConstruct
	public void init() {
		System.out.println("Getting DB connection");
	}
	
	public void getData() {
		System.out.println("Getting data from DB");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("closing DB connection");
	}

}
