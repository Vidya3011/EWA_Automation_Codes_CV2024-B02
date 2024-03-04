package Script;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.AdvancedViewer;

public class Thumbnail_MicroSoft_FabBTN extends BaseClass {
	
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(DocumentContextSingleFolderDocSendTo.class);
	 
	/*@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		
         launchUrl();
         log.info("CVS URL started Successfully...");
   
         
		
		}

	@Test(priority=1)
	public void LogVCS() throws Exception {
		 loginSQL2022();
		 log.info("CVS User is logged in successfully...");
	}
*/
@Test(priority=2)
public void ShowThumbnail() throws Exception{
	
	AdvancedViewer adv= new AdvancedViewer();
	adv.CreateDocumentAndShowThumbnail();
	
}
	
@Test(priority=3)
public void Create_document_saveDoc() throws Exception{
	
	AdvancedViewer adv= new AdvancedViewer();
	adv.CreateDocumentAnd_SaveFromDocument_Fabbtn();
	
}
	
@Test(priority=4)
public void Upload_Document_fabBTN() throws Exception{
	
	AdvancedViewer adv= new AdvancedViewer();
	adv.CreateDocumentAnd_Upload_NewDocument_From_FabBrowseOption();
	
}
	
@Test(priority=5)
public void View_Document_fullScreen() throws Exception{
	
	AdvancedViewer adv= new AdvancedViewer();
	adv.CreateDocumentAnd_ViewFullScreen();
	
}
	
@Test(priority=6)
public void View_Document_Delete() throws Exception{
	
	AdvancedViewer adv= new AdvancedViewer();
	adv.CreateDocumentAnd_DeleteFabBTN_option();
	}


//*[@id="loadmorecount"]
	
	
	
	
	
	
	

}
