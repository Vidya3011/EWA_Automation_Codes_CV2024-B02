package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Computhink.Generic.FailedRetry;
import Computhink.Generic.IAutoConst;
import Computhink.Generic.Lib;
import Computhink.Pom.Print;
import Computhink.Pom.ViewerToolbar;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
SendToMail extends Computhink.Generic.BaseClass {

	public static SoftAssert so;
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(PrintFunctionality.class);

	@BeforeClass
	public void ladBrowser() throws Exception {
		loadBrowser("Chrome");

		log.info("Chrome Browser Launched");
		Reporter.log("Chrome Browser launched Successfully...");
		launchUrl();
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

}
