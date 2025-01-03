package Scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Generic.IAutoConst;
import Generic.Lib;
import Pom.LoginPage;
import Pom.NewDocument;

public class CreateNavigateDocument {
	//private static org.apache.logging.log4j.Logger log = LogManager.getLogger(CreateNavigateDocument.class);
	//Vidya
	private WebDriver driver;

	CreateNavigateDocument() {

	}
	String path="D://Automationimages//*.*";
	CreateNavigateDocument(WebDriver driver) {		
		this.driver = driver;
	}
	
	public void testCreateNaviagateDocument() throws Exception  {
		
		String xlpath = IAutoConst.xlpath;
		int rc = Lib.getRowCount(xlpath, "DocumentType");
		for (int i = 1; i <= rc; i++) {
			String Documenttypename = Lib.getCellValue(xlpath, "DocumentType", i, 0);
			Reporter.log("DocumentType is:" + Documenttypename, true);
			String IndexVal = Lib.getCellValue(xlpath, "DocumentType", i, 1);
			Reporter.log("IndexValue is:" + IndexVal, true);
			NewDocument newdoc = new NewDocument(driver);
			newdoc.SetCreateNewDocument();
			//Viewer view1=new Viewer(driver);
			//newdoc.SetFileUpload();	
			Thread.sleep(2000);
			newdoc.SetDestinationfolder();
			Thread.sleep(2000);
			newdoc.SetDocType(Documenttypename, IndexVal);
			Thread.sleep(2000);
			newdoc.SetFileUpload();
			Thread.sleep(8000);
			//newdoc.SetClickCreateButton();	
			newdoc.SetClickCreateNavigatebutton();
			Thread.sleep(3000);
			newdoc.SetRependoc();
			Thread.sleep(5000);
			RecentDoc rec=new RecentDoc(driver);
					rec.testRecent();					
					Thread.sleep(2000);
					
					//LogoutPage logout=new LogoutPage(driver); logout.testLogout();
					 
			
		}
	}
}
