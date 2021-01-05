package com.example.demo.www.chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import static java.util.Comparator.comparing;
import static com.example.demo.cmm.utl.Util.*;

import lombok.Data;

public class AppleController {
	public static void main(String... args) {
		AppleService as = new AppleService();
		List<Apple> ls = Arrays.asList(new Apple[] { new Apple(80, Color.GREEN), new Apple(90, Color.GREEN),
				new Apple(100, Color.RED), new Apple(110, Color.RED), new Apple(120, Color.RED) });
		
		print("1. 녹색사과 필터링 결과");
		for (Apple a : as.filterApples(ls, as::isGreenApple)) print(a.toString());
		for (Apple a : as.filterApples(ls, (Apple a)->a.getColor().equals(Color.GREEN)))
		print("2. 100그램이상 사과 필터링 결과");
		for(Apple a : as.filterApples(ls, as::isHeavyApple)) print(a.toString());
		for(Apple a : as.filterApples(ls, (Apple a)->a.getWeight()>100)) print(a.toString());
		print("3. 빨간사과 필터링 결과 ...  단, 색깔은 외부주입");
		for(Apple a : as.filterApplesByColor(ls, Color.RED)) print(a.toString());		
		print("4. 120그램이상 사과 필터링 결과 ... 단, 무게는 외부주입");
		for(Apple a : as.filterApplesByWeight(ls, 120)) print(a.toString());
		print("5. 100그램이상 빨간 사과 필터링 결과");
		for(Apple a : as.filterApples(ls, (Apple a)->a.getWeight()>100 && a.getColor().equals(Color.RED))) print(a.toString());
		
		print(">>>정렬>>>");
		//익명함수(참조용)
		Comparator<Apple> c = new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return Integer.valueOf(o1.getWeight()).compareTo(Integer.valueOf(o2.getWeight()));
			}
			
		};
		//람다
		// 오름차순 정렬
		ls.sort((Apple o1, Apple o2)
				-> integer(string(o1.getWeight())).compareTo(integer(string(o2.getWeight()))));
		for(Apple a : ls) print(a.toString());
		// 위 코드를 더 간략화 시킴. 단 import static java.util.Comparator.comparing; 주의!!!
		// Comparator<Apple> app = Comparator.comparing((Apple a)-> a.getWeight());
		ls.sort(comparing(Apple::getWeight));
		for(Apple a : ls) print(a.toString());
		
		// 내림차순 정렬
		ls.sort((Apple o1, Apple o2)
				-> integer(string(o1.getWeight())).compareTo(integer(string(o2.getWeight()))));
		for(Apple a : ls) print(a.toString());
		// 위 코드를 더 간략화 시킴. 단 import static java.util.Comparator.comparing; 주의!!!
		ls.sort((Apple o1, Apple o2)-> integer(string(o1.getWeight())).compareTo(integer(string(o2.getWeight()))));
		for(Apple a : ls) print(a.toString());
		
	}
}

@Data
class Apple {
	private int weight; private Color color;
	public Apple(int weight, Color color) {this.weight = weight; this.color = color;}
}
enum Color {RED, GREEN}

// @FunctionalInterface interface Predicate<T> { public boolean test(T t);} //p.101
/*
 * class AppleWeightPredicate implements Predicate<Apple>{
 * 
 * @Override public boolean test(Apple t) { return false; } }
 * 
 * class AppleColorPredicate implements Predicate<Apple>{
 * 
 * @Override public boolean test(Apple t) { return false; }
 * 
 * } class AppleRedAndHeavyPredicate implements Predicate<Apple>{
 * 
 * @Override public boolean test(Apple t) { return false; }
 * 
 * }
 * 
 * class AppleFilter{ public List<Apple> filterGreenApples(List<Apple>
 * inventory) { List<Apple> result = new ArrayList<>(); for (Apple apple :
 * inventory) { if (apple.getColor() == Color.GREEN) { result.add(apple); } }
 * return result; }
 * 
 * 
 * 
 * 
 * 
 * 
 * public List<Apple> filter(List<Apple> inventory, ApplePredicate p) {
 * List<Apple> result = new ArrayList<>(); for (Apple apple : inventory) { if
 * (p.test(apple)) { result.add(apple); } } return result; } }
 * 
 * @FunctionalInterface interface FilterApples{public List<Apple>
 * apply(List<Apple> ls, Predicate<Apple> pre);}
 */
class AppleService {
	List<Apple> filterApples(List<Apple> ls, Predicate<Apple> p) {
		List<Apple> r = new ArrayList<>();
		for (Apple a : ls) {
			if (p.test(a))
				r.add(a);
		}
		return r;
	}

	public List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getColor() == color) {
				result.add(apple);
			}
		}
		return result;
	}

	public List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > weight) {
				result.add(apple);
			}
		}
		return result;
	}

	boolean isHeavyApple(Apple apple) {return apple.getWeight() >= 100;}
	boolean isGreenApple(Apple apple) {return Color.GREEN.equals(apple.getColor());}

}

