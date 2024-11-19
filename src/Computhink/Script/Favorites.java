package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.FavoritesPom;
import Computhink.Pom.RoomContextMenu;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class Favorites extends Computhink.Generic.BaseClass {
	public static Actions act;

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(Favorites.class);

	//@BeforeClass
	public void loadBrowser() throws Exception {
		loadBrowser("Chrome");

		log.info("Chrome Browser Launched");
		Reporter.log("Chrome Browser launched Successfully...");
		launch47Url();
		// launchLocalUrl();
		Reporter.log("Contentverse URL launched successfully...");
		log.info("Contentverse URL launched successfully...");
	}

  //	@Test(priority = 1)
	public void Login() throws Exception {
	
		LogoutPage();
		LogInAdmin();
		
		Reporter.log("User logged in successfully... ");
		log.info("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successfully... ");
	}
	



	@Test(priority = 2)

	public static void TC_1_FavoriteInUserLevel() throws Exception {

		FavoritesPom fav = new FavoritesPom();
		fav.FavoriteInUserLevel();
		log.info("Favorite User Level working fine...");
	}

	@Test(priority = 3)

	public static void TC_2_FavoriteInSystemLevel() throws Exception {

		FavoritesPom fav = new FavoritesPom();
		fav.FavoriteInSystemLevel();
		Reporter.log("The Favorite System option verified successfully...");
	}

}
