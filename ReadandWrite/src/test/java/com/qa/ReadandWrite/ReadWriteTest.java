package com.qa.ReadandWrite;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utlis.Constants;
import ExcelUtils.FileExcel;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;


public class ReadWriteTest {

	
	WebDriver driver= null;
	ExtentTest test;
	ExtentReports report = Constants.report; 
	
	
	
	@Before
	public  void setup() {
		
		FileExcel.setExcelFile(Constants.pathTestData + Constants.fileTestData, 0);
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Admin/Desktop/testing exe/chromedriver.exe");	
		driver = new ChromeDriver();	
		test = report.startTest("The start of the Test");
	}
		
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1)  {
		
		driver.get(arg1);
		driver.manage().window().maximize();
	 
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws InterruptedException  {
	   
		BingHomePage searching = PageFactory.initElements(driver, BingHomePage.class);
		searching.search(arg1);

	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() 
	{

		assertTrue(!Constants.websiteURL.equals(driver.getCurrentUrl()));
		if((!Constants.websiteURL.equals(driver.getCurrentUrl()))) {
			
			  FileExcel.setCellData("Test case" + Constants.count, Constants.count, 0);
			  FileExcel.setCellData("PASS", Constants.count++, 1);
			  test.log(LogStatus.PASS,"Successful search");
		}
		else {
			
			   FileExcel.setCellData("Test case" + Constants.count, Constants.count, 0);
			   FileExcel.setCellData("FAIL", Constants.count++, 1);
			   test.log(LogStatus.FAIL,"Unsuccessful shit");
		}
		
	
	}


	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
		driver.quit();
//		report.endTest(test);
	}
	
	
	
	
	
}
