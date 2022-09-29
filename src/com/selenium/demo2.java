package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Kalpana\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.get("https://www.facebook.com/");	
		Thread.sleep(5000);	
		String title2 = driver.getTitle();
		System.out.println(title2);	
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);		
		driver.navigate().forward();		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.close();
		driver.quit();
	}

}
