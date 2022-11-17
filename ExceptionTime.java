package frames;

import org.testng.annotations.Test;

public class ExceptionTime {
	
@Test(invocationTimeOut=20)
public void infiniteloop() {
	int i=1;
	while(i==1) {
		System.out.println(i);
	
	}
	
	
}


}
