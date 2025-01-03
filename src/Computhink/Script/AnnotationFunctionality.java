package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.AdvancedViewer;
import Computhink.Pom.AnnotaionsPom;
import Computhink.Pom.My_Preferences;
import Computhink.Pom.RoomContextMenu;

//NishaR codes

public class AnnotationFunctionality extends Computhink.Generic.BaseClass {
	
	public static Actions act;

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AnnotationFunctionality.class);

	@BeforeClass
	public void ladBrowser() throws Exception {
		loadBrowser("Chrome");
	
		log.info("Chrome Browser Launched");
		Reporter.log("Chrome Browser launched Successfully...");

	launch47Url();

		launchUrl();

		//launchUrl();
		// launchLocalUrl();
		Reporter.log("Contentverse URL launched successfully...");
		log.info("Contentverse URL launched successfully...");
	}
	
	@Test(priority = 1)
	public void Login() throws Exception {
		
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
		log.info("User log in to 'CVWin19Server.Win2019_TestRoom'successfully... ");
	}

	@Test(priority = 2)
	public void TC_A_DefaultView() throws Exception {

		AdvancedViewer ad = new AdvancedViewer();
		ad.DefaultView();
	

	}

	@Test(priority = 3)
	public void TC_B_CreateDocument() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
	
	an.creatingDocumentForDefaulfViewingAnnotation();
	}

	@Test(priority = 4)
	public void TC_c_Redaction_UnlockRedaction() throws Exception {


	@Test(priority = 3)
	public void TC_B_Redaction_UnlockRedaction() throws Exception {

		AnnotaionsPom an = new AnnotaionsPom();
		an.RedactionAnnotation();

		log.info("Redaction added and Unlocked redaction successful");
	}


	@Test(priority = 5)
	public void TC_D_HighLight_Annotation() throws Exception {

	@Test(priority = 4)
	public void TC_C_HighLight_Annotation() throws Exception {

		AnnotaionsPom an = new AnnotaionsPom();
		an.HighLighFunction();
		log.info("Page HighLighted successful");

	}


	@Test(priority = 6)

	@Test(priority = 5)

	public void TC_E_StikyNote_Annotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.StickyNoteAnnotation();
		log.info("sticky note added successful");
		Thread.sleep(3000);
	}


	@Test(priority = 7)

	@Test(priority = 6)

	public void TC_F_RubberStampAnnotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.RubberStampAnnotation();
		log.info("RubberStamp Annotation Added Successful");
	}


	@Test(priority = 8)

	@Test(priority = 7)

	public void TC_G_Rectangle_Annotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.rectangleAnnotation();
		log.info("Rectangle annotation added successful");
	}


	@Test(priority = 9)

	@Test(priority = 8)

	public void TC_H_StampAnnotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.StampAnnotation();
		log.info("Stamp annotation added successful");

	}


	@Test(priority = 10)

	@Test(priority = 9)

	public void TC_I_LineAnnotation_Ellipse_Annotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.LineAnnotation();

		an.ellipseAnnotation();

		log.info("Line and ellipse added successful");

	}


	@Test(priority = 11)

	@Test(priority = 10)

	public void TC_J_Signature_Annotation() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		an.signatureAnnotation();

		log.info("Signature added successfully");
	}


	@Test(priority = 12)

	@Test(priority = 11)

	public void TC_K_Polygon() throws Exception {
		AnnotaionsPom an = new AnnotaionsPom();
		log.info("polygon added successfully");
		an.PolygonAnnotation();
		an.closeAndReopenThePage();
		Thread.sleep(8000);

		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
	}

}
