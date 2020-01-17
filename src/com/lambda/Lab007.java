package com.lambda;

//Lambda Expressions and Exceptions
public class Lab007 {

	public static void main(String[] args) {
		double[] values = {};
		// double [] values = {1.0, 2.0, 3.0, 4.0, 5.0};
		DoubleNumericArrayFunc average = (n) -> {
			double sum = 0;
			if (n.length == 0)
				throw new EmptyArrayException();
			for (int i = 0; i < n.length; i++) {
				sum += n[i];
			}
			return sum / n.length;
		};
		try {
			System.out.println("Average of values is : " + average.func(values));
		} catch (EmptyArrayException e) {
			e.printStackTrace();
		}

	}

}

class EmptyArrayException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmptyArrayException() {
		super("Empty Array");
	}
}

interface DoubleNumericArrayFunc {
	double func(double[] n) throws EmptyArrayException;
}
