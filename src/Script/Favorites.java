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
		loadBrowser("Chrome");
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
