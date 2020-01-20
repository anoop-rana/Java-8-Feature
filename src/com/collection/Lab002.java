package com.collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lab002 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A101","B102","C103");
		list.forEach(new TempConsumer());
		
	}
}

class TempConsumer implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}