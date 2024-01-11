package com.pageEvents;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.base.BaseTest;

public class HomePageEvents extends BaseTest{
	
	public void homePage() {
		 //  Verify that the home page is displayed
        Assert.assertTrue(driver.findElement(By.id("home")).isDisplayed(), "Home page is not displayed");

	}
}
