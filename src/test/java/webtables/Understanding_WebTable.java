package webtables;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Understanding_WebTable {

	public WebDriver driver;
	
	@Test
	public void rediffWebTable() {
		String companyName = "Hubtown";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		//I want to print all the name of the companies
		//I want to print their respective Current prices
		
		List<WebElement> companies = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		
		System.out.println(companies.size()+"---------------->" + currentPrices.size());
		
		//print all the companies along with their current prices
		//print a specific company name and it's corresponding current price
		
		for(int i=0 ; i<companies.size(); i++) {
			if((companyName.equals(companies.get(i).getText()))) {
				System.out.println(companies.get(i).getText()+ "-------------->" + currentPrices.get(i).getText());
				break;
			}
		}
		
	}
}
