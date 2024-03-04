package CVS_Hindi_French_Language;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pom.DashBoardPom;
import Pom.ToDoListTab;

public class DashBoardScript  extends Generic.BaseClass {
	
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(DashBoardScript.class);
	/*@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser");
		//launchLocalUrl();
		launchUrl();
		log.info("ContentVerseURL");
	}

	@Test (priority=1)
	public void Login() throws Exception {
		loginCVS();
		//loginLocalCVS();
		log.info("User is Successfully logged in");
	}*/
	
	@Test(priority=2)
	public void SearchIconDashBoardFunctionality() throws Exception {
		
		DashBoardPom db=new DashBoardPom();
		db.DashBoardSeachIcon();
	}
	
	@Test(priority=3)
	public void NotifiactionIconDashBoardFunctionality() throws Exception {
		
		DashBoardPom db=new DashBoardPom();
		db.NotificationIcon();
	}
	
	@Test(priority=4)
	public void TodoListWFDetailsDashBoardFunctionality() throws Exception {
		
		DashBoardPom db=new DashBoardPom();
		db.TodoListWFDetailsfromDb();
	}
	
	@Test(priority=5)
	public void CreateNewDocumentFromDB() throws Exception {
		
		DashBoardPom db=new DashBoardPom();
		db.NewDocumentfromDb();
	}
	
	@Test(priority=6)
	public void logoutFromDB() throws Exception {
		
		DashBoardPom db=new DashBoardPom();
		db.LogoutfromDb();
	}
	

	
	
	
	
	
}
