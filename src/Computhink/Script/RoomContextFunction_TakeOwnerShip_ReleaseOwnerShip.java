package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.Authentication.Failed;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.FailedRetry;
import Computhink.Pom.RoomContextMenu;
import Computhink.Pom.Security;

//NishaR codes
public class
RoomContextFunction_TakeOwnerShip_ReleaseOwnerShip extends Computhink.Generic.BaseClass {
	public static Actions act;

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(RoomContextFunction_TakeOwnerShip_ReleaseOwnerShip.class);

	@BeforeClass
	public void loadBrowser() throws Exception {
		loadBrowser("Chrome");

		log.info("Chrome Browser Launched");
		Reporter.log("Chrome Browser launched Successfully...");

		launch47Url();

		launchUrl();

		// launchLocalUrl();
		Reporter.log("Contentverse URL launched successfully...");
		log.info("Contentverse URL launched successfully...");
	}

	@Test(priority = 1)
	public void Login() throws Exception {

		// LogoutPage();
		LogInAdmin();

		Reporter.log("User logged in successfully... ");
		log.info("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successfully... ");
	}

	//@Test(priority = 2)
	public void TC_01_ChangeNavigation() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.ChangeNavigation();
		log.info(
				"Admin user has taken the ownership of particular folder,so another user cannot take ownership of that folder.Take ownership functionality verified successfully, Its working fine... ");

	}

//	@Test(priority = 3)
	public void TC_02_Checking_Cabinet_SecurityPermission() throws Exception {

		RoomContextMenu rm = new RoomContextMenu();
		rm.GrantSuperivorPermission();

		log.info(
				"Admin user has taken the ownership of particular folder,so another user cannot take ownership of that folder.Take ownership functionality verified successfully, Its working fine... ");

	}

	@Test(priority = 4)
	public void TC_03_TakeOwnerShip() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.TakeOwnerShip();
		log.info(
				"Admin user has taken the ownership of particular folder,so another user cannot take ownership of that folder.Take ownership functionality verified successfully, Its working fine... ");

	}

	@Test(priority = 5)
	public void TC_04_ReleaseOwnerShip() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.ReleaseOwnerShip();
		Thread.sleep(3000);
		log.info(
				"Admin User has released the ownership of particular folder,so another user can pick up the owner ship.Release owner ship working fine and its verified successfully..."); // Refresh_Button(driver);
																																															// }

	}
}
