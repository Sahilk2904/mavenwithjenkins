package Selenium;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class New_Multi_input 
{
	@DataProvider(name="set1")
	public Object[][] test()
	{
		return new Object[][] {{"F_name-->Sahil"},{"L_Name-->Kumar"},{"DOB-->23/12/1990"},{"Gender-->Male"},{"E-mail-->sahil@gmail.com"}};
	}

	@Test(dataProvider="set1")
	public void method(String input)
	{
		
		System.out.println(input);
		//Printing values in html report
		Reporter.log("result will be - >"+ input);
	}
	
}
