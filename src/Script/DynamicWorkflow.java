package Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pom.ToDoListTab;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
DynamicWorkflow extends Generic.BaseClass {
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(DynamicWorkflow.class);

	public static SoftAssert so;
	@BeforeClass
	public void loadBrowser() {
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
	public void DynamicWf() throws Exception {

		ToDoListTab todo = new ToDoListTab();
		todo.DynamicWorkFlowTodoListFunctionality();
	}

	@Test(priority = 3)
	public void dyanamic_wf_AndLogVidyaUser() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(8000);
		todo.LogVidyaTaskUser1();
		log.info("New manual for automation first task user vidya has logged in successful");
	}

	@Test(priority = 4)
	public void TC_1_dynamicWF_MetaDataAgree_Vidya() throws Exception {

		ToDoListTab todo = new ToDoListTab();
		todo.dynamicWF_MetaDataAgree_Vidya();
	}

	@Test(priority = 5)
	public void TC_2_dynamic_WF_Task2UserNisha() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(8000);
		todo.refrshLogNishaTaskUser();
		log.info("Task user 2 RNisha Logged in successful");
	}

	@Test(priority = 6)
	public void TC_3_DynamicWF_user2_RNishaAcceptTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		todo.DynamicWF_user2_RNishaAcceptTheDocument();
		log.info("TaskUser2 RNisha has received the document successful.RNisha Accept dynamic wf document");
	}

	@Test(priority = 7)
	public void TC_4_DynamicWFrefrshAndLogDipak() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(3000);
		todo.refrshLogDipakTaskUser();
		log.info("TaskUser3 Dipak Logged in successful");
	}

	@Test(priority = 8)
	public void TC_5_DynamicWF_user3_DipakRejectTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		todo.DynamicWF_user3_DipakRejectTheDocument();
		log.info("Rejected document will move to Rewiew items");

	}

	/*
	 * @Test(priority=8) public void dynamic_WF_OriginatorRnisha() throws Exception
	 * { ToDoListTab todo=new ToDoListTab(); Thread.sleep(8000);
	 * todo.refrshLogNishaTaskUser();
	 * log.info("Originator RNisha Logged in successful"); }
	 */

}
