package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Siva\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
//single frame====
		driver.switchTo().frame(0);
		WebElement g = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		g.click();
		
		
		driver.switchTo().defaultContent();
		// driver.switchTo().frame("kjjkb");

	}
}









//===================================================================================================================



////JavascriptExecutor js = (JavascriptExecutor) driver;
////WebElement ref = driver.findElement(By.xpath("//a[text()='Help']"));
////js.executeScript("arguments[0].scrollIntoView();", ref);// =====
////Thread.sleep(5000);
////js.executeScript("window.scrollBy(0,5550);");
//////========================================================================================================
//Thread.sleep(5000);
//driver.get("https://demo.automationtesting.in/Frames.html");
//Thread.sleep(5000);
//
//