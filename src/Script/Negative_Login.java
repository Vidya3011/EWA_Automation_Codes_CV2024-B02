package Script;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Language;

public class Negative_Login extends Generic.BaseClass {

	private static final Logger log = LogManager.getLogger(Negative_Login.class);

	 @BeforeClass
	public void LandBrowser() {

		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	 @Test
	public void Login_EWA() throws Exception {
		LogDipakUser();
		log.info("CVS User is logged in successfully...");

	}

	@Test(priority = 1)
	public void verify_Username_Validation() throws Exception {

		Language pojo = new Language();
		Thread.sleep(6000);
		jsclick(pojo.getUsername());
		Thread.sleep(2000);
		jsclick(pojo.getLogout());
		Thread.sleep(4000);
		pojo.loginwithoutUsername();
		Thread.sleep(4000);
		pojo.getUsernameerror();

	}

	@Test(priority = 2)
	public void verify_Password_Validation() throws Exception {

		Language pojo = new Language();
		Thread.sleep(4000);
		pojo.loginwithoutPassword();
		Thread.sleep(4000);
		pojo.getPassworderror();

	}

	@Test(priority = 3)
	public void verify_RoomName_Validation() throws Exception {

		Language pojo = new Language();
		Thread.sleep(4000);
		pojo.loginwithoutRoomname();
		Thread.sleep(4000);
		pojo.getRoomerror();
	}

	@Test(priority = 4)
	public void verify_Invalid_Username() throws Exception {

		Language pojo = new Language();
		Thread.sleep(4000);
		pojo.InvalidUsername();
		Thread.sleep(4000);
		pojo.getUsernotexist();
		Thread.sleep(4000);

	}

	@Test(priority = 5)
	public void verify_Invalid_Password() throws Exception {

		Language pojo = new Language();
		Thread.sleep(4000);
		pojo.InvalidPassword();
		Thread.sleep(4000);
		pojo.getInvalidpassword();
		Thread.sleep(5000);
		LogDipakUser();
		Thread.sleep(5000);
	}
}
