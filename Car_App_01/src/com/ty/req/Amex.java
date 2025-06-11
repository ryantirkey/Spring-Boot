package com.ty.req;

public class Amex implements IPayment{

	@Override
	public int processPayment(double billamt) {
		System.out.println("Amex selected");
		return 1;
	}

}
