package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		ApplicationContext cxt= new ClassPathXmlApplicationContext("beans.xml");
//		UserDao dao=cxt.getBean(UserDao.class);
//		dao.getData();
//		ConfigurableApplicationContext ccxt= (ConfigurableApplicationContext)cxt;
//		ccxt.close();
		
//		ProgrammaticeApp ap=cxt.getBean(ProgrammaticeApp.class);
//		ap.getData();
//		ConfigurableApplicationContext ccxt= (ConfigurableApplicationContext)cxt;
//		ccxt.close();
		
		ApplicationContext cxt= new AnnotationConfigApplicationContext(AppConfig.class);
		AnnotationApp ap=cxt.getBean(AnnotationApp.class);
		ap.getData();
		ConfigurableApplicationContext ccxt= (ConfigurableApplicationContext)cxt;
		ccxt.close();
		
		

	}
}
