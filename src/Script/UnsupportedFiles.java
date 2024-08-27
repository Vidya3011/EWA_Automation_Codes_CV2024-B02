package Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.UnSupporterFiles;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
UnsupportedFiles extends Generic.BaseClass {
	public static Actions act;

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(UnsupportedFiles.class);

	@BeforeClass
	public void loadBrowser() {
		loadBrowser("edge");

		log.info("Chrome Browser Launched");
		Reporter.log("Chrome Browser launched Successfully...");
		// launchUrl();
		launchUrl();
		Reporter.log("Contentverse URL launched successfully...");
		log.info("Contentverse URL launched successfully...");
	}

	@Test(priority = 1)
	public void TC_1_Login() throws Exception {

		// loginCVS();
		loginCVS();

		// Reporter.log("Rnisha user logged in
		// 'CVWin19Server.Win2019_TestRoom'successfully... ");
		log.info("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successfully... ");
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