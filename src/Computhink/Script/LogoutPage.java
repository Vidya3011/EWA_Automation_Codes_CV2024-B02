package Computhink.Script;

import org.openqa.selenium.WebDriver;

import Computhink.Pom.Logout;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
LogoutPage {

	private WebDriver driver;

	LogoutPage() {

	}

	LogoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void testLogout() throws Exception {
		Logout logout1 = new Logout();
		// logout1.SetLogout();
	}
}