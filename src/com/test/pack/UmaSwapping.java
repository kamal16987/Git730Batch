package com.test.pack;

import java.util.Scanner;

public class UmaSwapping {
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int a, b,temp;
		@SuppressWarnings("resource")
		Scanner sw = new Scanner(System.in);
		System.out.println("The numbers are");
		a = sw.nextInt();
		b = sw.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		/*temp=a;
		a=b;
		b=temp;*/
		System.out.println("swapping numbers are");
		System.out.println(a);
		System.out.println(b);
	}
}
