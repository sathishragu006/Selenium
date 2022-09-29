package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class proj_demo1 {
	public static void main(String[] args) throws InterruptedException, IOException {

		// Browser Launch=================

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Siva\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		// single frame(automation demo site)=============
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(0);
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text.sendKeys("welcome to selenium");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		// Multiple frame(automation demo site)=============
		WebElement multi = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		multi.click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("weldone you entered in to multiple frame");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		// drop================================
		driver.get("https://www.facebook.com/");
		WebElement fb = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		fb.click();
		Thread.sleep(5000);
		WebElement s = driver.findElement(By.xpath("//select[@name='birthday_day']"));// ======
		Select se = new Select(s);
		se.selectByIndex(0);
		Thread.sleep(5000);
		se.selectByValue("5");
		Thread.sleep(5000);
		se.selectByVisibleText("9");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		// Multiple drop down====????????????????
		System.out.println(se.isMultiple());		
		driver.navigate().refresh();
		// Screenshot==============================
		Thread.sleep(5000);
		TakesScreenshot screen = (TakesScreenshot)driver;
		File a = screen.getScreenshotAs(OutputType.FILE);
		File b = new File("C:\\Users\\Sathish\\eclipse-workspace\\Siva\\ScreenShot\\screen.png");
		FileHandler.copy(a, b);
		String title2 = driver.getTitle();
		System.out.println(title2);
		// javascript -Executor============================
		driver.get("https://www.amazon.in//");
		//Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scroll = driver.findElement(By.xpath("//div[text()='Get to Know Us']"));
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		//Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-5000);");
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		String title1 = driver.getTitle();
		System.out.println(title1);
		// alert==========
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		WebElement promt = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promt.click();
		driver.switchTo().alert().sendKeys("nvhjgvjh");
		driver.switchTo().alert().accept();
		// Actions
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01uo6w3xdqkpxl19uofbeyz6wl101140.node0");
		Actions ac = new Actions(driver);
		Thread.sleep(5000);
		WebElement drop = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement drag = driver.findElement(By.xpath("//div[@id='form:drop_content']"));
		ac.dragAndDrop(drop, drag).build().perform();
		WebElement drop1 = driver.findElement(By.xpath("//div[@id='form:conpnl_header']"));
		ac.clickAndHold(drop1).build().perform();
		ac.moveToElement(drop1, 1000, 0).build().perform();
		String url5 = driver.getCurrentUrl();
		System.out.println(url5);
		driver.get("https://www.amazon.in/");
		WebElement ss = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		Actions ac1 = new Actions(driver);
		ac1.contextClick(ss).build().perform();
		driver.close();
		driver.quit();
	}

}
