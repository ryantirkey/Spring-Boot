package com.ty.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.bean.Engine;
import com.ty.bean.Robot;
import com.ty.config.AppConfig;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		ctx.getBean(Robot.class);
	}
}
