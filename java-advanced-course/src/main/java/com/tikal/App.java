package com.tikal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		runnable();
	}
	
	
	public static void runnable() {

		System.out.println("Starting");
		
		List<Integer> list = Arrays.asList(7, 6, 5);
//
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
//		
//		
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
	
	private static Consumer<List<Integer>> printList = (list) -> {
		try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		System.out.println(list);
	};	
}
