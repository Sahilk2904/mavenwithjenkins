package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop_Down 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		driver.findElement(By.name("fname")).sendKeys("Kittu");
		driver.findElement(By.name("lname")).sendKeys("Arora");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc@123");
		driver.findElement(By.id("male")).click();
		
		WebElement skill=driver.findElement(By.name("Skills"));
		//skill.click();
		skill.sendKeys(Keys.ARROW_DOWN);
	
		skill.sendKeys(Keys.ENTER);
		skill.click();
		
		WebElement county=driver.findElement(By.name("Country"));
		for (int i=1; i<=8;i++)
		{
			county.sendKeys(Keys.ARROW_DOWN);
		}
		
		WebElement add=driver.findElement(By.id("Present-Address"));
		add.sendKeys("Mahendergarh,Haryana");
		//add.sendKeys(Keys.CONTROL.RIGHT.);
		
		
		
		
		
		
		


	}

}
