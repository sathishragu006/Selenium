package com.selenium;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Argument;

public class aaaa {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Siva\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window,scrollBy(0,200)");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("sathishabcd");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Sathish@123");
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
		WebElement a1 = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(a1);
		s.selectByIndex(5);
		WebElement a2 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select m = new Select(a2);
		m.selectByValue("Hotel Cornice");
		WebElement a3 = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select n = new Select(a3);
		n.selectByVisibleText("Deluxe");
		WebElement a4 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select o = new Select(a4);
		o.selectByIndex(5);
		WebElement a9 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		a9.sendKeys("15/9/2022");
		WebElement a10 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		a10.sendKeys("17/9/2022");
		WebElement a5 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select p = new Select(a5);
		p.selectByIndex(1);
		WebElement a6 = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select q = new Select(a6);
		q.selectByIndex(1);
		Thread.sleep(5000);
		WebElement kk = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));//===========
		kk.click();
		Thread.sleep(5000);
		WebElement a = driver.findElement(By.xpath("//input[@type='submit']"));
		a.click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		TakesScreenshot screen = (TakesScreenshot) driver;
		File aa = screen.getScreenshotAs(OutputType.FILE);
		File mm = new File("C:\\Users\\Sathish\\eclipse-workspace\\Siva\\ScreenShot\\man.png");
		FileHandler.copy(aa, mm);
		driver.navigate().refresh();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)");
		WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
		name.sendKeys("sathish");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("ragu");
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("sathishhjhhdklwhkldjk;ladm,.ma,sdm,.asm,.maclma,.mawlml;aw");
		WebElement credit = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		credit.sendKeys("1234567891234567");
		WebElement yy = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s11 = new Select(yy);
		s11.selectByIndex(2);
		WebElement xx = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s12 = new Select(xx);
		s12.selectByIndex(2);
		WebElement cc = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s13 = new Select(cc);
		s13.selectByIndex(2);
		WebElement a15 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		a15.sendKeys("177");
		WebElement click1 = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		click1.click();
		Actions ac = new Actions(driver);
		ac.contextClick().build().perform();
		driver.close();
		driver.quit();
	}
}
