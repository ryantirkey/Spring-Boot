package com.ty;

public class Car extends Engine {
	public void drive() {
		
		int status =start();
		if(status >= 1) {
			System.out.println("Journey started!!");
		}
		else {
			System.out.println("Engine problem!!");
		}
		
	}

}
