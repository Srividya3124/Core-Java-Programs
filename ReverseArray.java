package com.nirmaan.corejava;

import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter array elements");
		for(int i = 0;i < arr.length;i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int[] revArr = new int[n];
		System.out.println("Reverse array");
		for(int i = 0;i < n ;i++) {
			revArr[i] = arr[n-1-i];
			System.out.print(revArr[i]+" ");
		}
		
		/***System.out.println("Reverse array");
		for(int i = 0;i <revArr.length;i++) {
			System.out.print(revArr[i]+" ");
		}***/
	}

}
