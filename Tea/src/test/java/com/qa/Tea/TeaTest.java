package com.qa.Tea;
 

import java.util.List;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Constants;
import cucumber.api.java.After;

public class TeaTest {
	
	
	WebDriver driver= null;
	ExtentTest test;
	ExtentReports report = Constants.report; 
	
	@Before
	public  void setup() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Admin/Desktop/testing exe/chromedriver.exe");
		
	}
	
	@Given("^the correct web address$")
	public void the_correct_web_address() {
		test = report.startTest("The start of the Test");
		
		driver = new ChromeDriver();
		
		test.log(LogStatus.INFO,"Page opened");
		
		driver.get(Constants.websiteURL);	
		
		  
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page(){
		
		test.log(LogStatus.INFO,"Menu has been selected"); 
		HomePage home = PageFactory.initElements(driver, HomePage.class);   
		home.selectMenu();
		 
	}
	
	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
		
		MenuPage menu = PageFactory.initElements(driver, MenuPage.class);
		
		if ((menu.greenTea().getText().equals("Green Tea")))
		{
			test.log(LogStatus.PASS,"There is a Green Tea Product"); 
		}
		else
		{
			test.log(LogStatus.FAIL,"There isnt Green Tea Product"); 
		}
			
		if ((menu.redTea().getText().equals("Red Tea")))
		{
			test.log(LogStatus.PASS,"There is a Red Tea Product"); 
		}
		else
		{
			test.log(LogStatus.FAIL,"There isnt Red Tea Product"); 
		}
		if ((menu.oolongTea().getText().equals("Oolong Tea")))
		{
			test.log(LogStatus.PASS,"There is a Oolong Tea Product"); 
		}
		else
		{
			test.log(LogStatus.FAIL,"There isnt Oolong Tea Product"); 
		}
//		test.log(LogStatus.PASS,"There is a Green Tea Product"); 
//		assertEquals("Green Tea", (menu.greenTea().getText()));
//		test.log(LogStatus.PASS,"There is a Red Tea Product"); 
//		assertEquals("Red Tea", (menu.redTea().getText()));
//		test.log(LogStatus.PASS,"There is a Oolong Tea Product"); 
//		assertEquals("Oolong Tea", (menu.oolongTea().getText()));;
	}
	
	@When("^I click the checkout button$")
	public void i_click_the_checkout_button()  {
	   
		 test.log(LogStatus.INFO,"The checkout has been selected from Home Page"); 
		 HomePage check = PageFactory.initElements(driver, HomePage.class);   
		 check.selectCheckOut();
		 
	}
	
	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
	    
		CheckOutPage check = PageFactory.initElements(driver, CheckOutPage.class); 
		 test.log(LogStatus.PASS,"The checkout has been selected from Home Page"); 
		assertEquals("Enter your billing information",check.checkTitle().getText().trim());
	}
	
	@After()
	public void teardown() throws InterruptedException
		{ 
			
			Thread.sleep(3000);
			driver.close();
			driver.quit();
			report.endTest(test);
			report.flush();
	
		}
	
	}


	//*[@id="wsb-button-00000000-0000-0000-0000-000451955160"]/span
	//*[@id="wsb-button-00000000-0000-0000-0000-000451959280"]/span
//	MenuPage Kurapika = PageFactory.initElements(driver, MenuPage.class);
//	MenuPage Killua = PageFactory.initElements(driver, MenuPage.class);
//	
//	if ((Killua.redTea().getText().equals("Red Tea")))
//	{
//		Kurapika.checkOutGreenButton();
//	}
//	else if(Killua.redTea().getText().equals("Red Tea")) {
//		
//		Kurapika.checkOutRedButton();
//	}
//	else if (Killua.oolongTea().getText().equals("Oolong Tea")) {
//		
//		Kurapika.checkOutOolongButton(); 
//	}
	
	

