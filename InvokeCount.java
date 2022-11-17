package frames;

import org.testng.annotations.Test;

public class InvokeCount {
	
	@Test(invocationCount=10)
	public void multiplerun() {
		
		String name = "kareem Sahar";

		StringBuffer sbr = new StringBuffer(name);
		sbr.reverse();

		System.out.println(sbr);
	}
	

}
