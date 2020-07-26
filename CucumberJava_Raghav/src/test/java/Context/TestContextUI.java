package Context;


import org.openqa.selenium.WebDriver;

import PageFactory.HomePage_PF;
import PageFactory.LoginPage_PF;




public class TestContextUI 
{

private WebDriver driver;
private LoginPage_PF login;
private HomePage_PF home;


public WebDriver getDriver() 
{
	
return driver;

}//getDriver

public void setDriver(WebDriver driver) 
{
	
this.driver = driver;

}//setDriver

public LoginPage_PF getLoginPage_PF() 
{
	
return login;
	
}//getLoginPage_PF


public HomePage_PF getHomePage_PF() 
{
	
return home;
	
}//getHomePage_PF



public void intitializePageObject(WebDriver driver)
{
	
login = new LoginPage_PF(driver);
home = new HomePage_PF(driver);

	
}//intitializePageObject

	
}//TestContextUI
