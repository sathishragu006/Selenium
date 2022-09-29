package com.selenium;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbbb {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Sathish\\eclipse-workspace\\Siva\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/men-tshirts");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	driver.findElement(By.xpath("//span[@class='product-strike']/preceding::span[class='desktop-superscriptTag']"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	String s =" the by the people ";
	String[] allwords = s.split(" ");
	Map<String,Integer>m=new HashMap<String,Integer>();
	for (String word : allwords) {
		if(m.containsKey(word)) {
			Integer value = m.get(word);
			m.put("word", value+1);
			
		}
		else {
			m.put(word, 1);
		}
		
		}
		System.out.println(m);
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1);
			System.out.println();
			
		}
	}
	
}

