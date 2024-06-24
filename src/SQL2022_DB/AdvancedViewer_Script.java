package SQL2022_DB;

import org.apache.logging.log4j.LogManager;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.AdvancedViewer;

public class AdvancedViewer_Script extends Generic.BaseClass {
	
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AdvancedViewer_Script.class);
	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser");
		
		launchUrl();
		log.info("ContentVerseURL");
	}

	@Test (priority=1)
	public void Login() throws Exception {
		loginSQL2022();
		//loginCVS();
		log.info("User is Successfully logged in");
	} 
/*	@Test(priority=2)
	public void AdvancedViewerOptionSelection() throws Exception {
		
		AdvancedViewer ad=new AdvancedViewer();
		ad.AdvancedViewerOption();
		Thread.sleep(5000);
}*/

	
	@Test(priority=3,invocationCount=2000)
	public void AdvancedViewerWordDocument() throws Exception {
		
		AdvancedViewer ad=new AdvancedViewer();
		ad.CreateDocumentAdvancedViewWordDocument_SQL();
		Reporter.log("Word Document verified successfull");
	}
 /* @Test(priority=4)
	public void AdvancedViewerPDfDoc() throws Exception{
		AdvancedViewer ad=new AdvancedViewer();
		ad.AdvancedViewPDFDocument_SQL();
		Reporter.log("PDF Document verified successfull");
	
}
	@Test(priority=5)
	public void AdvancedViewerExcelFile() throws Exception{
		AdvancedViewer ad=new AdvancedViewer();
		ad.AdvancedViewExcelDocumentt_SQL();
		Reporter.log("Excel spread sheet verified successfull");
}*/
}