package com.nirmaan.corejava;

import java.util.Scanner;


public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		
		int arr[] = new int[limit + 11];
		
		System.out.println("Table");
		
		for(int i = 1; i < limit+1; i++) {
			arr[i] = num*i;
			
		}
		for(int i = 1; i < limit +1; i++) {
			System.out.println(num + " * " + i + " = " + arr[i]);
		}

	}

}
