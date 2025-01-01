package Computhink.Script;

import org.openqa.selenium.WebDriver;

import Computhink.Pom.RecentFolderDocument;
import Computhink.Pom.ViewerToolbar;

//vidya codes 
public class RecentDoc {
	private WebDriver driver;

	RecentDoc(WebDriver driver) {
		this.driver = driver;
	}

	public void testRecent() throws Exception {

		RecentFolderDocument rec = new RecentFolderDocument(driver);
		// rec.SetRecentFolder();
		Thread.sleep(2000);
		rec.SetRecentDocument();
		Thread.sleep(3000);
		ViewerToolbar view = new ViewerToolbar(driver);
		// view.setConvToPDF();
		view.SetCopyPaste();

	}

}
