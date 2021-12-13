package com.java.practice;

import java.util.Scanner;
public class HWmethods {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int[] array = new int[length];

		PrintArray(array);

		IniArray(array);
		System.out.println("After Initialize");
		PrintArray(array);
		Multiplication(array);
		System.out.println("Myltiplication of the array");
		PrintArray(array);
		Multiplicationby3(array);
		System.out.println("Myltiplication of the array by 3");
		PrintArray(array);
		int sum = SumEvenArray(array);
		System.out.println("Sum of the array  " + sum);
		ReplaceOdd(array);
		System.out.println("Replacement all odds by 1-");
		PrintArray(array);

	}

	public static void PrintArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void IniArray(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}
	}

	public static void Multiplication(int[] arr1) {

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr1[i] * arr1[i];
		}

	}

	public static void Multiplicationby3(int[] arr1) {

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr1[i] * 3;
		}

	}

	public static int SumEvenArray(int[] arr1) {
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0) {

				sum += arr1[i];
			}
		}
		return sum;
	}

	public static void ReplaceOdd(int[] arr1) {

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 != 0) {

				arr1[i] = -1;
			}
		}
	}
}
