package com.java.practice;


public class HWmatrix {
	static int[][] matrix = new int[5][5];

	public static void main(String[] args) {

		PrintMatrix();
		Initialize();
		PrintMatrix();
		multiplication();
		PrintMatrix();

	}

	public static void multiplication() {
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				matrix[i][j] = matrix[i][j] * 20;

			}
		}
		System.out.println();

	}

	public static void PrintMatrix() {

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j] + "  ");

			}
			System.out.println();
		}

	}

	public static void Initialize() {
		int plus = 0;
		for (int i = 0; i < matrix.length; i++) {

			int value = 0;
			value = value + plus;

			for (int j = 0; j < matrix[i].length; j++) {
				 value++;
				matrix[i][j] = value;

			}
			plus++;
		}
System.out.println();
	}
}