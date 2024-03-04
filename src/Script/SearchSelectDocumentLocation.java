package Script;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.FailedRetry;
import Pom.SearchFunction;
import okhttp3.internal.connection.RouteSelector.Selection;

public class SearchSelectDocumentLocation extends Generic.BaseClass {
	public static Actions act;
	
	 private static org.apache.logging.log4j.Logger log = LogManager.getLogger(SearchSelectDocumentLocation.class);

	/*@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser started Successfully...");
	
		launchUrl();
		
		log.info("CVS URL started Successfully...");
	}

	@Test(priority=1)
	public void CVSLogin() throws Exception {
		
		loginCVS();
		
		 log.info("CVS User is logged in successfully...");
	}
*/
    @Test(priority=3) 
	public void ExactSearchInIndexWithLoadMoreCount() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		Reporter.log("Scenario 02: Verify Search list load more count");
		Reporter.log("User click on Search tab");
	   Thread.sleep(5000);
		act = new Actions(driver);
		act.moveToElement(sr.getIndexContainsSearch()).click().build().perform();
		Reporter.log("User enter value into Index contains textbox");
		sr.getIndexContainsSearch().sendKeys("Test Doc");
		Thread.sleep(5000);
		Reporter.log("User click on find button");
		jsclick(sr.getFindButton());
		Thread.sleep(8000);
	/*	scrollDown(sr.getinMiddleDocOFSeachMetaData());
		Thread.sleep(3000);
		jsclick(sr.getinMiddleDocOFSeachMetaData());*/
	
		Reporter.log("User scroll down the search list");
		
		sr.ScrollDownButton();
		Thread.sleep(5000);
		Reporter.log("User click on load more count");
	   jsclick(sr.getloadMore());
	   Thread.sleep(4000);
	  /* scrollDown(sr.getafterLoadmoreSeachMetaData());
	   Thread.sleep(5000);
	   jsclick(sr.getafterLoadmoreSeachMetaData());*/
	   Thread.sleep(8000);
	   Reporter.log("Once again click on load more count");
	   sr.ScrollDownButton();
	  
