package com.qa.driver;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {
	WebDriver driver;
	String url = "https://www.google.co.uk/";
	
	@Before
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Admin/Desktop/testing exe/chromedriver.exe");
	driver = new ChromeDriver();
	
	}
	
@Test

	
	public void mthodTest() {
		driver.manage().window().maximize();					// opens and maximizes window
		driver.get(url);	
		driver.get("http://www.crunchyroll.com/videos/anime");
		
		assertEquals("1Piece",driver.findElement(By.id("library_article_header")).getText());
	}	
	
	
	
	@After
	
	public void teardown()
	{
		driver.quit();
	}
	
										// gets the url above and opens it		
//		driver.findElement(By.id("lst-ib")).click();			// find the textbox element with the id stated			
//		driver.findElement(By.id("lst-ib")).sendKeys("anime"); // types (send words) to the textbox
//		driver.findElement(By.id("lst-ib")).submit();			// submits it 
		//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[2]/div/div/div[1]/a/h3")).click();
		 // it then opens another url 
//		driver.findElement(By.id("header_search_input")); // finds the text box
//		driver.findElement(By.id("header_search_input")).sendKeys("one piece"); // send the words to the textbox
//		driver.findElement(By.id("header_search_input")).sendKeys(Keys.ENTER); // submits the text using the enter key
//		driver.findElement(By.xpath("//*[@id=\"main_results\"]/ul/li[2]/a/table/tbody/tr/td[2]/span/span[1]")).click(); // opens the link to another page
	 // asserts that there is a title page called 1Piece
		//*[@id="rso"]/div[1]/div/div[2]/div/div/div[1]/a/h3
		
		//*[@id="rso"]/div[1]/div/div[2]/div/div/div[1]/a/h3
		
		//	library_article_header

//		checkElement.submit();
//
//		WebElement checkNextElement = 
//		checkNextElement.click();
//		
//		WebElement checkNextElement1 = driver.findElement(By.id("header_search_input"));
//		checkNextElement1.sendKeys("One Piece");
//		checkElement.submit();
	}

