package com.qa.ReadandWrite;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BingHomePage {
	
		@FindBy (id= "sb_form_q")
		private WebElement searchbox;
		
		public void search(String text) throws InterruptedException {
			searchbox.sendKeys(text);
			Thread.sleep(2500);
			searchbox.submit();
		}
		
	}

