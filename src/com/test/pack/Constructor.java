//panneer

package com.test.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constructor {



	static WebDriver driver;
	public Constructor(){
		this(10,20);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\git 730ambatch\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	public Constructor(int a,int b){
		
		int c=a+b;
		
		System.out.println("The sum of A and B is"+c);
		
		
	}
	public Constructor(WebDriver driver1){
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
	

	public static void main(String[] args) {
		new Constructor ();
		new Constructor(driver);
		
		
		
	
	}

}


