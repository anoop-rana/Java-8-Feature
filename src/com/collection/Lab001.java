package com.collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//forEach Lambda Expression
public class Lab001 {

	public static void main(String[] args) {
		//For Normal Case
		System.out.println("**** For Normal Case ****");
		List<String> list1 = Arrays.asList("A","B","C");
		for (String p : list1) {
			System.out.println(p);
		}
		
		//For Lambda Expression
		System.out.println("**** For Lambda Expression ****");
		List<String> list2 = Arrays.asList("A","B","C");
		list2.forEach((c)-> System.out.println(c));
		
		//For Lambda Expression with Consumer Interface
		System.out.println("**** For Lambda Expression with Consumer interface ****");
		List<String> list3 = Arrays.asList("A","B","C");
		list3.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});
	}
	
}
