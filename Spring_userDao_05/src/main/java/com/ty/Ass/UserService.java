package com.ty.Ass;

public class UserService {
	private UserDao dao;
	
	public UserService() {
		System.out.println("0-constructor: UserService");
	}
	
	public UserService(UserDao dao) {
		this.dao=dao;
	}
	
	public void printName(int id) {
		String name= dao.findName(id);
		
		System.out.println(name);
		
	}

}
