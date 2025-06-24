package com.ty.CommandLine;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRunnerCom implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLine Runner: run() method");
		
	}

}
