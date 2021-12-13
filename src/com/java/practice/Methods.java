package com.java.practice;

public class Methods {
	public static void main(String[] args) {
		
		 
		        int [] array=new int[5];
		       
		        PrintArray(array);
		         IniArray(array);
		        System.out.println("After Initialize");
		        PrintArray(array);
		       int s= SumArray(array);
		        System.out.println("Sum: "+s);
		         
		    }
		    public static void PrintArray(int [] arr)
		    {
		        //int [] array=new int[6];
		       
		       for(int i=0;i<arr.length;i++)
		         {
		             System.out.println(arr[i]);
		         }
		      
		    }
		   
		    public static void IniArray(int [] arr1)
		    {
		         for(int i=0;i<arr1.length;i++)
		         {
		             arr1[i]=i;
		         }
		    }
		   
		    public static int SumArray(int [] arr1)
		    {
		        int sum=0;
		       for(int i=0;i<arr1.length;i++)
		         {
		            sum+=arr1[i];
		         }
		       // System.out.println("Sum: "+sum);
		        return sum;
		    }
		
	}

