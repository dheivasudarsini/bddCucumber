package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features= "features", 
                 glue={"stepDefinitions","hooks"},
                 dryRun=false,
                 //strict=false)
                 monochrome=true,
                 plugin = {"html:report/WebReport", "json:report/jsonReport.json", "junit:report/xmlReport.xml"},
                 tags= {"@BackgroundExample"}
		         )


public class RunnerClass {

}
