package automation_code_3rd_Apr_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_Automation {
	//you have to learn Java
	//Learn Selenium Library
	//Learn TestNG [validation means - comparing expected with actual ?]
	//Git and GitHub
	//Jenkins - every Friday 9:00 pm ye poora code execute
	
	//Eclipse -> Github -> Jenkins
	// 25th September -> Code push [login test, register test] -> Jenkins [run]
	//8th November -> Code push [login test(changes), reg  test(changes), 2 more test cases] -> Jenkins
	
	//Interview - java knowledge[theory + programming(Strings and Arrays), Collection framework]
	//            java OOPs (Class&Object, Method, Inheritance, Polymorphism, Abstraction, Encapsulation)
	
	//Selenium automates browsers
	//WebDriver is the interface in Selenium Library which helps justify the statement

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		
		driver.get("https://rediff.com");
		//getTitle()
		//getCurrentUrl()
		//getPageSource()
		
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String actualTitle = driver.getTitle();
		
		String expectedCurrentUrl = "https://www.rediff.com/";
		String acutalCurrentUrl = driver.getCurrentUrl();
		
		
		if(expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(acutalCurrentUrl)) {
			System.out.println("My url is correct");
		}else {
			System.out.println("The url entered is incorrect");
		}
		
		//isDisplayed()
		//isEnabled()
		//isSelected() - radio button, checkboxes
		
		WebElement signInLink = driver.findElement(By.linkText("Sign in"));
		WebElement rediffLogoImage = driver.findElement(By.cssSelector("span.hmsprite.logo"));
		
		if(rediffLogoImage.isDisplayed() && signInLink.isEnabled()) {
			System.out.println("My webpage is correct");
		}else {
			System.out.println("My webpage is not correct");
		}
		
		driver.findElement(By.linkText("Sign in")).click();
		WebElement checkBox = driver.findElement(By.id("remember"));
		System.out.println(checkBox.isSelected());
		
		if(checkBox.isSelected()) {
			System.out.println("My logic is correct");
		}else {
			System.out.println("My logic is incorrect");
		}

	}

}
