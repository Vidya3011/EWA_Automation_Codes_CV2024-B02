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
import org.openqa.selenium.JavascriptException;
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

	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser started Successfully...");
	
		launchUrl();
	//	launchLocalUrl();
		log.info("CVS URL started Successfully...");
	}

	@Test(priority=1)
	public void A_ACVSLogin() throws Exception {
		
		loginCVS();
	//	loginLocalCVS();
		 log.info("CVS User is logged in successfully...");
	}

	 
		@Test (priority=2)// blank search
		public void A_BlankSearch() throws InterruptedException {
			 Reporter.log("Scenario 01: Search tab - blank search");
			SearchFunction sr = new SearchFunction();
			sr.BlankSearch();
			
			log.info("verify Blank search.");
		}

    @Test(priority=3) 
	public void B_ExactSearchInIndexWithLoadMoreCount() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		sr.ExactSearchInIndexWithLoadMoreCount();
		
		log.info("Searchfunctionality with exact phrase index search with load more count");
		
		
   }
    @Test(priority=4)
     public void C_ExactSearchInIndex() throws Exception {
 		SearchFunction sr = new SearchFunction();
 		sr.ExactSearchInIndex();
 		log.info("Search tab: Exact phrase index contains search working fine");
		
     }
    
     	@Test(priority=16) // AlloftheWords search
	public void N_TextSearchWithSQLData() throws InterruptedException, IOException {
		SearchFunction sr = new SearchFunction();
		sr.TextSearchWithSQLData();
		
		log.info(" verify Search text contains functionality with all of the words option.");
	}
    	@Test(priority=17) // AlloftheWords search
    	public void O_TextSearchWithAllOftheWords() throws InterruptedException, IOException {
    		
    		SearchFunction sr = new SearchFunction();
    		sr.TextSearchWithAllOftheWords();
    		
    		log.info(" verify Search text contains functionality with all of the words option.");
    	}
    	@Test(priority=18) // AlloftheWords search
    	public void P_TextSearchWithAtpartOftheWord() throws InterruptedException, IOException {
    		
    		SearchFunction sr = new SearchFunction();
    		sr.TextSearchWithAtpartOftheWord();
    		
    		log.info(" verify Search text contains functionality with all of the words option.");
    	}
     	
    	
     	


	

	@Test (priority=5)// atleast one word
	public void D_AtLeastOneWordSeachIndex() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.AtLeastOneWordSeachIndex();
		log.info(" verify Index contains search:atleast one of the words search");
	}
		@Test(priority=6) // allofthe word search
	public void E_AllOfTheWordSearchIndex() throws Exception {
			
		SearchFunction sr = new SearchFunction();
		sr.getForallofthewordsinText();
		log.info(" verify Index contains search:all of the word search");
	}
	
	
	 @Test (priority=7)
		public void F_AllVrsn_Incldcmnt_FindInHit_AppendToHit() throws InterruptedException, IOException {
			SearchFunction sr = new SearchFunction();
			sr.AllVrsn_Incldcmnt_FindInHit_AppendToHit();
			log.info(" verify Allversion/include comments/appendtohitlist /find in hit list functionality working fine");
		}
	
	@Test(priority=8) // Cabinet/drawer/folder level search in search document location
	public void G_FolderLevelSearch() throws InterruptedException {
		
		SearchFunction sr = new SearchFunction();
		sr.FolderLevelSearch();
		log.info("Cabinet/drawer/folder level search in search document location working fine");
	}

	@Test(priority=9) // Cabinet/drawer/ level search in search document location
	public void H_DrawerLevelSearch() throws InterruptedException {
		
		SearchFunction sr = new SearchFunction();
		sr.DrawerLevelSearch();
		log.info("Cabinet/drawer/ level search in search document location working fine");
	}

	@Test(priority=10) // Cabinet level search in search document location
	public void I_CabinetLevel() throws InterruptedException {
		
		SearchFunction sr = new SearchFunction();
		sr.CabinetLevel();
		
		log.info("Cabinet level search in search document location working fine");
	}
	
 @Test (priority=11)
	public void J_DocumentDropDown() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.DocumentDropDown();
		log.info("Select document type dropdown: Enter CVReport and click cvreports it shows the cvreports documents.");
		}
@Test (priority=12)// enter value in field and select the user
	public void K_DocumentCreatorDropDown() throws Exception {
	Reporter.log("Scenario 14:Verify Search tab  ('document creator')");
		SearchFunction sr = new SearchFunction();
		sr.DocumentCreatorDropDown();
		log.info("Document Creator dropdown working fine..");

}

	@Test(priority=13)
	public void L_WorkflowStatusDropdown() throws InterruptedException {
		SearchFunction sr = new SearchFunction();
		sr.WorkflowStatusDropdown();
}


	

	@Test(priority=15) // showing saved documents
	public void M_SavingTheSearchDoc() throws InterruptedException, IOException {
		
		SearchFunction sr = new SearchFunction();
		sr.SavingTheSearchDoc();
	}

	@Test(priority=19) // TreeIcon search
	public void Q_FolderSerchIcon() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.FolderSerchIcon();
		log.info("TreeIcon search functionality works fine");
		

	}

	@Test(priority=20) // Quick search
	public void R_QuickSearch() throws Exception {
		SearchFunction sr = new SearchFunction();
		sr.QuickSearch();
		log.info("quick search icon works fine");
	//	Reporter.log("quick search works fine");
		
	}
	@Test(priority=21)
	public void S_DocumentSearch() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 24:Folder document search");
		sr.SearchDocumentsTabInPage();
		
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		Reporter.log("The documents Search from folder completed, working fine");
		log.info("The documents Search from folder completed, working fine");
}
}
