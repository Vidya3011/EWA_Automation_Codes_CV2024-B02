package CVS_Hindi_French_Language;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.FavoritesPom;
import Pom.RoomContextMenu;

public class Favorites extends Generic.BaseClass {
	public static Actions act;
	
	 private static org.apache.logging.log4j.Logger log = LogManager.getLogger(Favorites.class);
	

	/*@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser started Successfully...");
		driver.manage().deleteAllCookies();
		launchUrl();
		
		log.info("CVS URL started Successfully...");
		
	}*/

	@Test(priority=1)
	public void CVSLogin() throws Exception {
		RoomContextMenu rm=new RoomContextMenu();
		//LogoutPage();
		rm.LogInAdmin();
		log.info("Admin User is logged in successfully...");
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	
	public static void FavoriteInUserLevel() throws Exception {

		FavoritesPom fav = new FavoritesPom();
		jsclick(fav.getCabinetForFav());
		Thread.sleep(3000);
		movingclkElement(fav.getFavStarIcon());
		Thread.sleep(3000);
		jsclick(fav.getFavUserLevel());
		Thread.sleep(3000);
		jsclick(fav.getFavdialogOKBTN());
		Thread.sleep(5000);
		movingclkElement(fav.getFavBookMarkIconTab());
		Thread.sleep(8000);
		jsclick(fav.getLoadAll());
		Thread.sleep(3000);
		movingElement(fav.getDeleteFav());
		jsclick(fav.getDeleteFav());
		Thread.sleep(3000);
		jsclick(fav.getDeleteFavOkBTN());
		Thread.sleep(3000);
		log.info("Favorite User Level working fine...");
	}

	@Test(priority = 3)

	public static void FavoriteInSystemLevel() throws Exception {

		FavoritesPom fav = new FavoritesPom();
		jsclick(fav.getSystemLevelFavCabinet());
		Thread.sleep(3000);
		movingclkElement(fav.getFavStarIcon());
		Thread.sleep(3000);
		jsclick(fav.getFavSystemLevel());
		Thread.sleep(3000);
		jsclick(fav.getFavdialogOKBTN());
		Thread.sleep(3000);
		movingclkElement(fav.getFavBookMarkIconTab());
		Thread.sleep(4000);
		LogoutPage();
		loginCVS();
		movingclkElement(fav.getFavBookMarkIconTab());
		Thread.sleep(3000);
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		log.info("Favorite System Level working fine...");
	}

}
