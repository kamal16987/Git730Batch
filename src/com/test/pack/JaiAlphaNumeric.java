package com.test.pack;

import java.util.Scanner;

public class JaiAlphaNumeric {

	public static void main(String[] args) {
		String str;
		String numbers;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the alphanumeric string");
		str = sc.nextLine();
		numbers = str.replaceAll("[^0-9]", "");
		System.out.println(numbers);
	}

}
