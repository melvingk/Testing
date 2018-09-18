package com.qa.basicExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.junit.Assert.*;

public class basicTest {

	@FindBy (xpath="/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
	private WebElement Adduser;
	
	@FindBy (xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
	private WebElement Textbox1;
	
	@FindBy (xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")
	private WebElement Textbox2;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
	private WebElement saveButton;
	
	@FindBy(xpath="/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement Login;
	
	@FindBy (xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
	private WebElement Textbox3;
	
	@FindBy (xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
	private WebElement Textbox4;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
	private WebElement loginButton;
	
	
	public void addingUser(String text1,String text2)
	{
		Adduser.click();
		Textbox1.sendKeys(text1);
		Textbox2.sendKeys(text2);
		saveButton.submit();
	}
	
	public void loginUser (String text1, String text2)
	{
		Login.click();
		Textbox3.sendKeys(text1);
		Textbox4.sendKeys(text2);
		loginButton.submit();
	}
	
	
	
	
	
}
