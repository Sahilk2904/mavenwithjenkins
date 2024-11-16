package Amazon_Project.Amazon_Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searching_product 
{
WebDriver driver;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement aandlist;
	
	@FindBy(xpath="(//div[@id='nav-flyout-ya-signin']//a)[1]")
	WebElement sign_in;
	
	@FindBy(id="ap_email")
	WebElement login_tf;
	
	@FindBy(id="continue")
	WebElement cont_button;
	
	@FindBy(id="ap_password")
	WebElement pwd_ft;
	
	@FindBy(id="signInSubmit")
	WebElement sign_button;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searh;
	
	public void aandli(WebDriver driver)
	{
		Actions a2 = new Actions(driver);
		a2.moveToElement(aandlist).perform();
	}
	public void sig()
	{
		sign_in.click();
	}
	public void log()
	{
		login_tf.sendKeys("9466816635");
	}
	public void cont()
	{
		cont_button.click();
	}
	public void pass()
	{
		pwd_ft.sendKeys("Sahil1990");
	}
	public void sign()
	{
		sign_button.click();
	}
	
	public void search()
	{
		searh.sendKeys("pen"+Keys.ENTER);
	}
	
	public Searching_product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
