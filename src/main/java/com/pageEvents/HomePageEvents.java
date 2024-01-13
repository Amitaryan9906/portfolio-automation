package com.pageEvents;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.base.BaseTest;
import com.utils.ElementFetch;
import com.pageObjects.*;
public class HomePageEvents extends BaseTest{
	
	ElementFetch ele = new ElementFetch();
	
	public void homePage() {
		 //  Verify that the home page is displayed
        Assert.assertTrue(driver.findElement(By.id("home")).isDisplayed(), "Home page is not displayed");
        ele.getWebElement("XPATH",HomePageObjects.homeTabElementXpath).click();
        Assert.assertTrue(ele.getWebElement("XPATH",HomePageObjects.aboutTabXpath).isDisplayed(),"About button isn't displayed");
        ele.getWebElement("XPATH",HomePageObjects.aboutTabXpath).click();
        Assert.assertTrue(ele.getWebElement("XPATH",HomePageObjects.contactTabXpath).isDisplayed(),"About button isn't displayed");
        ele.getWebElement("XPATH",HomePageObjects.contactTabXpath).click();
	}
}
