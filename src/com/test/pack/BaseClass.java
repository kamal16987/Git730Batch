package com.test.pack;

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
	String s="madam",reverse="";
	System.out.println(s);
	System.out.println("Bhanu reverse palidrome program");
	int len = s.length();
	for (int i = len - 1; i >=0 ; i--)
	{
		reverse=reverse+s.charAt(i);}
if (s.equals(reverse)) {System.out.println("palidrome");
	
}
		
else {System.out.println("not palidrome");
	
}
}
}





