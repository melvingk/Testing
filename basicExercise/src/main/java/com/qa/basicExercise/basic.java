package com.qa.basicExercise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert.*;


public class basic {
	
	WebDriver driver=null;
	String url = "http://thedemosite.co.uk/";
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Admin/Desktop/testing exe/chromedriver.exe");
	driver = new ChromeDriver();
	}
	
@Test
	
	public void mthodTest() {
	driver.get(url);
	
		String username = "kamehameha";
		String password= "ahhhh";
		
		basicTest page = PageFactory.initElements(driver, basicTest.class);
		
		page.addingUser(username, password);
		page.loginUser(username, password);
		
		//assertEquals("**Successful Login**",driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText().trim());
		
//		assertEquals("itisme",driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote")).getText());
}	


	@After
	
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
	
}




//	driver.manage().window().maximize();