package com.qa.shopping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dressPage {
	
	
	@FindBy(xpath ="//*[@id=\"center_column\"]/div/div/div[3]/h1")
	private WebElement  dressName;
	
	public WebElement dressName()
	{
		return dressName; 
	}
	
	
	
	

}
