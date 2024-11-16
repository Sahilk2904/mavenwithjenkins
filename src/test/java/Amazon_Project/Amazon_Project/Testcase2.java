package Amazon_Project.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase2 
{
	@Test
	public void amz_login()
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	Login_Page l1= new Login_Page(driver);
	
	l1.aandli(driver);
	l1.sig();
	l1.log();
	l1.cont();
	l1.pass();
	l1.sign();
}
}
