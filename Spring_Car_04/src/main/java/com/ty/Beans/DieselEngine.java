package com.ty.Beans;

public class DieselEngine implements IEngine{

	public DieselEngine() {
		System.out.println("Diesel Engine:0-constructor");
	}
	
	@Override
	public int start() {
		System.out.println("Diesel Engine");
		return 1;
	}

}
