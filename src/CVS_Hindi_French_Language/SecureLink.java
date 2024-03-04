package CVS_Hindi_French_Language;

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
	public void DocumentSendToSecureLink() throws Exception {
		Print pojo = new Print();
      
        jsclick(pojo.getTestCabExpIcon());
		Thread.sleep(3000);
		 jsclick(pojo.getTesttestDrawerExpIcon());
		Thread.sleep(3000);
		movingDoublecli(pojo.getVidyaTestFolder(), pojo.getVidyaTestFolder());
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
        sendvalue(pojo.getsecureLinkReceipientMail(), readFromExMail(2, 0));
	    Thread.sleep(2000);
	    sendvalue(pojo.getsecureLinkConfirmtMail(), readFromExMail(2, 0));
	    jsclick(pojo.getsecureLinkModifyCheckBox());
	    Thread.sleep(2000);
	    jsclick(pojo.getsecureLinkOKBTN());
	   Thread.sleep(5000);
	   sendvalue(pojo.getsecLinkReceipientMailAgain(), readFromExMail(2, 0));
	  
	    Thread.sleep(2000);
	    sendvalue(pojo.getsecLinkConfirmtMailAgain(),readFromExMail(2, 0));
	    Thread.sleep(2000);
	    jsclick(pojo.getsecureLinkOKBTNsecond());
	    Thread.sleep(5000);
	    log.info("Sending secure link mail from viewer page,select the document from page List the Selected Page was sent Successfully...Mail has received.");
	    }

	//@Test(priority=5)
	public void SentDocumentToView() throws Exception {
		Print pojo = new Print();
	driver.get("http://10.4.10.60:8080/CVWeb/secureLinkLogin?serverName=CVWin19Server&roomName=Win2019_TestRoom&documentId=81809");
	Thread.sleep(3000);
	pojo.getsecLinkUserName().sendKeys("nisha.rahamah@computhink.in");
	Thread.sleep(3000);
	pojo.getsecLinkUserPwrd().sendKeys("4db4f7aabd");
	Thread.sleep(3000);
	jsclick(pojo.getsecLinkLogin());
	Thread.sleep(5000);
	if(pojo.getLockeddoc().isDisplayed()) {
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
        jsclick(element1);
	Reporter.log("Locked message displayed",true);
	Thread.sleep(2000);
	}
	else {
		Reporter.log("Opened");
	}
	Thread.sleep(4000);
	try{
	 alertIsPresent();
    acceptAlert();
	}
	catch(Exception e){
	      System.out.println("NoAlertPresent");
	}
	}
	@Test(priority=4)
	 public void SecureLinkFromDocumentList() throws Exception {
	       launchUrl();
	       loginCVS();
		 Print pojo = new Print();
			movingElement(pojo.getRecentTab());
			Thread.sleep(3000);
			ElementToBeClickable(pojo.getRecentFolder());
			jsclick(pojo.getRecentFolder());
	        Thread.sleep(5000);                                
			WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"documentListTable\"]/tbody/tr[7]/td[1]"));
		    checkbox.click();
		    WebElement doc = driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[1]/ul/li[5]"));
		   movingElement(doc);
		   jsclick(pojo.getsecureLinkFromDocTab());
		   jsclick(pojo.getsendToDocTab());
		   Thread.sleep(3000);
	        sendvalue(pojo.getsecureLinkReceipientMail(), readFromExMail(2, 0));
		    Thread.sleep(2000);
		    sendvalue(pojo.getsecureLinkConfirmtMail(), readFromExMail(2, 0));
		    jsclick(pojo.getsecureLinkModifyCheckBox());
		    Thread.sleep(2000);
		    jsclick(pojo.getsecureLinkOKBTN());
		   Thread.sleep(5000);
		   sendvalue(pojo.getsecLinkReceipientMailAgain(), readFromExMail(2, 0));
		  
		    Thread.sleep(2000);
		    sendvalue(pojo.getsecLinkConfirmtMailAgain(),readFromExMail(2, 0));
		    Thread.sleep(2000);
		    jsclick(pojo.getsecureLinkOKBTNsecond());
		    Thread.sleep(5000);
		    jsclick(Refresh_Button(driver));
		    log.info("Sending secure link mail from document tab,select the document from Document List the Selected document was sent Successfully...Mail has received.");
		   }
	@Test(priority=3)
	 public void SecureLinkFromSearchTab() throws Exception {
		SearchFunction sr = new SearchFunction();
		Thread.sleep(6000);
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		jsclick(sr.getFindButton());
		Thread.sleep(10000);
		WebElement checkbox = driver.findElement(By.xpath("(//span[@class='checkmark'])[4]"));
	   jsclick(checkbox);
	    WebElement doc = driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[1]/ul/li[5]"));
	   movingElement(doc);
	   Print pojo = new Print();
	   jsclick(pojo.getsecureLinkFromDocTab());
	   jsclick(pojo.getsendToDocTab());
	   Thread.sleep(3000);
        sendvalue(pojo.getsecureLinkReceipientMail(), readFromExMail(1, 0));
	    Thread.sleep(2000);
	    sendvalue(pojo.getsecureLinkConfirmtMail(), readFromExMail(1, 0));
	    jsclick(pojo.getsecureLinkModifyCheckBox());
	    Thread.sleep(2000);
	    jsclick(pojo.getsecureLinkOKBTN());
	   Thread.sleep(5000);
	   sendvalue(pojo.getsecLinkReceipientMailAgain(), readFromExMail(1, 0));
	  
	    Thread.sleep(2000);
	    sendvalue(pojo.getsecLinkConfirmtMailAgain(),readFromExMail(1, 0));
	    Thread.sleep(2000);
	    jsclick(pojo.getsecureLinkOKBTNsecond());
	    Thread.sleep(5000); 
		 log.info("Searching the document and select the document from searchList the selected document was Sent Successfully...Mail has received.");
		jsclick(Refresh_Button(driver)); 
		Thread.sleep(5000);
		}
	
	
}
