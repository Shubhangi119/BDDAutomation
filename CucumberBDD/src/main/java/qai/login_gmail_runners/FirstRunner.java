package qai.login_gmail_runners;
import org.testng.annotations.BeforeClass;



import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import qai.login_gmail_testinitiator.setup;

@CucumberOptions(features="src/test/resources/featuretest.feature", tags= {"@test1"}, glue="qai.login_gmail_stepdefs", plugin = {"html:target/cucumber-html-report-teacher", "json:target/cucumber-teacher.json"})
public class FirstRunner extends AbstractTestNGCucumberTests{
	
	@BeforeClass
	public void runSetup() {
		setup.setupBrowser();
	}
	
//	@Before
//	public void setupClasss() {
//		System.out.println("Before Scenario");
//	}
//	
//	@BeforeStep
//	public void beforeStep() {
//		System.out.println("Before Step");
//	}

}

