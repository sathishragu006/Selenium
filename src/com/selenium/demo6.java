package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish\\eclipse-workspace\\Kalpana\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
//	driver.get("https://www.facebook.com/");
//	WebElement fb = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//	fb.click();
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
//	Thread.sleep(5000);
//	WebElement s = driver.findElement(By.xpath("//select[@name='birthday_day']"));// ======
//	Select se = new Select(s);
//	se.selectByIndex(0);
//	Thread.sleep(5000);
//	se.selectByValue("5");
//	Thread.sleep(5000);
//	se.selectByVisibleText("9");
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();

//	driver.navigate().to("https://demoqa.com/select-menu");
	
//	int m = driver.findElement(By.xpath("//select[@name='cars']"));
//	Select S= new Select(m);
//	
//	S.selectByIndex(0);
//	S.selectByValue("saab");
//	S.selectByVisibleText("Audi");
//	
//	S.deselectByVisibleText("Audi");
//	
//	List<WebElement> A = S.getOptions();
//	for(int i=0; i<A.size();i++) {
//		System.out.println(A.get(i).getText());
//	}
//	List<WebElement> j = S.getOptions();
//	
//	
//	for (int m1 = 0; m1 < j.size(); m1++) {
//		System.out.println(j.get(m).getText());
//		
	}
//	
}
