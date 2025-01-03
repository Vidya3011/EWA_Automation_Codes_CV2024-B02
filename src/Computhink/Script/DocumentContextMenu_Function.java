package Computhink.Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.Document_References;
import Computhink.Pom.Documents_ContextMenu;

public class DocumentContextMenu_Function extends BaseClass {

	/*
	 * @BeforeClass
	 * 
	 * public void Launch_Browser() throws Exception { loadBrowser("edge");
	 * launchUrl(); Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test
	 * 
	 * public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully", true);
	 * 
	 * }
	 */

	@Test(priority = 1, invocationCount = 2)
	public void Create_PDF_Documents() throws Exception {

		Document_References Doc = new Document_References();
		Doc.Create_pdf_Documents();
	}

	@Test(priority = 2)
	public void TC_01_Verify_TakeOwnership_ReleaseOwnership_OnDocuments() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_TakeOwnership_ReleaseOwnership_OnDocuments();
	}

	@Test(priority = 3)
	public void TC_02_Verify_Refresh_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_Refresh_Option();
	}

	@Test(priority = 4)
	public void TC_03_Verify_Categories_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_Categories_Option();
	}

	@Test(priority = 5)
	public void TC_04_Verify_copy_and_paste_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_copy_and_paste_Option();
	}

	@Test(priority = 6)
	public void TC_05_Verify_cut_and_paste_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_cut_and_paste_Option();
	}

	@Test(priority = 7)
	public void TC_06_Verify_Delete_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_Delete_Option();
	}

	@Test(priority = 8)
	public void TC_07_Verify_CreateFavorites_Document() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_CreateFavorites_Document();
	}

<<<<<<< HEAD
	// @Test(priority = 9)
	public void TC_08_Verify_SendToWorkflow_Document() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_SendToWorkflow_Document();
	}

	// @Test(priority = 10)
	public void TC_07_Verify_Notification_on_Document() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_Notification_on_Document();
	}

	@Test(priority = 11)
=======
	@Test(priority = 9)
>>>>>>> origin/Dipak-Pandurang-Gawali
	public void TC_08_Verify_SendTo_Mail_as_References() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_SendTo_Mail_as_References();
	}

<<<<<<< HEAD
	@Test(priority = 12)
	public void TC_09_Verify_SendTo_Mail_ascopy() throws Exception {
=======
	@Test(priority = 10)
	public void TC_9_Verify_SendTo_Mail_ascopy() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_SendTo_Mail_ascopy();
	}

<<<<<<< HEAD
	@Test(priority = 13)
=======
	@Test(priority = 11)
>>>>>>> origin/Dipak-Pandurang-Gawali
	public void TC_10_Verify_SendTo_Print() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_SendTo_Print();
	}

<<<<<<< HEAD
	@Test(priority = 14)
=======
	@Test(priority = 12)
>>>>>>> origin/Dipak-Pandurang-Gawali
	public void TC_11_Verify_SendTo_Export() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_SendTo_Export();
	}

<<<<<<< HEAD
	@Test(priority = 15)
=======
	@Test(priority = 13)
>>>>>>> origin/Dipak-Pandurang-Gawali
	public void TC_12_Verify_SendTo_GenerateDocumentLink() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_SendTo_GenerateDocumentLink();
	}

<<<<<<< HEAD
	@Test(priority = 16)
=======
	@Test(priority = 14)
>>>>>>> origin/Dipak-Pandurang-Gawali
	public void TC_13_Verify_SendTo_SecureLink() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_SendTo_SecureLink();
	}
}
