package com.DivisionProblem;

import java.util.Scanner;

public class QuotientAndRemainder {

	public class QuotientReminder {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the Number to find Reminder quotient");
			int Div = sc.nextInt();

			System.out.println("Enter the Divisor");
			int Value = sc.nextInt();

			// Computation

			Math.floorDiv(Div, Value);
			int Remainder = (Div % Value);
			int Quotient = (Div / Value);
			System.out.println("Reminder is;" + Remainder + " and Qoutient is : " + Quotient);
			sc.close();
		}
	}

}
