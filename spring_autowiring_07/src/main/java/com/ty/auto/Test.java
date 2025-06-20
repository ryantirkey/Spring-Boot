package com.ty.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext cx= new ClassPathXmlApplicationContext("Beans.xml");
		
		Car c=cx.getBean(Car.class);
		c.drive();
	}
}
