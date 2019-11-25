package qai.login_gmail_stepdefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import qai.login_gmail_actions.*;
public class StepDef_login {
	loginpage_actions  obj = new loginpage_actions ();
	
	@Given("^I am on google website$")
	public void opengmail() {
	 obj.openurl();
	}
	
	@And("^I enter the keyword to search$")
	public void enterkeyword() {
		obj.entersearchword();
	}
	
}
