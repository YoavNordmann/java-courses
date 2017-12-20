package com.tikal.beans.simple.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	//@RequestScope
	@Bean
	public Event getEvent() {
		return new Event();
	}
}
