package com.tikal.reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		
		Person p = new Person("Yoav", 18);
		Person p1 = new Person("Yoav", 18);
		
//		Field[] declaredFields = Person.class.getDeclaredFields();
//		
//		Arrays.asList(declaredFields).stream().forEach(f -> {
//			System.out.println(f.getName());
//			try {
//				f.setAccessible(true);
//				System.out.println(f.get(p));
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		});
		
		System.out.println(p1);
		
		Method m = Person.class.getMethod("setName", String.class);
		m.invoke(p1, "Roman");
		
		System.out.println("After Change");
		System.out.println(p1);
		
		
	}

}
