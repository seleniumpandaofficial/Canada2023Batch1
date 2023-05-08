package automation_code_extra_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTip {
	
	public WebDriver driver;
	
	@Test
	public void toolTipValidation() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		WebElement moneyLink = driver.findElement(By.linkText("Money"));
		String tooltipValMoney = moneyLink.getAttribute("title");
		System.out.println(tooltipValMoney);
	}

}
