package Amazon_Project.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class Testcase1 
{
	public void register_amazon()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();	
		Home_Page h1 = new Home_Page(driver);
		
		h1.aandl(driver);
		h1.nw_usr();
		h1.name();
		h1.name();
		h1.phone();
		h1.setpwd();
		h1.cont();
	}
	
}
