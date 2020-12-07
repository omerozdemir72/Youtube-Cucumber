package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = {"src/test/java"},

        glue = {"stepDefinition"}
        ,
        dryRun = false
)





public class _0_1_RunnerGenel extends AbstractTestNGCucumberTests {
}
