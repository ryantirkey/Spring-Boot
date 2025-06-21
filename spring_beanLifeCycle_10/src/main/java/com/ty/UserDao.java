package com.ty;

public class UserDao {
	
	public void init() {
		System.out.println("Getting DB connection");
	}
	
	public void getData() {
		System.out.println("Getting data from DB");
	}
	
	public void destroy() {
		System.out.println("closing DB connection");
	}

}
