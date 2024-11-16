package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multi_inputs 
{

	@DataProvider(name="set1")
	public Object[][] city()
	{
		return new Object[][] {{"India"},{"US"},{"London"}};
	}
	
	@Test(dataProvider="set1")
	public void search(String input) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys(input+Keys.ENTER);
		
		Thread.sleep(10000);
		driver.quit();
	}
	
}
