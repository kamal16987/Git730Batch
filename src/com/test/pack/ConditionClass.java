package com.test.pack;

import java.util.Scanner;

public class ConditionClass {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println(num + "is even");
			
		}
		else {
			System.out.println(num + "is odd");
			
		}
		
	}

}
