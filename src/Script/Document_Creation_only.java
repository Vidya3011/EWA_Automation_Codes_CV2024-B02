package Script;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.My_Preferences;

//Dipak Automation Coading

public class Document_Creation_only extends Generic.BaseClass {

	@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("edge");
		launchUrl();
		Reporter.log("CVS URL started successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);
	}

	@Test(priority = 1, invocationCount = 2000)
	public void TC_01_Create_2000_Documents() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Create_2000_Documents();

	}
}
