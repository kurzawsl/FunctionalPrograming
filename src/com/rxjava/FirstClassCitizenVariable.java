package com.rxjava;

import java.util.function.BiFunction;

public class FirstClassCitizenVariable {
	
	public static void main(String[] args) {
		BiFunction<String, String, String> concatFunction = (s,t)->  s+t;
		System.out.println(concatFunction.apply("hello ", "world1"));
		
		concatFunction = FirstClassCitizenVariable::concatStrings;
		System.out.println(concatFunction.apply("hello ", "world2"));
		
		FirstClassCitizenVariable instance = new FirstClassCitizenVariable();
		
		concatFunction = instance::concatStrings2;
		
		System.out.println(concatFunction.apply("hello ", "world3"));
		
	}
	
	private static String concatStrings(String a, String b){
		return a + b;
	}
	
	String concatStrings2(String a, String b){
		return a + b;
	}

}
