package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DropDown 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dd=driver.findElement(By.xpath("(//*[@class='nav-line-2'])[1]"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(dd).perform();
		
		driver.findElement(By.xpath("(//span[@class='nav-text']/span[1])[8]")).click();
		}

}
