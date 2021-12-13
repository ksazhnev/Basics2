package com.java.practice;

public class Constructor2class {

	
	int a;
	
	static double b;
	public Constructor2class () {
	System.out.println("I am constructor");
		
	}
	
	public int Sum (int x, int y) {
		
		a=x+y;
		System.out.println("Sum: " +a);
		System.out.println("Value of B: " +b);
		return a;
		
	}
	public static double Sum (double x, int y) {
		b=x+y;
		System.out.println("Sum: " +b);
		System.out.println("Value of B: " +b);
		return b;
	}
}

