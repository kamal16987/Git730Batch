//panneer
package com.test.pack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\workspace\\DropDown\\driver\\chromedriver.exe\\" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement dDn = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(dDn);
		s.selectByIndex(11);
		
		WebElement dDn1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(dDn1);
		s1.selectByIndex(11);
		
		WebElement dDn2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(dDn2);
		s2.selectByIndex(50);
		
}
}