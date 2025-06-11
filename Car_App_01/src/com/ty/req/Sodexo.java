package com.ty.req;

public class Sodexo implements IPayment{

	@Override
	public int processPayment(double billamt) {
		System.out.println("Sodexo selected");
		return 1;
	}

}
