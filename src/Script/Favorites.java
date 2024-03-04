package Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.FavoritesPom;
import Pom.RoomContextMenu;

public class Favorites extends Generic.BaseClass {
	public static Actions act;
	
	 private static org.apache.logging.log4j.Logger log = LogManager.getLogger(Favorites.class);
	

	@BeforeClass
	public void ladBrowser() {
		loadBrowser("edge");
		log.info("Chrome Browser started Successfully...");
		driver.manage().deleteAllCookies();
		launchUrl();
		
		log.info("CVS URL started Successfully...");
		
	}

	@Test(priority=1)
	public void CVSLogin() throws Exception {
		RoomContextMenu rm=new RoomContextMenu();
		Thread.sleep(4000);
		rm.LogInAdmin();
		Reporter.log("Admin User is logged in successfully...");
		log.info("Admin User is logged in successfully...");
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	
	public static void TC_1_FavoriteInUserLevel() throws Exception {

		FavoritesPom fav = new FavoritesPom();
		jsclick(fav.getCabinetForFav());
		Reporter.log("User select a cabinet to set a favorite user level");
		Thread.sleep(3000);
		movingclkElement(fav.getFavStarIcon());
		Reporter.log("Click on star icon");
		Thread.sleep(3000);
		jsclick(fav.getFavUserLevel());
		Thread.sleep(3000);
		Reporter.log("Select the user radio button in the favorite dialog");
		jsclick(fav.getFavdialogOKBTN());
		Reporter.log("Select favorite dialog OK button ");
		Thread.sleep(5000);
		movingclkElement(fav.getFavBookMarkIconTab());
		Reporter.log("Mouse hover on favorite icon");
		Thread.sleep(8000);
		jsclick(fav.getLoadAll());
		Reporter.log("USer click on ellipse icon from the dropdown");
		Thread.sleep(3000);
		Reporter.log("Show favorite dialog opened");
		movingElement(fav.getDeleteFav());
		Reporter.log("User click on delete icon");
		jsclick(fav.getDeleteFav());
		Reporter.log("Added favorite item deleted successfully...");
		Thread.sleep(3000);
		jsclick(fav.getDeleteFavOkBTN());
		Reporter.log("User close the show favorite dialog");
		Thread.sleep(3000);
		Reporter.log("Favorite User Level working fine...");
		log.info("Favorite User Level working fine...");
	}

	@Test(priority = 3)

	public static void TC_2_FavoriteInSystemLevel() throws Exception {

		FavoritesPom fav = new FavoritesPom();
		jsclick(fav.getSystemLevelFavCabinet());
		Reporter.log("User select a cabinet to set a favorite system level");
		Thread.sleep(3000);
		movingclkElement(fav.getFavStarIcon());
		Reporter.log("Click on star icon");
		Thread.sleep(3000);
		jsclick(fav.getFavSystemLevel());
		Reporter.log("Select the System radio button in the favorite dialog");
		Thread.sleep(3000);
		jsclick(fav.getFavdialogOKBTN());
		Reporter.log("Select favorite dialog OK button ");
		Thread.sleep(3000);
		movingclkElement(fav.getFavBookMarkIconTab());
		Reporter.log("Mouse hover on favorite bookmark icon to show the system level favorite cabinet");
		Thread.sleep(4000);
		Reporter.log("User logout the page");
		LogoutPage();
		Reporter.log("USer login as user name RNisha");
		loginCVS();
		movingclkElement(fav.getFavBookMarkIconTab());
		Reporter.log("Rnisha user Mouse hover on favorite icon");
		Thread.sleep(3000);
		Reporter.log("Admin usser selected cabinet for system level.So it will show in other user account also.");
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		log.info("The Favorite System Level working fine...");
	}

}
