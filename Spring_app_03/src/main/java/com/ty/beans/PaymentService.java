package com.ty.beans;

public class PaymentService {
	
	private IPayment payment;
	
	public PaymentService() {
		System.out.println("0-Constructor: PaymentService");
	}
	
	public PaymentService(IPayment payment) {
		System.out.println("1-Constructor: PaymentService");
		this.payment= payment;
	}
	
	
	
	public void setPayment(IPayment payment) {
		System.out.println("Setter method triggered");
		this.payment = payment;
	}

	public void doPayment(double billAmt) {
		boolean status =payment.processPayment(billAmt);
		if(status == true) {
			System.out.println("recipt printing");
		}else {
			System.out.println("card trouble");
		}
	}

}
