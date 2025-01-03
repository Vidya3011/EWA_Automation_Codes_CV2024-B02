package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.Export;
import Computhink.Pom.Print;
import Computhink.Pom.ViewerToolbar;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
SendToExport extends BaseClass {

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(PrintFunctionality.class);

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
	public void TC_1_ExportBlankDocumenList() throws Exception {

		Export ex = new Export();
		ex.ExportBlankDocumenList();
	}

	@Test(priority = 3)
	public void TC_2_ExportDocumenList() throws Exception {

		Export ex = new Export();
		ex.ExportDocumenList();
	}

	@Test(priority = 4)
	public void TC_3_ExportingBlankSearchList() throws Exception {

		Export ex = new Export();
		ex.ExportingBlankSearch();
	}

	@Test(priority = 9)
	public void TC_8_DisbaledExport() throws Exception {

		Export ex = new Export();
		ex.DisabledExport();
	}

	@Test(priority = 7)
	public void TC_6_exports_with_convert_to_pdf_with_passwords() throws Exception {
		Print pojo = new Print();

		pojo.exports_with_convert_to_pdf_with_passwords();
		log.info("exporting documents dialog displayed");

	}

	@Test(priority = 6)
	public void TC_5_exports_with_Retain() throws Exception {
		Print pojo = new Print();
		pojo.exports_with_Retain();
		log.info("verifying export functionality retain format,with zip password");
	}

	@Test(priority = 5)
	public void TC_4_exports_with_convert_to_pdf_and_best_quality() throws Exception {
		Print pojo = new Print();
		pojo.exports_with_convert_to_pdf_and_best_quality();
		log.info("the document export with convert to pdf and best quality succcessfully");

	}

	@Test(priority = 8)
	public void TC_7_exports_with_convert_to_pdf_and_include_workflow_summary() throws InterruptedException {
		Print pojo = new Print();
		pojo.exports_with_convert_to_pdf_and_include_workflow_summary();

	}

	// @Test(priority=9)
	public void PrintWithcertifiedCoverPageUnlockRedaction() throws Exception {
		Print pojo = new Print();
		pojo.PrintWithcertifiedCoverPageUnlockRedaction();

	}

}