	   Thread.sleep(3000);
	   jsclick(sr.getloadMore());
	   Thread.sleep(5000);
	   WebDriverWait wait = new WebDriverWait(driver, 30);
	   try {
		wait.until(ExpectedConditions.alertIsPresent());
	   acceptAlert();
	   }
	   catch(Exception e) {
		 Reporter.log("NoAlertIsPresent");  
	   }
	   Reporter.log("'no more data found' warning alert displayed ");
	  Thread.sleep(8000);
		jsclick(sr.getClearButton());
		 Reporter.log("User click on clear button");
		log.info("Searchfunctionality with exact phrase index search with load more count");
		 Reporter.log("Loadmore count functionality working fine");
   }
    @Test(priority=4)
     public void ExactSearchInIndex() throws Exception {
 		SearchFunction sr = new SearchFunction();
 		Reporter.log("Scenario 03: Verify index search contains 'Exact Search'");
 		jsclick(sr.getSearchTab());
 		 Reporter.log("User click on search tab");
 	   Thread.sleep(5000);
 		act = new Actions(driver);
 		act.moveToElement(sr.getIndexContainsSearch()).click().build().perform();
 		Reporter.log("User enter value on index search contains textbox");
 		sr.getIndexContainsSearch().sendKeys(readFromExSearch(3, 1));
 		Thread.sleep(5000);
 		Reporter.log("User click on find button");
 		jsclick(sr.getFindButton());
 		Thread.sleep(8000);
 		Reporter.log("Searchfunctionality with exact phrase index contains search working fine");
 		log.info("Searchfunctionality with exact phrase index search");
		sr.getRandomSelectDoc();
		Thread.sleep(10000);
		Reporter.log("User click on Clear button");
		jsclick(sr.getClearButton());
     }
    
     	@Test(priority=16) // AlloftheWords search
	public void TextSearchWithSQLData() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		Reporter.log("User click on search tab");
		jsclick(sr.getSearchTab());
		Thread.sleep(3000);
		(sr.getfortextcontainsdrpdwnicon()).click();
		Reporter.log("User select text contains allof the word submenu");
	     Thread.sleep(3000);
		movingclkElement(sr.getforallofthewordsinText());
		Reporter.log("Start the  indexer by using sql statement");
		movingclkElement(sr.getTextContainsSearch());
		sr.getTextContainsSearch().sendKeys(sr.getSearchString());
		Reporter.log("Its automatically taken the indexer value by using SQL autoamtion codings");
		Thread.sleep(3000);
		jsclick(sr.getFindButton());
		Reporter.log("User click on find button");
		Thread.sleep(10000);
		jsclick(sr.getopendocfortext());
		Reporter.log("User open the document to check the thumbnail view");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
		if(wait.until(ExpectedConditions.alertIsPresent()) != null) {
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		} }catch(Exception e) {
			
			Reporter.log("AlertNotPresent");
		}
		Thread.sleep(3000);
		scrollDown(sr.getnewdocscroll());
		Reporter.log("It should highlight the document on thumbnail page");
		snap("SearchScrollDownBarIssue");
		Thread.sleep(8000);
		jsclick(Refresh_Button(driver));
		log.info(" verify Search text contains functionality with all of the words option.");
	}
    	@Test(priority=17) // AlloftheWords search
    	public void TextSearchWithAllOftheWords() throws InterruptedException, IOException {
    		SearchFunction sr = new SearchFunction();
    		jsclick(sr.getSearchTab());
    		Reporter.log("User click on search tab");
    		Thread.sleep(3000);
    		jsclick(sr.getfortextcontainsdrpdwnicon());
    		Reporter.log("User select text contains atleaset one of the word submenu");
    	     Thread.sleep(3000);
    		movingclkElement(sr.getforExactPhraseText());

    		Reporter.log("Start the  indexer by using sql statement");
    		Thread.sleep(2000);
    		jsclick(sr.getTextContainsSearch());
    		Reporter.log("Its automatically taken the indexer value by using SQL autoamtion codings");
    		sr.getTextContainsSearch().sendKeys(readFromExSearch(2, 4));
    		Thread.sleep(3000);
    		Reporter.log("User click on find button and open the searched list document");
    		Reporter.log("It should highlight the document on thumbnail page");
    		jsclick(sr.getFindButton());
    		Thread.sleep(10000);
    		jsclick(sr.getopendocforallwrdtext());
    		WebDriverWait wait = new WebDriverWait(driver, 30);
    		try {
    		if(wait.until(ExpectedConditions.alertIsPresent()) != null) {
    	//	WebDriverWait wait = new WebDriverWait(driver, 30);
    		wait.until(ExpectedConditions.alertIsPresent());
    		acceptAlert();
    		}
    		}catch(Exception e) {
    			
    			Reporter.log("AlertNotPresent");
    		}
    		Thread.sleep(3000);
    		jsclick(sr.gethighlightdocview());
    		Thread.sleep(8000);
    		//scrollDown(sr.getnewdocscroll());
    		//snap("SearchScrollDownBarIssue");
    	//	Thread.sleep(8000);
    		jsclick(Refresh_Button(driver));
    		log.info(" verify Search text contains functionality with all of the words option.");
    	}
    	@Test(priority=18) // AlloftheWords search
    	public void TextSearchWithAtpartOftheWord() throws InterruptedException, IOException {
    		SearchFunction sr = new SearchFunction();
    		jsclick(sr.getSearchTab());
    		Thread.sleep(3000);
    		(sr.getfortextcontainsdrpdwnicon()).click();
    	     Thread.sleep(3000);
    		movingclkElement(sr.getForatleasetoneofthewordText());
    		Thread.sleep(2000);
    		movingclkElement(sr.getTextContainsSearch());
    		sr.getTextContainsSearch().sendKeys(sr.searchStringSQL());
    		Thread.sleep(3000);
    		jsclick(sr.getFindButton());
    		Thread.sleep(10000);
    		jsclick(sr.getforRandomdocOpen());
    		WebDriverWait wait = new WebDriverWait(driver, 30);
    		try {
    		if(wait.until(ExpectedConditions.alertIsPresent()) != null) {
    		//WebDriverWait wait = new WebDriverWait(driver, 30);
    		wait.until(ExpectedConditions.alertIsPresent());
    		acceptAlert();
    		} }catch(Exception e) {
    			
    			Reporter.log("AlertNotPresent");
    		}
    		Thread.sleep(3000);
    		//jsclick(sr.gethighlightdocview());
    		Thread.sleep(3000);
    		
    		/*sr.ScrollDownBTNText();
    		snap("SearchScrollDownBarIssue");
    		Thread.sleep(8000);*/
    		jsclick(Refresh_Button(driver));
    		log.info(" verify Search text contains functionality with all of the words option.");
    	}
     	
    	
     	

	@Test (priority=2)// blank search
	public void BlankSearch() throws InterruptedException {
		 Reporter.log("Scenario 01: Verify blank search");
		SearchFunction sr = new SearchFunction();
		Thread.sleep(3000);
		 Reporter.log("User click on Search tab");
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		 Reporter.log("User click on find button without enter any values");
		jsclick(sr.getFindButton());
		Thread.sleep(10000);
		 Reporter.log("Blank search working fine, it lists the document details on the document page");
		jsclick(sr.getClearButton());
		log.info("verify Blank search.");
	}

	

	@Test (priority=5)// atleast one word
	public void AtLeastOneWordSeachIndex() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 04: Verify Search tab index contains AtleastOneOfTheWord");
		jsclick(sr.getSearchTab());
		 Reporter.log("User click on Search tab");
		Thread.sleep(3000);
		VisiblityOf(sr.getForIndxdropdwnicon());
		 Reporter.log("User click on atleastoneofthe word submenu");
		movingclkElement(sr.getForIndxdropdwnicon());
		jsclick(sr.getForatleastoneword());
		Reporter.log("User enter the value in index contains text box");
		movingclkElement(sr.getIndexContainsSearch());
		sendvalue(sr.getIndexContainsSearch(),readFromExSearch(1, 1));
		movingclkElement(sr.getFindButton());
		Thread.sleep(10000);
		Reporter.log("Searchfunctionality with exact phrase index contains search working fine");
		jsclick(sr.getClearButton());
		log.info(" verify Index contains search:atleast one of the words search");
	}
		@Test(priority=6) // allofthe word search
	public void AllOfTheWordSearchIndex() throws Exception {
			Reporter.log("Scenario 05: Verify Search tab index contains AtleastOneOfTheWord");
		SearchFunction sr = new SearchFunction();
		Thread.sleep(5000);
		Reporter.log("User click on index contains search 'all of th word' submenu");
		movingElement(sr.getForIndxdropdwnicon());
		Reporter.log("User enter value in index contains search textbox");
		jsclick(sr.getforAllofthewords());
		sendvalue(sr.getIndexContainsSearch(),readFromExSearch(1, 0));
		Reporter.log("User click on find button");
		jsclick(sr.getFindButton());
		Thread.sleep(10000);
		Reporter.log("User click on metadata view");
		jsclick(sr.getmetaDataNum3());
		Reporter.log("Index contains search all of the word working fine...");
		Thread.sleep(10000);
		Reporter.log("User click on clear button");
		jsclick(sr.getClearButton());
		log.info(" verify Index contains search:all of the word search");
	}
	
	
	 @Test (priority=7)
		public void AllVrsn_Incldcmnt_FindInHit_AppendToHit() throws InterruptedException, IOException {
			SearchFunction sr = new SearchFunction();
			Thread.sleep(3000);
			Reporter.log("Scenario 06: Verify Search tab: Allversion");
		    movingclkElement(sr.getIndexContainsSearch());
			Reporter.log("User enter the value in index contains search text box");
			sendvalue(sr.getIndexContainsSearch(), readFromExSearch(1, 4));
			movingclkElement(sr.getFindButton());
			Reporter.log("User click on find button");
			Thread.sleep(8000);
			Reporter.log("It should listed the document on document page");
			(sr.getIndexContainsSearch()).clear();
			Reporter.log("USer clear the index contains search text box");
			Thread.sleep(3000);
			Reporter.log("User click on append to hit list check box");
			sr.getAppendToHitlist().click();
			Reporter.log("User should enter the value in index contains search text box ");
			movingclkElement(sr.getIndexContainsSearch());
			sendvalue(sr.getIndexContainsSearch(), readFromExSearch(2, 3));//dsdf
			movingclkElement(sr.getFindButton());
			Reporter.log("User click on find button");
			Thread.sleep(10000);
			Reporter.log("It should display the document first position");
			sr.getAppendToHitlist().click();
			Reporter.log("Expected result actual result same...");
			Thread.sleep(3000);
			Reporter.log("scenario 06: Verify search tab find_in_hitlist function");
			sr.getFindInHitlist().click();
			Reporter.log("USer enter the value in index contains search textbox");
			movingclkElement(sr.getFindButton());
			Reporter.log("User click on find in hitlist check box");
			Thread.sleep(3000);
			Reporter.log("USer click on find button");
			sr.getFindInHitlist().click();
			Thread.sleep(3000);
			Reporter.log("It should display only the searched document on the document page");
			sr.getIncludeComments().click();
			Reporter.log("Scneario 07: Verify include comment function");
			Thread.sleep(3000);
			Reporter.log("USer click on clear button");
			(sr.getIndexContainsSearch()).clear();
			Reporter.log("USer enter the value in text contains search text box");
			sendvalue(sr.getTextContainsSearch(), readFromExSearch(1, 3));//vidya
			movingclkElement(sr.getFindButton());
			Reporter.log("USer click on Inclue_comment check box");
			Thread.sleep(10000);
			Reporter.log("User click on find button");
			jsclick(sr.getMetadata());
			Reporter.log("It should display the document which is containing the comment..");
			Thread.sleep(8000);
			Reporter.log("Expected result and actual result is same test case passed...");
			jsclick(sr.getforComments());
			Thread.sleep(3000);
			sr.getCancelComments().click();
			Thread.sleep(5000);
			Reporter.log("User click  on clear button");
			sr.getClearButton().click();
			Thread.sleep(3000);
			Reporter.log("Scneario 08: Verify include comment function");
			movingElement(sr.getForIndxdropdwnicon());
			Reporter.log("User enter the value in index contains search text box");
			jsclick(sr.getforExactPhraseinde());
			sendvalue(sr.getIndexContainsSearch(), readFromExSearch(2,0 ));
			sr.getAllVersion().click();
			Reporter.log("User click on all version check box");
	        movingclkElement(sr.getFindButton());
	        Reporter.log("User click on find button");
	        Thread.sleep(10000);
	        jsclick(sr.getMetadata());
	        Reporter.log("It should display the version of the document");
	        Thread.sleep(3000);
	        Reporter.log("USer click on Clear button");
	        WebDriverWait wait=new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOf(sr.getforallversionshows()));
			sr.getforallversionshows().click();
			Reporter.log("All version function working fine");
			Thread.sleep(8000);
			sr.getClearButton();
			log.info(" verify Allversion/include comments/appendtohitlist /find in hit list functionality working fine");
		}
	
	@Test(priority=8) // Cabinet/drawer/folder level search in search document location
	public void FolderLevelSearch() throws InterruptedException {
		Reporter.log("Scneario 10: Verify Search document location folder level");
		SearchFunction sr = new SearchFunction();
		act=new Actions(driver);
		Reporter.log("USer click on search tab");
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		Reporter.log("User click on search location textbox");
		movingElement(sr.getSearchlocation());// used base class
		Reporter.log("User expand a cabinet");
		jsclick(sr.getSearchlocation());
		Reporter.log("USer click on select search location dialog OK button");
	    act.doubleClick(sr.getCabinet()).perform();
		Thread.sleep(3000);
		Reporter.log("User expand a drawer");
		act.moveToElement(sr.getDrawer());// used base class
		act.doubleClick(sr.getDrawer()).perform();
		Reporter.log("User select a folder");
		Thread.sleep(3000);
	    act.moveToElement(sr.getFolder()).perform();
		act.doubleClick(sr.getFolder()).perform();
		Reporter.log("USer click on search location dialog OK button");
		jsclick(sr.getOKbuttonforsearchlocation());
		Reporter.log("USer click on find button");
		jsclick(sr.getFindButton());
		Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
		Reporter.log("It should display the particular selected folder documents on the page");
		Thread.sleep(10000);
		Reporter.log("Expected actual same TC passed...");
		jsclick(sr.getClearButton());
		log.info("Cabinet/drawer/folder level search in search document location working fine");
	}

	@Test(priority=9) // Cabinet/drawer/ level search in search document location
	public void DrawerLevelSearch() throws InterruptedException {
		Reporter.log("Scneario 11: Verify Search document location drawer level");
		SearchFunction sr = new SearchFunction();
		act=new Actions(driver);
		Reporter.log("USer click on search tab");
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		Reporter.log("User click on search location textbox");
		movingElement(sr.getSearchlocation());// used base class
		Reporter.log("User expand a cabinet");
		jsclick(sr.getSearchlocation());
		Reporter.log("USer click on select search location dialog OK button");
	    act.doubleClick(sr.getCabinet()).perform();
		Thread.sleep(3000);
		Reporter.log("User expand a drawer");
		movingElement(sr.getDrawer());// used base class
		act.doubleClick(sr.getDrawer()).perform();
		Thread.sleep(3000);
		Reporter.log("USer click on search document location OK button");
		jsclick(sr.getOKbuttonforsearchlocation());
		Reporter.log("USer click on find button");
		jsclick(sr.getFindButton());
		Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
		Reporter.log("IT should display the particular draer document on the page");
        Thread.sleep(10000);
        Reporter.log("Actual and expected same...TC passed");
		jsclick(sr.getClearButton());
		log.info("Cabinet/drawer/ level search in search document location working fine");
	}

	@Test(priority=10) // Cabinet level search in search document location
	public void CabinetLevel() throws InterruptedException {
		Reporter.log("Scneario 12: Verify Search document location cabinet level");
		SearchFunction sr = new SearchFunction();
		act=new Actions(driver);
		Reporter.log("USer click on search tab");
		jsclick(sr.getSearchTab());
		Thread.sleep(5000);
		Reporter.log("User click on search location textbox");
		movingElement(sr.getSearchlocation());// used base class
		Reporter.log("User expand a cabinet");
		jsclick(sr.getSearchlocation());
		Reporter.log("USer click on select search location dialog OK button");
	    act.doubleClick(sr.getCabinet()).perform();
		Thread.sleep(3000);
		jsclick(sr.getOKbuttonforsearchlocation());
		jsclick(sr.getFindButton());
		Reporter.log("USer click on find button");
		Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
		applyWaitsForAll();
		Reporter.log("It should display the searched cabinet document on the page");
		Thread.sleep(10000);
		Reporter.log("Expected actuall result same.. Test Case passed");
		jsclick(sr.getClearButton());
		
		log.info("Cabinet level search in search document location working fine");
	}
	
 @Test (priority=11)
	public void DocumentDropDown() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 13: Verify search tab document type dropdown");
        movingclkElement(sr.getforSelectDocdropdownicon());
        Reporter.log("USer click on document type dropdown");
       sr.getforSelectDocdropdown().sendKeys(readFromExSearch(1, 2));
       Thread.sleep(3000);
       Reporter.log("User should select document type");
	    movingclkElement(sr.getforCVReports());
	    jsclick(sr.getFindButton());
	    Reporter.log("USer click on find button");
	    Thread.sleep(10000);
	    Reporter.log("It should display the searched document type documents");
		jsclick(sr.getClearButton());
		Reporter.log("Expected reuslt actual result same...TC passed");
		log.info("Select document type dropdown: Enter CVReport and click cvreports it shows the cvreports documents.");
		}
