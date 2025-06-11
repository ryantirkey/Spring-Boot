package com.ty.ex3;

public class App {
	public static void main(String[] args) {
		Car c= new Car();
		
// programmer needs to pass obj of impl class but this is loss coupling
		
//		Car c= new Car(new DieselEng()); //constructor injection
		
//		c.setEng(new PetrolEng());  //setter injection
		
		c.eng= new DieselEng(); // field injection
		
		c.drive();
	}

}
