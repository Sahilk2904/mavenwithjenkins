package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gmail_check 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions c1= new ChromeOptions();
		c1.addArguments("--headless");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("banglore");
	
	Thread.sleep(1000);
	List<WebElement> li= driver.findElements(By.xpath("//div[@class='OBMEnb']//ul//li"));
	int count=li.size();
	System.out.println(count);
	
	Thread.sleep(3000);
	li.get(6).click();
	
	}
}
