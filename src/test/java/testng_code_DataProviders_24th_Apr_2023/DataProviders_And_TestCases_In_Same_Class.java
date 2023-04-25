package testng_code_DataProviders_24th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//rules of @DataProvider
//1. Returns 2-D Object array
//2. Array declare, create, initialize
//3. @Test case we have to connect with the @DataProvider   @Test(dataProvider = "getData")
//4. @Test there is a method - we have to parameterize this method

public class DataProviders_And_TestCases_In_Same_Class {

	public WebDriver driver;

	@Test(priority = 2, dataProvider = "Rediff")
	public void enterRediffLogicDetails(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();

	}

	@Test(priority = 1, dataProvider = "TN")
	public void enterTNLoginDetails(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}

	@DataProvider(name = "Rediff")
	public Object[][] getRediffData() {
		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
				            { "seleniumpanda1@rediffmail.com", "Donkey@123" } };

		return data;
	}

	@DataProvider(name = "TN")
	public Object[][] getTNData() {
		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
				            { "seleniumpanda1@gmail.com", "Selenium@123"},
				            { "seleniumpanda2@gmail.com", "Selenium@123"},
				            { "seleniumpanda3@gmail.com", "Selenium@123"},
				            { "seleniumpanda4@gmail.com", "Selenium@1234"}};

		return data;
	}
}
