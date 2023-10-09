package cucumberjunit;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 

public class stepondefinition extends BaseClass {
	
	LogInwebelement lw;
	
	@Given("^User tries to launch the browser with the url$")
	public void user_tries_to_launch_the_browser_with_the_url() {
		
		BaseClass.intilize();
		BaseClass.geturl();
	}

	@When("^USer tries to login$")
	public void user_tries_to_login()   {
		
		lw = new LogInwebelement();
		lw.validcredentails();
	}

	@Then("^LogiLogInwebelementn should be successfull$")
	public void login_should_be_successfull()   {
		
		lw.checking();
	}

	@And("^Browser need to be closed$")
	public void browser_need_to_be_closed()   {
		
		BaseClass.close();
	}



}
