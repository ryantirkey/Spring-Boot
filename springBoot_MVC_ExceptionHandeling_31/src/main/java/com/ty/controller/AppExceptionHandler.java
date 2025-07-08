package com.ty.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {
	
	private Logger logger= LoggerFactory.getLogger(AppExceptionHandler.class);
	
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception ae) {
		String msg= ae.getMessage();
		logger.error(msg);
		return "errorpage";
	}
	// when we have multiple handlers spring will first look for specific exception if not found then use super most exception method
	@ExceptionHandler(value = StringIndexOutOfBoundsException.class)
	public String stringException(StringIndexOutOfBoundsException ae) {
		String msg= ae.getMessage();
		logger.error(msg);
		return "errorpage";
	}

}
