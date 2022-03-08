package com.swapnumbers;

import java.util.Scanner;

public class SwapNumbers {

	static int x, y, t;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of X");
		x = sc.nextInt();
		System.out.println("Enter the Value of Y");
		y = sc.nextInt();

		System.out.println("The numbers before Swapping are: X = " + x + " and Y = " + y);

		t = x;
		x = y;
		y = t;

		System.out.println("The numbers after Swapping are: X = " + x + " and Y = " + y);
		sc.close();
	}
}
