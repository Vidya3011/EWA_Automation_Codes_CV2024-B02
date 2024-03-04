package Script;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.FailedRetry;
import Pom.ToDoListTab;

public class ToDoListFunctionality extends Generic.BaseClass {
	
    public static SoftAssert so;
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(ToDoListFunctionality.class);
	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser started Successfully...");
		driver.manage().deleteAllCookies();
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
	public void TC_1_SendDoc() throws InterruptedException {
		ToDoListTab todo = new ToDoListTab();
		todo.SendingDocumentInworkflow();
		Thread.sleep(15000);
		log.info("Nisha User Sending the document in to new manual for automation workflow successful");

	}

	@Test(priority = 3)
	public void TC_2_refrshAndLogVidyaUser() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(8000);
		todo.LogVidyaTaskUser1();
		log.info("New manual for automation first task user vidya has logged in successful");
	}

	@Test(priority = 4)
	public void TC_3_SendAndNewItemsMetaDataAgree() throws Exception {

		ToDoListTab todo = new ToDoListTab();
		so = new SoftAssert();
		jsclick(todo.getTodolistTab());
		Reporter.log("User click on todolist tab");
		Thread.sleep(3000);
		jsclick(todo.getNewItems());
		Reporter.log("User select newitems submenu");
		Thread.sleep(5000);
		ElementToBeClickable(todo.getMetadata());
		movingclkElement(todo.getMetadata());
		Thread.sleep(3000);
		Reporter.log("User Expand the todolist newitems documents's metadata");
		todo.getAcceptButton().click();
		Reporter.log("User click on accept button");
		so.assertTrue(todo.getAssertvalid().isDisplayed(), "The workflow status dialog box opened successfull");
		todo.getWorkflowComments().sendKeys(TodoListExcel(2, 0));
		Reporter.log("User enter comment in accept dialog box");
		jsclick(todo.getWorkflowCommentsOKButton());
		Reporter.log("USer click on accept dilaog box OK button");
		Thread.sleep(8000);
		log.info(
				"New manual for automation first task user vidya has accept the document,Its has move to second task user successfull");
	}

	@Test(priority = 5)
	public void TC_4_Task2UserNishaAccept() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(8000);
		todo.refrshLogNishaTaskUser();
		log.info("Task user 2 RNisha Logged in successful");
	}

	@Test(priority = 6)
	public void TC_5_TaskUser2RNishaRejectTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		so = new SoftAssert();
		jsclick(todo.getTodolistTab());
		Reporter.log("User click on todolist tab ");
		Thread.sleep(3000);
		jsclick(todo.getNewItems());
		Reporter.log("User click on newitems");
		Thread.sleep(3000);
		ElementToBeClickable(todo.getMetadata());
		movingclkElement(todo.getMetadata());
		Reporter.log("User Expand the todolist newitems documents's metadata");
        Thread.sleep(3000);
		jsclick(todo.getRejectButton());
		Reporter.log("User select reject button");
		Thread.sleep(3000);
		Reporter.log("user enter comment in reject dialog box");
		todo.getWorkflowComments().sendKeys(TodoListExcel(2, 5));
		todo.getWorkflowCommentsOKButton().click();
		Thread.sleep(15000);
		Reporter.log("click on reject dilaog OK button");

		log.info("TaskUser2 RNisha has received the document successful.RNisha Reject the document");
	}

	@Test(priority = 7)
	public void TC_6_refrshAndLogDipak() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(3000);
		todo.refrshLogDipakTaskUser();
		Reporter.log("TaskUser3 Dipak Logged in successful");
	}

	//@Test(priority = 8)
	public void TC_7_SummaryStatusDialogBoxFucntions() throws InterruptedException {
		ToDoListTab todo = new ToDoListTab();
		so = new SoftAssert();
		jsclick(todo.getTodolistTab());
		Reporter.log("USer click on todolist tab");
		Thread.sleep(3000);
		jsclick(todo.getNewItems());
		Reporter.log("Select new items submenu");
		Thread.sleep(5000);
		VisiblityOf(todo.getMetadata());
		Reporter.log("User Expand the todolist newitems documents's metadata");
		clickElement(todo.getMetadata());
	    Thread.sleep(5000);
	    Reporter.log("User click on summary button");
		jsclick(todo.getSummaryButton());
		Thread.sleep(5000);
		Reporter.log("USer check the summary of the document");
		jsclick(todo.getsummaryshowreportscancel());
		Reporter.log("User Expand the todolist newitems documents's metadata");
		Reporter.log("Task user3 Dipak has shows the Summary of a document it shows added comments successfully");
		log.info("Task user3 Dipak has shows the Summary of a document it shows added comments successfully");
	}

	@Test(priority = 9)
	public void TC_8_DocEndedFromTask3DipakUser() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		
		movingElement(todo.getTodolistTab());
		Thread.sleep(3000);
		Reporter.log("Select todolist tab");
		jsclick(todo.getNewItems());
		Reporter.log("Select new items");
		Thread.sleep(3000);
		Reporter.log("User Expand the todolist newitems documents's metadata");
		VisiblityOf(todo.getMetadata());
		jsclick(todo.getMetadata());
		Reporter.log("Click on endwf button");
        Thread.sleep(3000);
		jsclick(todo.getEndWfButton());
		Thread.sleep(3000);
		Reporter.log("Enter comment in the endwf dialog box");
		todo.getWorkflowComments().sendKeys(TodoListExcel(2, 6));
		todo.getWorkflowCommentsOKButton().click();
		Reporter.log("Select endwf dialog OK button");
		Thread.sleep(15000);
		log.info(
				"Task user 3 Dipak Click on EndWorkFlow. Workflow ended successful,Manual workflow Completed Successfully");

		log.info(
				"Task user 3 Dipak has Click on EndWorkFlow the work flow has end successful,Manual workflow Completed Successfully");
		jsclick(Refresh_Button(driver));
		Thread.sleep(3000);
	}
	
	
	
		
		
