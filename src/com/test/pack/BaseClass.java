package com.test.pack;

public class BaseClass {

	public static void main(String[] args) {
		System.out.println("Adding my base class");

	}
	
	public void launchBrowser() {
		System.out.println("Method to launch brownser");
	}
	
	public void sendkeys() {
		System.out.println("Method to type value in textbox");
	}

}
class Palindromepanneer{  
	 public static void main(String args[]){  
	  int r,sum=0,temp;    
	  int n=454;//It is the number variable to be checked for palindrome  
	  
	  temp=n;    
	  while(n>0){    
	   r=n%10;  //getting remainder  
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	}  
	}  