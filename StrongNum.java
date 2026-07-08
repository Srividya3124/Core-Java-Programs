package com.nirmaan.corejava;

import java.util.Scanner;
public class StrongNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number ");
		int num = sc.nextInt();                           
		
		int original = num;                               
		int factSum = 0;
		
		while(num > 0) {                                
			int digit = num % 10;   
			int fact = 1;
		    for(int i = 1; i <= digit; i++) {           
		    	fact = fact*i;                          
		    	
		    }
		    factSum += fact; 
		                      
		    num = num/10; 
		    
		}
		
		if(original == factSum) {
			
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a Strong Number");
		}
		sc.close();
	}

}
