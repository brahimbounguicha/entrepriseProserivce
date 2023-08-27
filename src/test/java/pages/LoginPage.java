package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {
	
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement username ;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement submit;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement LoginDashboardMessage;
	
	public LoginPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void connect(String UserName , String Passwd) {
		Config.attente(10);
		username.sendKeys(UserName);
		password.sendKeys(Passwd);
		submit.click();
	
	}
	 public  String verifMessageLogin() {
		 String actualMessage = LoginDashboardMessage.getText();
		 return actualMessage;
	  }

}
