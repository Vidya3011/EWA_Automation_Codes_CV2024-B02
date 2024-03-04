package Script;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Print;

public class SecureLink_Negative_Scenerio extends Generic.BaseClass {
	
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(SecureLink_Negative_Scenerio.class);
	/*@BeforeClass
	public void ladBrowser() {
		loadBrowser("edge");
		log.info("Chrome Browser");
		//launchLocalUrl();
		launchUrl();
		log.info("ContentVerseURL");
	}

	@Test (priority=1)
	public void Login() throws Exception {
		loginCVS();
		//loginLocalCVS();
		log.info("User is Successfully logged in");
	}*/
   @Test(priority=2)
	public void SecureLinkInvalidRecepient_Mail_ID_ValidConfirm_Mail() throws Exception {
		Print pojo = new Print();
       Thread.sleep(9000);
      // jsclick(Refresh_Button(driver));
        jsclick(pojo.getTestCabExpIcon());
		Thread.sleep(3000);
		 jsclick(pojo.getTesttestDrawerExpIcon());
		Thread.sleep(3000);
		selectElement(pojo.getVidyaTestFolder());
		Thread.sleep(5000);
		jsclick(pojo.getDocument());
		Thread.sleep(5000);
		try {
		if(pojo.getLockeddoc().isDisplayed()) {
			
			WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
            jsclick(element1);
		}
		}
		catch(Exception e) {
		Reporter.log("Locked message displayed",true);
		Thread.sleep(2000);
		}
		
		Thread.sleep(3000);
		try {
		
	
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert(); 
		} catch(Exception e) {
			Reporter.log("No Alert is present");
		}
		Thread.sleep(3000);
		jsclick(pojo.getCheckBox());
		jsclick(pojo.getSendToIcon());
		Thread.sleep(3000);
		jsclick(pojo.getsecureLink());
		Thread.sleep(3000);
        sendvalue(pojo.getsecureLinkReceipientMail(), "NishaR@@3.com");
	    Thread.sleep(2000);
	    sendvalue(pojo.getsecureLinkConfirmtMail(), readFromExMail(2, 0));
	  //  jsclick(pojo.getsecureLinkModifyCheckBox());
	    Thread.sleep(2000);
	    jsclick(pojo.getsecureLinkOKBTN());
	   Thread.sleep(5000);
	   System.out.println("SecureLink : Invalid Receipient mail and valid confirm mail");
	  System.out.println(pojo.getEmailIDMismatchMessage().getText());
	  Thread.sleep(3000);
	   jsclick(pojo.getEmailIDMismatchDialogOKBTN());
	   String msg= "Please enter valid recipient email id";
	   SoftAssertEqalValidation(pojo.getEmailIDMismatchMessage(), msg);
	   System.out.println("Assert Validation successfull.");
	   Thread.sleep(8000);
	    }

   
   
   
   @Test(priority=2)
	public void SendToSecureLinkwithout_Email_ID_BlankTest() throws Exception {
	   Print pojo=new Print();
	   Thread.sleep(3000);
      pojo.getsecureLinkReceipientMail().clear();
	    pojo.getsecureLinkConfirmtMail().clear();
	  //  jsclick(pojo.getsecureLinkModifyCheckBox());
	    Thread.sleep(2000);
	    jsclick(pojo.getsecureLinkOKBTN());
	   Thread.sleep(5000);
	   System.out.println("SecureLink : without email id");
	  System.out.println(pojo.getEmailIDMismatchMessage().getText());
	  Thread.sleep(3000);
	   jsclick(pojo.getEmailIDMismatchDialogOKBTN());
	   String msg= "Please enter recipient email id";
	   SoftAssertEqalValidation(pojo.getsecLinkBlankMail_ID(), msg);
	   System.out.println("Assert Validation successfull.");
	   Thread.sleep(8000);
	   }
   
   
   @Test(priority=3)
	public void SecLinkReceipientDailogBoxInvalid_Email_ID() throws Exception {
	   Print pojo = new Print();
	      
       
		Thread.sleep(3000);
       sendvalue(pojo.getsecureLinkReceipientMail(), readFromExMail(2, 0));
	    Thread.sleep(2000);
	    sendvalue(pojo.getsecureLinkConfirmtMail(), readFromExMail(2, 0));
	    jsclick(pojo.getsecureLinkModifyCheckBox());
	    Thread.sleep(2000);
	    jsclick(pojo.getsecureLinkOKBTN());
	   Thread.sleep(5000);
	   sendvalue(pojo.getsecLinkReceipientMailAgain(), "NishaR@1234.com");
	  
	    Thread.sleep(2000);
	    sendvalue(pojo.getsecLinkConfirmtMailAgain(),"!@#$%^&&1234@gmail.com");
	    Thread.sleep(2000);
	    jsclick(pojo.getsecureLinkOKBTNsecond());
	    Thread.sleep(5000);
	    log.info("Sending secure link mail from viewer page,select the document from page List the Selected Page was sent Successfully...Mail has received.");
	    Thread.sleep(5000);
		   System.out.println("SecureLink : invalid confirm email id");
		  System.out.println(pojo.getEmailIDMismatchMessage().getText());
		  Thread.sleep(3000);
		   jsclick(pojo.getEmailIDMismatchDialogOKBTN());
		   String msg= "Email id Mismatch";
		   SoftAssertEqalValidation(pojo.getsecLinkBlankMail_ID(), msg);
		   System.out.println("Assert Validation successfull.");
		   Thread.sleep(8000);
   }
   @Test(priority=3)
	public void SecLinkReceipientMailBlank() throws Exception {
	   Print pojo = new Print();
	   
	   Thread.sleep(5000);
	   pojo.getsecLinkReceipientMailAgain().clear();
	  
	    Thread.sleep(2000);
	    pojo.getsecLinkConfirmtMailAgain().clear();
	    Thread.sleep(2000);
	    jsclick(pojo.getsecureLinkOKBTNsecond());
	    Thread.sleep(5000);
	    log.info("Blank mail id:Unable to send the document into secure link");
	    Thread.sleep(5000);
		   System.out.println("SecureLink : blank confirm email id");
		  System.out.println(pojo.getEmailIDMismatchMessage().getText());
		  Thread.sleep(3000);
		   jsclick(pojo.getEmailIDMismatchDialogOKBTN());
		   String msg= "Email id Mismatch";
		   SoftAssertEqalValidation(pojo.getsecLinkBlankMail_ID(), msg);
		   System.out.println("Assert Validation successfull.");
		   jsclick(Refresh_Button(driver));
   }
	   
	   
   }
   


