package Selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multi_input1 
{
	@DataProvider(name="set1")
	public Object[][] method1()
	{
		return new Object[][] {{300},{400},{500},{900}};
	}

	@Test(dataProvider="set1")
	public void add(int input)
	{
		int sum = 100+input;
		System.out.println(sum);
	}
	
}
