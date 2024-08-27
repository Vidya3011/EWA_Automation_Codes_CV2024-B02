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

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
ManualWorkflow extends Generic.BaseClass {

	public static SoftAssert so;
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(ManualWorkflow.class);
	/*
	 * @BeforeClass public void ladBrowser() { loadBrowser("Chrome");
	 * log.info("Chrome Browser started Successfully...");
	 * driver.manage().deleteAllCookies(); launchUrl();
	 * 
	 * log.info("CVS URL started Successfully..."); }
	 */

	@Test(priority = 1)
	public void Login() throws Exception {
		loginCVS();
		Reporter.log("User Logged in successfull...");
		log.info("EWA User is logged in successfully...");
	}

	@Test(priority = 2)
	public void TC_1_SendDoc() throws InterruptedException {
		ToDoListTab todo = new ToDoListTab();
		todo.SendingDocumentInworkflow();
		Thread.sleep(10000);
		log.info("Nisha User Sending the document in to new manual for automation workflow successful");
		Reporter.log("Logout the current session");

	}

	@Test(priority = 3)
	public void TC_2_refrshAndLogVidyaUser() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(4000);
		todo.LogVidyaTaskUser1();
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
	public void TC_4_Task2UserNishaAccept() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(8000);
		todo.refrshLogNishaTaskUser();
		log.info("Task user 2 RNisha Logged in successful");
	}

	@Test(priority = 6)
	public void TC_5_TaskUser2RNishaRejectTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		todo.TaskUser2RNishaRejectTheDocument();

	}

	@Test(priority = 7)
	public void TC_6_refrshAndLogDipak() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Thread.sleep(3000);
		todo.refrshLogDipakTaskUser();
		Reporter.log("TaskUser3 Dipak Logged in successful");
	}

	// @Test(priority = 8)
	public void TC_7_SummaryStatusDialogBoxFucntions() throws InterruptedException {
		ToDoListTab todo = new ToDoListTab();
		todo.SummaryStatusDialogBoxFucntions();
	}

	@Test(priority = 9)
	public void TC_8_DocEndedFromTask3DipakUser() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		todo.DocEndedFromTask3DipakUser();
	}

}
