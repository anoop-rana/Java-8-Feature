package com.lambda;

public class Lab004 {

	public static void main(String[] args) {
		StringFunc reverse = (str)->{
			String result = "";
			for (int i = 0; i < str.length(); i++) {
				result = str.charAt(i)+result;
			}
			return result;
		};
		System.out.println("Lambda reverse is : " + reverse.func("abc"));
	}
}

interface StringFunc {
	String func(String n);
}
