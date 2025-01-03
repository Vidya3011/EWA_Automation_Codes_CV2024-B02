package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.UnSupporterFiles;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
UnsupportedFiles extends Computhink.Generic.BaseClass {
	public static Actions act;

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(UnsupportedFiles.class);

	@BeforeClass
	public void ladBrowser() throws Exception {
		loadBrowser("Chrome");

	
		Reporter.log("Chrome Browser launched Successfully...");
		launch47Url();
		// launchLocalUrl();
		Reporter.log("Contentverse URL launched successfully...");
	
	}

	@Test(priority = 1)
	public void Login() throws Exception {
	
		//LogoutPage();
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
	}


	@Test(priority = 2)
	public void TC_2_CreateDocumentWithUnsupportedFiles() throws Exception {

		UnSupporterFiles un = new UnSupporterFiles();
		un.create_document_Auto();

		log.info("Unsupported document created successful");

	}

	@Test(priority = 3)
	public void TC_3_Verify_UnsupportedFiles_Download_Offline() throws Exception {
		UnSupporterFiles un = new UnSupporterFiles();
		un.viewAndDownloadDocs(16);
		log.info("Download&Offline functionality verified successful");

	}
}