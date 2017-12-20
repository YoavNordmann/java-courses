package com.tikal.beans.simple.local;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	
	@Bean
	public Event event() {
		return new Event();
	}

}