/*	@Test(priority = 10)
	public void DynamicWf() throws Exception {

		ToDoListTab todo = new ToDoListTab();
		todo.DynamicWorkFlowTodoListFunctionality();
	}

	@Test(priority=11)
	 public void dyanamic_wf_AndLogVidyaUser() throws Exception {
		 ToDoListTab todo=new ToDoListTab();
		 Thread.sleep(8000);
		 todo.LogVidyaTaskUser1();
		 log.info("New manual for automation first task user vidya has logged in successful");
	}
	
	
	
	
	
	
	@Test(priority=12)
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
	
	@Test(priority=13)
	 public void dynamic_WF_Task2UserNisha() throws Exception {
		 ToDoListTab todo=new ToDoListTab();
		 Thread.sleep(8000);
		 todo.refrshLogNishaTaskUser();
		 log.info("Task user 2 RNisha Logged in successful");
	}
	
	@Test(priority = 14)
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

	@Test(priority = 15)
	public void DynamicWFrefrshAndLogDipak() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(3000);
		todo.refrshLogDipakTaskUser();
		log.info("TaskUser3 Dipak Logged in successful");
	}

	@Test(priority = 16)
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
	
	
	
	
	
	
	
	
	
  @Test(priority = 18)
	public void SummaryStatuswithReviewFunction() throws Exception {
		
		 ToDoListTab todo=new ToDoListTab();
		 movingElement(todo.getTodolistTab());
			Thread.sleep(3000);
			VisiblityOf(todo.getRewiewITems());
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
	}
	 
	
	 	 
	 
	 
	 
	 
	
	
/////////////////////////////////////////////////////////for my reference please dont use below codings///*****************************************************************************
	 
	 
	/* 
	 public void refrshAndLogAgainNishaUser() throws Exception {
		 ToDoListTab todo=new ToDoListTab();
		 Thread.sleep(8000);
		 driver.navigate().refresh();
		 loginCVS();
		 Reporter.log("User nisha Logged in for checking reject document in new items");
	}
	 
	 @Test(priority=14)
		public void NewItemsMetaDataAgreeByDipak() throws InterruptedException {
		   ToDoListTab todo=new ToDoListTab();
	        so=new SoftAssert();
			jsclick(todo.getTodolistTab());
			Thread.sleep(3000);
			jsclick(todo.getNewItems());
		    Thread.sleep(5000);
	        movingclkElement(todo.getMetadata());
		    Thread.sleep(3000);
			todo.getAcceptButton().click();
			applyWaitsForAll();
			so.assertTrue(todo.getAssertvalid().isDisplayed(), "The workflow status dialog box opened successfull");
			todo.getWorkflowComments().sendKeys("completed by nishaR");
			jsclick(todo.getWorkflowCommentsOKButton());
			 Thread.sleep(15000);
			Reporter.log("NEW-ITEMS (MetaData) Nisha user again agree the Rejected document.Again it will move to Dipak user successfull",true);
			
		}
	 
	 @Test(priority=15)
	 public void AgainLogDipakUserToAcceptRejectDoc() throws Exception {
		 ToDoListTab todo=new ToDoListTab();
		 Thread.sleep(3000);
		 todo.refrshLogDipakTaskUser();
			}
	 @Test(priority=16)
	 public void DipakUserNewItemsMetaDataAgree() throws InterruptedException {
		   ToDoListTab todo=new ToDoListTab();
	        so=new SoftAssert();
			jsclick(todo.getTodolistTab());
			Thread.sleep(3000);
			jsclick(todo.getNewItems());
		    Thread.sleep(5000);
	        movingclkElement(todo.getMetadata());
		    Thread.sleep(3000);
			todo.getAcceptButton().click();
			applyWaitsForAll();
			so.assertTrue(todo.getAssertvalid().isDisplayed(), "The workflow status dialog box opened successfull");
			todo.getWorkflowComments().sendKeys("completed by nishaR");
			jsclick(todo.getWorkflowCommentsOKButton());
			Reporter.log("Dipak user Received the document from nisha user.Dipak user open the document and click on accept.Dipak is end User so the document move to end workflow",true);
			
		}
			
	/////////////////////////////////////////////////////////////////////just for my reference so please dont use below codings////////////////////////////////////////////////////////////////	
		
	/* @Test(priority=17)
	 public void cmpletewrkflowSentItemsWithSummary() throws InterruptedException {
			ToDoListTab todo=new ToDoListTab();
	        so=new SoftAssert();
			jsclick(todo.getTodolistTab());
			Thread.sleep(3000);
			jsclick(todo.getTodolistsentItems());
			
			WebDriverWait wait =new WebDriverWait(driver,30);
			Thread.sleep(5000);
		    wait.until(ExpectedConditions.visibilityOf((todo.getMetadata())));
		    movingclkElement(todo.getMetadata());
		    Thread.sleep(3000);
			jsclick(todo.getSummaryButton());
			Thread.sleep(8000);
			so.assertTrue(todo.getAssertvalid().isDisplayed(), "The workflow status dialog box opened successfull");
			jsclick(todo.getsummarycancelbtn());
		    Reporter.log("Sent items (MetaData) functionality with  summary workflow status validation successfull",true);
			
		}*/
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
    /*@Test(priority=9)
	public void OpenDocAndRejct() throws InterruptedException {
		 ToDoListTab todo=new ToDoListTab();
	        so=new SoftAssert();
			jsclick(todo.getTodolistTab());
			Thread.sleep(3000);
			jsclick(todo.getNewItems());
		    Thread.sleep(8000);
		    jsclick(todo.getTodolistDoc());
		    WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
       
	        Thread.sleep(3000);
	    jsclick(todo.getRejectButton());
		
		//for softassert validation purpose
		so.assertTrue(todo.getopendocwfvalidation().isDisplayed(), "The workflow status dialog box opened successfull");
		todo.getWorkflowComments().sendKeys("Rejected  by nishaR");
		
		jsclick(todo.getWorkflowCommentsOKButton());
		Thread.sleep(80000);
		jsclick(todo.getRefreshButton());
		Reporter.log("Click on To-do item,Click on new items and open a document from the list and select Reject from workflow Status.Reject Status validation successfull",true);
	
	}
	
	 @Test(priority=2)
	public void NewItemsMetaDataAgree() throws InterruptedException {
	   ToDoListTab todo=new ToDoListTab();
        so=new SoftAssert();
		jsclick(todo.getTodolistTab());
		Thread.sleep(3000);
		jsclick(todo.getNewItems());
	    Thread.sleep(5000);
        movingclkElement(todo.getMetadata());
	    Thread.sleep(3000);
		todo.getAcceptButton().click();
		applyWaitsForAll();
		so.assertTrue(todo.getAssertvalid().isDisplayed(), "The workflow status dialog box opened successfull");
		todo.getWorkflowComments().sendKeys("completed by nishaR");
		jsclick(todo.getWorkflowCommentsOKButton());
		Reporter.log("NEW-ITEMS (MetaData) with agree functionality validation successfull",true);
		
	}

	@Test(priority=3)
	public void PendingItemsWithReject() throws InterruptedException {
		
		ToDoListTab todo=new ToDoListTab();
        so=new SoftAssert();
		jsclick(todo.getTodolistTab());
		Thread.sleep(3000);
		jsclick(todo.getTodolistPendingItems());
	    Thread.sleep(5000);
         movingclkElement(todo.getMetadata());
	    Thread.sleep(3000);
		jsclick(todo.getRejectButton());  
		VisiblityOf(todo.getWorkflowComments());
		
		todo.getWorkflowComments().sendKeys("Rejected  by nishaR");
		applyWaitsForAll();
		jsclick(todo.getWorkflowCommentsOKButton());
		so.assertTrue(todo.getAssertvalid().isDisplayed(), "The workflow status dialog box opened successfull");
		Reporter.log("Pending items (MetaData) functionality  with Reject Status validation successfull",true);
	}
	@Test(priority=4)
	public void AllItemsWithEndWorkFlowStatus() throws InterruptedException {

		ToDoListTab todo=new ToDoListTab();
        so=new SoftAssert();
		jsclick(todo.getTodolistTab());
		Thread.sleep(3000);
		jsclick(todo.getTodolistallItems());
	    Thread.sleep(5000);
         movingclkElement(todo.getMetadata());
	    Thread.sleep(3000);
		jsclick(todo.getEndWfButton());  
		Thread.sleep(8000);
		todo.getWorkflowComments().sendKeys("Rejected  by nishaR");
		applyWaitsForAll();
		jsclick(todo.getWorkflowCommentsOKButton());
		so.assertTrue(todo.getAssertvalid().isDisplayed(), "The workflow status dialog box opened successfull");
		
		Reporter.log("All items (MetaData) with functionality EndWorkFlow status validation successfull",true);
	}

	@Test(priority=5)
	public void SentItemsWithSummary() throws InterruptedException {
		ToDoListTab todo=new ToDoListTab();
        so=new SoftAssert();
		jsclick(todo.getTodolistTab());
		Thread.sleep(3000);
		jsclick(todo.getTodolistsentItems());
		
		WebDriverWait wait =new WebDriverWait(driver,30);
		Thread.sleep(5000);
	    wait.until(ExpectedConditions.visibilityOf((todo.getMetadata())));
	    movingclkElement(todo.getMetadata());
	    Thread.sleep(3000);
		jsclick(todo.getSummaryButton());
		Thread.sleep(8000);
		so.assertTrue(todo.getAssertvalid().isDisplayed(), "The workflow status dialog box opened successfull");
		jsclick(todo.getsummarycancelbtn());
	    Reporter.log("Sent items (MetaData) functionality with  summary workflow status validation successfull",true);
		
	}
	@Test(priority=6)
	public void SummaryStatusDialogBoxFucntions() throws InterruptedException {
		ToDoListTab todo=new ToDoListTab();
        so=new SoftAssert();
		jsclick(todo.getTodolistTab());
		Thread.sleep(3000);
		jsclick(todo.getTodolistallItems());
	    Thread.sleep(5000);
         WebDriverWait wait =new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOf((todo.getMetadata())));
	    movingclkElement(todo.getMetadata());
		applyWaitsForAll();
		
		jsclick(todo.getSummaryButton());
		
		WebElement expect = driver.findElement(By.xpath("(//span[@class='jconfirm-title'])[1]"));//Soft Assert for validation purpose
		//so.assertTrue(expect.isDisplayed(), "summary page Opened Successfully");
		jsclick(todo.getsummaryshowdiscription());
		Thread.sleep(5000);//Show the Workflow Tasks
		jsclick(todo.getsummaryshowdiscriptioncancelbtn());
		Thread.sleep(4000);
		jsclick(todo.getsummaryshowproperties());//It will show the properties hide doucment
		Thread.sleep(4000);
		jsclick(todo.getsummaryshowreportsshowall());
		Thread.sleep(3000);//Show all the reports
		jsclick(todo.getsummaryshowreportscancel());
		
		Reporter.log("All items (MetaData) with functionality summary status options validation successfull",true);
	}
	@Test(priority=10)
	public void OpenDocAndEndWf() throws InterruptedException {
		ToDoListTab todo = new ToDoListTab();
		so = new SoftAssert();
		jsclick(todo.getTodolistTab());
		Thread.sleep(3000);
		jsclick(todo.getNewItems());
		Thread.sleep(8000);
		jsclick(todo.getTodolistDoc());
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
	
		Thread.sleep(3000);
        jsclick(todo.getEndWfButton());
		Thread.sleep(5000);
		
		todo.getWorkflowComments().sendKeys("end workflow");
		
		jsclick(todo.getWorkflowCommentsOKButton());
		Thread.sleep(10000);
		jsclick(todo.getRefreshButton());
		Reporter.log(
				"Click on To-do item,Click on new items and open a document from the list and select EndTask from workflow Status.End task Functionality validation successfully",
				true);
	}

	@Test(priority=11)
	public void OpenDocWIthSummary() throws InterruptedException {
		ToDoListTab todo = new ToDoListTab();
		so = new SoftAssert();
		jsclick(todo.getTodolistTab());
		Thread.sleep(3000);
		jsclick(todo.getNewItems());
		Thread.sleep(5000);
		jsclick(todo.getTodolistDoc());
		Thread.sleep(3000);
        jsclick(todo.getSummaryButton());
		so.assertTrue(todo.getopendocwfvalidation().isDisplayed(), "The workflow status dialog box opened successfull");
		jsclick(todo.getsummarycancelbtn());
       Reporter.log(
				"Click on To-do item,Click on new items and open a document from the list and select summary from workflow Status.The work flow summary displayed successfully",
				true);

	}*/
	}
