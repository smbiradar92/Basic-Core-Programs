package com.distance;

public class Distance {

	public static void main(String[] args) {

		// By using Command line Arguments method
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		System.out.println("The entered value of x is : " + x);
		System.out.println("The entered value of y is : " + y);

		double distance = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
		System.out.println("The distance between (0, 0) and (" + x + "," + y + ")\" is " + distance);

	}

}
