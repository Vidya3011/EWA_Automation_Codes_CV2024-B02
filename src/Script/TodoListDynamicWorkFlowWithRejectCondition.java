package Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	public void dynamicWF_MetaDataAgree_Vidya() throws Exception {
		
		 ToDoListTab todo=new ToDoListTab();
	        so=new SoftAssert();
			jsclick(todo.getTodolistTab());
			Thread.sleep(3000);
			jsclick(todo.getNewItems());
		    Thread.sleep(5000);
	        movingclkElement(todo.getMetadata());
		    Thread.sleep(3000);
		    todo.getCommentButton().click();
		    todo.getCommenttextBox().sendKeys(TodoListExcel(4, 0));
		    Thread.sleep(3000);
		    jsclick(todo.getCommenttextBoxOKBTN());
		    Thread.sleep(4000);
			todo.getAcceptButton().click();
			
			so.assertTrue(todo.getAssertvalid().isDisplayed(), "The workflow status dialog box opened successfull");
			todo.getWorkflowComments().sendKeys(TodoListExcel(3, 2));
			jsclick(todo.getWorkflowCommentsOKButton());
			Thread.sleep(8000);
			log.info("New manual for automation first task user vidya has accept the document,Its has move to second task user successfull");
		}
	
	@Test(priority=4)
	 public void dynamic_WF_Task2UserNisha() throws Exception {
		 ToDoListTab todo=new ToDoListTab();
		 Thread.sleep(8000);
		 todo.refrshLogNishaTaskUser();
		 log.info("Task user 2 RNisha Logged in successful");
	}
	
	@Test(priority = 5)
	public void DynamicWF_user2_RNishaAcceptTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		so = new SoftAssert();
		jsclick(todo.getTodolistTab());
		Thread.sleep(3000);
		jsclick(todo.getNewItems());
		VisiblityOf(todo.getTodolistDoc());
	    jsclick(todo.getTodolistDoc());
	    Thread.sleep(6000);
	    WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		Thread.sleep(6000);
		jsclick(todo.getCommentButton());
		Thread.sleep(3000);
		todo.getCommenttextBox().sendKeys(TodoListExcel(4, 0));
		Thread.sleep(3000);
		jsclick(todo.getCommenttextBoxOKBTN());
		Thread.sleep(4000);
		jsclick(todo.getAcceptButton());
		Thread.sleep(3000);
		todo.getWorkflowComments().sendKeys(TodoListExcel(1, 4));
		jsclick(todo.getWorkflowCommentsOKButton());
		Thread.sleep(8000);
		log.info("TaskUser2 RNisha has received the document successful.RNisha Accept dynamic wf document");
	}

	@Test(priority = 6)
	public void DynamicWFrefrshAndLogDipak() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(3000);
		todo.refrshLogDipakTaskUser();
		log.info("TaskUser3 Dipak Logged in successful");
	}

	@Test(priority = 7)
	public void DynamicWF_user3_DipakRejectTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		so = new SoftAssert();
		jsclick(todo.getTodolistTab());
		Thread.sleep(3000);
		jsclick(todo.getNewItems());
		Thread.sleep(6000);
	    VisiblityOf(todo.getMetadata());
		movingclkElement(todo.getMetadata());
		Thread.sleep(3000);
		
		jsclick(todo.getRejectButton());
		Thread.sleep(3000);
		todo.getWorkflowComments().sendKeys(TodoListExcel(1, 5));
		todo.getWorkflowCommentsOKButton().click();
		Thread.sleep(8000);
		log.info(
				"TaskUser3 Dipak has received the document successful.dipak Reject the dynamic wf document.It will move to rewiew items");
	
	}
	
	
   @Test(priority = 8)
	public void SummaryStatuswithReviewFunction() throws Exception {
		
		 ToDoListTab todo=new ToDoListTab();
		 jsclick(todo.getTodolistTab());
			Thread.sleep(3000);
			jsclick(todo.getRewiewITems());
			
			WebDriverWait wait =new WebDriverWait(driver,30);
			Thread.sleep(5000);
		    wait.until(ExpectedConditions.visibilityOf((todo.getMetadata())));
		    movingclkElement(todo.getMetadata());
		    Thread.sleep(3000);
			jsclick(todo.getSummaryButton());
			Thread.sleep(8000);
	        jsclick(todo.getsummarycancelbtn());
	        Thread.sleep(2000);
	        jsclick(todo.getRewiewBTN());
	        Thread.sleep(2000);
	        todo.getWorkflowComments().sendKeys(TodoListExcel(1, 4));
			todo.getWorkflowCommentsOKButton().click();
	        Thread.sleep(3000);
		log.info("Task user3 Dipak has received the document.it will displayed in review items.User 2 shows the summary and give review for the wf document successful");
	    LogoutPage();
   }
	 
	
	
}
