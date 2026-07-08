package com.nirmaan.corejava;

import java.util.Scanner;

public class PerfectNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int factorSum = 0;
		for(int i = 1; i < num; i++) {
			if(num%i == 0) {
				factorSum = factorSum + i;
//				System.out.print(i + "+");
			}
		}
	
		if(factorSum == num) {
//			System.out.print(" = ");
			System.out.println("Factor sum is " + factorSum);
	        System.out.println("Number is a Perfect Number");
	    }
		else {
			System.out.println("Number is not a perfect Number");
		}
		
		
	}

}
