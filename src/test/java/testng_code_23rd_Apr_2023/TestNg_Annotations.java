package testng_code_23rd_Apr_2023;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//@BeforeSuite > @BeforeTest > @BeforeClass > @BeforeMethod > @Test > @AfterMethod > @AfterClass > @AfterTest > AfterSuite

public class TestNg_Annotations {
	@BeforeSuite
	public void executionFirst() {
		System.out.println("This will execute first - BeforeSuite");
	}

	@BeforeTest
	public void executionSecond() {
		System.out.println("This will execute second - BeforeTest");
	}

	@BeforeClass
	public void executionThird() {
		System.out.println("This will execute third - BeforeClass");
	}

	@BeforeMethod
	public void executionPreImportant() {
		System.out.println("We mostly use Before Method in combination with @Test annotation");
	}

	@Test
	public void testCase1() {
		System.out.println("This is test case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("This is test case 2");
	}

	@AfterMethod
	public void executionPostImportant() {
		System.out.println("We mostly use After Method in combination with @Test annotation");
	}

	@AfterClass
	public void executionLater() {
		System.out.println("This will execute later - AfterClass");
	}

	@AfterTest
	public void executionLatermore() {
		System.out.println("This will execute later later - AfterTest");
	}

	@AfterSuite
	public void executeLast() {
		System.out.println("This will execute last");
	}

}
