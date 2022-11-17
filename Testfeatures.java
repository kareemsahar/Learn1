package frames;

import org.testng.annotations.Test;

public class Testfeatures {

	@Test
	public void login() {
		System.out.println("login test");
	
	}
	@Test(dependsOnMethods="login")
	public void homepage() {
		System.out.println("homepage test");
	}
	@Test(dependsOnMethods="homepage")
	public void firstPage() {
		System.out.println("homepage test");
	}
	@Test(dependsOnMethods="firstPage")
	public void secondPage() {
		System.out.println("homepage test");
	}

	
}
