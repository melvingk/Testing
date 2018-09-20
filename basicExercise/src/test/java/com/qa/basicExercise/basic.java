package com.qa.basicExercise;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.junit.Assert.*;


public class basic {

	
	WebDriver driver=null;
	
	ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public static void before() {
	
	report = new ExtentReports("C:\\Users\\Admin\\Desktop\\Empty\\New.html", true);
	
	}
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Admin/Desktop/testing exe/chromedriver.exe");
	driver = new ChromeDriver();
	}
	

@Test
	public void mthodTest() throws IOException, InterruptedException {
		test = report.startTest("The start of the Test");
		FileInputStream file = new FileInputStream(Constants.pathTestData + Constants.fileTestData);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheetAt(0);

		
		for (int i=1; i < sheet.getPhysicalNumberOfRows(); i++)
		{
			
			Cell username = sheet.getRow(i).getCell(0);
			Cell password = sheet.getRow(i).getCell(1);
			
			String user = username.getStringCellValue();
			String pass = password.getStringCellValue();
		
		basicAddUser page = PageFactory.initElements(driver, basicAddUser.class);
		basicLogin page1 = PageFactory.initElements(driver, basicLogin.class);
		basicTest access1 = PageFactory.initElements(driver, basicTest.class);
		
		test.log(LogStatus.INFO,"Page opened");
		driver.get(Constants.websiteURL);
		
		test.log(LogStatus.INFO,"Access User page");
		access1.AddUser();
		
		test.log(LogStatus.INFO,"Creating User");
		page.addingUser(user, pass);
		
		test.log(LogStatus.INFO,"Access Login page");
		page.Login();
		
		test.log(LogStatus.INFO,"Confirming Login");
		page1.loginUser(user, pass);
		
		
		test.log(LogStatus.PASS,"Shows the successful login");
		assertEquals("**Successful Login**",driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText().trim());
		
		Cell result = sheet.getRow(i).getCell(2);
		result.setCellValue("pass");
		
		}
		file.close();
		FileOutputStream something = new FileOutputStream(new File (Constants.pathTestData + Constants.fileTestData));
		workbook.write(something);
		something.close();
}
		
	@Ignore
	public void mmethod1 () throws IOException, InterruptedException
	{
			test = report.startTest("The start of the Test");
			FileInputStream file = new FileInputStream(Constants.pathTestData + Constants.fileTestData);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet= workbook.getSheetAt(0);
			
			
			for (int i=1; i < sheet.getPhysicalNumberOfRows(); i++)
			{
				System.out.println("sdgeg");
				Cell username = sheet.getRow(i).getCell(0);
				Cell password = sheet.getRow(i).getCell(1);
				
				String user = username.getStringCellValue();
				String pass = password.getStringCellValue();
			
			basicAddUser page = PageFactory.initElements(driver, basicAddUser.class);
			basicLogin page1 = PageFactory.initElements(driver, basicLogin.class);
			basicTest access1 = PageFactory.initElements(driver, basicTest.class);
			
			
			test.log(LogStatus.INFO,"Page opened");
			driver.get(Constants.websiteURL);
			
			test.log(LogStatus.INFO,"Access User page");
			access1.AddUser();
			
			test.log(LogStatus.INFO,"Creating User");
			page.addingUser(user, pass);
			
			test.log(LogStatus.INFO,"Access Login page");
			page.Login();
			
			test.log(LogStatus.INFO,"Confirming Login");
			page1.loginUser(user, pass);
			
			test.log(LogStatus.PASS,"Shows the successful login");
			assertEquals("**Successful Login**",driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText().trim());

			test.log(LogStatus.FAIL,"Failing Login");
			assertEquals("**Failed Login**",driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText().trim());
			page1.loginUser(user, pass);
			
			
			
			
			}
		
//			Actions action = new Actions(driver);
//
//			action.moveByOffset(10, 10).perform();
//
//			Thread.sleep(1000);
//
//			String title = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText();
//			String expected = "**Successful Login**";
//
//			if (!title.equals(expected)) {
//				test.log(LogStatus.FAIL, "Demo Site Login Test");
//				report.endTest(test);
//				report.flush();
//				ExcelUtils.setCellData("Fail", i, 2);
//			}
//
//			assertEquals(expected, title);
//
//			ExcelUtils.setCellData("Pass", i, 2);
//			test.log(LogStatus.PASS, "Demo Site Login Test");
//			report.endTest(test);
//		}
//
//		report.flush();
//	}
//
//
//			
		
		
			}
			
		
////		assertEquals("itisme",driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote")).getText());
//}	

	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		report.endTest(test);
	}
	
	

@AfterClass
	public static void afterClass() {
		report.flush();
		report.close();
	}
}



//String username = "kamehameha";
//String password= "ahhhh";
//String password2 = "blahblah";

//	driver.manage().window().maximize();