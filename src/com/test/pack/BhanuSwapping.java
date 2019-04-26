package com.test.pack;

import java.util.Scanner;

public class BhanuSwapping {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();{
		System.out.println("First number" +num1);
	}
	int num2=sc.nextInt();{
		System.out.println("second number" +num2);
	}
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
			
}
}
