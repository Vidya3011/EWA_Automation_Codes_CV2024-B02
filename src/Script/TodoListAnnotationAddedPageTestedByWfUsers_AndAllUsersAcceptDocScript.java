package Script;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pom.SearchFunction;
import Pom.ToDoListTab;

public class TodoListAnnotationAddedPageTestedByWfUsers_AndAllUsersAcceptDocScript  extends Generic.BaseClass {
	
   
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(TodoListAnnotationAddedPageTestedByWfUsers_AndAllUsersAcceptDocScript.class);
	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser started Successfully...");
		driver.manage().deleteAllCookies();
		launchUrl();
		
		log.info("CVS URL started Successfully...");
	}
	
 
	  @Test (priority=1)
		public void LoginCV() throws Exception {
			 loginCVS();
			
			  log.info("CVS User is logged in successfully...");
		
			  }
    
	@Test(priority = 2)
	public void SendAnnotationPageToWf() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		//todo.AnnotationPageSendWF();
		log.info("The Added annotation page document send to dynamic wf successfull...");
		todo.LogVidyaTaskUser1();
		log.info("Logged as USer 2 Vidya");
		todo.VerifyingAnnotationPageBySecondUSerVidya();
		log.info("User2 verify the page and accept the document");
	    todo.LoggedInAsThirdUser();
	    log.info("Logged as Third user Dipak");
	    todo.VerifyingAnnotationPageByThirdUSerDipak();
	    log.info("The third user has check the document and accept the document and the user add one more user successfull");
	    todo.RamTaskUser();
	    log.info("Ram usser has added successfull");
	    todo.VerifyingAnnotationPageByFourthUSerRAm();
	    log.info("Ram user verify the page and accept the document successfull.");
	    LogoutPage();
	    log.info("Wf Ended successfull.And The creator got mail successfull");
	    loginCVS();
	    log.info("when opening this wf ended document it shows document locked by EWS admin... ");
	    todo.SentItemsWithSummary();
	    log.info("The wrokflow summary displayed successfull");
	}

}
