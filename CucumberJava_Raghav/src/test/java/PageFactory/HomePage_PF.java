package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF 
{

WebDriver driver;	

public HomePage_PF(WebDriver driver)
{
		
this.driver = driver;
PageFactory.initElements(driver, this);
		
}//HomePage_PF

@FindBy(id="logout")
@CacheLookup
WebElement txt_logout;

public void clickLogOutDisplayed()
{
	
txt_logout.isDisplayed();
	
}//clickLogOutDisplayed

	
}//HomePage_PF
