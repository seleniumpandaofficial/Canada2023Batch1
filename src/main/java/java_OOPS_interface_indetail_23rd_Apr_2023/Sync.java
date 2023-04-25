package java_OOPS_interface_indetail_23rd_Apr_2023;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sync extends Demo implements Execute, Execute_New{
	
	//a concrete class can extend Abstract class
	//a concrete class can implement an interface
	//a concrete class can implement multiple interfaces
	//a concrete class can extend an abstract Class and implement multiple interfaces at the same time
	
	//Sync as an example here is the implementing Class
	
	//Can I create the object of an interface ??
	//Abstract Class you cannot instantiate
	//Interface you cannot instantiate 
	
	//WebDriver driver = new WebDriver();
	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Override
	public void hello() {
		
		
	}

	@Override
	public void dummy() {
		
		
	}

	@Override
	public void sample() {
	
		
	}

	@Override
	public void chase() {
		
		
	}

	@Override
	public void run() {
		
		
	}

	@Override
	public void dance() {
		
		
	}

	@Override
	public void walk() {
		
		
	}

}
