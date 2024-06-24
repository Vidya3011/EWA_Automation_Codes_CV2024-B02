package Script;

import org.apache.logging.log4j.LogManager;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.AdvancedViewer;

public class AdvancedViewer_Script extends Generic.BaseClass {
	
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AdvancedViewer_Script.class);
	/*@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		
		log.info("Chrome Browser Launched");
		Reporter.log("Chrome Browser launched Successfully...");
		launchUrl();
		//launchLocalUrl();
		Reporter.log("Contentverse URL launched successfully...");
		log.info("Contentverse URL launched successfully...");
	}

	@Test (priority=1)
	public void Login() throws Exception {
		//LogDipakUser();
		//LogRamUser();
		loginCVS();
		//loginLocalCVS();
		//loginSQL2022();
		Reporter.log("User logged in successfully... ");
		log.info("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successfully... ");
	} */
	@Test(priority=2)
	public void TestCase_1_AdvancedViewerOptionSelection() throws Exception {
		
		AdvancedViewer ad=new AdvancedViewer();
		ad.AdvancedViewerOption();
		log.info("Pdf document and office document changed as advanced viewing successsfully...");
		Thread.sleep(5000);
}

	
	@Test(priority=3)
	public void TestCase_2_AdvancedViewerWordDocument() throws Exception {
		
		AdvancedViewer ad=new AdvancedViewer();
		ad.CreateDocumentAdvancedViewWordDocument();
		Reporter.log("Word Document verified successfull");
	}
  @Test(priority=4)
	public void TestCase_3_AdvancedViewerPDfDoc() throws Exception{
		AdvancedViewer ad=new AdvancedViewer();
		ad.AdvancedViewPDFDocument();
		Reporter.log("PDF Document verified successfull");
	
}
	@Test(priority=5)
	public void TestCase_4_AdvancedViewerExcelFile() throws Exception{
		AdvancedViewer ad=new AdvancedViewer();
		ad.AdvancedViewExcelDocumentt();
		Reporter.log("Excel spread sheet verified successfull");
}
}