package com.qa.basicExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class basicLogin {
	
	@FindBy (xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
	private WebElement Textbox3;
	
	@FindBy (xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
	private WebElement Textbox4;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
	private WebElement loginButton;
	

	
	public void loginUser (String text1, String text2)
	{
		
		Textbox3.sendKeys(text1);
		Textbox4.sendKeys(text2);
		loginButton.click();
	}
	
	
	
	
	
}
