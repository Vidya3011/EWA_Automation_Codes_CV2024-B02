package Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Lib;
import Pom.LoginPage;
import Pom.RecentFolderDocument;
import Pom.ViewerToolbar;




public class RecentDoc extends BaseTest {
	//vidya
	//private static org.apache.logging.log4j.Logger log = LogManager.getLogger(RecentDoc.class);
	private WebDriver driver;

	RecentDoc(WebDriver driver) {
		this.driver = driver;
	}
	@Test(priority = 2)
	public void testRecent() throws Exception{	
				

		RecentFolderDocument rec=new RecentFolderDocument(driver);
	    rec.SetRecentFolder();
	    Thread.sleep(3000);
	    rec.SetRecentDocument();
	    Thread.sleep(3000);
	    ViewerToolbar view = new ViewerToolbar(driver);
view.SetFullScreen();
view.SetComments();
Thread.sleep(2000);
view.SetCopyPaste();
Thread.sleep(2000);
view.SetDeletePage();
Thread.sleep(2000);
view.SetSavePage();
Thread.sleep(3000);
view.setConvToPDF();
Thread.sleep(8000);

view.DownloadAllPages();

Thread.sleep(5000);

view.DownloadFirstPage();
Thread.sleep(3000);

		view.SetCloseViewer();
		Thread.sleep(3000);
//		LogoutPage logout=new LogoutPage(driver);
//		logout.testLogout();
		 
	
	}


}
