package com.test.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaseClass {
   public BaseClass() {
	   int a;
		int b;
		int c;			
		b=3;
		c=8;
		a=b+c;
		System.out.println(a);
		c=a-b;
		b=c+b;
		System.out.println(b);
		List <String> l4=new ArrayList<String>();
		int size = l4.size();
		System.out.println(size);
	
			if(l4.isEmpty()){
				List<String> l7=new ArrayList<String>();
				l7.add("panneer");
				l7.add("selam");
				l7.add("PanneerSelvam");
				System.out.println(l7);
			l7.set(1,"Selvam");
			System.out.println(l7);
				if(l7.contains("Sel")){
					List<Integer> l8=new ArrayList<Integer>();
					l8.add(0);
					System.out.println(l8);}
	List<String> newList=new ArrayList<String>();
    for(int i=0;i<=6;i++){
    @SuppressWarnings("resource")
	Scanner sc2=new Scanner(System.in);			
    newList.add(sc2.nextLine());
	System.out.println(newList);
	}}}	
	public void sendkeys(){
    System.out.println("Method to type value in textbox");		
	}	
	public void mouseoveractions() {
    System.out.println("method to move element");
	}	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BaseClass b=new BaseClass();
	
	// palindrome program by bhanuprasadh
	String s="madam",reverse1="";
	System.out.println(s);
	System.out.println("Bhanu reverse palidrome program");
	int len = s.length();
	for (int i = len - 1; i >=0 ; i--)
	{
		reverse1=reverse1+s.charAt(i);
   if (s.equals(reverse1)) {System.out.println("palidrome");	
   }}
// palindrome program panneerselvamyourteam
   String originalpanneer, reversepanneer =""; 
   System.out.println("***panneer***");
   System.out.println("Enter a string/number to check if it is a palindrome"); 
   Scanner in = new Scanner(System.in);   
   originalpanneer = in.nextLine();   
   int lengthpanneer = originalpanneer.length();
   System.out.println( "The length of the entered string is"+lengthpanneer);
   for ( int i = lengthpanneer - 1; i>=0; i-- ) {
   reversepanneer = reversepanneer + originalpanneer.charAt(i);}
   if (originalpanneer.equals(reversepanneer))  {
   System.out.println("Entered string/number is a palindrome.");  }
   else  
   System.out.println("Entered string/number isn't a palindrome.");   
	}
                       //Gomss
	{
	int r, sum=0, temp; 
	@SuppressWarnings("resource")
	Scanner sc1=new Scanner(System.in);
	int num=sc1.nextInt();
	temp=num;
	while(num>0) {
	r=num%10;
	sum=(sum*10)+r;
	num=num/10;}				
	if(temp==sum) {
	System.out.println("Palidrome");}
	else {
	System.out.println("not a palidrome");}}}
			
			
			

