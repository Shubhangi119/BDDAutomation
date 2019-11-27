package qai.login_gmail_stepdefs;



//import cucumber.api.java.After;
//import cucumber.api.java.AfterStep;
//import cucumber.api.java.Before;
//import cucumber.api.java.BeforeStep;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.AfterStep;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Hooks {
    @Before
    public void init() {
        System.out.println("@Before scenario executes");
    }

    @After
    public void cleanUp() {
        System.out.println("@After scenario executes");
    }

    @BeforeStep
    public void beforeStep() {
        System.out.println("@BeforeStep executes");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("@AfterStep executes");
    }
}