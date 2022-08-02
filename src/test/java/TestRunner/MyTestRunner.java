package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/main/resources/AppFeatures" }, glue = { "StepDefination", "AppHooks" },
		// plugin = {"pretty",
		// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

		// }
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" }

)

public class MyTestRunner extends AbstractTestNGCucumberTests {

}