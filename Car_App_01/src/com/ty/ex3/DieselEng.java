package com.ty.ex3;

public class DieselEng implements IEngine{

	@Override
	public int start() {
		System.out.println("Diesel Engine");
		return 1;
	}

}
