package com.java.practice;

import java.util.Scanner;

public class Constructor1ClassPractice {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		Costructor2classPractice obj = new Costructor2classPractice(a);
		
	obj.intitialization();
	obj.Print();

	}
}
