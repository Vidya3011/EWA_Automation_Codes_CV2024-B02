package Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.AdvancedViewer;
import Pom.AnnotaionsPom;
import Pom.My_Preferences;
import Pom.RoomContextMenu;


public class AnnotationFunctionality  extends Generic.BaseClass {
	public static Actions act;
	
	 private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AnnotationFunctionality.class);
	

	 /*   @BeforeClass
		public void loadBrowser() {
			loadBrowser("Chrome");
			
			log.info("Chrome Browser Launched");
			Reporter.log("Chrome Browser launched Successfully...");
			launchUrl();
			Reporter.log("Contentverse URL launched successfully...");
			log.info("Contentverse URL launched successfully...");
		}

		@Test (priority=1)
		public void TC_1_Login() throws Exception {
			//LogDipakUser();
			//LogRamUser();
			loginCVS();
			Reporter.log("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successfully... ");
			log.info("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successfully... ");
		} */
	
	 
	 @Test(priority=2)
		public void  TC_2_DefaultView() throws Exception {
		 My_Preferences pojo = new My_Preferences();
		 AdvancedViewer ad=new AdvancedViewer();
			jsclick(pojo.getRefreshbutton());
			
			Thread.sleep(5000);
			jsclick(pojo.getSetting_Icon());
			Reporter.log("User click on setting icon");
			Thread.sleep(5000);
			jsclick(pojo.getMy_Preferencesetting());
			Reporter.log("User click on the my preference tab");
			Thread.sleep(5000);
		    ad.getSelect_PDF_document_Defviewing();
		    Reporter.log("User changes pdf document as default viewing");
			Thread.sleep(4000);
			jsclick(pojo.getApply_button());
			Reporter.log("User click on Apply button and the default view successfully applied...");
			Thread.sleep(5000);
	 
	 }
	 
	 
		@Test(priority=3)
		public void  TC_3_Redaction_UnlockRedaction() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.RedactionAnnotation();
			
			log.info("Redaction added and Unlocked redaction successfull");
			}

		@Test(priority=4)
	   public void  TC_4_HighLight_Annotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.HighLighFunction();
			log.info("Page HighLighted successfull");
			
		}
		@Test(priority=5)
		   public void  TC_5_StikyNote_Annotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
				an.StickyNoteAnnotation();
				log.info("sticky note added successfull");
				Thread.sleep(3000);
			}
		
		@Test(priority=6)
		   public void  TC_6_RubberStampAnnotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.RubberStampAnnotation();
	            log.info("RubberStampAnnotationAddedSuccessfull");
}
		@Test(priority=7)
		   public void  TC_7_Rectangle_Annotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.rectangleAnnotation();
				log.info("Rectangle annotation added successfull");
}
	
		@Test(priority=8)
		   public void  TC_8_StampAnnotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.StampAnnotation();
				log.info("Stamp annotation added successfull");
				
}
		
		@Test(priority=9)
		   public void  TC_9_LineAnnotation_Ellipse_Annotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.LineAnnotation();
			an.ellipseAnnotation();
			
				log.info("Line and ellipse added successfull");
				
}	
		
		@Test(priority=10)
		public void  TC_10_Signature_Annotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.signatureAnnotation();
			
			log.info("Signature added successfully");
			}
		
		@Test(priority=11)
		public void  TC_11_Polygon() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			log.info("polygon added successfully");
			an.PolygonAnnotation();
			an.closeAndReopenThePage();
			Thread.sleep(8000);
		
			jsclick(Refresh_Button(driver));
			Thread.sleep(5000);
			}
		
}
	
	
	
	
	
	


