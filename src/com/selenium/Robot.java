package com.selenium;
import java.awt.*; 
import java.awt.AWTException;
import java.awt.event.KeyEvent;
//import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot {
	public static void main(String[] args)throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Siva\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions ac = new Actions(driver);
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		ac.contextClick(mob).build().perform();
//
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
////	
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_PRINTSCREEN);
//		
		
	}

	private void keyRelease(int vkDown) {
		// TODO Auto-generated method stub
		
	}


		
	}

