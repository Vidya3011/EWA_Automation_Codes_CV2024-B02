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
		loginCVS();
		//loginLocalCVS();
		log.info("User is Successfully logged in");
	}
   @Test(priority=2)
	public void DocumentSendToSecureLink() throws Exception {
		Print pojo = new Print();
		Reporter.log("USer exapnd the cabinet");
        jsclick(pojo.getTestCabExpIcon());
		Thread.sleep(3000);
		 jsclick(pojo.getTesttestDrawerExpIcon());
		 Reporter.log("USer exapnd the drawer");
		Thread.sleep(3000);
		selectElement(pojo.getVidyaTestFolder());
		Reporter.log("USer exapnd the folder");
		Thread.sleep(5000);
		Reporter.log("USer open the document");
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
		Reporter.log("USer select the check box in thubmnail view");
		jsclick(pojo.getSendToIcon());
		Reporter.log("USer click on sendTo tool button");
		Thread.sleep(3000);
		jsclick(pojo.getsecureLink());
		Reporter.log("USer select secure link submenu");
		Thread.sleep(3000);
        sendvalue(pojo.getsecureLinkReceipientMail(), readFromExMail(2, 0));
        Reporter.log("USer enter the valid mail into securelink email textbox");
	    Thread.sleep(2000);
	    sendvalue(pojo.getsecureLinkConfirmtMail(), readFromExMail(2, 0));
	    Reporter.log("USer enter the valid mail into securelink confirm textbox");
	    jsclick(pojo.getsecureLinkModifyCheckBox());
	    Thread.sleep(2000);
	    Reporter.log("User click the modify check box");
	    jsclick(pojo.getsecureLinkOKBTN());
	    Reporter.log("Click on securelink dilaog ok button");
	   Thread.sleep(5000);
	   sendvalue(pojo.getsecLinkReceipientMailAgain(), readFromExMail(2, 0));
	   Reporter.log("Enter receipent mail again");
	    Thread.sleep(2000);
	    sendvalue(pojo.getsecLinkConfirmtMailAgain(),readFromExMail(2, 0));
	    Reporter.log("Enter receipent mail un confirm textbox");
	    Thread.sleep(2000);
	    jsclick(pojo.getsecureLinkOKBTNsecond());
	    Thread.sleep(5000);
	    Reporter.log("Sending secure link mail from viewer page,select the document from page List the Selected Page was sent Successfully...Mail has received.");
	    log.info("Sending secure link mail from viewer page,select the document from page List the Selected Page was sent Successfully...Mail has received.");
	    }

	@Test(priority=5)
	public void SentDocumentToView() throws Exception {
		Print pojo = new Print();
	driver.get("http://10.4.10.60:8080/CVWeb/secureLinkLogin?serverName=CVWin19Server&roomName=Win2019_TestRoom&documentId=83701");
	Thread.sleep(3000);
	pojo.getsecLinkUserName().sendKeys("nisha.rahamah@computhink.in");
	Thread.sleep(3000);
	pojo.getsecLinkUserPwrd().sendKeys("4977138662");
	Thread.sleep(3000);
	jsclick(pojo.getsecLinkLogin());
	Thread.sleep(15000);
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
	      
		 Print pojo = new Print();
			movingElement(pojo.getRecentTab());
Reporter.log("User click on recent folder tab");
			Thread.sleep(3000);
			ElementToBeClickable(pojo.getRecentFolder());
			Reporter.log("User open the recent folder");
			jsclick(pojo.getRecentFolder());
			
	        Thread.sleep(5000);    
	        Reporter.log("User click on document page check box");
			WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"documentListTable\"]/tbody/tr[7]/td[1]"));
		    checkbox.click();
		    WebElement doc = driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[1]/ul/li[5]"));
		   movingElement(doc);
		   Reporter.log("User mouse hover on document tab");
		   jsclick(pojo.getsecureLinkFromDocTab());
		   jsclick(pojo.getsendToDocTab());
		   Reporter.log("USer click sendto submenu securelink option");
		   Thread.sleep(3000);
	        sendvalue(pojo.getsecureLinkReceipientMail(), readFromExMail(2, 0));
	        Reporter.log("USer enter the valid email id");
		    Thread.sleep(2000);
		    sendvalue(pojo.getsecureLinkConfirmtMail(), readFromExMail(2, 0));
		    Reporter.log("USer enter the mail id in confirm mail textbox");
		    jsclick(pojo.getsecureLinkModifyCheckBox());
		    Thread.sleep(2000);
		    Reporter.log("User click on modify check box");
		    jsclick(pojo.getsecureLinkOKBTN());
		   Thread.sleep(5000);
		   Reporter.log("User click on securelink dilaog ok button");
		   sendvalue(pojo.getsecLinkReceipientMailAgain(), readFromExMail(2, 0));
		   Reporter.log("User enter receipient mail ");
		    Thread.sleep(2000);
		    sendvalue(pojo.getsecLinkConfirmtMailAgain(),readFromExMail(2, 0));
		    Thread.sleep(2000);
		    Reporter.log("User confirm the receipient mail again");
		    jsclick(pojo.getsecureLinkOKBTNsecond());
		    Thread.sleep(5000);
		    Reporter.log("User click on receipied dialog OK button");
		    jsclick(Refresh_Button(driver));
		    log.info("Sending secure link mail from document tab,select the document from Document List the Selected document was sent Successfully...Mail has received.");
		   }
	@Test(priority=3)
	 public void SecureLinkFromSearchTab() throws Exception {
		SearchFunction sr = new SearchFunction();
		Thread.sleep(6000);
		 Reporter.log("User click on search tab");
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		 Reporter.log("User click on find button");
		jsclick(sr.getFindButton());
		Thread.sleep(10000);
		WebElement checkbox = driver.findElement(By.xpath("(//span[@class='checkmark'])[4]"));
	   jsclick(checkbox);
	   Reporter.log("User click on document page check box");
	    WebElement doc = driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[1]/ul/li[5]"));
	   movingElement(doc);
	   Reporter.log("Mouse hover on document tab");
	   Print pojo = new Print();
	   jsclick(pojo.getsecureLinkFromDocTab());
	   Reporter.log("User click on sendto submenu");
	   jsclick(pojo.getsendToDocTab());
	   Thread.sleep(3000);
	   Reporter.log("User click on securelink submenu");
        sendvalue(pojo.getsecureLinkReceipientMail(), readFromExMail(1, 0));
	    Thread.sleep(2000);
	    Reporter.log("USer enter valid email");
	    sendvalue(pojo.getsecureLinkConfirmtMail(), readFromExMail(1, 0));
	    jsclick(pojo.getsecureLinkModifyCheckBox());
	    Reporter.log("enter valid email id on confirm mail text box");
	    Thread.sleep(2000);
	    jsclick(pojo.getsecureLinkOKBTN());
	    Reporter.log("USer click on secure link ok button");
	   Thread.sleep(5000);
	   sendvalue(pojo.getsecLinkReceipientMailAgain(), readFromExMail(1, 0));
	   Reporter.log("USer enter receipient mail ");
	    Thread.sleep(2000);
	    sendvalue(pojo.getsecLinkConfirmtMailAgain(),readFromExMail(1, 0));
	    Thread.sleep(2000);
	    Reporter.log("USer confirm the receipien mail ");
	    jsclick(pojo.getsecureLinkOKBTNsecond());
	    Thread.sleep(5000); 
	    Reporter.log("User click on securelink dialog OK button");
		 log.info("Searching the document and select the document from searchList the selected document was Sent Successfully...Mail has received.");
		jsclick(Refresh_Button(driver)); 
		Thread.sleep(5000);
		}
	
	
}
