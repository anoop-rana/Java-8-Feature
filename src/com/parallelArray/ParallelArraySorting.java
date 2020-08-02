package com.parallelArray;

import java.util.Arrays;

public class ParallelArraySorting {

	public static void main(String[] args) {

		int[] arr = { 5, 8, 1, 0, 6, 9 };
		for (int i : arr) {
			System.out.print(i + " ");
		}

		// Sorting array elements parallel
		Arrays.parallelSort(arr);
		System.out.println("\nArray elements after sorting 1st");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		int[] arr002 = {5,8,1,0,6,9,50,-3};  
		// Sorting array elements parallel and passing start, end index  
        Arrays.parallelSort(arr002,0,4);  
        System.out.println("\nArray elements after sorting 2nd");  
        for (int i : arr002) {  
            System.out.print(i+" ");  
        }  
        
	}
}
