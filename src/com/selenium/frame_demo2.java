package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame_demo2 {
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\eclipse-workspace\\Kalpana\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	
	
	driver.switchTo().frame(0);
	WebElement frame = driver.findElement(By.xpath("//input[@type='text']"));
	frame.sendKeys("welldone");
	driver.switchTo().defaultContent();
	
	
	
	
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	