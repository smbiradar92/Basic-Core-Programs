package com.oddAndEven;

import java.util.Scanner;

public class OddAndEven {
	
	public static void main(String[] args) {
		
		System.out.println("Please Enter the Number to chcek for even or odd:");
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("The Entered number " +N + " " + "is EVEN");			
		} else {
			System.out.println("The Entered number " +N + " " + "is ODD");
		}
		sc.close();
	}

}
