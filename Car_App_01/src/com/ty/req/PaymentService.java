package com.ty.req;

public class PaymentService {
	
	private IPayment payment;
	
	
	
	public PaymentService(IPayment payment) {
		this.payment = payment;
	}
	
//	public void setPayment(IPayment payment) {
//		this.payment = payment;
//	}
	
//	IPayment payment;



	public void doPayment(double  billamt) {
		
		int status= payment.processPayment(billamt);
		if(status >=1) {
			System.out.println("Payment done Successfully");
		}
		else {
			System.out.println("Card Rejected");
		}
	}



	

}
