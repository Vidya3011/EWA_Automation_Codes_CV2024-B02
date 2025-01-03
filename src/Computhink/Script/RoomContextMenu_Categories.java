package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.RoomContextMenu;

public class RoomContextMenu_Categories extends BaseClass {
	public static Actions act;

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(RoomContextMenu_Categories.class);

	@BeforeClass
	public void loadBrowser() throws Exception {
		loadBrowser("Chrome");

		log.info("Chrome Browser Launched");
		Reporter.log("Chrome Browser launched Successfully...");
		launch47Url();
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

	@Test(priority = 2)
	public void TC_1_CategoriesPrivateFunction() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.CategoryPrivate();
		log.info("User can set colour of particular document in private level.works fine verified successfully...");

	}

	@Test(priority = 3)
	public void TC_2_CategoriesPublic() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.CategoryPublic();
		jsclick(Refresh_Button(driver));
		log.info("User can set colour of particular document in public level.works fine verified successfully...");
	
	}
	
	@Test(priority = 4)
	public void TC_3_ChangeNavigationToID() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.ChangeNavigationID();
	
	}

}
