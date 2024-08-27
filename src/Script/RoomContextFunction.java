package Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.Authentication.Failed;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.FailedRetry;
import Pom.RoomContextMenu;
import Pom.Security;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
RoomContextFunction extends Generic.BaseClass {
	public static Actions act;

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(RoomContextFunction.class);

	// @BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser started Successfully...");

		launchUrl();

		log.info("CVS URL started Successfully...");

	}

	@Test(priority = 1)
	public void CVSLogin() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		LogoutPage();
		LogInAdmin();

		Thread.sleep(3000);
		log.info("Admin User is logged in successfully...");
	}

	@Test(priority = 2)
	public void TC_01_ChangeNavigation() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.ChangeNavigation();
		log.info(
				"Admin user has taken the ownership of particular folder,so another user cannot take ownership of that folder.Take ownership functionality verified successfully, Its working fine... ");

	}

	@Test(priority = 3)
	public void TC_2_Checking_Cabinet_SecurityPermission() throws Exception {

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
				"Admin User has released the ownership of particular folder,so another user can pick up the owner ship.Release owner ship working fine and its verified successfully...");
		// Refresh_Button(driver);
	}

	// @Test(priority=6)
	public void TC_05_CopyAndPasteDrawerLevel() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.CopyAndPasteDrawer();
		log.info(
				"User copied the drawer,paste the drawer into another cabinet.it works well,Copy and paste drawerLevel verified successfully");

	}

	@Test(priority = 8)
	public void TC_07_NodePropertiesFunction() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		jsclick(Refresh_Button(driver));
		rm.NodeProperties();
		log.info(
				"node properties are set and it shows the node set in the new create document.works fine verified successfully...");

		log.info(
				"Default node properties shows the default node in the new create document.works fine verified successfully...");
	}

	@Test(priority = 9)
	public void TC_08_NotificationFunction() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.Notification();
		log.info(
				"The user can set different type of notification.ALL Notification options working fine.User receives notification successfull...");
	}

	@Test(priority = 10)
	public void TC_09_CustomDocTypesFunction() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.CustomDocTypes();
		log.info("User can set custom document type to create new document.works fine verified successfully...");
	}

	@Test(priority = 11)
	public void TC_10_CategoriesPrivateFunction() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.CategoryPrivate();
		log.info("User can set colour of particular document in private level.works fine verified successfully...");

	}

	@Test(priority = 12)
	public void TC_11_CategoriesPublic() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.CategoryPublic();
		jsclick(Refresh_Button(driver));
		log.info("User can set colour of particular document in public level.works fine verified successfully...");

	}

	@Test(priority = 13)
	public void TC_12_ChangeNavigationToID() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.ChangeNavigationID();

	}

}