package com.tikal;

public class Person {

	private static final String GLOBAL = "SHAGABOOM";

	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String concatWithSpace(String str1, String str2) {
		return String.join(" ", str1, str2);
	}

}
