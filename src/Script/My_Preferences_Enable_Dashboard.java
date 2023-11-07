package Script;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.Logout;
import Pom.My_Preferences;

public class My_Preferences_Enable_Dashboard extends BaseClass {

	private static final Logger log = LogManager.getLogger(My_Preferences_Add_signature.class);
	
	//@BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	//@Test

	public void Login_EWA() throws Exception {
		loginCVS();
		log.info("CVS URL started Successfully...");

	}

	@Test(priority = 1)
	public void Verify_Enable_Dashboard() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(BaseClass.Refresh_Button(driver));
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getVerify_EnableDashboard_checkbox();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		jsclick(pojo.getLogout());
		Thread.sleep(5000);
		loginCVS();
		Thread.sleep(4000);
		pojo.getClick_SwitchTo_DefaultView_Option();
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getVerify_EnableDashboard_checkbox_Unchecked();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		Reporter.log(" Enable Dashboard Functionality Verified Successfully", true);
		log.info("Enable Dashboard Functionality Verified Successfully");
		jsclick(BaseClass.Refresh_Button(driver));
	}

	
}

