package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testclass1 {
	
@Test
	public void Test1(){

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://admin.hospiol.com/site/login");
	

}

	
	
}
