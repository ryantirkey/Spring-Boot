package com.ty.Ass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		UserService service=context.getBean(UserService.class);
		
		service.printName(1);
	}

}
