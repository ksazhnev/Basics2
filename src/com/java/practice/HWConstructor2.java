package com.java.practice;

public class HWConstructor2 {

	static int[] array;

	public HWConstructor2(int x) {

		array = new int[x];

	}

	public static void Intitialization() {

		for (int i = 0; i < array.length; i++) {

			array[i] = i * 3;

		}
	}

	public static int ValueOfSum() {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];

		}
		return sum;
	}

	public static void Print() {

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);

		}
	}
}