@Test (priority=12)// enter value in field and select the user
	public void DocumentCreatorDropDown() throws Exception {
	Reporter.log("Scenario 14:Verify Select document creator dropdown");
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		Reporter.log("User click on search tab");
		Thread.sleep(5000);
        movingclkElement(sr.getforSelectcreatordropdown());
        Reporter.log("USer select document creator from the dropdonw");
		sr.getforSelectcreatordropdownicon().sendKeys(readFromExSearch(1, 4));
		Thread.sleep(3000);
		Reporter.log("USer click on find button");
		movingclkElement(sr.getforNishacreator());
		sr.getFindButton().click();
		Reporter.log("It should display the searched creator documents on the page");
		Thread.sleep(10000);
		sr.getClearButton().click();
		log.info("Document Creator dropdown working fine..");

}

	@Test(priority=13)
	public void WorkflowStatusDropdown() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 14:Verify Search tab workflow status dropdown Reject submenu");
        WebDriverWait wait=new WebDriverWait(driver,30);
        Reporter.log("User click on workflow status dropdown");
		wait.until(ExpectedConditions.elementToBeClickable(sr.getforworkflowdropdown()));
		(sr.getforworkflowdropdown()).click();
		Reporter.log("User select reject submenu");
        (sr.getforworkflowReject()).click();
        Reporter.log("User click on find button");
        jsclick(sr.getFindButton());
        Reporter.log("It should display the rejected workflow documents on the page");
        Thread.sleep(15000);
		jsclick(sr.getClearButton());
		Reporter.log("USer click on clear button");
		log.info("workflow rejected: documents displayed successfully");
		Reporter.log("Scenario 15: Verify workflow status dropdown pending submenu");
		(sr.getforworkflowdropdown()).click();// pending
		Reporter.log("USer select a workflow dropdown pending status");
		(sr.getforworkflowPending()).click();
		Reporter.log("USer click on find button");
		jsclick(sr.getFindButton());
		Reporter.log("It should display the wrokflow status pending documents on the page");
		Thread.sleep(8000);
		
		jsclick(sr.getClearButton());
		log.info("workflow pending: documents displayed successfully");

		(sr.getforworkflowdropdown()).click();
		Reporter.log("Scenario 16: Verify workflow status dropdown workflow completed submenu");
		(sr.getforworkflowCompleted()).click();
		Reporter.log("USer select a workflow dropdown  workflow completed status");
	    jsclick(sr.getFindButton());
	    Reporter.log("USer click on find button");
		Thread.sleep(8000);
		Reporter.log("It should display the wrokflow completed documents on the page");
		jsclick(sr.getClearButton());
		Thread.sleep(3000);
		log.info("workflow completed: documents displayed successfully");

		(sr.getforworkflowdropdown()).click();// Endworkflow
		Reporter.log("Scenario 17: Verify workflow status dropdown EndWorkflow submenu");
		(sr.getforworkflowEndWorkflow()).click();
		Reporter.log("USer select a workflow dropdown  endworkflow status");
		jsclick(sr.getFindButton());
		Reporter.log("USer click on find button");
		Thread.sleep(8000);
		jsclick(sr.getClearButton());
		Reporter.log("It should display the workflow ended documents on the page");
		Thread.sleep(8000);
		log.info("end workflow: documents displayed successfully");

		(sr.getforworkflowdropdown()).click();
		Reporter.log("Scenario 18: Verify workflow status dropdown Task completed submenu");
		(sr.getforworkflowTaskcomplete()).click();// taskcompleted
		Reporter.log("USer select a workflow dropdown  Task completed status");
		jsclick(sr.getFindButton());
		Reporter.log("USer click on find button");
		Thread.sleep(8000);
		jsclick(sr.getClearButton());
		Thread.sleep(3000);
		Reporter.log("It should display the Task completed documents on the page");
		log.info("task completed: documents displayed successfully");
}

