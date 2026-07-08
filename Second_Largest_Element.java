package com.nirmaan.corejava;

import java.util.Scanner;

public class Second_Largest_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int largestNum1 = arr[0];
		int largestNum2 = arr[0];
		
		for(int i = 1;i < arr.length;i++) {
			if(arr[i] > largestNum1) {
				largestNum2 = largestNum1;
				largestNum1 = arr[i];
			}
			else if(arr[i] > largestNum2 && arr[i] != largestNum1) {
				largestNum2 = arr[i];
			}
		}
		System.out.println(largestNum2);
				

	}

}
