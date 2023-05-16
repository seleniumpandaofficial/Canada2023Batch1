package automation_code_extra_Topics;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiple_WebElements {
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;

	@Test(priority = 1)
	public void bbcNewsChannel() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		System.out.println("title of the home page of bbc is : " + driver.getTitle());
		// find the total number of links in this instant in the bbc.com page
		List<WebElement> BBCLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links present in BBC at this instant is : " + BBCLinks.size());

		// let's say I was 52nd link out of the 272
		WebElement Link52 = BBCLinks.get(51);

		// find the name of the 52nd Link or the text
		System.out.println(Link52.getText());

		// coordinate of the 52nd Link
		System.out.println("The x-coordinate is: -> " + Link52.getLocation().x + "and y-coordinate is : -> "
				+ Link52.getLocation().y);

		// determine the url of this link
		System.out.println("The url for this link is : " + Link52.getAttribute("href"));

		// click on Link 52
		// Link52.click();
		// System.out.println("title of the 52nd link page of bbc is : " +
		// driver.getTitle());

		// Print all the links in the output console

		for (int i = 0; i < BBCLinks.size(); i++) {
			WebElement AllLinks = BBCLinks.get(i);
			System.out.println(AllLinks.getText() + "------------> " + AllLinks.isDisplayed());
		}

		driver.quit();
	}

	@Test
	public void flipkart() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\automation_code_extra_Topics\\config.properties");
		prop.load(ip);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("flipkartUrl"));

		List<WebElement> formalShirts = driver.findElements(By.xpath("//div[@class = '_2WkVRV']"));
		System.out.println("total number of formal shirts in this page is : " + formalShirts.size());

		List<WebElement> prices = driver.findElements(By.xpath("//div[@class = '_30jeq3']"));

		List<WebElement> discountpercentage = driver.findElements(By.xpath("//div[@class = '_3Ay6Sb']"));

		for (int i = 0; i < formalShirts.size(); i++) {
			System.out.println(formalShirts.get(i).getText() + "---->" + prices.get(i).getText() + "----->"
					+ discountpercentage.get(i).getText());
			System.out.println(
					"---------------------------------------------------------------------------------------------------");
		}

		driver.quit();

	}

	@Test
	public void rediffFooterLinks() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com/");

		// each link pe click and determine the title of that page
		List<WebElement> footerLinks = driver.findElements(By.cssSelector("div.footer.alignC > a"));
		// total number of links?
		System.out.println("total number of footer links are : " + footerLinks.size());

		// Link with name and displayed or not ?
		// what is the url of each link
		// each link pe click and determine the title of that page
		for (int i = 0; i < footerLinks.size(); i++) {
			WebElement AllLinks = footerLinks.get(i);
			System.out.println(AllLinks.getText() + "------------> " + AllLinks.isDisplayed());
			System.out.println(footerLinks.get(i).getAttribute("href"));

			footerLinks.get(i).click();
			System.out.println("Title of this webpage is : " + driver.getTitle());
			driver.get("https://rediff.com");
			footerLinks = driver.findElements(By.cssSelector("div.footer.alignC > a"));
		}

		driver.quit();

	}

}
