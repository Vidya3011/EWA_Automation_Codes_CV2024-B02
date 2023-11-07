package Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pom.DashBoardPom;

public class DashBoardScript  extends Generic.BaseClass {
	public static Actions act;
    public static SoftAssert so;
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(DashBoardScript.class);
	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser");
		launchUrl();
		log.info("ContentVerseURL");
	}

	@Test (priority=1)
	public void Login() throws Exception {
		loginCVS();
		log.info("User is Successfully logged in");
	}
	
	/*@Test(priority=2)
	public void SearchIconDashBoardFunctionality() throws Exception {
		
		DashBoardPom db=new DashBoardPom();
		db.DashBoardSeachIcon();
	}
	
	@Test(priority=2)
	public void NotifiactionIconDashBoardFunctionality() throws Exception {
		
		DashBoardPom db=new DashBoardPom();
		db.NotificationIcon();
	}*/
	
	@Test(priority=3)
	public void TodoListWFDetailsDashBoardFunctionality() throws Exception {
		
		DashBoardPom db=new DashBoardPom();
		db.TodoListWFDetailsfromDb();
	}
	
	
	

	
	
	
	
	
	
	
	
}
