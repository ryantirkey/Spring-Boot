package com.ty.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.service.ReportService;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext cxt= new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService service=cxt.getBean(ReportService.class);
		service.generateReport();
	}

}
