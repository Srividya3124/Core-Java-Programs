package com.nirmaan.corejava;
import java.util.Scanner;
public class Creating2dArray {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no.s of rows");
		int m = sc.nextInt();
		System.out.println("Enter no.s of columns");
		int n = sc.nextInt();
		
		int[][] MyArr = new int[m][n];
		
		for(int i = 0;i < m;i++) {
			for(int j = 0;j < n;j++) {
				MyArr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i < m; i++) {
			for(int j = 0;j < n;j++) {
				System.out.print(MyArr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
