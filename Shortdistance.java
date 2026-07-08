package com.nirmaan.corejava;

import java.util.Scanner;

public class Shortdistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//path : WNEENESENNNN
		System.out.println("Enter Path(in caps)");
		String path = sc.next();
		
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < path.length(); i++) {
			char curr = path.charAt(i);
			if(curr == 'W') {
				x--;
			}
			else if(curr == 'N') {
				y++;
			}
			else if(curr == 'E') {
				x++;
			}
			else {
				y--;
			}
			
		}
		// distance x,y from 0,0 = sqrt.root((y-0)sq -(x-0)sq) = y sq - x sq
		double dist = Math.sqrt(y*y - x*x);
		System.out.print("Distance of point " + dist);
		
		
		
	}

}
