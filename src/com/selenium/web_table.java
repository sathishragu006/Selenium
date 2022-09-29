package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Siva\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://scholarships.gov.in/");
		driver.manage().window().maximize();
		
		List<WebElement> findElement = driver.findElements(By.xpath("//table[@class='table table-sm table-bordered table-style']/tbody/tr[2]/td"));
		
	}

}
