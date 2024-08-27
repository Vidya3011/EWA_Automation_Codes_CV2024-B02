package Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.FailedRetry;
import Generic.IAutoConst;
import Generic.Lib;
import Pom.Print;
import Pom.ViewerToolbar;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
SendToMail extends Generic.BaseClass {

	public static SoftAssert so;
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(PrintFunctionality.class);

	/*
	 * @BeforeClass public void ladBrowser() { loadBrowser("Chrome");
	 * 
	 * launchUrl(); log.info("CVS URL started Successfully...");
	 * 
	 * }
	 * 
	 * @Test(priority = 1) public void LogCVS() throws Exception {
	 * 
	 * launchUrl(); loginCVS(); //loginSQL2022();
	 * log.info("CVS User is logged in successfully..."); }
	 */

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
