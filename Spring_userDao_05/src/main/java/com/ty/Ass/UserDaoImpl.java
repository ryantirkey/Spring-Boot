package com.ty.Ass;

public class UserDaoImpl implements UserDao {
	
	public UserDaoImpl() {
		System.out.println("0-Constructor: UserDaoImpl");
	}

	@Override
	public String findName(int id) {
		System.out.println("U are in UserDaoImpl");
		return "ryan";
	}

}
