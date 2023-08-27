package testsuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.*;


public class LoginPageStepDef {
	
	@Before
	public void inti() {
		Config.confChrome();
		Config.driver= new ChromeDriver();
		Config.maximesWindow();
		
	}
	
	
	@Given("admin is on login page")
	public void admin_is_on_login_page() {
		Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}


	@When("admin enter correct username {string} and correct password {string}")
	public void admin_enter_correct_username_and_correct_password(String Nom, String Mdp) {
		LoginPage page = new LoginPage();
		page.connect(Nom, Mdp);
	}

	@Then("admin is directed to the homepage")
	public void admin_is_directed_to_the_homepage() {
		HomePage home = new HomePage();
		String actualMessage = home.verifMessageHome();
		String expectedMessage = "Dasard";
		Assert.assertEquals(expectedMessage, actualMessage);
	   
	}
	
	@Then("admin is directed to the homepage that contains message {string}")
	public void admin_is_directed_to_the_homepage_that_contains_message(String expectedMessage) {
		HomePage home = new HomePage();
		String actualMessage = home.verifMessageHome();
		Assert.assertEquals(expectedMessage, actualMessage);
	    
	}

	@When("admin enter correct username {string} and wrong password {string}")
	public void admin_enter_correct_username_and_wrong_password(String Nom, String Mdp) {
		LoginPage page = new LoginPage();
		page.connect(Nom, Mdp);
	  
	}

	@Then("admin is still on login page that contains message {string}")
	public void admin_is_still_on_login_page_that_contains_message(String expectedMessage) {
		LoginPage Login = new LoginPage();
		String acrualMessage =Login.verifMessageLogin();
		Assert.assertEquals(expectedMessage, acrualMessage);

	}

}