//	@Test(priority=14)
	public void CreatedFromToModifiedFromTo() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(sr.getCreatedFrom()));
		movingclkElement(sr.getCreatedFrom());
		movingclkElement(sr.getCreatedfromdate());
		jsclick(sr.getDatePickerOKBTN());
		Thread.sleep(3000);
		movingclkElement(sr.getCreatedTo());
		Thread.sleep(3000);
		movingclkElement(sr.getforCreatedToDate());
		jsclick(sr.getDatePickerOKBTN());
		Thread.sleep(3000);
		jsclick(sr.getFindButton());
		Thread.sleep(8000);
		jsclick(sr.getClearButton());
		log.info("Created from and created To date: document displayed successfully");
		movingclkElement(sr.getModifiedFrom());
		Thread.sleep(3000);
		movingclkElement(sr.getModifiedfromdate());
		Thread.sleep(3000);
		jsclick(sr.getDatePickerOKBTN());
		Thread.sleep(3000);
		movingclkElement(sr.getModifiedTo());
		Thread.sleep(2000);
		movingclkElement(sr.getModifiedTodate());
		jsclick(sr.getDatePickerOKBTN());
		
		Thread.sleep(3000);
		jsclick(sr.getFindButton());
		Thread.sleep(10000);
		jsclick(sr.getClearButton());
		log.info("Modify from and modify To date: documents displayed successfully");
	}

	

	@Test(priority=15) // showing saved documents
	public void SavingTheSearchDoc() throws InterruptedException, IOException {
		Reporter.log("Scenario 18:Verify Select saved search function");
		SearchFunction sr = new SearchFunction();
		jsclick(sr.getSearchTab());
		Reporter.log("User select search tab");
		jsclick((sr.getsaveDropdown()));
		Reporter.log("User click on new search");
		Thread.sleep(3000);
        sr.getnewsearch().click();
        Reporter.log("USer enter name for new saved search");
		sr.getnewsearchvalueenter().sendKeys(readFromExSearch(3, 0));
		Thread.sleep(5000);
		Reporter.log("USer enter value in index contains search textbox");
		sendvalue(sr.getIndexContainsSearch(), readFromExSearch(1, 3));
		 movingclkElement(sr.getforSelectDocdropdownicon());
		 Reporter.log("USer select document data type");
	     sr.getforSelectDocdropdown().sendKeys(readFromExSearch(1, 2));
	     Thread.sleep(3000);
	     Reporter.log("User selecct a document creator ");
		 movingclkElement(sr.getforCVReports());
		sr.getFindButton().click();
		Thread.sleep(5000);
		Reporter.log("USer click on save icon");
		movingElement(sr.getsavebotton());
		
		jsclick(sr.getsavebotton());
		Thread.sleep(3000);
		movingclkElement((sr.getsavedNamecheck()));
		Reporter.log("Mouse hover on saved select search ");
		Thread.sleep(5000);
		Reporter.log("USer click on find");
		sr.getClearButton().click();
		Reporter.log("IT should display the document on the page");
		Reporter.log("search documents saved functionality working fine");
	}

	@Test(priority=19) // TreeIcon search
	public void FolderSerchIcon() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Click on search text");
		jsclick(sr.getfornavigatetofoldersearch());
		Thread.sleep(3000);
		Reporter.log("Enter value on search textbox");
		sr.getsearchTree().sendKeys(readFromExSearch(1, 3));
		Thread.sleep(5000);
		Reporter.log("USer click on ENTER key");
		sr.getsearchTree().sendKeys(Keys.RETURN);// tree search
		Thread.sleep(10000);
		Reporter.log("It should display the documents on the page");
		WebElement CloseIcon = driver.findElement(By.xpath("//*[@id=\"FolderSearchModelHeaderClose\"]"));
		jsclick(CloseIcon);
		Reporter.log("User click on close icon");
		Thread.sleep(4000);
		log.info("TreeIcon search functionality works fine");
		

	}

	@Test(priority=20) // Quick search
	public void QuickSearch() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.getquicksearch().sendKeys(readFromExSearch(2, 1));
        Thread.sleep(3000);
		sr.getquicksearch().sendKeys(Keys.RETURN);
		Thread.sleep(15000);
		SoftAssert so = new SoftAssert();
		String PageTitle = driver.getTitle();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(sr.getquicksearch()));
		so.assertTrue(PageTitle.contains(readFromExSearch(2, 4)));
		log.info("quick search icon works fine");
		Reporter.log("quick search works fine");
		jsclick(Refresh_Button(driver));
	}
	@Test(priority=21)
	public void DocumentSearch() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.SearchDocumentsTabInPage();
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		Reporter.log("The documents Search from folder completed, working fine");
		log.info("The documents Search from folder completed, working fine");
}
}
