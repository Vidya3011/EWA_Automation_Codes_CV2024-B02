package Script;

import org.apache.logging.log4j.LogManager;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.Documents_ContextMenu;

public class DocumentContextSingleFolderDocSendTo extends BaseClass {
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(DocumentContextSingleFolderDocSendTo.class);
	 
	/*@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		
         launchUrl();
         log.info("CVS URL started Successfully...");
   
         
		
		}

	@Test(priority=1)
	public void  TC_1_LogVCS() throws Exception {
		 loginCVS();
		Reporter.log("CVS User is logged in successfully...");
	}
*/


	@Test(priority = 2)
	public void  TC_2_Verify_SendTo_Mail() throws Exception {
		Reporter.log("Scneario 01: A folder containing ten documents will be email");
		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getRefreshbutton());
		Reporter.log("User click on refresh icon");
		Thread.sleep(3000);
		selectElement(Doc.getCabinet());
		Reporter.log("User expand the cabinet");
		Thread.sleep(4000);
		selectElement(Doc.getDrawer());
		Reporter.log("User expand the drawer ");
		Thread.sleep(4000);
		selectElement(Doc.getDocEmailFolder());
		Reporter.log("User Open the folder, document is listed on the document page");
		Thread.sleep(6000);
		jsclick(Doc.getSelectAlldoc());
		Reporter.log("User click the Select all check box");
		Thread.sleep(9000);
		Doc.getMoveTo_Menu_Documents();
		Reporter.log("User mouse hover on the document tab");
		Thread.sleep(2000);
		Doc.getSentTo_Mail_asReference();
		Reporter.log("User mouse hover on the sendto submenu");
		Thread.sleep(3000);
		log.info("SendTo Mail asReference Functionality verified Successfully");
		Reporter.log("User select email from the send to dropdown");
		jsclick(Doc.getSelect_Document());
		Thread.sleep(3000);
		
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(3000);
		Doc.getSentTo_Mail_asCopy();
		Reporter.log("The email dialog box opened, user click on the copy radio button.");
		Thread.sleep(2000);
		log.info("SendTo Mail asCopy Functionality verified Successfully");
		Reporter.log("The copy mail has been sent successfully");
	}

	@Test(priority = 3)
	public void  TC_3_Verify_SendTo_Print() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.SentTo_Print_Folder();
		log.info("SendTo Print Functionality verified Successfully");

	}

	@Test(priority = 4)
	public void  TC_4_Verify_SendTo_Export() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.getSentTo_Export_Folder();
		Thread.sleep(8000);
		log.info("SendTo Export Functionality verified Successfully");

	}

	@Test(priority = 5)
	public void  TC_5_Verify_SendTo_GenerateDocumentLink() throws Exception {
		Reporter.log("Scneario 05: Verify generate document link");
		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getRefreshbutton());
		Reporter.log("User click on refresh icon");
		Thread.sleep(3000);
		selectElement(Doc.getCabinet());
		Reporter.log("User expand the cabinet");
		Thread.sleep(4000);
		selectElement(Doc.getDrawer());
		Reporter.log("User expand the drawer");
		Thread.sleep(4000);
		selectElement(Doc.getDocEmailFolder());
		Reporter.log("User Open the folder, document is listed on the document page");
		Thread.sleep(6000);
		jsclick(Doc.getSelectAlldoc());
		Reporter.log("User click the Select all check box");
		Thread.sleep(9000);
		Reporter.log("User mouse hover on the document tab");
		Thread.sleep(4000);
		Doc.getSentTo_GenerateDocumentLink();
		Reporter.log("User mouse hover on the send to submenu");
		Thread.sleep(3000);
		Reporter.log("User select generatedocumentlink from the send to dropdown");
		jsclick(Doc.getRefreshbutton());
		Reporter.log("SendTo GenerateDocumentLink Functionality verified Successfully");
		log.info("SendTo GenerateDocumentLink Functionality verified Successfully");
	}

	@Test(priority = 6)
	public void  TC_6_Verify_SendTo_SecureLink() throws Exception {
		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Reporter.log("Scneario 06: A folder containing ten documents will be printed");
		jsclick(Doc.getRefreshbutton());
		Reporter.log("User click on refresh icon");
		Thread.sleep(3000);
		Reporter.log("User expand the cabinet");
		selectElement(Doc.getCabinet());
		Thread.sleep(4000);
		Reporter.log("User expand the drawer");
		selectElement(Doc.getDrawer());
		Thread.sleep(4000);
		selectElement(Doc.getDocEmailFolder());
		Thread.sleep(6000);
		Reporter.log("User Open the folder, document is listed on the document page");
		
		jsclick(Doc.getSelectAlldoc());
		Reporter.log("User click the Select all check box");
		Thread.sleep(8000);
		Doc.getSentTo_SecureLink();
		Reporter.log("User select secureLink from the send to dropdown");
		log.info("SendTo SecureLink Functionality verified Successfully");
		Thread.sleep(5000);
		Reporter.log("Folder has been sent to securelink successfull");
		jsclick(Doc.getRefreshbutton());
	}
}


