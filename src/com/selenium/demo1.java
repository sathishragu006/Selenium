package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Siva\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		// Thread.sleep(5000);

		driver.switchTo().alert().sendKeys("hello");// ======
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
