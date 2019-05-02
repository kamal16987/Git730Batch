package com.test.pack;

import java.io.InputStreamReader;
import java.util.Scanner;

public class alphanumjash{
  public static void main(String[] args) {
	  Scanner scan = new Scanner(new InputStreamReader(System.in));
	    System.out.print("Enter alphaNumeric: ");
	    String x = scan.next();
	    String numStr = "";
	    int num;

	    for (int i = 0; i < x.length(); i++) {
	        char charCheck = x.charAt(i);
	        if(Character.isDigit(charCheck)) {
	            numStr += charCheck;
	        }
	    }

	    num = Integer.parseInt(numStr);
	    System.out.println("The extracted number is: " + num);
 
     
      }
 }
 

 


