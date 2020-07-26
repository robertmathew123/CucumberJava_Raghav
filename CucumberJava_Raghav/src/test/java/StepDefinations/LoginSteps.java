package StepDefinations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Context.TestContextUI;
import Utils.XLUtils;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends BaseClass 
{

TestContextUI testContextUI;
Scenario scn;
Logger logger = LogManager.getLogger(this.getClass()); 

@Before
public void setUp(Scenario s) throws IOException
{
	
this.scn = s;

}//setUp
		
public LoginSteps(TestContextUI testContextUI)
{
				
this.testContextUI = testContextUI;

}//HomePageStepDefination
	
@Given("^browser is open$")
public void browser_is_open() throws Throwable 
{

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.manage().window().maximize();
ExtentCucumberAdapter.addTestStepLog("Browser is opened");
testContextUI.setDriver(driver);
testContextUI.intitializePageObject(driver);
	
}//browser_is_open

@And("^user is on login page$")
public void user_is_on_login_page() throws Throwable 
{
	

testContextUI.getDriver().get("https://example.testproject.io/web/");
logger.info("Opening URL: " +driver.getCurrentUrl());	
ExtentCucumberAdapter.addTestStepLog("Opening URL: " +driver.getCurrentUrl());	
	
}//user_is_on_login_page

@When("^user enter (.+) and (.+)$")
public void user_enter_username_and_password(String username, String password) throws Throwable 
{
	

testContextUI.getLoginPage_PF().enterUserName(username);	
testContextUI.getLoginPage_PF().enterPassword(password);
logger.info("User entered the username and password");
ExtentCucumberAdapter.addTestStepLog("User entered the username and password");
	        
}//user_enter_username_and_password

@And("^user clicks on login$")
public void user_clicks_on_login() throws Throwable 
{
	
testContextUI.getLoginPage_PF().clickLogin();
logger.info("User clicked on login button");
ExtentCucumberAdapter.addTestStepLog("User clicked on login button");
    
}//user_clicks_on_login

@Then("^user navigate to the Home page$")
public void user_navigate_to_the_home_page() throws Throwable 
{
	
logger.info("User navigated to home page");
ExtentCucumberAdapter.addTestStepLog("User navigated to home page");
testContextUI.getHomePage_PF().clickLogOutDisplayed();


}//user_navigate_to_the_home_page

//User Login Scenario from excel file    

@When("^user login with following username and password form excel from (.+) and (.+)$")
public void user_login_with_following_username_and_password_form_excel_from_and(int rownumber, int columnumber) throws Throwable
{
    
String path = System.getProperty("user.dir")+"/src/main/java/testData/Data.xlsx";
int rownum = rownumber;
int colcount = columnumber;


String logindata[][] = new String[rownumber+1][colcount];

for(int i=rownum; i<=rownum;i++)
{

for(int j=0; j<colcount;j++)
{

logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);//1,0

if(j==0)
{
testContextUI.getLoginPage_PF().enterUserName(logindata[i-1][j]);
}//j
else if(j==1)
{
testContextUI.getLoginPage_PF().enterPassword(logindata[i-1][j]);
}//j

}//for j
		
}//for  i	

logger.info("User entered the username and password");
ExtentCucumberAdapter.addTestStepLog("User entered the username and password");

}//user_login_with_following_username_and_password_form_excel

    
}//LoginSteps


