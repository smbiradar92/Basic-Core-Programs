package com.largestnumber;

import java.util.Scanner;

public class LargetNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first number");
		int a = sc.nextInt();
		
		System.out.println("Please enter the second number");
		int b = sc.nextInt();
		
		System.out.println("Please enter the third number");
		int c = sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("The largest number is " +a);
		} else if(b>=a && b>=c) {
			System.out.println("The largest number is " +b);
		} else {
			System.out.println("The largest number is " +c);
		}
		sc.close();
	}
}
