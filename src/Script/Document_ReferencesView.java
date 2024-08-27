package Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.Document_References;

public class Document_ReferencesView extends BaseClass {

	/*
	 * @BeforeClass
	 * 
	 * public void Launch_Browser() throws Exception { loadBrowser("edge");
	 * launchUrl(); Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test
	 * 
	 * public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully", true); }
	 */

	@Test(priority = 1, invocationCount = 2)
	public void Create_PDF_Documents() throws Exception {

		Document_References Doc = new Document_References();
		Doc.Create_pdf_Documents();
	}

	@Test(priority = 2)
	public void TC_01_Verify_CopyandPasteReferences_OnDocuments() throws Exception {

		Document_References Doc = new Document_References();
		Doc.Copy_PasteAsReference();
	}

	@Test(priority = 3)
	public void TC_02_Verify_and_Delete_References_Documents() throws Exception {

		Document_References Doc = new Document_References();
		Doc.Open_Delete_Reference_Document();
	}
}
