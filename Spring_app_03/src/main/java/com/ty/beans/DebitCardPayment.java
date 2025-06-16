package com.ty.beans;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment() {
		System.out.println("0-Constructor: DebitCard");
	}

	@Override
	public boolean processPayment(double billAmt) {
		
		System.out.println("Debit card payment successfull");
		return true;
	}

}
