package com.ty;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("userdao")
public class UserService {
	
	public UserService() {
		System.out.println("Getting data from redis");
	}

}
