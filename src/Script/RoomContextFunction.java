package Script;


import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.Authentication.Failed;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.FailedRetry;
import Log4j.Log4j2;
import Pom.RoomContextMenu;

public class RoomContextFunction extends Generic.BaseClass {
		public static Actions act;
		
		 private static org.apache.logging.log4j.Logger log = LogManager.getLogger(RoomContextFunction.class);
		

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
			
			rm.LogInAdmin();
			
			Thread.sleep(3000);
		    log.info("Admin User is logged in successfully...");
		}
		
		@Test(priority=2)
		public void takeOwnerShip_ReleaseOwnerShip() throws Exception {
			RoomContextMenu rm=new RoomContextMenu();
			rm.TakeOwnerShip();
		   log.info("Admin user has taken the ownership of particular folder,so another user cannot take ownership of that folder.Take ownership functionality verified successfully, Its working fine... ");
			Thread.sleep(3000);
			 log.info("Admin User has released the ownership of particular folder,so another user can pick up the owner ship.Release owner ship working fine and its verified successfully...");
			//Refresh_Button(driver);
			
			}
	    @Test(priority=3)
	   public void CopyAndPasteDrawerLevel() throws Exception {
			RoomContextMenu rm=new RoomContextMenu();
			rm.CopyAndPasteDrawer();
			log.info("User copied the drawer,paste the drawer into another cabinet.it works well,Copy and paste drawerLevel verified successfully");
			
		}
		@Test(priority=4)
		   public void CopyAndPasteFolderLevel() throws Exception {
				RoomContextMenu rm=new RoomContextMenu();
				rm.copyAndpasteFolder();
				log.info("User copied the folder,paste the folder into another folder.it works well,Copy and paste folderLevel verified successfully");
				Thread.sleep(3000);
			}
		
		@Test(priority=5)
		   public void NodePropertiesFunction() throws Exception {
				RoomContextMenu rm=new RoomContextMenu();
	           rm.NodeProperties();
	           log.info("node properties are set and it shows the node set in the new create document.works fine verified successfully...");
	           rm.NodePropertiesDefault();
	            log.info("Default node properties shows the default node in the new create document.works fine verified successfully...");
}
		@Test(priority=6)
		   public void NotificationFunction() throws Exception {
				RoomContextMenu rm=new RoomContextMenu();
				rm.Notification();
				log.info("The user can set different type of notification.ALL Notification options working fine.User receives notification successfull...");
}
		
		@Test(priority=7)
		   public void CustomDocTypesFunction() throws Exception {
				RoomContextMenu rm=new RoomContextMenu();
				rm.CustomDocTypes();
				log.info("User can set custom document type to create new document.works fine verified successfully...");
}
		
		@Test(priority=8)
		   public void CategoriesFunction() throws Exception {
				RoomContextMenu rm=new RoomContextMenu();
				rm.CategoryPrivate();
				log.info("User can set colour of particular document in private level.works fine verified successfully...");
				rm.CategoryPublic();
				jsclick(Refresh_Button(driver));
				log.info("User can set colour of particular document in public level.works fine verified successfully...");
				
}	
		
	
		
		
		
}