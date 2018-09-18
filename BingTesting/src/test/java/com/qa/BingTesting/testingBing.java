package com.qa.BingTesting;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class testingBing 
{
	WebDriver driver= null;
	final String url = "https://www.bing.com/";
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Admin/Desktop/testing exe/chromedriver.exe");
	driver = new ChromeDriver();
	
	}
	
	@Test 
	
	public void bingSearchBox() {
		driver.get(url);
		bing page= PageFactory.initElements(driver, bing.class);
		page.searchFor("Selenium");
		WebElement checkElement = driver.findElement(By.id("sb_form_q"));
		assertEquals("Selenium", checkElement.getAttribute("value"));
	}

	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
	
}
