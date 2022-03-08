
package com.vowelandconsonant;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {

		System.out.println("Enter a Alphabet:");
		Scanner sc = new Scanner(System.in);
		char ch;
		ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("The entered Alphabet " + ch + " is a Vowel");

		} else {
			System.out.println("The entered Alphabet " + ch + " is a Consonant");
		}
		sc.close();
	}
}
