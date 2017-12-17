package com.tikal;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionExample {

	public static void main(String[] args) {
		Field[] declaredFields = Person.class.getDeclaredFields();
		Arrays.asList(declaredFields).stream().forEach(f -> {
			System.out.println(f.getName());
		});
	}

}
