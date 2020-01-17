package com.lambda;

//Some Lambda Expression Examples
public class Lab002 {

	public static void main(String[] args) {
		// No-Arguments Lambda expressions
		MyNumber myValue = () -> 123;
		System.out.println("Some Value : " + myValue.getValue());

		myValue = () -> 100 * Math.random();
		System.out.println("Some Random Value : " + myValue.getValue());

		// Arguments Lambda expressions
		NumericTest2 numericTest = (n, m) -> (n + m) * 100;
		System.out.println("Some Value 3 : " + numericTest.test(5, 2));

	}

}

interface MyNumber {
	double getValue();
}

interface NumericTest2 {
	int test(int n, int d);
}
