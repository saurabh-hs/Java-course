package com.app;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception {
	
	//Constructor of a InvalidAgeException class
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
