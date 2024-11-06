package Computhink.Script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.lang.management.LockInfo;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Computhink.Generic.FailedRetry;
import Computhink.Pom.Print;
import Computhink.Pom.TemplatePage;
import Computhink.Pom.ToDoListTab;
import io.github.bonigarcia.wdm.WebDriverManager;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

PrintFunctionality extends Computhink.Generic.BaseClass {

	public static SoftAssert so;
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(PrintFunctionality.class);

	@BeforeClass
	public void ladBrowser() throws Exception {
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


	@Test(priority = 4)
	public void TC_C_Email_ConvertPDF_WithAll_Annotations() throws Exception {
		Print pojo = new Print();
		pojo.Email_ConvertPDF_With_Annotation();
	}

	@Test(priority = 2)
	public void TC_A_Email_Reference() throws Exception {
		Print pojo = new Print();
		pojo.Email_Reference();
		log.info("Reference Email sent successfull");
	}

	@Test(priority = 3, retryAnalyzer = FailedRetry.class)
	public void TC_B_Email_Copy_WithMsgBox_SubjectBox() throws Exception {
		Print pojo = new Print();
		pojo.Email_Copy_WithMsgBox_SubjectBox();
		log.info("Copy Email sent successfull");

	}

	@Test(priority = 5)
	public void TC_D_exports_with_convert_to_pdf_with_passwords() throws Exception {
		Print pojo = new Print();

		pojo.exports_with_convert_to_pdf_with_passwords();
		log.info("exporting documents dialog displayed");

	}

	@Test(priority = 6)
	public void TC_E_exports_with_Retain() throws Exception {
		Print pojo = new Print();
		pojo.exports_with_Retain();
		log.info("verifying export functionality retain format,with zip password");
	}

	@Test(priority = 7)
	public void TC_F_exports_with_convert_to_pdf_and_best_quality() throws Exception {
		Print pojo = new Print();
		pojo.exports_with_convert_to_pdf_and_best_quality();
		log.info("the document export with convert to pdf and best quality succcessfully");

	}

	@Test(priority = 8)
	public void TC_G_exports_with_convert_to_pdf_and_include_workflow_summary() throws InterruptedException {
		Print pojo = new Print();
		pojo.exports_with_convert_to_pdf_and_include_workflow_summary();

	}

	// @Test(priority=9)
	public void PrintWithcertifiedCoverPageUnlockRedaction() throws Exception {
		Print pojo = new Print();
		pojo.PrintWithcertifiedCoverPageUnlockRedaction();

	}

}

/*
 * Robot r=new Robot(); String fol="nisha"; for (char c:fol.toCharArray()) { int
 * keyCode=KeyEvent.getExtendedKeyCodeForChar(c); r.keyPress(keyCode);
 * r.keyRelease(keyCode); } r.keyPress(KeyEvent.VK_ENTER);
 * r.keyRelease(KeyEvent.VK_ENTER);
 * 
 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
 */
