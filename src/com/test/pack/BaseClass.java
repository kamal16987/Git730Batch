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
	@SuppressWarnings("resource")
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
	// palindrome program by bhanuprasadh
	String s="madam",reverse1="";
	System.out.println(s);
	System.out.println("Bhanu reverse palidrome program");
	int len = s.length();
	for (int i = len - 1; i >=0 ; i--)
	{
		reverse1=reverse1+s.charAt(i);}
if (s.equals(reverse1)) {System.out.println("palidrome");	
}		
else {System.out.println("not palidrome");	
}
// palindrome program panneerselvamyourteam
String originalpanneer, reversepanneer =""; 
System.out.println("***panneer***");
System.out.println("Enter a string/number to check if it is a palindrome"); 
Scanner in = new Scanner(System.in);   
originalpanneer = in.nextLine();   
int lengthpanneer = originalpanneer.length();
System.out.println( "The length of the entered string is"+lengthpanneer);
for ( int i = lengthpanneer - 1; i>=0; i-- ) 
   reversepanneer = reversepanneer + originalpanneer.charAt(i);

if (originalpanneer.equals(reversepanneer))  
   System.out.println("Entered string/number is a palindrome.");  
else  
   System.out.println("Entered string/number isn't a palindrome.");   
} 
	// Gomathy
{  
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
	


