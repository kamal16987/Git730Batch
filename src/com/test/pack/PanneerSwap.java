package com.test.pack;

public class PanneerSwap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping");
		System.out.println("Value of num1 is :" + a);
		System.out.println("Value of num2 is :" +b);
		
		//add both the numbers and assign it to first
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("after swapping");
		System.out.println("Value of num1 is :" + a);
		System.out.println("Value of num2 is :" +b);
	}
 
 


	}

