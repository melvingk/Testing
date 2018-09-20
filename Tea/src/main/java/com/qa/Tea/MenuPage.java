package com.qa.Tea;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {

	@FindBy (xpath= "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
	private WebElement greenTea;
	
	public  WebElement greenTea() {
		return greenTea;
}
	
	@FindBy (xpath= "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong")
	private WebElement redTea;
	
	public WebElement redTea() {
		return redTea;
	}
	
	@FindBy (xpath= "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231735\"]/div/p/span/span/strong")
	private WebElement oolongTea;
	
	public WebElement oolongTea() {
		return oolongTea;
	}
	
	@FindBy (xpath= "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]")
	private WebElement checkOutGreenButton;
	
	public WebElement checkOutGreenButton() {
		return checkOutGreenButton;
	}
	
	public void checkOutGreen()
	{
		
		checkOutGreenButton.click();
	}

	@FindBy (xpath= "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451959280\"]")
	private WebElement checkOutRedButton;
	
	public WebElement checkOutRedButton() {
		return checkOutRedButton();
	}
	
	public void checkRedOut()
	{
		
		checkOutRedButton.click();
	}
	
	@FindBy (xpath= "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451961556\"]")
	private WebElement checkOutOolongButton;
	
	public WebElement checkOutOolongButton() {
		return checkOutOolongButton;
	}
	
	public void checkOolongOut()
	{
		
		 checkOutOolongButton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
