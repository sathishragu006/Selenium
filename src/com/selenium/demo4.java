package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish\\eclipse-workspace\\Kalpana\\Driver\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("sathishragu006@gmail.com");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("12345");
		WebElement log = driver.findElement(By.id("loginbutton"));
		log.click();
		
	}

}
