package Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pom.ToDoListTab;

public class TodoListDynamicWorkFlowWithRejectCondition extends Generic.BaseClass {
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(TodoListDynamicWorkFlowWithRejectCondition.class);
	
	 public static SoftAssert so;
	
	
	@Test(priority = 1)
	public void DynamicWf() throws Exception {

		ToDoListTab todo = new ToDoListTab();
		todo.DynamicWorkFlowTodoListFunctionality();
	}

	@Test(priority=2)
	 public void dyanamic_wf_AndLogVidyaUser() throws Exception {
		 ToDoListTab todo=new ToDoListTab();
		 Thread.sleep(8000);
		 todo.LogVidyaTaskUser1();
		 log.info("New manual for automation first task user vidya has logged in successful");
	}
	
	
	
	
	
	
	@Test(priority=3)
	public void TC_1_dynamicWF_MetaDataAgree_Vidya() throws Exception {
		
		 ToDoListTab todo=new ToDoListTab();
	        so=new SoftAssert();
			Reporter.log("Select todolist tab");
			jsclick(todo.getTodolistTab());
			Thread.sleep(3000);
			Reporter.log("USer select new items");
			jsclick(todo.getNewItems());
		    Thread.sleep(5000);
	        movingclkElement(todo.getMetadata());
	        Reporter.log("User Expand the todolist newitems documents's metadata");
		    Thread.sleep(3000);
		    todo.getCommentButton().click();
		    Reporter.log("User click on comment button to add comment");
		    todo.getCommenttextBox().sendKeys(TodoListExcel(4, 0));
		    Thread.sleep(3000);
		    Reporter.log("Enter comment");
		    jsclick(todo.getCommenttextBoxOKBTN());
		    Reporter.log("Click on comment dialog OK button");
		    Thread.sleep(4000);
		    Reporter.log("click on accept button");
			todo.getAcceptButton().click();
			Reporter.log("Enter comment into the accept dialog box");
			so.assertTrue(todo.getAssertvalid().isDisplayed(), "The workflow status dialog box opened successfull");
			todo.getWorkflowComments().sendKeys(TodoListExcel(3, 2));
			jsclick(todo.getWorkflowCommentsOKButton());
			Reporter.log("User click on Accept dilaog OK button");
			Thread.sleep(8000);
			log.info("New manual for automation first task user vidya has accept the document,Its has move to second task user successfull");
		}
	
	@Test(priority=4)
	 public void  TC_2_dynamic_WF_Task2UserNisha() throws Exception {
		 ToDoListTab todo=new ToDoListTab();
		 Thread.sleep(8000);
		 todo.refrshLogNishaTaskUser();
		 log.info("Task user 2 RNisha Logged in successful");
	}
	
