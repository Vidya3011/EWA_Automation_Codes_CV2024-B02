package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.Print;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
SecureLink_Negative_Scenerio extends Computhink.Generic.BaseClass {

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(SecureLink_Negative_Scenerio.class);

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

	@Test(priority = 2)
	public void TC_1_SecureLinkInvalidRecepient_Mail_ID_ValidConfirm_Mail() throws Exception {
		Print pojo = new Print();
		pojo.SecureLinkInvalidRecepient_Mail_ID_ValidConfirm_Mail();
	}

	@Test(priority = 3)
	public void TC_2_SendToSecureLinkwithout_Email_ID_BlankTest() throws Exception {
		Print pojo = new Print();
		pojo.SendToSecureLinkwithout_Email_ID_BlankTest();
	}

	@Test(priority = 4)
	public void TC_3_SecLinkReceipientDailogBoxInvalid_Email_ID() throws Exception {
		Print pojo = new Print();
		pojo.SecLinkReceipientDailogBoxInvalid_Email_ID();
	}

	@Test(priority = 5)
	public void TC_4_SecLinkReceipientMailBlank() throws Exception {
		Print pojo = new Print();
		pojo.SecLinkReceipientMailBlank();

	}

}
