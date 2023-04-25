package automation_code_10th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		//driver.findElement(By.xpath("//a[text() = 'Sign in']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		//driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
		
		driver.findElement(By.xpath("//input[@name = 'passwd' and @id = 'password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'proceed']")).click();

	}

}
