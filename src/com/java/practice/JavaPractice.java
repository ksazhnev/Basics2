package com.java.practice;

import java.util.Scanner;


public class JavaPractice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter a number");
			array[i] = input.nextInt();

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 3;

		}
		System.out.println("Print with multiplication");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sum = sum + array[i];

			}

		}
		System.out.println("Sum of all even numbers " +sum);

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				array[i] = 0;

			}
		}
		System.out.println("Print Final");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}
