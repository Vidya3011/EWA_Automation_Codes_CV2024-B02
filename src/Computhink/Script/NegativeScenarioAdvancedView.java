package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.AdvancedViewer;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
NegativeScenarioAdvancedView extends Computhink.Generic.BaseClass {

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AdvancedViewer_Script.class);

	@BeforeClass

	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser");

		launchLocalUrl();

	public void ladBrowser() throws Exception {
		loadBrowser("Chrome");
		log.info("Chrome Browser");

		launchUrl();

		log.info("ContentVerseURL");
	}

	@Test(priority = 1)
	public void Login() throws Exception {
		loginLocalCVS();

		log.info("User is Successfully logged in");
	}

	@Test(priority = 2)
	public void TC_1_AdvancedViewerOptionSelection() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.AdvancedViewerOption();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void TC_2_AdvancedViewPDFDocNegativeScript() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();

		ad.AdvancedViewPDFDocument_WithSpcialCharacterFileName();
		Thread.sleep(5000);
		log.info("The created pages aare not visible");
	}

}
