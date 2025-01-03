package Computhink.Script;

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

import Computhink.Generic.FailedRetry;
import Computhink.Pom.ToDoListTab;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
ManualWorkflow extends Computhink.Generic.BaseClass {

	public static SoftAssert so;
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(ManualWorkflow.class);
	@BeforeClass
	public void loadBrowser() throws Exception {
		loadBrowser("Chrome");

		log.info("Chrome Browser Launched");
		Reporter.log("Chrome Browser launched Successfully...");
		launch47Url();
		
		Reporter.log("Contentverse URL launched successfully...");
		log.info("Contentverse URL launched successfully...");
	}

	@Test(priority = 1)
	public void Login() throws Exception {
	
		
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
		log.info("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successfully... ");
	}


	@Test(priority = 2)
	public void TC_1_SendDoc() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		todo.SendingDocumentToworkflow();
		Thread.sleep(10000);
		log.info("Nisha User Sending the document in to new manual for automation workflow successful");
		Reporter.log("Logout the current session");

	}

	@Test(priority = 3)
	public void TC_2_refrshAndLogRnishaUser() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(4000);
		todo.LogRnishaTaskUser1();
		jsclick(Refresh_Button(driver));
		log.info("Task User1 logged in successfully... ");
		log.info("New manual for automation first task user vidya has logged in successful");
	}

	@Test(priority = 4)
	public void TC_3_SendAndNewItemsMetaDataAgree() throws Exception {

		ToDoListTab todo = new ToDoListTab();
		todo.SendAndNewItemsMetaDataAgree();
		Reporter.log("Successfully Document  Move to Task User2");
		Reporter.log("Task user1 Logout the Session...");
	}

	@Test(priority = 5)
	public void TC_4_Task2UserVidyaAccept() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(8000);
		todo.refrshLogVidyaTaskUser();
		jsclick(Refresh_Button(driver));
		log.info("Task user 2 Vidya Logged in successful");
	}

	@Test(priority = 6)
	public void TC_5_TaskUserVidyaAcceptTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		todo.TaskUser2RNishaRejectTheDocument();

	}

	@Test(priority = 7)
	public void TC_6_refrshAndLogDNishaC() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(3000);
		todo.refrshLog3rdTaskUserNishaC();
		Thread.sleep(3000);
	
		jsclick(Refresh_Button(driver));
		Reporter.log("TaskUser3 Dipak Logged in successful");
	}

	// @Test(priority = 8)
	public void TC_7_SummaryStatusDialogBoxFucntions() throws InterruptedException {
		ToDoListTab todo = new ToDoListTab();
		todo.SummaryStatusDialogBoxFucntions();
	}

	@Test(priority = 9)
	public void TC_8_DocEndedFromTask3NishaCUser() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		todo.DocEndedFromTask3NishaCUser();
	}

}
