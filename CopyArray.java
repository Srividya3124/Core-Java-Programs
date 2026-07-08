package com.nirmaan.corejava;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		System.out.println("Enter array1 elements");
		for(int i = 0;i < arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		
		 
		int[] arr2 = new int[n];
		System.out.println("Elements of Array2");
		for(int i = 0;i < arr2.length;i++) {
			arr2[i] = arr1[i];
		}
		for(int i = 0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
 
	}

}
