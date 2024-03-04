package Script;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.RoomContextMenu;

public class RoomContextMenuNegativeScenario  extends Generic.BaseClass {
	 private static org.apache.logging.log4j.Logger log = LogManager.getLogger(RoomContextMenuNegativeScenario.class);
	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser started Successfully...");
		
		launchUrl();
		
		log.info("CVS URL started Successfully...");
		
	}

	@Test(priority=1)
	public void CVSLogin() throws Exception {
		RoomContextMenu rm=new RoomContextMenu();
	//	LogoutPage();
		rm.LogInAdmin();
		
		Thread.sleep(3000);
	    log.info("Admin User is logged in successfully...");
	}
	
	
	
	
	
}
