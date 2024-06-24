package Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Print;
import Pom.SearchFunction;

public class SecureLink extends Generic.BaseClass {
	
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(SecureLink.class);
	@BeforeClass
	public void loadBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser");
		//launchLocalUrl();
		launchUrl();
		log.info("ContentVerseURL");
	}

	@Test (priority=1)
	public void Login() throws Exception {
		Thread.sleep(2000);
		loginCVS();
		//loginSQL2022();
		//loginLocalCVS();
		log.info("User is Successfully logged in");
	}
   @Test(priority=2)
	public void TC_1_DocumentSendToSecureLink() throws Exception {
		Print pojo = new Print();
		pojo.DocumentSendToSecureLink();
		
	    }

	@Test(priority=5)
	public void TC_4_SentDocumentToView() throws Exception {
		Print pojo = new Print();
		pojo.SentDocumentToView();
	
	}
	@Test(priority=4)
	 public void TC_3_SecureLinkFromDocumentList() throws Exception {
		Reporter.log("Scenario 02: Document send to securelink from Document page");
		 Print pojo = new Print();
		 pojo.SecureLinkFromDocumentList();
	}
	@Test(priority=3)
	 public void TC_2_SecureLinkFromSearchTab() throws Exception {
		
	   Print pojo = new Print();
	   pojo.SecureLinkFromSearchTab();
	   
		}
	
	
}
