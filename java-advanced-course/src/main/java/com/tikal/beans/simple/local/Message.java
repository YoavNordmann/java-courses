package com.tikal.beans.simple.local;

import org.springframework.stereotype.Component;

@Component
public class Message {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

}
