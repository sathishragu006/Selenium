package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish\\eclipse-workspace\\Kalpana\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
//		1)//tagName[@attributeName='attributeValue']
//      2)//tagName[text()='Full text']
//      3)//tagName[contains(@attributeName,'attributeValue')]
//      4)//tagName[contains(text(),'half of the text')]
//      5)//tagName[normalize.space()='text']
//      6)(//tagName[@attributeName='attributeValue'])[index]

		
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));//tagName[text()='Full text']2METHOD
		signup.click();
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));//(//tagName[@attributeName='attributeValue'])[index]6TH METHOD
		firstname.sendKeys("sathish");
		
		WebElement surename = driver.findElement(By.xpath("(//input[@type='text'])[2]"));//(//tagName[@attributeName='attributeValue'])[index]6TH METHOD
		surename.sendKeys("R");
		
		WebElement  mail = driver.findElement(By.xpath("(//input[@type='text'])[3]"));//(//tagName[@attributeName='attributeValue'])[index]6TH METHOD
		mail.sendKeys("sathishragu006@gmail.com");
		WebElement reemail = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		reemail.sendKeys("sathishragu006@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));////tagName[@attributeName='attributeValue']1st method
		password.sendKeys("123456");
		
	}
	
}
	
	