package Script;

import org.apache.logging.log4j.LogManager;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pom.SearchFunction;
import Pom.ToDoListTab;

public class TodoListAnnotationAddedPageTestedByWfUsers_AndAllUsersAcceptDocScript  extends Generic.BaseClass {
	
   
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(TodoListAnnotationAddedPageTestedByWfUsers_AndAllUsersAcceptDocScript.class);
	
    @BeforeClass
	public void loadBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser started Successfully...");
	
		launchUrl();
		log.info("CVS URL started Successfully...");
	}
	
 
   
	@Test (priority=1)
	public void Login() throws Exception {
		  loginCVS();
		  Reporter.log("RNISHa User is logged in successfull...");
		  log.info("CVS User is logged in successfully...");
	}
	@Test(priority = 2)
	public void TC_1_SendAnnotationPageToWf() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(4000);
		todo.AnnotationPageSendWF();
		Reporter.log("The annotation added page document send to dynamic wf successfull...");
		log.info("The Added annotation page document send to dynamic wf successfull...");
		todo.LogVidyaTaskUser1();
		log.info("Logged as USer 2 Vidya");
		todo.VerifyingAnnotationPageBySecondUSerVidya();
		Reporter.log("User2 verify the page and accept the document");
		
	}
		
	@Test(priority = 3)
		public void TC_2_ThirdUSerDipakAnnotationdynamicWf() throws Exception{
		
			ToDoListTab todo = new ToDoListTab();
		todo.LoggedInAsThirdUser();
		Reporter.log("Logged as Third user Dipak");
	    todo.VerifyingAnnotationPageByThirdUSerDipak();
	    log.info("The third user has check the document and accept the document and the user add one more user successfull");
	}
	
	@Test(priority = 4)
	public void TC_3_UpdateAndAddOneMoreUSer() throws Exception{
		ToDoListTab todo = new ToDoListTab();
		todo.RamTaskUser();
	    log.info("Ram usser has added successfull");
	    todo.VerifyingAnnotationPageByFourthUSerRAm();
	  Reporter.log("Ram user verify the page and accept the document successfull.");
	  //  LogoutPage();
	}
	//@Test(priority = 5)
	public void SendItemsWithSummary() throws Exception{
		ToDoListTab todo = new ToDoListTab();
	   
	    log.info("Wf Ended successfull.And The creator got mail successfull");
	    loginCVS();
	    log.info("when opening this wf ended document it shows document locked by EWS admin... ");
	    todo.SentItemsWithSummary();
	    log.info("The wrokflow summary displayed successfull");
	}

}
