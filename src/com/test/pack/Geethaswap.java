package com.test.pack;

import java.util.Scanner;

public class Geethaswap {
	public static void main(String[] args) {
		int x,y;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		x=sc.nextInt();
		y=sc.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("The swapping numbers are:");
		System.out.println(x);
		System.out.println(y);
	}

}
