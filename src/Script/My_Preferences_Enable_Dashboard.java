package Script;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.My_Preferences;

public class My_Preferences_Enable_Dashboard extends BaseClass {

	@BeforeClass

	public void  Launch_Browser() throws Exception {
		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully", true);

	}

	@Test(priority = 1)
	public void TC_01_Verify_Enable_Dashboard() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 1 : Verifying Enable Dashboard ", true);
		Thread.sleep(5000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(5000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(5000);
		Reporter.log("Click on My Preferences", true);
		pojo.getVerify_EnableDashboard_checkbox();
		Thread.sleep(5000);
		Reporter.log("Check Enable Dashboard Chekbox", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(5000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getUsername());
		Thread.sleep(5000);
		Reporter.log("Click on Username", true);
		jsclick(pojo.getLogout());
		Thread.sleep(5000);
		Reporter.log("Click on Logout Option", true);
		LogDipakUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with User credential", true);
		movingclkElement(pojo.getClick_SwitchTo_DefaultView_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Switch to Default view Option", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(5000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(5000);
		Reporter.log("Click on Setting Icon", true);
		pojo.getVerify_EnableDashboard_checkbox_Unchecked();
		Thread.sleep(5000);
		Reporter.log("Uncheck Enable Dashboard Checkbox", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(5000);
		Reporter.log("Click on Apply button", true);
		Reporter.log("Enable Dashboard Functionality Verified Successfully", true);
		driver.close();
		Reporter.log("Close the Application", true);
		
	}
}
