package Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.AnnotaionsPom;
import Pom.RoomContextMenu;


public class AnnotationFunctionality  extends Generic.BaseClass {
	public static Actions act;
	
	 private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AnnotationFunctionality.class);
	

	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser started Successfully...");
		driver.manage().deleteAllCookies();
		launchUrl();
		
		log.info("CVS URL started Successfully...");
		
	}

	@Test(priority=1)
	public void CVSLogin() throws Exception {
		
		
		loginCVS();
		
		Thread.sleep(3000);
	    log.info("CVS is logged in successfully...");
	}
	
		@Test(priority=2)
		public void Redaction_UnlockRedaction() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.RedactionAnnotation();
			log.info("Redaction added and Unlocked redaction successfull");
			}

		@Test(priority=3)
	   public void HighLight_Annotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.HighLighFunction();
			log.info("Page HighLighted successfull");
			
		}
		@Test(priority=4)
		   public void StikyNote_Annotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
				an.StickyNoteAnnotation();
				log.info("sticky note added successfull");
				Thread.sleep(3000);
			}
		
		@Test(priority=5)
		   public void RubberStampAnnotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.RubberStampAnnotation();
	            log.info("RubberStampAnnotationAddedSuccessfull");
}
		@Test(priority=6)
		   public void Rectangle_Annotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.rectangleAnnotation();
				log.info("Rectangle annotation added successfull");
}
	
		@Test(priority=7)
		   public void StampAnnotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.StampAnnotation();
				log.info("Stamp annotation added successfull");
				
}
		
		@Test(priority=8)
		   public void LineAnnotation_Ellipse_Annotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.LineAnnotation();
			an.ellipseAnnotation();
			
				log.info("Line and ellipse added successfull");
				
}	
		
		@Test(priority=9)
		public void Signature_Annotation() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			an.signatureAnnotation();
			log.info("Signature added successfully");
			}
		
		@Test(priority=10)
		public void Polygon() throws Exception {
			AnnotaionsPom an=new AnnotaionsPom();
			log.info("polygon added successfully");
			an.PolygonAnnotation();
			an.closeAndReopenThePage();
			Thread.sleep(8000);
			jsclick(Refresh_Button(driver));
			}
		
}
	
	
	
	
	
	


