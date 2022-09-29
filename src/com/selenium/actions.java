package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\eclipse-workspace\\Siva\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01uo6w3xdqkpxl19uofbeyz6wl101140.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		Actions ac =new Actions(driver);
		Thread.sleep(5000);
		WebElement drop = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement drag = driver.findElement(By.xpath("//div[@id='form:drop_content']"));
		
		ac.dragAndDrop(drop, drag).build().perform();
		
		WebElement drop1 = driver.findElement(By.xpath("//div[@id='form:conpnl_header']"));
		
		ac.clickAndHold(drop1).build().perform();
		ac.moveToElement(drop1,1000,0).build().perform();
		
	}

}
