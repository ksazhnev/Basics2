package com.java.practice;

import java.util.Scanner;

public class HWConstructor {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	
	HWConstructor2 obj = new HWConstructor2(a);
	
		HWConstructor2.Print();
		HWConstructor2.Intitialization();
		System.out.println(" ");
		HWConstructor2.Print();
		int sum = HWConstructor2.ValueOfSum();
		System.out.println("Sum of the array " + sum);
		
	}
}
