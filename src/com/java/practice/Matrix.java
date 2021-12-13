package com.java.practice;

public class Matrix {
	public static void main(String[] args) {
		
		int[][] matrix = new int[5][7];
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				System.out.print(matrix [i][j]+"  ");
			
			}
		System.out.println();
		}
		int plus = 0;
for (int i = 0; i < matrix.length; i++) {
	
	int value = 0;
	value = value + plus;
	
			for (int j = 0; j < matrix[i].length; j++) {
				value++;
				matrix [i][j] = value;  
			
			}
plus++;
			System.out.println();
		}
for (int i = 0; i < matrix.length; i++) {
	
	for (int j = 0; j < matrix[i].length; j++) {
		
		System.out.print(matrix [i][j]+"  ");
	
	}
System.out.println();
}
		


for (int i = 0; i < matrix.length; i++) {
	
	for (int j = 0; j < matrix[i].length; j++) {
		
		if(matrix [i] [j] == 5) {
		matrix [i][j] = 99;
	
	}
System.out.println();
}}



	for (int i = 0; i < matrix.length; i++) {
		
		for (int j = 0; j < matrix[i].length; j++) {
			
			System.out.print(matrix [i][j]+"  ");
		
		}
	System.out.println();
	}


}}
