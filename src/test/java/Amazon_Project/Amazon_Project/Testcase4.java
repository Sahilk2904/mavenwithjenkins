package Amazon_Project.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase4 
{

	public class Testcase3 
	{

		@Test
		public void Search_pro()
		{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Searching_product s1= new Searching_product(driver);
		
		s1.aandli(driver);
		s1.sig();
		s1.log();
		s1.cont();
		s1.pass();
		s1.sign();
		s1.search();
	}
	
	}
}