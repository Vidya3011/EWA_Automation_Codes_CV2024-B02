package Script;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.Logout;
import Pom.My_Preferences;

public class My_Preferences_DateFormat extends BaseClass {

	private static final Logger log = LogManager.getLogger(My_Preferences_DateFormat.class);

	// @BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	// @Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		log.info("CVS User is logged in successfully...");

	}

	@Test(priority = 1)
	public void Verify_DateFormat_YYYY_MM_DD() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(3000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(3000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(3000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(3000);
		pojo.getYYYY_MM_DD_DateFormat();
		Thread.sleep(3000);
		jsclick(pojo.getApply_button());
		Thread.sleep(3000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(4000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(5000);
		pojo.Verify_YYYY_MM_DD_Date(driver);
		Thread.sleep(5000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(3000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(3000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(5000);
		pojo.Verify_YYYY_MM_DD_Date(driver);
		Thread.sleep(5000);
		Reporter.log("Verified DateFormat YYYY-MM-DD on Search and Folder Documents List", true);
		log.info("Verified DateFormat YYYY-MM-DD on Search and Folder Documents List");

	}

	@Test(priority = 2)
	public void Verify_DateFormat_DD_MM_YYYY() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(3000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(3000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(3000);
		pojo.getDD_MM_YYYY_DateFormat();
		Thread.sleep(3000);
		jsclick(pojo.getApply_button());
		Thread.sleep(3000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(3000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(5000);
		pojo.Verify_DD_MM_YYYY_Date(driver);
		Thread.sleep(5000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(3000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(3000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(5000);
		pojo.Verify_DD_MM_YYYY_Date(driver);
		Thread.sleep(5000);
		Reporter.log("Verified DateFormat DD-MM-YYYY on Search and Folder Documents List", true);
		log.info("Verified DateFormat DD-MM-YYYY on Search and Folder Documents List");
	}

	@Test(priority = 3)
	public void Verify_DateFormat_MM_DD_YYYY() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(3000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(3000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(3000);
		pojo.getMM_DD_YYYY_DateFormat();
		Thread.sleep(3000);
		jsclick(pojo.getApply_button());
		Thread.sleep(3000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(3000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(5000);
		pojo.Verify_MM_DD_YYYY_Date(driver);
		Thread.sleep(5000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(3000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(3000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(5000);
		pojo.Verify_MM_DD_YYYY_Date(driver);
		Thread.sleep(5000);
		Reporter.log("Verified DateFormat MM-DD-YYYY on Search and Folder Documents List", true);
		log.info("Verified DateFormat MM-DD-YYYY on Search and Folder Documents List");
	}

	@Test(priority = 4)
	public void Verify_DateFormat_Default() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(3000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(3000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(3000);
		pojo.getDefault_DateFormat();
		Thread.sleep(3000);
		jsclick(pojo.getApply_button());
		Thread.sleep(3000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(3000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(5000);
		pojo.Verify_Default_Date(driver);
		Thread.sleep(5000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(3000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(3000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(5000);
		pojo.Verify_Default_Date(driver);
		Thread.sleep(5000);
		Reporter.log("Verified DateFormat Default on Search and Folder Documents List", true);
		log.info("Verified DateFormat Default on Search and Folder Documents List");
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
	}
}
