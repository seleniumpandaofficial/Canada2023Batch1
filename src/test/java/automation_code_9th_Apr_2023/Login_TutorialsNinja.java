package automation_code_9th_Apr_2023;

import org.openqa.selenium.By;
//By using Automation I want you to create 5 users in TutorialsNinja
//And also execute the Login using those users
//plus I want validation statements using if - else and 
//Every user will have a different validation WebElement

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_TutorialsNinja {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
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
	}

}
