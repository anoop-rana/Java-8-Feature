package com.lambda;

public class Lab001 {

	int a = 10;
	int b = 20;
	
	public int add() {
		return a + b;
	}
	public static void main(String[] args) {
		System.out.println("Add : " + new Lab001().add());
	}
}
