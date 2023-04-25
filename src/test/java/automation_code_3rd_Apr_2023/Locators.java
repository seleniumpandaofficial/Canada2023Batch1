package automation_code_3rd_Apr_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rediff.com");
		// driver.findElement(By.className("signin")).click();
		// driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.partialLinkText("Sign i")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		
		Thread.sleep(2000);
		WebElement profileName = driver.findElement(By.linkText("SeleniumPanda"));
		
		if(profileName.isDisplayed()) {
			driver.findElement(By.className("rd_logout")).click();
		} else {
			System.out.println("My profileName is not existing");
		}
		
		String actualLogoutMessage = driver.findElement(By.xpath("//p[text() = 'You have successfully signed out of Rediffmail.']")).getText();
		String expectedLogoutMessage = "You have successfully signed out of Rediffmail.";
		
		if(actualLogoutMessage.contains(expectedLogoutMessage)) {
			System.out.println("Successfully logged out");
			Thread.sleep(1000);
			driver.findElement(By.linkText("Rediff Home")).click();
		}else {
			System.out.println("Logout unsuccessful");
		}
		
		
		driver.quit();

	}

}
