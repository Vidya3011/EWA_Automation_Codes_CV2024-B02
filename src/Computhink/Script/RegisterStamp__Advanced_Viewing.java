package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.AdvancedViewer;
import Computhink.Pom.AnnotaionsPom;

public class RegisterStamp__Advanced_Viewing extends BaseClass {

	

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AnnotationFunctionality.class);

	@BeforeClass
	public void ladBrowser() throws Exception {
		loadBrowser("Chrome");

		log.info("Chrome Browser Launched");
		Reporter.log("Chrome Browser launched Successfully...");
		
		
<<<<<<< HEAD
		launch47Url();
=======
		launchUrl();
>>>>>>> origin/Dipak-Pandurang-Gawali
		// launchLocalUrl();
		Reporter.log("Contentverse URL launched successfully...");
		log.info("Contentverse URL launched successfully...");
	}

	@Test(priority = 1)
	public void Login() throws Exception {
		
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
		log.info("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successfully... ");
	}

	@Test(priority = 2)
	public void TC_A_Advanced_View() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.AdvancedViewerOption();

	}

	@Test(priority = 3)
	public void TestCase_2_Add_Stamp_SignHere() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.SignHereAllStamps(5);
		
		ad.SaveDocumentAndReopen();
		
		Reporter.log("Word Document verified successful");
	}
	
	@Test(priority = 4)
	public void TestCase_3_Dynamic_Stamp() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.DynamicAllStamps(6);
		ad.SaveDocumentAndReopen();
	}

	@Test(priority = 5)
	public void TestCase_4_Standard_Stamp() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.StandardAllStamps(12);
		ad.SaveDocumentAndReopen();
	}

	@Test(priority = 6)
	public void TestCase_5_Custom_Stamp() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.CustomAllStamps(9);
		ad.SaveDocumentAndReopen();
		jsclick(Refresh_Button(driver));
	}
	
	
	
	
}
