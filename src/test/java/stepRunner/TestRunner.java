package stepRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import base.DriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(
		features= "src/main/resources/features/ParaBank.feature",
		dryRun= false,
		glue= {"stepDefination"},
		monochrome = true
	)
public class TestRunner extends AbstractTestNGCucumberTests{


}
