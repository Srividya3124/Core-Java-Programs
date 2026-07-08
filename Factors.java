package com.nirmaan.corejava;

import java.util.Scanner;

public class Factors {
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		System.out.print("Factors of number : ");
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
		
	}

}
