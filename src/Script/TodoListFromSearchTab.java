package Script;

import org.apache.logging.log4j.LogManager;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.SearchFunction;
import Pom.ToDoListTab;

public class TodoListFromSearchTab  extends Generic.BaseClass {
	
   
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(TodoListFromSearchTab.class);
	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser started Successfully...");
		
		launchUrl();
		
		log.info("CVS URL started Successfully...");
	}
	
 
   
   @Test (priority=1)
	public void LoginCV() throws Exception {
		 loginCVS();
		
		  log.info("CVS User is logged in successfully...");
	
		  }

 @Test (priority=2)
  	public void TC_1_SearchTodoListTesting() throws Exception {
	   
	   SearchFunction sr = new SearchFunction();
	     sr.SearchTodoListFunctionality();
         Reporter.log("Search the document from document list send the document to dynamic wf");
	     log.info("Search the document from document list send the document to dynamic wf");
   }
  @Test (priority=3)
 	public void TC_2_SearchTodoListFirstUser() throws Exception {
	     ToDoListTab todo = new ToDoListTab();
		
		  todo.LogVidyaTaskUser1();
		  Reporter.log("User1 logged in success");
		 todo.VerifyingAnnotationPageBySecondUSerVidya();
		 Reporter.log("Dynamic wf first user accept the document");
		 Reporter.log("vidya user accept the document successfull");
   }
		
   @Test (priority=4)
 	public void TC_3_SearchTodoList() throws Exception {
	   ToDoListTab todo = new ToDoListTab();
	todo.refrshLogNishaTaskUser();
		  log.info("Nisha user logged in successfull");
		  Reporter.log("Nisha user logged in successfull");
		  todo.TaskUser2RNishaRejectTheDocfromSearch();
		  Reporter.log("nisha user rejected the document and the rejected document goes to task user3 ram.so the document moved to ram acconunt");
   }
   
   @Test (priority=5)
 	public void TC_4_SearchTodoListThirdUser() throws Exception {
	   ToDoListTab todo = new ToDoListTab();
	   SearchFunction sr = new SearchFunction();
	   todo.RamTaskUser();
	   Reporter.log("Ram user logged in sucessfull");
	  sr.SearchTodolistEndByUSerRAm();
	  Reporter.log("Ram user click on Endworkflow");
	  Reporter.log("Dynamic workflow working fine");
	 jsclick(Refresh_Button(driver));
	
   }
	   
	   
   }
   
   
   

