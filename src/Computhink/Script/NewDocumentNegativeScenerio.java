package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.NewDocument;

//NishaR codes
public class NewDocumentNegativeScenerio extends BaseClass {

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(NewDocumentNegativeScenerio.class);

	@BeforeClass
	public void loadBrowser() throws Exception {
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
	public void CreateNewDocumentWithoutFolder() throws Exception {

		NewDocument nw = new NewDocument(driver);

		nw.CreateNewDocumentWithoutFolder();
		log.info("Without folder unable to create the document");

	}

	@Test(priority = 3)
	public void CreateNewDocWithoutDocumentType() throws Exception {

		NewDocument nw = new NewDocument(driver);
		nw.CreateNewDocumentWithoutDocumentType();
		log.info("Without document type unable to create the document");
	}

	@Test(priority = 4)
	public void NewDocWithoutFileName() throws Exception {
		NewDocument nw = new NewDocument(driver);
		nw.CreateNewDocumentWithoutFileName();
		Thread.sleep(3000);
		jsclick(Refresh_Button(driver));
		log.info("Without file name  unable to create a document");

	}
}
