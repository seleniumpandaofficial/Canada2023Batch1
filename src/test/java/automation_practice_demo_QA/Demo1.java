package automation_practice_demo_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	
	public WebDriver driver;
	
	@Test
	public void clickOnSubmitButton() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Selenium Panda");
		driver.findElement(By.id("userEmail")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("123 Mark St, Leesburg Pike Vienna, Va 22182");
		driver.findElement(By.id("permanentAddress")).sendKeys("123 Mark St, Leesburg Pike Vienna, Va 22182");
		driver.findElement(By.id("submit")).click();
		
		String contentInsideBox = driver.findElement(By.cssSelector("div.border.col-md-12.col-sm-12")).getText();
		System.out.println(contentInsideBox);
		Assert.assertTrue(driver.findElement(By.cssSelector("div.border.col-md-12.col-sm-12")).isDisplayed());
		
	}

}
