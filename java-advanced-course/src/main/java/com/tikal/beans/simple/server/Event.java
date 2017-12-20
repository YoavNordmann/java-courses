package com.tikal.beans.simple.server;

import java.util.UUID;

public class Event {

	private String event;
	private String id;
	
	public Event() {
		id = UUID.randomUUID().toString();
	}

	public void setEvent(String event) {
		this.event = event;
	}
	
	public String getEvent() {
		return event;
	}

	public void printEvent() {
		System.out.println("["+id+"] Your Event : " + event);
	}

}
