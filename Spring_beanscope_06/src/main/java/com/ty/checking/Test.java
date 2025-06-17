package com.ty.checking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext cxt= new ClassPathXmlApplicationContext("Beans.xml");
		Car c1= cxt.getBean(Car.class);
		System.out.println(c1.hashCode());
		
		Car c2= cxt.getBean(Car.class);
		System.out.println(c2.hashCode());
		
		Car c3= cxt.getBean(Car.class);
		System.out.println(c3.hashCode());
	}
	
	
	

}
