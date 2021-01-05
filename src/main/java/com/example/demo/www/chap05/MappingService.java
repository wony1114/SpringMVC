package com.example.demo.www.chap05;

import static java.util.stream.Collectors.toList;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.zzz.chap04.Dish;

public class MappingService{

  public List<String> myMap(){
   return MyDish.menu.stream()
        .map(MyDish::getName)
        .collect(toList());
  }
  public List<Integer> myMap2(){
    // map
    return Arrays.asList("Hello", "World").stream()
        .map(String::length)
        .collect(toList());
  }
  public List<String> myFlatMap(){
    // flatMap
  return Arrays.asList("Hello", "World").stream()
        .flatMap((String line) -> Arrays.stream(line.split("")))
        .distinct()
        .collect(toList());
  }
  public List<Integer[]> myFlatMap2(){
    // flatMap
    return Arrays.asList(1,2,3,4,5).stream()
        .flatMap((Integer i) -> Arrays.asList(6,7,8).stream()
            .map((Integer j) -> new Integer[]{i, j}))
        .filter(pair -> (pair[0] + pair[1]) % 3 == 0)
        .collect(Collectors.toList());
  }
}


