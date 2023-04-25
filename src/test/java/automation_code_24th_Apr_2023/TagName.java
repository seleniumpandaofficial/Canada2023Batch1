package automation_code_24th_Apr_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagName {

	public WebDriver driver;

	@Test
	public void rediff() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

		WebElement signinLink = driver.findElement(By.className("signin"));
		System.out.println(signinLink.getTagName());

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(" Total Links in this webpage with tagname a are : " + allLinks.size());

		List<WebElement> allDivWebElements = driver.findElements(By.tagName("div"));
		System.out.println(" Total elements in this webpage with tagname div are : " + allDivWebElements.size());
		
		List<WebElement> allInputWebElements = driver.findElements(By.tagName("input"));
		System.out.println(" Total elements in this webpage with tagname input are : " + allInputWebElements.size());
	}

}
