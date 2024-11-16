package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop");
		driver.manage().window().maximize();
		Actions a1= new Actions(driver);
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.id("container-10"));
		Thread.sleep(2000);
		WebElement e2=driver.findElement(By.id("div2"));
		
		
		a1.dragAndDrop(e1, e2).perform();
		Thread.sleep(5000);
		a1.dragAndDrop(e2, e1).perform();

	}

}
