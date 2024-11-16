package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment65 
{
	ChromeDriver driver = new ChromeDriver();
	@Test
	public void login() throws InterruptedException
	{
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[2]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9466816635");
		driver.findElement(By.id("continue")).click();
		WebElement e1=driver.findElement(By.id("ap_password"));
		e1.sendKeys("Sahil1990" + Keys.ENTER);
		
		Thread.sleep(5000);
		
	}
	
	@Test
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		String tittle=driver.getTitle();
		System.out.println(tittle);
		if(tittle.equals("Amazon Sign In"))
		{
			System.out.println("Condition meet logout successfully");
		}
	}
}
