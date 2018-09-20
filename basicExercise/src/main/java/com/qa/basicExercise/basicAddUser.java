package com.qa.basicExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class basicAddUser {
	
	@FindBy (xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
	private WebElement Textbox1;


	@FindBy (xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")
	private WebElement Textbox2;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
	private WebElement saveButton;
	
	@FindBy(xpath="/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement Login;
	
	public void Login()
	{
		Login.click();
	}

	
public void addingUser(String text1,String text2)
	{
		
		Textbox1.sendKeys(text1);
		Textbox2.sendKeys(text2);
		saveButton.click();
	}

}
