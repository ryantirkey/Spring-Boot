package com.ty.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Robot {
	
	public Robot() {
		System.out.println("Robot COnstructor");
	}

}
