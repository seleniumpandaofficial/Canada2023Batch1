package automation_code_9th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_HowAndWhereToBeCareful {
	
	//id - P1
	//class - P2
	//name - P3
	
	//name = name93086eac
	//name = nameed62a76c
	//name = name2d110eae
	
	//id = dolly1as23er
	//id = dolly3dse234
	
	//Class = compound class
	//class = bmailicon relative
	//Compound class - either Xpath or cssSelector (My choice) html.compvalue1.value2.value3
	
	//id mostly 99% unique [also has alphanumeric values attached. So be careful]
	//name mostly unique but name can be tricky if it has alphanumeric
	//Class - scrutiny [value is changing or not, if value is not changing is it unique or not, is it compound or not]
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//driver.findElement(By.linkText("Business Email")).click();
		//driver.findElement(By.className("bmailicon relative")).click();
		driver.findElement(By.cssSelector("a.bmailicon.relative")).click();
		
	}

}
