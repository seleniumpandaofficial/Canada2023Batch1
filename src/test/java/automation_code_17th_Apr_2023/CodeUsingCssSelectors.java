package automation_code_17th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CodeUsingCssSelectors {


	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.cssSelector("div#top-links ul.list-inline > li.dropdown i.fa.fa-user+span")).click();
		
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right li:nth-child(2) > a")).click();
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		//driver.quit();

	}

}
