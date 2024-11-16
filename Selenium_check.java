package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_check 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("(//a[@href='#switch-lang=mr_IN'])[1]"));
	WebElement e1=	driver.findElement(By.id("searchDropdownBox"));
	
	Select s1 = new Select(e1);
	s1.selectByVisibleText("Books");
	}

}
