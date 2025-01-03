package Scripts;


import java.util.logging.LogManager;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Generic.IAutoConst;
import Generic.Lib;
import Pom.NewDocument;
//import Script.AnnotationFunctionality;

public class CreateDocument {
	//private static org.apache.logging.log4j.Logger log = LogManager.getLogger(CreateDocument.class);
	//Vidya
	private WebDriver driver;

	CreateDocument() {

	}
	String path="D://Automationimages//*.*";
	CreateDocument(WebDriver driver) {
		this.driver = driver;
	}

	public void testCreateDocument() throws Exception  {
		String xlpath = IAutoConst.xlpath;
		int rc = Lib.getRowCount(xlpath, "DocumentType");
		for (int i = 1; i <= rc; i++) {
			String Documenttypename = Lib.getCellValue(xlpath, "DocumentType", i, 0);
			Reporter.log("DocumentType is:" + Documenttypename, true);
			//log.info("Document type is set");
			String IndexVal = Lib.getCellValue(xlpath, "DocumentType", i, 1);
			Reporter.log("IndexValue is:" + IndexVal, true);

			NewDocument newdoc = new NewDocument(driver);
			newdoc.SetCreateNewDocument();			
			Viewer view1=new Viewer(driver);
			newdoc.SetFileUpload();			
			newdoc.SetDestinationfolder();
			newdoc.SetDocType(Documenttypename, IndexVal);
			newdoc.SetClickCreateButton();
			Thread.sleep(5000);
		
			view1.testViewerToolbar();

		}
	}
}
