package com.syntax.hw;

public class MessageUtil {
	
	private String message;
	
	//contructor
	//@param message to be printed
	public MessageUtil(String message) {
		this.message=message;
	}
	
	//print the message
	
	public String printMessage() {
		System.out.println(message);
		return message;
	}

}
