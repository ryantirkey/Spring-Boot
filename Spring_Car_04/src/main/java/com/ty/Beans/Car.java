package com.ty.Beans;

public class Car {
	
	private IEngine eng;
	
	public Car() {
		System.out.println("Car: 0-constructor");
	}
	
	public Car(IEngine eng) {
		this.eng=eng;
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
