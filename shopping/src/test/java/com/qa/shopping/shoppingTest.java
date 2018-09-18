package com.qa.shopping;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



public class shoppingTest 
	{
		WebDriver driver= null;
		String url = "http://automationpractice.com/index.php";
		
		@Before
		public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/testing exe/chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		
		@Test 
		
		public void shoppingSearchBox() {
			String name= "\"DRESS\"";
			String name1= "Dress";
			driver.get(url);
			shoppingWebsite page= PageFactory.initElements(driver, shoppingWebsite.class);
			page.searchFor("Dress");
			dress page1= PageFactory.initElements(driver, dress.class);
			page1.dressItem();
			//assertEquals(name,page1.dressItem().getText());
			page1.dressPic().click();
			dressPage page2 = PageFactory.initElements(driver, dressPage.class);
//			assertEquals(name, get.dressItem().isDisplayed());
			assertEquals(name1,page2.dressName().getText());
		}

		@After
		public void teardown() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.close();
		}
	
	
	
	}
	
	
	
	
	
	
	//*[@id=""]/h1/span[1]
	
//*[@id="center_column"]/h1/span[1]

