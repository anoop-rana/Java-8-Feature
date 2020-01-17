package com.lambda;

//Block Lambda Expressions
public class Lab003 {
	public static void main(String[] args) {
		NumericFunc factorial = (m) -> {
			int result = 1;
			for (int i = 1; i <= m; i++) {
				result = i * result;
			}
			return result;
		};
		
		System.out.println("Factorial is : " + factorial.func(4));
	}
}

interface NumericFunc {
	int func(int n);
}
