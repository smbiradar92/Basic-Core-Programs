package com.factorsnew;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factors");
		int N = sc.nextInt();
		
		for(i=1; i <=N ; i++) {
			if(N%i == 0) {
				System.out.println(i);
			}
			
		}
		sc.close();
	}
}
