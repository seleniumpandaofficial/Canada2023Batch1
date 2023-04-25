package automation_code_10th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCases {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		verifyingLoginWithValidCredentials("firefox");
		verifyingLoginWithInvalidCredentials("chrome");
	}
	
	
	public static WebDriver verifyingLoginWithValidCredentials(String browserName) {
		if(browserName.equals("chrome")) {
		driver = new ChromeDriver();
		} else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();	
		}else if (browserName.equals("edge")){
			driver = new EdgeDriver();
		}else {
			System.out.println("None of my browsers work");
		}
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		if (logoutLink.isDisplayed() && logoutLink.isEnabled()) {
			logoutLink.click();
		} else {
			System.out.println("I am not in the right webpage / logout link is not enabled");
		}

		driver.findElement(By.linkText("Continue")).click();
		
		return driver;
	}
	
	public static WebDriver verifyingLoginWithInvalidCredentials(String browserName) {
		if(browserName.equals("chrome")) {
		driver = new ChromeDriver();
		} else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();	
		}else if (browserName.equals(null)){
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda2123423@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@12dfgdfg3");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
        String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
        String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
        
        if(actualWarningMessage.contains(expectedWarningMessage)) {
        	System.out.println("My test case is PASS");
        }else {
        	System.out.println("Test case is FAIL");
        }
      
        
        return driver;
	}

}
