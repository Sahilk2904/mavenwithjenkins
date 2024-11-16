package Amazon_Project.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{
	WebDriver driver;
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement aandlist;
	
	@FindBy(xpath="(//a[@class=\"nav-a\"])[1]")
	WebElement new_usr;
	
	@FindBy(id="ap_customer_name")
	WebElement name_tf;
	
	@FindBy(id="ap_phone_number")
	WebElement phone_tf;
	
	@FindBy(id="ap_password")
	WebElement pwd_tf;
	
	@FindBy(id="continue")
	WebElement verify_button;
	
	
	public void aandl(WebDriver driver)
	{
	
		Actions a1 = new Actions(driver);
		a1.moveToElement(aandlist).perform();
	}
	
	public void nw_usr()
	{
		new_usr.click();
	}
	
	public void name()
	{
		name_tf.sendKeys("Sahil");
	}
	public void phone()
	{
		phone_tf.sendKeys("9466816635");
	}
	public void setpwd()
	{
		pwd_tf.sendKeys("Sahil@1990");
	}
	
	public void cont()
	{
		verify_button.click();
	}
	
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
