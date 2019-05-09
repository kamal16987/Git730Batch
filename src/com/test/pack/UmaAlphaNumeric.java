package com.test.pack;

import java.util.Scanner;

public class UmaAlphaNumeric {

	public static void main(String[] args) {
		String str;
		String numbers;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alpha numerc string ");
		str = sc.nextLine();
		numbers=str.replaceAll("[^0-9]", "");
		System.out.println(numbers);

	}

}
