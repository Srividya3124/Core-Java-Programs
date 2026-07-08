package com.nirmaan.corejava;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int search = sc.nextInt();
		boolean found = false;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == search) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.print("Element found");
		}
		else {
			System.out.print("Element not found");
		}
	}

}
