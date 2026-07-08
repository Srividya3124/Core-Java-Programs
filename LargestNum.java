package com.nirmaan.corejava;

import java.util.Scanner;  //Scanner class ni import chestunnam

public class LargestNum {  //LargestArray ane class create chestunnam. 

	public static void main(String[] args) {     //Program execution start ayye method.
		                                        //JVM first ee method ni call chestundi.
		Scanner sc = new Scanner(System.in);   //Scanner object create chestunnam to take input from user.
		int n = sc.nextInt();
		int arr[] = new int[5];               // memory allocate chesthunnam(eg:5)
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();            //array lo inputs isthunnam.
		}
        int largestNum = arr[0];              //First element ni largest ani assume chestunnam
        for(int i = 1; i < arr.length;  i++) {
        	if(arr[i] > largestNum) {
        		largestNum = arr[i];
        	}
        }
        System.out.print(largestNum);
     
	}

}
