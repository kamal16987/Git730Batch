package com.test.pack;

import java.util.Scanner;

public class BaseClass {

   public void launchBrowser() {
		System.out.println("Method to launch brownser");
	}
	
	public void sendkeys() {
		System.out.println("Method to type value in textbox");
		
		
	}
	
	public void mouseoveractions() {
    System.out.println("method to move element");
	}
	
	public static void main(String[] args) {
	String original,reverse="";
	Scanner sc=new Scanner(System.in);	
    System.out.println("Enter the string to reverse");
	original=sc.nextLine();
	
	int length=original.length();
	for(int i=length-1;i>=0;i--)
		reverse=reverse+original.charAt(i);
	if(reverse.equals(original)) {
		System.out.println("Given string is palindrome");
	}
	else {
		System.out.println("Given string is not a palindrome");

	}
	
	}
	
	}




 
