package com.ty.auto;

public class PetrolEng implements Engine{
	
	public PetrolEng() {
		System.out.println("0-param Constructor petrol");
	}

	@Override
	public int start() {
		System.out.println("Petrol Engine");
		return 1;
	}

}
