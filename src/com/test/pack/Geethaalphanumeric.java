package com.test.pack;

import java.util.Scanner;

public class Geethaalphanumeric {
	
	public static void main(String[] args)
	{
		String str;
		String numbers;
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the alphanumeric string:");
	    str=sc.nextLine();
	    
	    numbers=str.replaceAll("[^0-9]", "");
	    System.out.println(numbers);
	    
	

}
}