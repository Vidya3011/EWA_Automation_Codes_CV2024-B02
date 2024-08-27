package Script;

//Dipak Automation Coading

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.My_Preferences;

public class My_Preferences_QuickFind extends BaseClass {

	/*
	 * @BeforeClass
	 * 
	 * public void Launch_Browser() throws Exception { loadBrowser("edge");
	 * launchUrl(); Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test
	 * 
	 * public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully.", true);
	 * 
	 * }
	 */

	@Test(priority = 1)
	public void TC_01_Verify_QuickFind_DocIdSearch() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_QuickFind_DocIdSearch();

	}

	@Test(priority = 2)
	public void TC_02_Verify_QuickFind_TextSearch() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_QuickFind_TextSearch();

	}

	@Test(priority = 3)
	public void TC_03_Verify_QuickFind_IndexSearch() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_QuickFind_IndexSearch();

	}

	@Test(priority = 4)
	public void TC_04_Verify_QuickFind_BothSearch() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_QuickFind_BothSearch();

	}
}
