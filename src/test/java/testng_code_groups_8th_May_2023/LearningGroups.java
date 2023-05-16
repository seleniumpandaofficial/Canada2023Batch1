package testng_code_groups_8th_May_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningGroups {
	
	public WebDriver driver;
	public SoftAssert softassert;
	
	@BeforeMethod
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	@Test(priority = 1, groups = {"smoke"})
	public void registrationTest() {
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium");
		driver.findElement(By.id("input-lastname")).sendKeys("Panda");
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda000909@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualConfirmationMessage = driver.findElement(By.xpath("//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]")).getText();
	    String expectedConfirmationMessage = "Congratulations! Your new account has been successfully created!";
	    softassert = new SoftAssert();
	    softassert.assertTrue(actualConfirmationMessage.equals(expectedConfirmationMessage), "Account has not been created");
	    softassert.assertAll();
	}
	
	@Test(priority = 2, groups = {"smoke", "sanity"})
	public void loginTest() {
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda000909@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.xpath("//a[text() = 'Edit your account information']")).isDisplayed());
		softassert.assertAll();
	}
	
	@Test(priority = 3, groups = {"smoke", "sanity", "regression"})
	public void logoutTest() {
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda0909@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		softassert = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.xpath("//p[text() = 'You have been logged off your account. It is now safe to leave the computer.']")).isDisplayed());
		softassert.assertAll();
	}
	
	@Test(priority = 4)
	public void searchProductTest() {
		
		driver.findElement(By.name("search")).sendKeys("HP");
		driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
		softassert = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.xpath("//a[contains(text(), 'HP LP3065')]")).isDisplayed());
		softassert.assertAll();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
