package automation_code_30th_Mar_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenBrowser {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver(); //Ctrl+Shift+O , Command+Shift+O
	    driver.manage().window().maximize();
	    driver.get("https://amazon.com");
	    driver.quit();
	    
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://walmart.com");
	    driver.quit();
	    
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://costco.com");
	    driver.quit();

	}

}
