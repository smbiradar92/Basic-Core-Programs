package com.quadratic;

import java.util.Scanner;

public class Quadratic {
	
	public static void main(String[] args) {
		
		int a, b, c, delta, root1, root2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		a = sc.nextInt();
		System.out.println("Enter the value of b");
		b = sc.nextInt();
		System.out.println("Enter the value of c");
		c = sc.nextInt();
		
		delta = (b*b - (4*a*c));
		root1 = (int) (-b + Math.sqrt(delta)/2*a);
		root2 = (int) (-b - Math.sqrt(delta)/2*a);
		
		System.out.println("The roots of the equation "+a+"x^2+"+b+"x+"+c+ " are : " +root1+ " and "+root2);
		sc.close();
	}

}

