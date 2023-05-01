package testng_code_Parameterization_30th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rediff_Paramterize {
	//what is parameterization ?
	//using different set of input parameters to determine the output of the same logic
	
	//What are the parameters that I want to use which will parameterize my logic
	//browser, url, username, password

	public WebDriver driver;
	
	@Test
	@Parameters({"browser", "url", "username", "password", "locatorUsername", "locatorPassword", "locatorSignInButton"})
	public void rediffLoginTest(@Optional("chrome") String browser, String url, String username, String password, String locatorUsername, String locatorPassword, String locatorSignInButton) {
		if(browser.equals("chrome")) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();	
		}
		driver.get(url);
		driver.findElement(By.id(locatorUsername)).sendKeys(username);
		driver.findElement(By.id(locatorPassword)).sendKeys(password);
		driver.findElement(By.className(locatorSignInButton)).click();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