	@Test(priority = 5)
	public void  TC_3_DynamicWF_user2_RNishaAcceptTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		so = new SoftAssert();
		jsclick(todo.getTodolistTab());
		Reporter.log("Select todolist tab");
		Thread.sleep(3000);
		jsclick(todo.getNewItems());
		Reporter.log("Select newitem submenu");
		VisiblityOf(todo.getTodolistDoc());
	    jsclick(todo.getTodolistDoc());
	    Reporter.log("Open a received workflow document");
	    Thread.sleep(6000);
	    try {
	    WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
	    }
	    catch(Exception e) {
	    	System.out.println("alert is not present");
	    }
		Thread.sleep(6000);
		jsclick(todo.getCommentButton());
		Reporter.log("Click on comment button to enter a comment");
		Thread.sleep(3000);
		Reporter.log("Enter comment and click on comment dilaog OK butoton");
		todo.getCommenttextBox().sendKeys(TodoListExcel(4, 0));
		Thread.sleep(3000);
		jsclick(todo.getCommenttextBoxOKBTN());
		Thread.sleep(4000);
		Reporter.log("USer click on Accept button");
		jsclick(todo.getAcceptButton());
		Thread.sleep(3000);
		Reporter.log("USer enter comment into accept dialog box");
		todo.getWorkflowComments().sendKeys(TodoListExcel(1, 4));
		jsclick(todo.getWorkflowCommentsOKButton());
		Reporter.log("Click on accept dilaog OK button");
		Thread.sleep(8000);
		Reporter.log("Task user _2 accepted");
		log.info("TaskUser2 RNisha has received the document successful.RNisha Accept dynamic wf document");
	}

	@Test(priority = 6)
	public void  TC_4_DynamicWFrefrshAndLogDipak() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(3000);
		todo.refrshLogDipakTaskUser();
		log.info("TaskUser3 Dipak Logged in successful");
	}

	@Test(priority = 7)
	public void  TC_5_DynamicWF_user3_DipakRejectTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		so = new SoftAssert();
		Reporter.log("Select a todolist tab");
		jsclick(todo.getTodolistTab());
		Thread.sleep(3000);
		Reporter.log("Select new item submenu");
		jsclick(todo.getNewItems());
		Thread.sleep(6000);
		Reporter.log("User Expand the todolist newitems documents's metadata");
	    VisiblityOf(todo.getMetadata());
		movingclkElement(todo.getMetadata());
		Thread.sleep(3000);
		Reporter.log("USer select reject button");
		jsclick(todo.getRejectButton());
		Thread.sleep(3000);
		Reporter.log("USer enter comment in the reject dialog box");
		todo.getWorkflowComments().sendKeys(TodoListExcel(1, 5));
		todo.getWorkflowCommentsOKButton().click();
		Thread.sleep(8000);
		Reporter.log("USer click on reject dilaog box OK button");
		Reporter.log("Task user_3 rejected the document");
		log.info(
				"TaskUser3 Dipak has received the document successful.dipak Reject the dynamic wf document.It will move to rewiew items");
	
	}
	
/*	@Test(priority=8)
	 public void dynamic_WF_OriginatorRnisha() throws Exception {
		 ToDoListTab todo=new ToDoListTab();
		 Thread.sleep(8000);
		 todo.refrshLogNishaTaskUser();
		 log.info("Originator RNisha Logged in successful");
	}*/
   @Test(priority = 9)
	public void  TC_6_SummaryStatuswithReviewFunction() throws Exception {
		
		 ToDoListTab todo=new ToDoListTab();
		 jsclick(todo.getTodolistTab());
		 Reporter.log("Select todo list tab");
			Thread.sleep(3000);
			jsclick(todo.getRewiewITems());
			Reporter.log("Select Review items Submenu");
			
			WebDriverWait wait =new WebDriverWait(driver,30);
			Thread.sleep(5000);
			Reporter.log("IF the document rejected by 3rd user it will move to orginator review items");
		    wait.until(ExpectedConditions.visibilityOf((todo.getMetadata())));
		    movingclkElement(todo.getMetadata());
		    Reporter.log("User Expand the todolist newitems documents's metadata");
		    Thread.sleep(6000);
		   /* VisiblityOf(todo.getSummaryButton());
			jsclick(todo.getSummaryButton());
			Thread.sleep(8000);
	        jsclick(todo.getsummarycancelbtn());
	        Thread.sleep(2000);*/
	        jsclick(todo.getRewiewBTN());
	        Thread.sleep(2000);
	        todo.getWorkflowComments().sendKeys(TodoListExcel(1, 4));
	        Reporter.log("USer click on review button");
			todo.getWorkflowCommentsOKButton().click();
			Reporter.log("USer enter the review and click on review dialog OK button");
	        Thread.sleep(3000);
	        jsclick(Refresh_Button(driver));
	        Reporter.log("USer click on Refresh tab");
		log.info("originaotor has received the document.it will displayed in review items.User 2 shows the summary and give review for the wf document successful");
	   
   }
	 
	
	
}
