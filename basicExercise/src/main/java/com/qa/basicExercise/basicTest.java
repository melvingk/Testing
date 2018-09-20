package com.qa.basicExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.junit.Assert.*;

public class basicTest {

	@FindBy (xpath="/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
	private WebElement Adduser;
	
	public void AddUser (){
		Adduser.click();
	}
}
