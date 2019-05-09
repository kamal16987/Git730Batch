package com.test.pack;

import java.util.Scanner;

public class BhanuPalidrome {
	static int r, sum=0, temp;
	 
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;}
			
			if(temp==sum) {
				System.out.println("Palidrome");
			}
			else {
				System.out.println("not a palidrome");
			}
			
		}
		
	}


