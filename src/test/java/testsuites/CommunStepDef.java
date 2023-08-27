package testsuites;

import Helper.Config;
import io.cucumber.java.en.Given;
import pages.LoginPage;

public class CommunStepDef {
	@Given("Utilisateur est connectee avec le bon username {string} et le bon password {string}")
	public void utilisateur_est_connectee_avec_le_bon_username_et_le_bon_password(String username, String password) {
		Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage page = new LoginPage();
		page.connect(username, password);
	 
	}

}
