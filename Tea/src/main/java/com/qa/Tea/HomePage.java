package com.qa.Tea;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class HomePage {
		
		@FindBy (xpath= "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
		private WebElement menuselect;
		
		public void selectMenu() {
			menuselect.click();
			
		}
		@FindBy (xpath= "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a")
		private WebElement checkOutSelect;
		
		public void selectCheckOut() {
			checkOutSelect.click();
			
		}
		
	}
	
	
	
	
	//*[@id="wsb-nav-00000000-0000-0000-0000-000450914915"]/ul/li[5]/a