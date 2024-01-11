package qa.testFiles;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pageEvents.HomePageEvents;

public class TestClass extends BaseTest {
	HomePageEvents hp= new HomePageEvents();

	@Test(priority=1, enabled=true)
	public void testHomeElements() {
		hp.homePage();
	}
	@Test(priority=2, enabled=true)
	public void testAboutTab() {
		logger.info("Verifying that the home page is displayed");
        Assert.assertTrue(driver.findElement(By.id("home")).isDisplayed(), "Home page is not displayed");
	}
}
