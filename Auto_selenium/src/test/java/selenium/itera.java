package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class itera {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.findElement(By.id("name")).sendKeys("A.sai pavan");
		
		driver.findElement(By.id("phone")).sendKeys("9014754123");
	
		driver.findElement(By.id("email")).sendKeys("pavan@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("********");
		
		driver.findElement(By.id("address")).sendKeys("Hyderabad");
		
		WebElement ele = driver.findElement(By.xpath("//button[@name='submit']"));
		System.out.println(ele.isDisplayed());
		
		driver.findElement(By.id("male")).click();
		
		driver.findElement(By.id("monday")).click();
		
		driver.findElement(By.id("tuesday")).click();
		
		driver.findElement(By.id("wednesday")).click();
		
		driver.findElement(By.id("thursday")).click();
		
		driver.findElement(By.id("friday")).click();
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@class='custom-select']"));
		
		Select sel = new Select(dropdown);
		
		sel.selectByValue("6");
		
		driver.findElement(By.xpath("//label[text()='3 years']")).click();
		
		driver.findElement(By.xpath("//label[text()='Selenium Webdriver']")).click();
		
		
	}
}
