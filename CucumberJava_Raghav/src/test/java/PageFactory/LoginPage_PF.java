package PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF 
{
	
WebDriver driver;	

public LoginPage_PF(WebDriver driver)
{
	
this.driver = driver;
PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);

	
}//LoginPage_PF

@FindBy(id="name")
@CacheLookup
WebElement txt_username;
	
@FindBy(id="password")
@CacheLookup
WebElement txt_password;

@FindBy(id="login")
@CacheLookup
WebElement txt_login;

//Another way
@FindBy(partialLinkText="raghav")
List<WebElement> myLinks;

//Another way
@FindBy(how = How.ID, using="name")
WebElement abc;

public void enterUserName(String username)
{
	
txt_username.sendKeys(username);
	
}//enterUserName

public void enterPassword(String password)
{
	
txt_password.sendKeys(password);
	
}//enterPassword

public void clickLogin()
{
	
txt_login.click();
	
}//clickLogin




}//LoginPage_PF
