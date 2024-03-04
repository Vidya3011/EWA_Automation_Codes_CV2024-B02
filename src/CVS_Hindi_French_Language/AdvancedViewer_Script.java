package CVS_Hindi_French_Language;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.AdvancedViewer;
import Pom.LanguageHindiFrench;

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
		LanguageHindiFrench ln=new LanguageHindiFrench();
		ln.HindiLanguageScript();
		loginCVS();
		
		log.info("User is Successfully logged in");
	} 
	@Test(priority=2)
	public void AdvancedViewerOptionSelection() throws Exception {
		
		AdvancedViewer ad=new AdvancedViewer();
		ad.AdvancedViewerOption();
		Thread.sleep(5000);
}

	
	@Test(priority=3)
	public void AdvancedViewerWordDocument() throws Exception {
		
		AdvancedViewer ad=new AdvancedViewer();
		ad.CreateDocumentAdvancedViewWordDocument_Hindi();
		
		Reporter.log("Word Document verified successfull");
	}
  @Test(priority=4)
	public void AdvancedViewerPDfDoc() throws Exception{
		AdvancedViewer ad=new AdvancedViewer();
		ad.AdvancedViewPDFDocument();
		Reporter.log("PDF Document verified successfull");
	
}
	@Test(priority=5)
	public void AdvancedViewerExcelFile() throws Exception{
		AdvancedViewer ad=new AdvancedViewer();
		ad.AdvancedViewExcelDocumentt();
		Reporter.log("Excel spread sheet verified successfull");
		
}
}