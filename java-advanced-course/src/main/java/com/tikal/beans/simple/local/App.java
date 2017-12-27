package com.tikal.beans.simple.local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
//		configuration1(args);
		configuration2(args);
	}
	
	public static void configuration1(String[] args) {
		ApplicationContext ctx = SpringApplication.run(App.class, args);

		Message bean = ctx.getBean(Message.class);
		bean.setMessage("Hello World (with @Component)!");
		bean.getMessage();
	}	
	
	public static void configuration2(String[] args) {
		ApplicationContext ctx = SpringApplication.run(App.class, args);

		Event bean = (Event) ctx.getBean("event");
		bean.setEvent("Hello World! (with @Configuration)");

		bean.getEvent();
	}
}
