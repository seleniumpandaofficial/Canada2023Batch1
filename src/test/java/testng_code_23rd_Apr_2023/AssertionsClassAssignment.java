package testng_code_23rd_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsClassAssignment {
	
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
	}
	
	@Test(priority = 1)
	public void clickOnMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
	}
	
	@Test(priority = 2)
	public void clickOnRegister() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	@Test(priority = 3)
	public void registerUserWithoutEnteringanyField() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		//WebElement PrivacyPolicyCheckbox
		
		String actualPrivacyPolicyWarningMessage = driver.findElement(By.xpath("//div[@class = 'alert alert-danger alert-dismissible']")).getText();
		String expectedPrivacyPolicyWarningMessage = "Warning: You must agree to the Privacy Policy!";
		softassert.assertTrue(actualPrivacyPolicyWarningMessage.contains(expectedPrivacyPolicyWarningMessage), "My assertion is false");
		
		
		//WebElement FirstName
		String actualFirstNameWarningMessage = driver.findElement(By.xpath("//div[contains(text(), 'First Name must be between 1 and 32 characters!')]")).getText();
		String expectedFirstNameWarningMessage = "First Name must be between 1 and 32 characters!";
		softassert.assertEquals(actualFirstNameWarningMessage, expectedFirstNameWarningMessage);
		
		//WebElement LastName
		
		
		
		//WebElement Telephone
		
		
		
		//WebElement email
		
		
		
		//WebElement password
		
		
		
		
		
		
		softassert.assertAll();
	}

}
