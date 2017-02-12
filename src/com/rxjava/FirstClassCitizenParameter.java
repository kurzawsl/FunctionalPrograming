package com.rxjava;

import java.util.function.Function;

public class FirstClassCitizenParameter {

	public static void main(String[] args) {
		
	}

	public static String concatAndTransform(String a, String b, Function<String, String> stringTransform){
		if(stringTransform != null){
			a = stringTransform.apply(a);
			b = stringTransform.apply(b);
		}
		return a + b;
	}
	
}
