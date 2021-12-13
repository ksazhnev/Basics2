package com.java.practice;

public class Costructor2classPractice {

	int[] array;

	public Costructor2classPractice(int x) {

		array = new int[x];

	}

	public void intitialization() {

		for (int i = 0; i < array.length; i++) {

			array[i] = i;

		}
	}

	public void Print() {

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);

		}
	}
}
