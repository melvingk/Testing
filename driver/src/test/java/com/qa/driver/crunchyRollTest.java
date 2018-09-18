package com.qa.driver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class crunchyRollTest {

	@FindBy(id="header_search_input")
	private WebElement searchboxx;
			
	@FindBy (xpath="//*[@id=\"main_results\"]/ul/li[2]/a/table/tbody/tr/td[2]/span/span[1]")
	private WebElement link;
	 
	public void searchForNext (String text)
	{
		searchboxx.sendKeys(text);
		searchboxx.submit();
	}

	public void clickOnLink() 
	{
		link.click();
	}
}