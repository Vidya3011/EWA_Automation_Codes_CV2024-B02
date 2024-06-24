package Script;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Language;

public class Login_Validation extends Generic.BaseClass {

	@BeforeClass
	public void  Launch_Browser() throws Exception {

		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test(priority = 1)
	public void TC_01_Verifying_Login_EWA_with_blank_Username() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 1 : Verifying Login EWA with blank username ", true);
		pojo.loginwithoutUsername();
		Thread.sleep(4000);
		pojo.getUsernameerror();
	}

	@Test(priority = 2)
	public void TC_02_Verifying_Login_EWA_with_blank_Password() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 2 : Verifying Login EWA with blank password", true);
		Thread.sleep(4000);
		pojo.loginwithoutPassword();
		Thread.sleep(4000);
		pojo.getPassworderror();
	}

	@Test(priority = 3)
	public void TC_03_Verifying_Login_EWA_without_Selecting_Roomname() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 3 : Verifying Login EWA without selecting roomname ", true);
		Thread.sleep(4000);
		pojo.loginwithoutRoomname();
		Thread.sleep(4000);
		pojo.getRoomerror();
	}

	@Test(priority = 4)
	public void TC_04_Verifying_Login_EWA_with_Invalid_Username() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 4 : Verifying Login EWA with invalid username ", true);
		Thread.sleep(4000);
		pojo.InvalidUsername();
		Thread.sleep(4000);
		pojo.getUsernotexist();
		Thread.sleep(4000);
	}

	@Test(priority = 5)
	public void TC_05_Verifying_Login_EWA_with_Invalid_Password() throws Exception {

		Language pojo = new Language();
		Reporter.log("Test Scenario 5 : Verifying Login EWA with invalid password ", true);
		Thread.sleep(4000);
		pojo.InvalidPassword();
		Thread.sleep(4000);
		pojo.getInvalidpassword();
		Thread.sleep(4000);
		driver.close();
		Reporter.log("Close the application", true);
	}

	@Test(priority = 6)
	public void  Launch_Browser1() throws Exception {

		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
		LogDipakUser();
		Thread.sleep(4000);
		driver.close();
		Reporter.log("Close the application", true);
	}

	@Test(priority = 7)
	public void  Launch_Browser2() throws Exception {

		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test(priority = 8)
	public void TC_06_Verifying_No_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Reporter.log("Test Scenario 6 : Verifying No button of Session for user is already active dialog box ", true);
		VerifyloginCVS();
		Reporter.log("Verified No button of Session for user is already active dialog box ", true);
		driver.close();
		Reporter.log("Close the application", true);
	}

	@Test(priority = 9)
	public void  Launch_Browser3() throws Exception {

		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test(priority = 10)
	public void TC_07_Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Reporter.log("Test Scenario 7 : Verifying Yes button of Session for user is already active dialog box ", true);
		Thread.sleep(4000);
		LogDipakUser();
		Thread.sleep(4000);
		Reporter.log("Verified Yes button of Session for user is already active dialog box ", true);
		driver.close();
		Reporter.log("Close the Application", true);
	}
}
