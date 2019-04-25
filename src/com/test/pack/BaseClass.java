package com.test.pack;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public void displayName() {
		System.out.println("ENTER YOUR NAME");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\kamal16987\\Git730Batch\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement UserName = driver.findElement(By
				.xpath("//a[@class='gb_5d gb_1 gb_kb']"));
		UserName.click();
		WebElement txt = driver.findElement(By.xpath("//input[@type='email']"));
		txt.sendKeys("PANNEERSELVAM");
		
	}

	public static void main(String[] args) throws InterruptedException {
		BaseClass bc = new BaseClass();
		bc.displayName();

		bc.launchBrowser();
	}

	
	}


