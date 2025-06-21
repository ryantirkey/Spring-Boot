package com.ty;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ProgrammaticeApp implements InitializingBean, DisposableBean {
	

	@Override
	public void destroy() throws Exception {
		System.out.println("Closing DB connection");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Getting DB connection");
		
	}
	
	public void getData() {
		System.out.println("Getting your data from DB");
	}
	

}
