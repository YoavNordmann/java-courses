package com.tikal.beans.simple.server;

import java.time.Instant;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {
	
	@Inject
	private Event event;

	@RequestMapping("/hello/{str}")
    String home(@RequestParam String str) {
		event.setEvent(Instant.now().toString());
		event.printEvent();
        return "Hello World!";
    }
}
