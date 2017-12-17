package com.tikal;

import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;

public class FunctionalExample {

	private static BiFunction<Integer, Integer, Integer> addition = (num1, num2) -> {
		return num1 + num2;
	};

	public static void main(String[] args) {
		println(null);
		// System.out.println(perform(100, 11, addition));
	}

	private static void println(String str) {

		// if(str != null) {
		// System.out.println(str.length());
		// }

		System.out.println(Optional.ofNullable(str).orElse("Stam").length());

		// ifPresent(s -> System.out.println(s.length()));

		// Optional.of("Yoav").ifPresent(System.out::println);

	}

	private static <T, R> R perform(T t1, T t2, BiFunction<T, T, R> func) {
		return func.apply(t1, t2);
	}

}
