package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.Print;
import Computhink.Pom.SearchFunction;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
SecureLink extends Computhink.Generic.BaseClass {

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(SecureLink.class);

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

	@Test(priority = 2)
	public void TC_1_DocumentSendToSecureLink() throws Exception {
		Print pojo = new Print();
		pojo.DocumentSendToSecureLink();

	}

	/*@Test(priority = 5)
	public void TC_4_SentDocumentToView() throws Exception {
		Print pojo = new Print();
		pojo.SentDocumentToView();
	
	}*/

	@Test(priority = 4)
	public void TC_3_SecureLinkFromDocumentList() throws Exception {
		Reporter.log("Scenario 02: Document send to securelink from Document page");
		Print pojo = new Print();
		pojo.SecureLinkFromDocumentList();
	}

	@Test(priority = 3)
	public void TC_2_SecureLinkFromSearchTab() throws Exception {

		Print pojo = new Print();
		pojo.SecureLinkFromSearchTab();

	}

}
