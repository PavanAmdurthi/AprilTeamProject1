package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class listners implements ISuiteListener {

	public void onStart(ISuite suite) {
		System.out.println("start browsing");
	}

	public void onFinish(ISuite suite) {
		System.out.println("finish browsing");
	}
	
	

}
