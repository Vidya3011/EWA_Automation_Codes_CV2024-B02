package Script;

import org.apache.logging.log4j.LogManager;
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
  	public void SearchTodoListTesting() throws Exception {
	   
	   SearchFunction sr = new SearchFunction();
	     sr.SearchTodoListFunctionality();
   
	     log.info("Search document and send the document into dynamic wf again successfull");
   }
  @Test (priority=3)
 	public void SearchTodoListFirstUser() throws Exception {
	     ToDoListTab todo = new ToDoListTab();
		 
		  todo.LogVidyaTaskUser1();
		  log.info("User1 logged in success");
		 todo.VerifyingAnnotationPageBySecondUSerVidya();
		  log.info("vidya user accept the document successfull");
   }
		
   @Test (priority=4)
 	public void SearchTodoList() throws Exception {
	   ToDoListTab todo = new ToDoListTab();
	todo.refrshLogNishaTaskUser();
		  log.info("Nisha user logged in successfull");
		  
		  todo.TaskUser2RNishaRejectTheDocfromSearch();
		  log.info("nisha user rejected the document successfull and the rejected doc goes to task user3 ram.so the doc move to ram acconunt");
   }
   
   @Test (priority=5)
 	public void SearchTodoListThirdUser() throws Exception {
	   ToDoListTab todo = new ToDoListTab();
	   SearchFunction sr = new SearchFunction();
	   todo.RamTaskUser();
		  log.info("Ram user logged in sucessfull");
	  sr.SearchTodolistEndByUSerRAm();
	 jsclick(Refresh_Button(driver));
	
   }
	   
	   
   }
   
   
   

