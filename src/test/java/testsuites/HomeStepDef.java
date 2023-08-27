package testsuites;

import Helper.Config;
import io.cucumber.java.en.*;
import pages.HomePage;

public class HomeStepDef {
	
	


	@When("Utilisateur clique sur le {string}")
	public void utilisateur_clique_sur_le(String menu) {
	   HomePage home = new HomePage();
	   home.clickOnMenuByName(menu);
	   
	}

	@Then("la pade de menu est affiche")
	public void la_pade_de_menu_est_affiche() throws InterruptedException {
	    Thread.sleep(3000);
	    Config.driver.quit();
	}


}
