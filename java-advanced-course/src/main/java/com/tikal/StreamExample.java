package com.tikal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {
	
	public static Predicate<Integer> isOdd = (i) -> {
		return i%2==1;
	};
	

	public static void main(String[] args) {
//		iteration();
		iteration2();
//		iteration3();
	}

	private static void iteration() {
		List<String> list = Arrays.asList("Rick", "Negan", "Daryl", "Glenn", "Carl");
//		list.forEach((name) -> System.out.println(name));
//		list.forEach(System.out::println);
		list.stream().forEach(System.out::println);
	}

	private static void iteration2() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		list.stream()
			.filter(i -> i % 2 == 0)
			.map(i -> {return i.toString();})
			.map(s -> {return s+"~";})
			.forEach(System.out::println);
		
		list.stream().filter(StreamExample::isEven).map(i -> i.toString()).forEach(System.out::println);
	}
	

	private static void iteration3() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		list.stream().filter(StreamExample.isOdd).map(i -> i.toString()).forEach(System.out::println);
	}


	public static boolean isEven(Integer i) {
		return i%2==0;
	};
	
	
}
