package com.lambda;

//Generic Functional Interfaces
public class Lab005 {
	
	public static void main(String[] args) {
		SomeFunc<String> reverse = (str)->{
			String result = "";
			for(int i = str.length()-1; i>=0; i--) {
				result+=str.charAt(i);
			}
			return result;
		};
		System.out.println("Generic Lambda Reverse is : " + reverse.func("abcdefg"));
	}

}

interface SomeFunc<T>{
	T func(T t);
}
