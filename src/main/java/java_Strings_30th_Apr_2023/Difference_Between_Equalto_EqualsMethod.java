package java_Strings_30th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Difference_Between_Equalto_EqualsMethod {

	public static WebDriver driver;

	public static void main(String[] args) {
		// == and .equals()

		String S1 = new String("Hello");
		String S2 = new String("Hello");

		System.out.println(S1 == S2); // used to compare references

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String ActualEditAccountInfoLink = driver.findElement(By.xpath("//a[contains(text(), 'Edit your account information')]")).getText();
		String expectedEditAccountInfoLink = "Edit your account information";
		
		System.out.println(ActualEditAccountInfoLink.equals(expectedEditAccountInfoLink));

	}

}
