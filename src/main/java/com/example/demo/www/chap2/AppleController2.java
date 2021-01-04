package com.example.demo.www.chap2;


import java.util.Arrays;

import java.util.List;

import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class AppleController2 {
	public static void main(String... args) {
		AppleService as = new AppleService();
		List<Apple> ls = Arrays.asList(new Apple[] { new Apple(80, Color.GREEN), new Apple(90, Color.GREEN),
				new Apple(100, Color.RED), new Apple(110, Color.RED), new Apple(120, Color.RED) });
		
		 ls.stream()
		 .map(Apple::toString)
		 .forEach(System.out::println);
		 
		 ls.stream()
			.map(Apple::toString)
			.limit(3)
			.collect(toList());
				
	}
	}

