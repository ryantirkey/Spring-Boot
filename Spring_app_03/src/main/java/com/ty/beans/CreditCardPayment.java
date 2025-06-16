package com.ty.beans;

public class CreditCardPayment implements IPayment {
	
	public CreditCardPayment() {
		System.out.println("0-Constructor: CreditCard");
	}

	@Override
	public boolean processPayment(double billAmt) {

		System.out.println("Credit card payment successfull");
		return true;
	}

}
