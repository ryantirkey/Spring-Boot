package com.ty.req;

public class Credit implements IPayment{

	@Override
	public int processPayment(double billamt) {
		System.out.println("Credit selected");
		return 1;
	}

}
