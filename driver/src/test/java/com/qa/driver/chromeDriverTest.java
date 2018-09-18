package com.qa.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class chromeDriverTest {
	
	@FindBy(id="lst-ib") 
	private WebElement searchbox;
	
	public void searchFor(String Text)
	{
		searchbox.sendKeys(Text);
		searchbox.submit();
	}
	
	

}
