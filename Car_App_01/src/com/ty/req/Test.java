package com.ty.req;

public class Test {
	public static void main(String[] args) {
		PaymentService service= new PaymentService(new Sodexo());
		
//		PaymentService service= new PaymentService();
//		service.setPayment(new Credit());
		
//		service.payment= new Debit();
		
		service.doPayment(45.5);
		
	}

}
