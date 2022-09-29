package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Kalpana\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.navigate().refresh();
		driver.get("https://www.facebook.com/");
		Thread.sleep(8000);
		driver.navigate().refresh();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(8000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.get("https://www.facebook.com/");
		Thread.sleep(8000);
		driver.get("https://www.amazon.in/");
		String title2 = driver.getTitle();
		System.out.println(title2);
		String currentUrl2 = driver.getCurrentUrl();
		driver.navigate().refresh();
		System.out.println(currentUrl2);
		driver.close();
		driver.quit();
	}

}
