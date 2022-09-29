package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void main(String[] args) throws IOException  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Siva\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		TakesScreenshot screen = (TakesScreenshot) driver;
		File a = screen.getScreenshotAs(OutputType.FILE);
		File b = new File("C:\\Users\\Sathish\\eclipse-workspace\\Siva\\ScreenShot\\screen.png");
		FileHandler.copy(a, b);
	
	};
}
