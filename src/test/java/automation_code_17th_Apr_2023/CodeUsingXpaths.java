package automation_code_17th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeUsingXpaths {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//div[@id = 'top-links']/child::ul/child::li[@class = 'dropdown']/descendant::span[1]")).click();
		
		driver.findElement(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']//child::li[2]/child::a[contains(text(), 'Login')]")).click();
		
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
		
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		//driver.quit();

	}

}
