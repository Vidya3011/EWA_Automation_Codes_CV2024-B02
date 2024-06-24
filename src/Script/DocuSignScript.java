package Script;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.AdvancedViewer;

public class DocuSignScript  extends BaseClass{
	  private static org.apache.logging.log4j.Logger log = LogManager.getLogger(DocuSignScript.class);
	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
	//launchLocalUrlRnisha();
       launchUrl();
         log.info("CVS URL started Successfully...");
   
         
		
		}

	@Test(priority=1)
	public void LogVCS() throws Exception {
		 loginCVS();
	//	 loginLocalCVS();
		 log.info("CVS User is logged in successfully...");
	}
	@Test(priority=2)
	public void TC_1_DocusignDocument() throws Exception {
		AdvancedViewer ad=new AdvancedViewer();

       ad.DocuSignCreateDoc();
		
		 log.info("CVS User is logged in successfully...");
	}
	
}
