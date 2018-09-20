package com.qa.Tea;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage {
	
	@FindBy (xpath= "//*[@id=\"wsb-element-00000000-0000-0000-0000-000451990420\"]/div/pre/strong/span")
	private WebElement checkTitle;
	
	public WebElement checkTitle() {
		return checkTitle;
	
	}	

}
