package com.tikal.beans.simple.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
public class AppConfiguration {
	
	@Bean
	@RequestScope
	public Event getEvent() {
		return new Event();
	}
}
