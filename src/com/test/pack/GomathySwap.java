package com.test.pack;

import java.util.Scanner;

public class GomathySwap {
	public static void main(String[] args) {
		int a,b;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping:");
		System.out.println(a);
		System.out.println(b);
	}

}
