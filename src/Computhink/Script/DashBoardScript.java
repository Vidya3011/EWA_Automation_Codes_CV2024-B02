package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Computhink.Pom.DashBoardPom;
import Computhink.Pom.ToDoListTab;

public class DashBoardScript extends Computhink.Generic.BaseClass {

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(DashBoardScript.class);

	@BeforeClass
	public void ladBrowser() throws Exception {
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
	
		//LogoutPage();
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
		log.info("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successfully... ");
	}

	@Test(priority = 2)
	public void TC_1_SearchIconDashBoardFunctionality() throws Exception {

		DashBoardPom db = new DashBoardPom();
		db.DashBoardSeachIcon();
	}

	@Test(priority = 3)
	public void TC_2_NotifiactionIconDashBoardFunctionality() throws Exception {

		DashBoardPom db = new DashBoardPom();
		db.NotificationIcon();
	}

	@Test(priority = 4)
	public void TodoListWFDetailsDashBoardFunctionality() throws Exception {

		DashBoardPom db = new DashBoardPom();
		db.TodoListWFDetailsfromDb();
	}

	@Test(priority = 5)
	public void TC_4_CreateNewDocumentFromDB() throws Exception {

		DashBoardPom db = new DashBoardPom();
		db.NewDocumentfromDb();
	}
	
	@Test(priority = 6)
	public void TC_5_Contentverse_Document_Report() throws Exception {

		DashBoardPom db = new DashBoardPom();
		db.ContentverseDocumentReport();

	}

	@Test(priority = 7)
	public void TC_6_Contentverse_WrokflowStatus_Report() throws Exception {

		DashBoardPom db = new DashBoardPom();
		db.ContentverseWorkflowReport();

	}

	@Test(priority = 8)
	public void TC_7_Contentverse_RejectDocumentInWFReport_Report() throws Exception {

		DashBoardPom db = new DashBoardPom();
		db.ContentverseRejectDocumentInWFReport();

	}

//	@Test(priority = 9)
	public void TC_8_logoutFromDB() throws Exception {

		DashBoardPom db = new DashBoardPom();
		db.LogoutfromDb();
	}

}
