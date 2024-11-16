package Amazon_Project.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase3 
{

	@Test
	public void incorrect_login()
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	Incorrect_user i1= new Incorrect_user(driver);
	
	i1.aandli(driver);
	i1.sig();
	i1.log();
	i1.cont();
	i1.pass();
	i1.sign();
	
}
}
