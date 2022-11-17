package frames;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame4 {
	// 1
	@BeforeSuite

	public void setup() {
		System.out.println("setup");
	}

	// 2
	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("LaunchBrowser");
	}
	// 3

	@BeforeClass

	public void enterURL() {

		System.out.println("enterURL");

	}

	// 4
	@BeforeMethod
	public void login() {
		System.out.println("login");

	}

	// 5
	@Test(priority = 3,groups="final")
	public void chekhoempageUI() {
		System.out.println("chekhoempageUI");
	}

	// 6
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	// 7
	@AfterTest

	public void deletcookies() {
		System.out.println("deletcookies");
	}

	// 8
	@AfterClass
	public void closebrowser() {
		System.out.println("closebrowser");
	}

	// 9
	@AfterSuite
	public void report() {
		System.out.println("report");
	}

	@Test(priority = 2,groups="first")
	public void checklinks() {
		System.out.println("checklinks");
	}

	@Test(priority = 1,groups="first")
	public void checkwindows() {
		System.out.println("checkwindows");
	}

}
