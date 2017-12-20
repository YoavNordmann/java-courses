package com.tikal.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaExample {
	
	
	private static Function<String, Integer> converter = (str) -> {
		return Integer.valueOf(str);
	};
	

	private static Consumer<List<Integer>> printList = (list) -> {
		try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		System.out.println(list);
	};

	
	
	private static BiFunction<String, String, Integer> multiply = (str1, str2) -> {
		return Integer.valueOf(str1) * Integer.valueOf(str2);
	};

	
	public static void main(String[] args) {
//		comparator();
		runnable();
	}

	
	
	public static void comparator() {

		List<Integer> list = Arrays.asList(7, 6, 5, 41, 4, 7, 923, 2);

//		Collections.sort(list, new Comparator<Integer>() {
//			public int compare(Integer p1, Integer p2) {
//				return p1.compareTo(p2);
//			}
//		});

		//Collections.sort(list, (Integer p1, Integer p2) -> p1.compareTo(p2));

		System.out.println(list);
	}
	
	
	public static void runnable() {

		List<Integer> list = Arrays.asList(7, 6, 5, 41, 4, 7, 923, 2);

//		new Thread(new Runnable() {
//			public void run() {
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println(list);
//			}
//		}).start();
		
		
//		new Thread(() -> {
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(list);
//		}).start();
		
		
		
		new Thread(() -> printList.accept(list)).start();
		
	}
	
	

}
