package com.test.pack;

public class BaseClass {

	
	
	public void launchBrowser() {
		System.out.println("Method to launch brownser");
	}
	
	public void sendkeys() {
		System.out.println("Method to type value in textbox");
		
	}
	public static void main(String[] args) {
		String s="madam", reverse3="";
		int len = s.length();
		for (int i = len-1; i >= 0; i--) {
			reverse3=reverse3+s.charAt(i);
			}
		if (s.equals(reverse3)) {System.out.println("palidrome");
			
		}
		else {System.out.println("not palidrome");
			
		}
	}

}
