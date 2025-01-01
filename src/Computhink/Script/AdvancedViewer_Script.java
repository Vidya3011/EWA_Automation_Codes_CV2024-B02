package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.AdvancedViewer;

//NishaR codes

//**************************************NishaR codes*********************************************************************
public class AdvancedViewer_Script extends Computhink.Generic.BaseClass {

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AdvancedViewer_Script.class);
//BaseClass bc=new BaseClass();

	/*@BeforeClass
		public void loadBrowser() throws Exception {
			loadBrowser("Chrome");
		
			log.info("Chrome Browser Launched");
			Reporter.log("Chrome Browser launched Successfully...");
			launch47Url();
			// launchLocalUrl();
			Reporter.log("Contentverse URL launched successfully...");
			log.info("Contentverse URL launched successfully...");
		}
		
	
		@Test(priority = 1)
		public void Login_To_EWA() throws Exception {
			//LogoutPage();
			
	    loginRNISHA47();
			Reporter.log("User logged in successful... ");
			log.info("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successful... ");
		}
	*/
	@Test(priority = 2)
	public void TestCase_1_AdvancedViewerOptionSelection() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.AdvancedViewerOption();
		log.info("Pdf document and office document changed as advanced viewing successful...");
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void TestCase_2_AdvancedViewerWordDocument() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();

		ad.CreateDocumentAdvancedViewWordDocument();
		Reporter.log("Word Document verified successful");
	}

	@Test(priority = 4)
	public void TestCase_3_Verify_Link_Option() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.LinkWord();
		Reporter.log("Word Document verified successful");
	}

	@Test(priority = 5)
	public void TestCase_4_Verify_Header_Option() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.HeaderWord();
		Reporter.log("Word Document verified successful");
	}

	@Test(priority = 6)
	public void TestCase_5_Verify_Footer_Option() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.FooterWord();
		Reporter.log("Word Document verified successful");
	}

	@Test(priority = 7)
	public void TestCase_6_Save_And_Reopen() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.SaveDocumentAndReopen();

		Reporter.log("Word Document verified successful");
	}

	@Test(priority = 8)
	public void TestCase_7_AdvancedViewerPDfDocument() throws Exception {
		AdvancedViewer ad = new AdvancedViewer();
		ad.AdvancedViewPDFDocument();
		Reporter.log("PDF Document verified successfull");

	}

	@Test(priority = 9)
	public void TestCase_8_AdvancedViewerExcelDocument() throws Exception {
		AdvancedViewer ad = new AdvancedViewer();
		ad.AdvancedViewExcelDocumentt();
		Reporter.log("Excel spread sheet verified successfull");

	}
}