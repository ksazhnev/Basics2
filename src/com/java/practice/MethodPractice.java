package com.java.practice;

import java.util.Scanner;

public class MethodPractice {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your array size");

		int length = input.nextInt();

		int[] array = new int[length];

		PrintArray(array);
		Initialize(array);
		PrintArray(array);
		int OddSumm = Odd(array);
		int EvenSum = Even(array);
		System.out.println("MaxSum");
		MaxSumm(OddSumm, EvenSum);
		System.out.println("Enter your value");

		int size = input.nextInt();

		Multiplication(array, size);
		System.out.println("Multiplication");
		PrintArray(array);
	}

	public static void PrintArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}

	public static void Initialize(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {

			arr1[i] = i;
		}
		System.out.println("Initializaton");

	}

	public static int Odd(int[] arr2) {

		int sumEven = 0;
		for (int i = 0; i < arr2.length; i++) {

			if (arr2[i] % 2 != 0) {
				sumEven += arr2[i];

			}

		}
		return sumEven;
	}

	public static int Even(int[] arr3) {

		int sumOdd = 0;
		for (int i = 0; i < arr3.length; i++) {

			if (arr3[i] % 2 == 0) {
				sumOdd += arr3[i];

			}
		}
		return sumOdd;
	}

	public static void MaxSumm(int sumOdd, int sumEven) {

		if (sumOdd > sumEven) {
			System.out.println(sumOdd);
		} else
			System.out.println(sumEven);
	}

	public static void Multiplication(int[] arr4, int size) {

		for (int i = 0; i < arr4.length; i++) {

			arr4[i] = arr4[i] * size;

		}

	}

}
