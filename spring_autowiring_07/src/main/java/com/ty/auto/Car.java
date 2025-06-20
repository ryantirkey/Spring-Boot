package com.ty.auto;


public class Car {
	
	private Engine eng;

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	public Car() {
		System.out.println("0- param constructor Car");
	}
	
	public void drive() {
		int status = eng.start();
		
		if(status == 1) {
			System.out.println("Engine Started");
		}
		else {
			System.out.println("engine trouble");
		}
	}
	
	

}
