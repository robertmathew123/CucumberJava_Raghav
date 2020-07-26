package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features= "src/test/resources/Features",
glue= "StepDefinations",
monochrome = true,
plugin = {"pretty","html:target/HtmlReports","json:target/JSONReports/report.json","junit:target/JUnitReports/report.xml",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags="@smoketest",
//tags= {"@smoketest or @regression"} //or tags
//tags= {"@smoketest and @regression"} //or and
//tags= {"(@smoketest and @regression) and @important"} //or and
//tags= {"@smoketest and not @regression"} //skip or ignore test
dryRun=false
)
public class TestRun 
{
	
//mvn test -Dcucumber.filter.tags="@smoke and @fast"

	

}//TestRun
