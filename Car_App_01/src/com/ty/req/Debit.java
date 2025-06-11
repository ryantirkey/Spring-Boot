package com.ty.req;

public class Debit implements IPayment{

	@Override
	public int processPayment(double billamt) {
		System.out.println("Debit selected");
		return 1;
	}

}
