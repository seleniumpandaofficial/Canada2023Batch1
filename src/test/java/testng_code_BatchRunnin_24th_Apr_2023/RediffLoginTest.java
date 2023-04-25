package testng_code_BatchRunnin_24th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class RediffLoginTest {
	
	public WebDriver driver;
	
	@Test
	public void rediffLogin() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.id("password")).sendKeys("Selenium@123");
			driver.findElement(By.className("signinbtn")).click();

		}
	}


