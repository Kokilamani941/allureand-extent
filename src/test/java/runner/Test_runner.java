package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/features/Array.feature",
	glue="step_definitions",
	dryRun=false,
	monochrome=true,
			plugin = { "pretty", "html:target/DsalgoXpathers.html",
					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

}
)
public class Test_runner {

}
