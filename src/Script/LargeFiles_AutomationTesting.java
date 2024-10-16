package Script;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pom.LargeFilesClass;
import Pom.RoomContextMenu;
import Pom.SpecialCharFilenames;
import Pom.SpecialCharFilenames1;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class LargeFiles_AutomationTesting extends Generic.BaseClass {
	private static final Logger log = LogManager.getLogger(LargeFiles_AutomationTesting.class);

	@BeforeClass
	public void loadBrowser() {
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
	@Test(priority = 1)
	public void TC_1_Upload_and_verify_Large_PDF_file() throws Exception {

		LargeFilesClass large = new LargeFilesClass();
		large.Upload_and_verify_Large_PDF_file();
		Reporter.log("Large PDF file added successfully...");

		// Reporter.log("User click on refresh icon");
	}

	@Test(priority = 2)
	public void TC_2_Upload_and_verify_Large_TIFF_file() throws Exception {

		LargeFilesClass large = new LargeFilesClass();
		large.Upload_and_verify_Large_TIFF_file();
		log.info("Upload and verify large Tiff file  document", true);

	}

	@Test(priority = 3)
	public void TC_3_Upload_and_verify_Large_DOCX_file() throws Exception {
		LargeFilesClass large = new LargeFilesClass();
		large.Upload_and_verify_Large_DOCX_file();

		log.info("Upload and verify large Docx file  document", true);

	}

	@Test(priority = 4)
	public void TC_4_Upload_and_verify_Large_XLSX_file() throws Exception {
		LargeFilesClass large = new LargeFilesClass();
		large.Upload_and_verify_Large_XLSX_file();
		log.info("Upload and verify large xlxs file  document", true);

	}

}
