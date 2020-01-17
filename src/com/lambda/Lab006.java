package com.lambda;

//Passing Lambda Expressions as Arguments
public class Lab006 {
	
	public static String methodTest(LambdaAsArg lambda, String str) {
		return lambda.func(str);
	}
	
	public static void main(String[] args) {
		String inStr = "Hello World";
		String outStr = "";
		
		System.out.println("inStr : " + inStr);
		
		//case 1:
		LambdaAsArg lambda = (str)-> str.toUpperCase();
		outStr = methodTest(lambda, inStr);
		System.out.println("outStr 1: " + outStr);
		
		//case 2:
		outStr = methodTest((str)-> str.toUpperCase(), inStr);
		System.out.println("outStr 2: " + outStr);
		
		//case 3:
		LambdaAsArg lambda2 = (str)->{
			String result = "";
			for (int i = str.length()-1; i >= 0; i--) {
				result+=str.charAt(i);
			}
			return result.toUpperCase();
		};
		outStr= methodTest(lambda2, inStr);
		System.out.println("outStr 3: " + outStr);
		
	}
}

interface LambdaAsArg {
	String func(String n);
}
