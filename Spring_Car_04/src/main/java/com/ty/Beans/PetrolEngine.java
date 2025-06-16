package com.ty.Beans;

public class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("PetrolEng: 0-constructor");
	}

	@Override
	public int start() {
		System.out.println("Petrol Engine");
		return 1;
	}

}
