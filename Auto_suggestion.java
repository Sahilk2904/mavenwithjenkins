package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion 
{

	public static void main(String[] args) throws InterruptedException
	{	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("banglore");
		Thread.sleep(2000);
		List <WebElement> li=driver.findElements(By.xpath("//div[@class='OBMEnb']//ul/li"));
		int count= li.size();
		System.out.println(count);
		Thread.sleep(3000);
		li.get(6).click();
		
		
	}

}
