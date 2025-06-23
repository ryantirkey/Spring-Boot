package com.ty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ty.bean.Car;

@SpringBootApplication
public class SpringBootFirstApp13Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootFirstApp13Application.class, args);
		Car c=ctx.getBean(Car.class);
		System.out.println(c.hashCode());
	}

}
