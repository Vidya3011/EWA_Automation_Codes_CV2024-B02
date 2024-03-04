package Script;

import org.apache.logging.log4j.LogManager;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.NewDocument;

public class NewDocumentNegativeScenerio extends BaseClass {
	
	
private static org.apache.logging.log4j.Logger log = LogManager.getLogger(NewDocumentNegativeScenerio.class);

    @BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
        launchUrl();
        log.info("CVS URL started Successfully...");
    }

	@Test(priority=1)
	public void LogVCS() throws Exception {
		loginCVS();
		Reporter.log("RNisha User logged in successfully...");
		log.info("CVS User is logged in successfully...");
	}

	@Test(priority=2)
	public void CreateNewDocumentWithoutFolder() throws Exception {
		
		NewDocument nw=new NewDocument(driver);
		
		nw.CreateNewDocumentWithoutFolder();
		log.info("Without folder unable to create the document");
		
	}
	@Test(priority=3)
	public void CreateNewDocWithoutDocumentType() throws Exception {
		
		NewDocument nw=new NewDocument(driver);
		nw.CreateNewDocumentWithoutDocumentType();
		log.info("Without document type unable to create the document");
		}
	
	@Test(priority=4)
	public void NewDocWithoutFileName() throws Exception {
		NewDocument nw=new NewDocument(driver);
		nw.CreateNewDocumentWithoutFileName();
		Thread.sleep(3000);
		jsclick(Refresh_Button(driver));
		log.info("Without file name  unable to create a document");
	
	}	
}
