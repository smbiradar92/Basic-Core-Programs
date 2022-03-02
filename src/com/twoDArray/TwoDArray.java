package com.twoDArray;

import java.io.PrintWriter;

import java.util.Scanner;

public class TwoDArray {

	int[][] number;
	int i, j;

	public TwoDArray(int row, int col) {
		number = new int[row][col];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		int row = sc.nextInt();

		System.out.println("Enter the number of columns");
		int column = sc.nextInt();

		TwoDArray twoDArray = new TwoDArray(row, column);
		twoDArray.saveNumbers(row, column);

		System.out.println("----------Printing an Array to file-------");
		twoDArray.printArray(row, column);

		sc.close();
	}

	private void printArray(int row, int column) {
		try {
			PrintWriter writer = new PrintWriter("abc.txt");
			for (i = 0; i < row; i++) {
				for (j = 0; j < column; j++) {
					writer.print(number[i][j]);
				}
				writer.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void saveNumbers(int row, int column) {
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {

				System.out.println("Enter the [" + i + "]" + "[" + j + "] :");
				number[i][j] = sc.nextInt();
			}
		}

		sc.close();
	}

}
