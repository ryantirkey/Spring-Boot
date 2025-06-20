package com.ty.auto;

public class DesielEng implements Engine {
	

	public DesielEng() {
		System.out.println("0-param Constructor Diesel");
	}

	@Override
	public int start() {
		System.out.println("Desiel Engine");
		return 1;
	}
	
	

}
