package Script;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Language;

public class Language_Test extends Generic.BaseClass {

	@BeforeClass
	public void Launch_Browser() throws Exception {

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
	public void TC_01_verify_Spanish_Language() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 1 : Verifying Spanish Language ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		Reporter.log("Click on My Preferences option", true);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		Reporter.log("Select Office document and set as Default View", true);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		Reporter.log("Select Pdf Document and set as Default view", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		Reporter.log("Click on Username", true);
		jsclick(pojo.getLogout());
		Thread.sleep(4000);
		Reporter.log("Click on Logout Option", true);
		jsclick(pojo.getSpanish_Language());
		Thread.sleep(4000);
		Reporter.log("Click on Spanish Language", true);
		LogDipakUser();
		Thread.sleep(4000);
		Reporter.log("Login EWA With User credential", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		Reporter.log("Click on Username", true);
		pojo.Spanish_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		Reporter.log("Verified My Account name in Spanish laguage", true);
		jsclick(pojo.getLogout());
		Thread.sleep(4000);
		Reporter.log("Click on Logout Option", true);
		Reporter.log("Spanish Language verified Successfully", true);
	}

	@Test(priority = 2)
	public void TC_02_verify_French_Language() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 2 : Verifying French Language ", true);
		jsclick(pojo.getFrench_Language());
		Thread.sleep(4000);
		Reporter.log("Click on French Language", true);
		LogDipakUser();
		Thread.sleep(4000);
		Reporter.log("Login EWA with User credential ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		Reporter.log("Click on Username", true);
		pojo.French_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		Reporter.log("Verified My Account text in French Language", true);
		jsclick(pojo.getLogout());
		Thread.sleep(4000);
		Reporter.log("Click on Logout Option", true);
		Reporter.log("French Language verified Successfully", true);
	}

	@Test(priority = 3)
	public void TC_03_verify_Dutch_Language() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 3 : Verifying Dutch Language ", true);
		jsclick(pojo.getDutch_Language());
		Thread.sleep(4000);
		Reporter.log("Click on Dutch Language", true);
		LogDipakUser();
		Thread.sleep(4000);
		Reporter.log("Login EWA with User credential ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		Reporter.log("Click on Username", true);
		pojo.Dutch_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		Reporter.log("Verified My Account text in Dutch language", true);
		jsclick(pojo.getLogout());
		Thread.sleep(4000);
		Reporter.log("Click on Logout Option", true);
		Reporter.log("Dutch Language verified Successfully", true);
	}

	@Test(priority = 4)
	public void TC_04_verify_Hindi_Language() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 4 : Verifying Hindi Language ", true);
		jsclick(pojo.getHindi_Language());
		Thread.sleep(4000);
		Reporter.log("Click on Hindi Language", true);
		LogDipakUser();
		Thread.sleep(4000);
		Reporter.log("Login EWA with User credential", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		Reporter.log("Click on Username", true);
		pojo.Hindi_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		Reporter.log("Verified My Account Text in Hindi Language", true);
		jsclick(pojo.getLogout());
		Thread.sleep(4000);
		Reporter.log("Click on Logout Option", true);
		Reporter.log("Hindi Language verified Successfully", true);
	}

	@Test(priority = 5)
	public void TC_05_verify_English_Language() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 5 : Verifying English Language ", true);
		jsclick(pojo.getEnglish_Language());
		Thread.sleep(4000);
		Reporter.log("Click on English Language Option", true);
		LogDipakUser();
		Thread.sleep(4000);
		Reporter.log("Login EWA with User credential", true);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		Reporter.log("Click on Username", true);
		pojo.English_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		Reporter.log("Verified My Account in English Language", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("English Language verified Successfully", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
