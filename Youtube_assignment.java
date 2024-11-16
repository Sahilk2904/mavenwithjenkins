package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Youtube_assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions c= new ChromeOptions();
		c.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver(c);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@name='search_query']"));
		e1.sendKeys("india");
		e1.sendKeys(Keys.ENTER);
		/*Thread.sleep(5000);
			JavascriptExecutor js=driver;
			js.executeScript("window.scrollBy(0,4000)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,4000)");
			
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,9000)");
			
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,9000)");*/
		
		int i=10;
		while(i>5)
		{
			Point p1 =      e1.getLocation();   
	          int x=    p1.getX();               
	          int y =   p1.getY();               

			
			Thread.sleep(3000);
	          JavascriptExecutor js = driver;       
	          js.executeScript("window.scrollBy(0,  "+y+")"); 
	          System.out.println(y);
	          y++;

		}
		
		
	}

}
