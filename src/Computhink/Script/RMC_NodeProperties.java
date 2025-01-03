package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.RoomContextMenu;

public class RMC_NodeProperties extends BaseClass {
	public static Actions act;

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(RMC_NodeProperties.class);

	@BeforeClass
	public void loadBrowser() throws Exception {
		loadBrowser("Chrome");

		log.info("Chrome Browser Launched");
		Reporter.log("Chrome Browser launched Successfully...");
<<<<<<< HEAD
		launch47Url();
=======
		launchUrl();
>>>>>>> origin/Dipak-Pandurang-Gawali
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
	@Test(priority = 3)

	public void RoomContextMenu_NodeProperties() throws Exception {
		RoomContextMenu rm = new RoomContextMenu();
		rm.NodePropertiesCVReports();
		log.info(
				"NodeProperties verified successfully...");

	}
	

}
