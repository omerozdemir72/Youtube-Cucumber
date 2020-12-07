package Runners;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.Driver;

@CucumberOptions(

tags = {"@RegressionTest"},
        features = {"src/test/java"},

        glue = {"stepDefinition"},

        plugin = {  "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html" },
        dryRun = false



)



public class _0_5_ParalelTest  extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browser")
    public static void beforeClass(String browser)
    {
        Driver.browserName.set(browser);
    }



    @AfterClass
    public void afterClass(){

        Reporter.loadXMLConfig("src/main/java/XMLFiles/extendReportSet.xml");

        Reporter.setSystemInfo("QA Tester : ","Ömer Özdemir");
        Reporter.setSystemInfo("Deparment ","QA");
        Reporter.setSystemInfo("Application Name :","Automation Practice" );
        Reporter.setTestRunnerOutput("Youtube Cucumber Test Report");

    }
}




