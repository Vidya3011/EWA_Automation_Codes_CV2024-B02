package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.Print;

public class ZeroPageDocumentCheckingCodesForAllFolder  extends Computhink.Generic.BaseClass {

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(ZeroPageDocumentCheckingCodesForAllFolder.class);


	@BeforeClass
		public void loadBrowser() throws Exception {
			loadBrowser("Chrome");
		
			log.info("Chrome Browser Launched");
			Reporter.log("Chrome Browser launched Successfully...");
<<<<<<< HEAD
			launch47Url();
=======
			launchUrl();
>>>>>>> origin/Dipak-Pandurang-Gawali
			
			Reporter.log("Contentverse URL launched successfully...");
			log.info("Contentverse URL launched successfully...");
		}
		
	
		@Test(priority = 1)
		public void Login_To_EWA() throws Exception {
			//LogoutPage();
			
	    loginRNISHA47();
			Reporter.log("User logged in successful... ");
			log.info("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successful... ");
		}
	
	@Test(priority=2)
	public void TestCase_1_ZeroPageDocumentFindingCode() throws Exception {
		
		Print pr=new Print();
		pr.AutomatingAllCabinetAndDrawerAndFolderForZeroPageDocumentIssue();
	}
}
