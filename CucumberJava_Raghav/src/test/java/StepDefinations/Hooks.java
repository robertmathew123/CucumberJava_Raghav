package StepDefinations;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Context.TestContextUI;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass
{

TestContextUI testContextUI;

	
			
public Hooks(TestContextUI testContextUI)
{
					
this.testContextUI = testContextUI;

}//Hooks	
	
@Before
public void setUp() throws IOException
{
	


if ((new File(screenshotdir)).exists())
FileUtils.cleanDirectory(new File(screenshotdir));

}//setUp


@AfterStep
public void AfterStepScreenShot(Scenario scenario) throws InterruptedException, IOException 
{

if(scenario.isFailed())
{
ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(getBase64Screenshot());
ExtentCucumberAdapter.addTestStepLog("Screenshot attached");
}//isFailed



}//AfterStepScreenShot

@After

public void CleanUp() 
{

testContextUI.getDriver().close();
testContextUI.getDriver().quit();
		
}//CleanUp
	
	
	
	
}//Hooks
