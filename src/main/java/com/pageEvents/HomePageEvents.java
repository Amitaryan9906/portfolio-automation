package com.pageEvents;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.base.BaseTest;
import com.utils.ElementFetch;
import com.pageObjects.*;
public class HomePageEvents extends BaseTest{
	
	ElementFetch el = new ElementFetch();
	
	public void homePage() {
		 //  Verify that the home page is displayed
        Assert.assertTrue(driver.findElement(By.id("home")).isDisplayed(), "Home page is not displayed");
        el.getWebElement("XPATH",HomePageObjects.homeTabElementXpath).click();

	}
}
