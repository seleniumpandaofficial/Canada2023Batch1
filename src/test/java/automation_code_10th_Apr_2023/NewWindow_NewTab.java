package automation_code_10th_Apr_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow_NewTab {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://amazon.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://walmart.com");

	}

}
