package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage 
{

protected WebDriver driver;

public loginPage(WebDriver driver)
{

this.driver = driver;

if(!driver.getTitle().equals("TestProject Demo"))
{
	
throw new IllegalStateException("This is not the login page.The current page is " +driver.getCurrentUrl());	

}//getTitle
	
}//loginPage


private By txt_username = By.id("name");

private By txt_password = By.id("password");	
	
private By txt_login = By.id("login");	

private By txt_logout = By.id("logout");	


public void enterUserName(String username)
{
	
driver.findElement(txt_username).sendKeys(username);
	
}//enterUserName

public void enterPassword(String password)
{
	
driver.findElement(txt_password).sendKeys(password);
	
}//enterPassword

public void clickLogin()
{
	
driver.findElement(txt_login).click();
	
}//clickLogin

public void clickLogOutDisplayed()
{
	
driver.findElement(txt_logout).isDisplayed();
	
}//clickLogOutDisplayed

public void loginValidUser(String username, String password)
{
	
driver.findElement(txt_username).sendKeys(username);	
driver.findElement(txt_password).sendKeys(password);
driver.findElement(txt_login).click();
	
}//loginValidUser
	
}//loginPage
