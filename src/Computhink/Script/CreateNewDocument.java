package Computhink.Script;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Computhink.Generic.IAutoConst;
import Computhink.Generic.Lib;
import Computhink.Pom.NewDocument;

public class CreateNewDocument {
	private WebDriver driver;

	CreateNewDocument() {

	}

	CreateNewDocument(WebDriver driver) {
		this.driver = driver;
	}

	String path = "D:\\Automationimages";

	public void testCreateNewDocument() throws Exception {
		String xlpath = IAutoConst.xlpath;
		int rc = Lib.getRowCount(xlpath, "DocumentType");
		for (int i = 1; i <= rc; i++) {
			String Documenttypename = Lib.getCellValue(xlpath, "DocumentType", i, 0);
			Reporter.log("DocumentType is:" + Documenttypename, true);

			String IndexVal = Lib.getCellValue(xlpath, "DocumentType", i, 1);
			Reporter.log("IndexValue is:" + IndexVal, true);

			NewDocument newdoc = new NewDocument(driver);
			newdoc.SetCreateNewDocument();
			// newdoc.SetFileuploadmenu(path);
			newdoc.SetDestinationfolder();
			newdoc.SetDocType(Documenttypename, IndexVal);
			newdoc.SetRetainCheck();
			newdoc.SetCreateNewDocument();

		}
	}
}
