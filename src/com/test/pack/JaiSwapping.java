package com.test.pack;

import java.util.Scanner;

public class JaiSwapping {

	public static void main(String[] args) {
		int a, b;
		@SuppressWarnings("resource")
		Scanner sw = new Scanner(System.in);
		System.out.println("The numbers are");
		a = sw.nextInt();
		b = sw.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("swapping number are");
		System.out.println(a);
		System.out.println(b);
	}

}
