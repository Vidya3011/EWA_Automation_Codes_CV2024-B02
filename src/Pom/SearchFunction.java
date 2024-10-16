package Pom;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.BaseClass;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class SearchFunction extends BaseClass {

	public static WebElement element = null;

	public SearchFunction() {
		PageFactory.initElements(driver, this);
	}

	public String getSearchString() {
		String searchVal = "";
		// JDBC URL, username, and password of MySQL server
		String jdbcUrl = "jdbc:sqlserver://10.4.8.13:1433;DatabaseName=CV2024B2_64bitDB;SelectMethod=direct;";
		String username = "sa";
		String password = "Cipl@2024!";

		try {
			// Load Microsoft SQL JDBC driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Create a connection to the database
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

			// Create a statement object
			Statement statement = connection.createStatement();

			// Define your SQL query
			String sqlQuery1 = "ALTER FULLTEXT INDEX ON Indexer START FULL POPULATION";
			String sqlQuery2 = "Select * from Indexer ";

			// Execute the query and get the result set
			ResultSet resultSet = statement.executeQuery(sqlQuery2);

			// Process the result set

			while (resultSet.next()) {
				// int id = resultSet.getInt("id");
				// String Nodeid = resultSet.getString("Nodeid");
				// int PageNo=resultSet.getInt("PageNo");
				String pagecontents = resultSet.getString("PageContents");

				// Add more columns as needed

				// Print the data
				System.out.println("PageContents" + pagecontents);
				// System.out.println("ID: " + id + ", Nodeid: " + Nodeid+ "PageContents"
				// +pagecontents);
				searchVal = pagecontents.substring(0, pagecontents.indexOf(" "));
				if (searchVal != null && searchVal.length() > 0) {
					System.out.println("SearchVal: " + searchVal);
					break;
				}
			}

			// Close resources
			resultSet.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchVal;
	}

	public String searchStringSQL() {
		String searchVal = "";
		// JDBC URL, username, and password of MySQL server
		String jdbcUrl = "jdbc:sqlserver://10.4.8.13:1433;DatabaseName=CV2024B2_64bitDB;SelectMethod=direct;";
		String username = "sa";
		String password = "Cipl@2024!";

		try {
			// Load Microsoft SQL JDBC driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Create a connection to the database
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

			// Create a statement object
			Statement statement = connection.createStatement();

			// Define your SQL query
			String sqlQuery1 = "ALTER FULLTEXT INDEX ON Indexer START FULL POPULATION";
			String sqlQuery2 = "Select * from Indexer ";

			// Execute the query and get the result set
			ResultSet resultSet = statement.executeQuery(sqlQuery2);

			// Process the result set

			while (resultSet.next()) {
				// int id = resultSet.getInt("id");
				// String Nodeid = resultSet.getString("Nodeid");
				// int PageNo=resultSet.getInt("PageNo");
				String pagecontents = resultSet.getString("PageContents");

				// Add more columns as needed

				// Print the data
				System.out.println("PageContents" + pagecontents);
				// System.out.println("ID: " + id + ", Nodeid: " + Nodeid+ "PageContents"
				// +pagecontents);
				searchVal = pagecontents.substring(21, 28);
				if (searchVal != null && searchVal.length() > 0) {
					System.out.println("SearchVal: " + searchVal);
					break;
				}
			}

			// Close resources
			resultSet.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchVal;
	}

	@FindBy(xpath = ("//a[@id='advSearchMenuBtn']"))
	private WebElement SearchTab;

	@FindBy(id = ("clearSearchBtnLabel"))
	private WebElement ClearButton;

	@FindBy(xpath = ("(//input[@id='indexPhrase1'])[1]"))
	private WebElement IndexContainsSearch;

	@FindBy(xpath = ("//input[@id='indexPhrase2']"))
	private WebElement TextContainsSearch;

	@FindBy(xpath = ("//span[@id='docTypeSpan']"))
	private WebElement SearchDoctype;

	@FindBy(xpath = ("//span[@id='docCreatorSpan']"))
	private WebElement SearchDocCreator;

	@FindBy(xpath = ("//input[@id='createdDateFrom']"))
	private WebElement CreatedFrom;

	@FindBy(xpath = ("(//img[@id='labelSearchImage2'])[1]"))
	private WebElement fortextcontainsdrpdwnicon;

	@FindBy(xpath = ("//li[@id='textOptionMenu_0']"))
	private WebElement forallofthewordsinText;

	@FindBy(xpath = ("(//li[@id='textOptionMenu_2'])[1]"))
	private WebElement foratleasetoneofthewordText;

	@FindBy(xpath = ("(//li[@id='textOptionMenu_3'])[1]"))
	private WebElement forAtpartofthewordText;

	@FindBy(xpath = ("(//li[@id='indexOptionMenu_0'])[1]"))
	private WebElement forAllofthewords;

	@FindBy(xpath = ("(//input[@id='folderLocationForSearch'])[1]"))
	private WebElement Searchlocation;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[2]/a"))
	private WebElement cabinet;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[2]/ul/li[1]/a"))
	private WebElement drawer;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[2]/ul/li/ul/li[1]/a"))
	private WebElement folder;

	@FindBy(id = ("navigatorTreeOk1"))
	private WebElement OKbuttonforsearchlocation;

	@FindBy(xpath = ("(//th[text()='DOCUMENT NAME'])[5]"))
	private WebElement softAssertValidation;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[2]")) // Change the number
	private WebElement forCVReports;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[2]"))
	private WebElement forCVReportsCSR;

	@FindBy(xpath = ("(//div[@class='elementHeader'])[3]"))
	private WebElement forComments;

	@FindBy(xpath = ("(//div[@class='elementHeader'])[5]"))
	private WebElement forallversionshows;

	@FindBy(xpath = ("//*[@id=\"cancelComments\"]"))
	private WebElement CancelComments;

	@FindBy(xpath = ("//li[text()='aaa']"))
	private WebElement foraaaDoc;

	@FindBy(xpath = ("//input[@class='e-input-filter e-input']"))
	private WebElement forSelectcreatordropdownicon;

	@FindBy(xpath = ("(//select[@class='e-multi-hidden'])[2]"))
	private WebElement forSelectcreatordropdown;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[4]")) // u can change the number to change the
																			// user//vwadmin
	private WebElement forNishacreator;// *[@class=\"e-content e-dropdownbase\"]/ul/li[12]//apurba

	@FindBy(xpath = ("//input[@class='e-input-filter e-input']"))
	private WebElement forSelectDocdropdown;

	@FindBy(xpath = ("//*[@id=\"searchArea\"]/fieldset/div[6]/div[1]/div/div/span[5]"))
	private WebElement forSelectDocdropdownicon;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[1]"))
	private WebElement forworkflowReject;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[2]"))
	private WebElement forworkflowPending;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[3]"))
	private WebElement forworkflowCompleted;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[4]"))
	private WebElement forworkflowEndWorkflow;

	@FindBy(xpath = ("//*[@class='e-content e-dropdownbase']/ul/li[5]"))
	private WebElement forworkflowTaskcomplete;

	@FindBy(xpath = ("//a[@id='myTaskMenu']"))
	private WebElement TodolistTab;

	@FindBy(xpath = ("//a[@id='newItems']"))
	private WebElement NewItems;

	// forSeconndDochtml[1]/body[1]/div[56]/div[59]/div[4]/div[2]/div[4]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[3]

	@FindBy(xpath = ("(//td[@class=' document-option'])[5]"))
	private WebElement OpenDocumentForTodoSearch;

	@FindBy(xpath = ("(//a[normalize-space()='Update'])[1]"))
	private WebElement UpdateProperties;

	@FindBy(xpath = ("//*[@id=\"searchDynamicUser\"]"))
	private WebElement findBTN;

	@FindBy(xpath = ("//*[@id=\"spanCheckDynamicUser_ram\"]"))
	private WebElement RamUSer;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeCancle5\"]"))
	private WebElement OKBTNADDName;

	@FindBy(xpath = ("(//a[normalize-space()='Save'])[1]"))
	private WebElement PropertiesUpdateSaveBTN;

	@FindBy(xpath = ("//*[@id=\"CommentsMessageModelOk\"]"))
	private WebElement UpdateDialogOKBTN;

	@FindBy(xpath = ("//*[@id=\"55\"]"))
	private WebElement DynamicNewDoc;

	@FindBy(xpath = ("(//span[@id='viewSendToWrkflw'])[1]"))
	private WebElement sendToWf;

	@FindBy(xpath = ("(//td[normalize-space()='Dynamic wf new'])[1]"))
	private WebElement dynamicwfnew;

	@FindBy(xpath = ("(//button[@id='sidbisendworkflowOk'])[1]"))
	private WebElement applyBTN;

	@FindBy(xpath = ("(//button[@id='CommentsMessageModelOk'])[1]"))
	private WebElement sendwfsuccessdialogOKBTN;

	@FindBy(id = ("Val_305"))
	private WebElement TextKey;

	@FindBy(xpath = ("//*[@id=\"Val_306\"]"))
	private WebElement User1;

	@FindBy(xpath = ("(//select[@id='viewDocumentTypeList'])[1]"))
	private WebElement docTypeDropDown;

	@FindBy(xpath = ("//*[@id=\"searchDynamicUser\"]"))
	private WebElement findbtn;

	@FindBy(xpath = ("//*[@id=\"spanCheckDynamicUser_vidya\"]"))
	private WebElement User1Vidya;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeCancle5\"]"))
	private WebElement usergrpOKBtn;

	@FindBy(xpath = ("//*[@id=\"Val_307\"]"))
	private WebElement User2;

	@FindBy(xpath = ("//*[@id=\"spanCheckDynamicUser_RNisha\"]"))
	private WebElement RNishaUser;

	@FindBy(xpath = ("//*[@id=\"Val_308\"]"))
	private WebElement User3;

	@FindBy(xpath = ("//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]"))
	private WebElement Open1stDocument;

	@FindBy(xpath = ("//*[@id=\"cvDocumentClose\"]/span"))
	private WebElement PageCloseIcon;

	@FindBy(xpath = ("//*[@id=\"searchArea\"]/fieldset/div[8]/div/span"))
	private WebElement forworkflowdropdown;

	public WebElement getforworkflowdropdown() {
		return forworkflowdropdown;
	}

	public WebElement getForallofthewordsinText() {
		return forallofthewordsinText;
	}

	@FindBy(xpath = ("//*[@id=\"1\"]/a"))
	private WebElement cabinetCSR;

	@FindBy(xpath = ("//*[@id=\"2\"]/a"))
	private WebElement drawerCSR;

	@FindBy(xpath = ("//*[@id=\"3\"]/a"))
	private WebElement folderCSR;

	@FindBy(xpath = ("//input[@id='indexPhrase2']"))
	private WebElement forExactPhraseText;

	@FindBy(xpath = ("//li[@id='indexOptionMenu_1']"))
	private WebElement forExactPhraseinde;

	@FindBy(xpath = ("//a[@id='navigationMenuBtn']"))
	private WebElement fornavigatetofoldersearch;

	@FindBy(id = ("searchTree"))
	private WebElement searchTree;

	@FindBy(id = ("search-text"))
	private WebElement quicksearch;

	@FindBy(xpath = ("/html/body/div[62]/div[2]/div[2]/table/tbody/tr[2]/td[5]"))
	private WebElement CreatedToDate;

	@FindBy(xpath = ("/html/body/div[63]/div[2]/div[2]/table/tbody/tr[1]/td[6]"))
	private WebElement Createdfromdate;

	@FindBy(xpath = ("//*[@id=\"mc-btn__ok\"]"))
	private WebElement DatePickerOKBTN;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[1]/td[2]"))
	private WebElement Metadata;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[2]/td[2]"))
	private WebElement MetadataSearch;

	public void getRandomSelectDoc() throws Exception {

		List<WebElement> names = driver.findElements(By.id("searchDiv1"));
		for (WebElement allname : names) {
			String options = allname.getText();
			if (options.contains("123")) {
				jsclick(metaDataNum2);
				break;
			}

		}

	}
	
	@FindBy(xpath = ("//button[@id='ownershipMessageModelOk']"))
	private WebElement Lockeddoc;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ins"))
	private WebElement Cabinet1;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li/ins"))
	private WebElement Drawer2;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li/ul/li/a"))
	private WebElement FolderVidya;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr/td[3]")
	private WebElement SearchDocOpen;

	@FindBy(xpath = "(//input[@id='tableFilter'])[1]")
	private WebElement DocIdSearch;

	public void SearchDocumentsTabInPage() throws Exception {
		Thread.sleep(3000);
		Reporter.log("Open a folder");
		jsclick(Cabinet1);
		Thread.sleep(3000);
		Reporter.log("Enter document name in folder search text box");
		jsclick(Drawer2);
		Thread.sleep(2000);
		selectElement(FolderVidya);
		Reporter.log("It should display the particular document on the page");
		Thread.sleep(8000);

		jsclick(DocIdSearch);
		Thread.sleep(4000);
		DocIdSearch.sendKeys(readFromExSearch(3, 2));
		Thread.sleep(8000);
		// Thread.sleep(4000);
		DocIdSearch.clear();
		Thread.sleep(3000);
		DocIdSearch.sendKeys(readFromExSearch(3, 3));
		Thread.sleep(7000);
		DocIdSearch.clear();
		DocIdSearch.sendKeys(readFromExSearch(3, 4));
		Thread.sleep(8000);
		DocIdSearch.clear();
		DocIdSearch.sendKeys(readFromExSearch(3, 5));
		Thread.sleep(7000);
	}

	public void SearchDocumentsInTodolistsearchtab() throws Exception {
		WebElement ele = (DocIdSearch);
		jsclick(ele);
		Thread.sleep(4000);
		ele.sendKeys("TestingDemoForSearchTodo");
		Thread.sleep(8000);
	}

	@FindBy(xpath = ("/html/body/div[62]/div[2]/div[2]/table/tbody/tr[2]/td[3]"))
	private WebElement Modifiedfromdate;

	@FindBy(xpath = ("/html/body/div[62]/div[2]/div[2]/table/tbody/tr[2]/td[5]"))
	private WebElement ModifiedTodate;

	@FindBy(xpath = ("(//input[@id='ModifiedDateFrom'])[1]"))
	private WebElement ModifiedFrom;

	@FindBy(xpath = ("(//input[@id='ModifiedDateTo'])[1]"))
	private WebElement ModifiedTo;

	@FindBy(id = ("savedSearchName"))
	private WebElement saveDropdown;

	@FindBy(xpath = ("//img[@id='saveBtnForSaveSearchName']"))
	private WebElement savebotton;

	@FindBy(xpath = ("(//option[@value='0'])[5]"))
	private WebElement newsearch;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[1]/td[3]"))
	private WebElement opendocfortext;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[1]/td[3]"))
	private WebElement opendocfortextSQL;

	@FindBy(xpath = ("//*[@id=\"docViewerMetaData\"]"))
	private WebElement newdocscroll;

	@FindBy(xpath = ("//*[@id=\"Screenshot_OTP.jpg\"]/div/img"))
	private WebElement highlightdocview;

	public static void ScrollDownBTNText() {
		WebElement scroll = driver.findElement(By.xpath("(//canvas[@class='lt-imageviewer-eventcanvas'])[1]"));
		scrollDown(scroll);

	}

	public static void ScrollDownButton() {
		WebElement scroll = driver.findElement(By.xpath("(//button[normalize-space()='LOAD MORE...'])[1]"));
		scrollDown(scroll);

	}

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[1]/td[3]"))
	private WebElement opendocforallwrdtext;

	@FindBy(xpath = ("(//button[normalize-space()='LOAD MORE...'])[1]"))
	private WebElement loadMore;

	@FindBy(id = ("newSavedSearchName"))
	private WebElement newsearchvalueenter;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[4]/td[2]"))
	private WebElement inMiddleDocOFSeachMetaData;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[19]/td[2]"))
	private WebElement afterLoadmoreSeachMetaData;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[2]/td[2]"))
	private WebElement metaDataNum2;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[5]/td[2]"))
	private WebElement metaDataNum3;

	@FindBy(xpath = ("//*[@id='searchListTable']/tbody/tr[4]/td[3]"))
	private WebElement forRandomdocOpen;

	@FindBy(xpath = ("//select[@id='savedSearchName']"))
	private WebElement savedNamecheck;

	@FindBy(xpath = ("//input[@id='createdDateTo']"))
	private WebElement CreatedTo;

	@FindBy(xpath = ("//input[@id='allVersions']"))
	private WebElement AllVersion;

	@FindBy(xpath = ("//input[@id='includeComment']"))
	private WebElement IncludeComments;

	@FindBy(xpath = ("//input[@id='appendToHitList']"))
	private WebElement AppendToHitlist;

	@FindBy(xpath = ("//input[@id='findInHitList']"))
	private WebElement FindInHitlist;

	@FindBy(xpath = ("//button[@id='advFindBtnLabel']"))
	private WebElement FindButton;

	@FindBy(xpath = ("(//img[@id='labelSearchImage1'])[1]"))
	private WebElement forIndxdropdwnicon;

	@FindBy(xpath = ("(//li[@id='indexOptionMenu_2'])[1]"))
	private WebElement foratleastoneword;

	public void BlankSearch() throws InterruptedException {
		Reporter.log("Scenario 01: Search tab - blank search");
		SearchFunction sr = new SearchFunction();
		Thread.sleep(3000);
		Reporter.log("User click on Search tab");
		jsclick(SearchTab);
		Thread.sleep(5000);
		Reporter.log("Click on find button");
		jsclick(FindButton);
		Thread.sleep(10000);
		Reporter.log("It should list all the document successfully...");
		jsclick(ClearButton);
		Reporter.log("Click on clear button");
		Reporter.log("Searched document list cleared successfull");

	}

	public void ExactSearchInIndexWithLoadMoreCount() throws InterruptedException, IOException {
		Thread.sleep(2000);

		jsclick(SearchTab);
		Reporter.log("Scenario 02: Search - load more count");
		Reporter.log("User click on Search tab");
		Thread.sleep(5000);

		Reporter.log("Click on find button");
		jsclick(FindButton);
		Thread.sleep(8000);
	//	scrollDown(inMiddleDocOFSeachMetaData);
		Thread.sleep(3000);

		try {
		jsclick(inMiddleDocOFSeachMetaData);

		Reporter.log("Scroll down the searched list,now user can able to see the 'loadmore' button");

		ScrollDownButton();
		Thread.sleep(5000);
		Reporter.log("Click on load more button");
		jsclick(loadMore);
		Thread.sleep(4000);
		scrollDown(afterLoadmoreSeachMetaData);
		Thread.sleep(5000);
		jsclick(afterLoadmoreSeachMetaData);
		Thread.sleep(8000);
		Reporter.log("Scroll down the searched list,again it will show the 'load more' button");
		Reporter.log("Click on load more button again");
		ScrollDownButton();
		jsclick(loadMore);
		Thread.sleep(3000);
		}
		
	
		
		catch (Exception e) {
			Reporter.log("Document not listed");
		}
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("NoAlertIsPresent");
		}
		Reporter.log("It should show 'no more data found' warning alert, Warning alert displayed successfull");
		Thread.sleep(8000);
		Reporter.log("Click on OK button");
		Reporter.log("It should close the Alert dialog successfull");
		jsclick(ClearButton);
		Reporter.log("Click on clear button");
		// log.info("Searchfunctionality with exact phrase index search with load more
		// count");

	}

	
	public void ExactSearchInIndex() throws Exception {


		Reporter.log("Scenario 03: Search tab - Index search contains 'Exact Phrase'");
		jsclick(SearchTab);
		Reporter.log("User click on search tab");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(IndexContainsSearch).click().build().perform();
		Reporter.log("Enter value on index search contains textbox");
		IndexContainsSearch.sendKeys(readFromExSearch(3, 1));
		Thread.sleep(5000);
		Reporter.log("Click on find button");
		jsclick(FindButton);
		Reporter.log("It should list the document on the page, document displayed successfull...");
		Thread.sleep(8000);
		// Reporter.log("Search tab: Exact phrase index contains search working fine");
		Reporter.log("Search tab: Exact phrase index contains search working fine");
		getRandomSelectDoc();
		Thread.sleep(10000);
		Reporter.log("Click on Clear button");
		Reporter.log("It should clear the searched document list successfully");
		jsclick(ClearButton);
		Thread.sleep(3000);

	}

	// AlloftheWords search
	public void TextSearchWithSQLData() throws InterruptedException, IOException {

		Reporter.log("Scenario 19:Search tab- TextContains search 'alloftheword' option");
		Reporter.log(
				"NOTE:Start the indexer server then execute the mentioned SQL statement 'ALTER FULLTEXT INDEX ON Indexer START FULL POPULATION\r\n"
						+ "Select * from Indexer");
		Reporter.log("Click on search tab");
		jsclick(SearchTab);
		Thread.sleep(3000);
		fortextcontainsdrpdwnicon.click();
		Reporter.log("Select text contains 'alloftheword' option");
		Thread.sleep(3000);
		movingclkElement(forallofthewordsinText);
		Reporter.log("Start the  indexer by using sql statement");
		movingclkElement(TextContainsSearch);
		TextContainsSearch.sendKeys(getSearchString());
		Reporter.log("Click on find button");
		Reporter.log("It will automatically  list all the indexed document relate to the search");
		Thread.sleep(3000);
		jsclick(FindButton);
		Reporter.log("Click on find button");
		Thread.sleep(8000);

		try {
		jsclick(opendocfortext);
		Thread.sleep(2000);
		if (Lockeddoc.isDisplayed()) {

			WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
			jsclick(element1);
		}
		Reporter.log(
				"open the document from the list, verify the thumbnail it will be highlihted for the particular search.");
		}
		catch (Exception e) {

			Reporter.log("AlertNotPresent");
		}
		try {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		

		
			if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
				// WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.alertIsPresent());
				acceptAlert();
			}
			

		} catch (Exception e) {

			Reporter.log("AlertNotPresent");
		}
		Thread.sleep(3000);
		scrollDown(newdocscroll);
		// Reporter.log("It should highlight the document on thumbnail page");
		snap("SearchScrollDownBarIssue");
		Thread.sleep(8000);
		jsclick(Refresh_Button(driver));
		// log.info(" verify Search text contains functionality with all of the words
		// option.");
	}

	// AlloftheWords search
	public void TextSearchWithAllOftheWords() throws InterruptedException, IOException {
		Reporter.log("Scenario 20:Search tab- TextContains search 'AtLeasetOneOFTheWord' option");
		Reporter.log(
				"NOTE:Start the indexer server then execute the mentioned SQL statement 'ALTER FULLTEXT INDEX ON Indexer START FULL POPULATION\r\n"
						+ "Select * from Indexer");
		Reporter.log("Click on search tab");

		jsclick(SearchTab);
		// Reporter.log("User click on search tab");
		Thread.sleep(3000);
		jsclick(fortextcontainsdrpdwnicon);
		Reporter.log("Select text contains 'AtLeastOneOFTheWord' option");
		Thread.sleep(3000);
		try {
		movingclkElement(forExactPhraseText);
		}
		catch(JavascriptException e) {
			//
		}
		Reporter.log("Start the  indexer by using sql statement");
		Thread.sleep(2000);
		jsclick(TextContainsSearch);
		Reporter.log("It will automatically  list all the indexed document relate to the search");
		TextContainsSearch.sendKeys(readFromExSearch(2, 4));
		Thread.sleep(3000);
		Reporter.log(
				"open the document from the list, verify the thumbnail it will be highlihted for the particular search.");
		// Reporter.log("It should highlight the document on thumbnail page");
		jsclick(FindButton);
		Thread.sleep(10000);
		try {
		jsclick(opendocforallwrdtext);
		
		Thread.sleep(2000);
		
		if (Lockeddoc.isDisplayed()) {

			WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
			jsclick(element1);
		}
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
	

			if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
				// WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.alertIsPresent());
				acceptAlert();
			}
		
		}
		catch (Exception e) {

			Reporter.log("AlertNotPresent");
		}
		Thread.sleep(3000);
		// jsclick(sr.gethighlightdocview());
		Thread.sleep(8000);

		jsclick(Refresh_Button(driver));
		
	}

	// AlloftheWords search
	public void TextSearchWithAtpartOftheWord() throws InterruptedException, IOException {
		Reporter.log("Scenario 21:Search tab- TextContains search 'AtPartOFTheWord' option");
		Reporter.log(
				"NOTE:Start the indexer server then execute the mentioned SQL statement 'ALTER FULLTEXT INDEX ON Indexer START FULL POPULATION\r\n"
						+ "Select * from Indexer");
		Reporter.log("Click on search tab");
		SearchFunction sr = new SearchFunction();
		jsclick(SearchTab);
		Reporter.log("Click on 'AtpartOFtheWord' word submenu");
		Thread.sleep(3000);
		Reporter.log("It will automatically  list all the indexed document relate to the search");
		fortextcontainsdrpdwnicon.click();
		Thread.sleep(3000);
		try {
			movingclkElement(foratleasetoneofthewordText);
		} catch (JavascriptException e) {
			Reporter.log("JavascriptException Handler");
		}
		Thread.sleep(2000);
		Reporter.log("User click on Find button");
		movingclkElement(TextContainsSearch);
		TextContainsSearch.sendKeys(sr.searchStringSQL());
		Thread.sleep(3000);
		jsclick(FindButton);
		Reporter.log(
				"open the document from the list, verify the thumbnail it will be highlihted for the particular search.");

		Thread.sleep(5000);
		try {
		jsclick(forRandomdocOpen);
		Thread.sleep(2000);
		if (Lockeddoc.isDisplayed()) {

			WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
			jsclick(element1);
		}
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
			if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
				// WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.alertIsPresent());
				acceptAlert();

				Thread.sleep(3000);

				sr.ScrollDownBTNText();
			}
		} catch (Exception e) {

			System.out.print("AlertNotPresent");
		}
		Thread.sleep(3000);

		// jsclick(sr.gethighlightdocview());
		Thread.sleep(3000);
		snap("SearchScrollDownBarIssue");
		Thread.sleep(8000);
		jsclick(Refresh_Button(driver));
		// Reporter.log("User check the thumbnail view highlighted pages...");
		// Reporter.log("Textcontains search with 'alloftheword' submenu working fine");
		// log.info(" verify Search text contains functionality with all of the words
		// option.");
	}

	// atleast one word
	public void AtLeastOneWordSeachIndex() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 04: Search tab- Index contains 'AtleastOneOfTheWord'");
		jsclick(SearchTab);
		Reporter.log("User click on Search tab");
		Thread.sleep(3000);
		VisiblityOf(forIndxdropdwnicon);
		Reporter.log("User click on atleastoneofthe word submenu");
		movingclkElement(forIndxdropdwnicon);
		jsclick(foratleastoneword);
		Reporter.log("User enter the value into  index contains text box");
		movingclkElement(IndexContainsSearch);
		sendvalue(IndexContainsSearch, readFromExSearch(1, 1));
		movingclkElement(FindButton);
		Reporter.log("User click on find button");
		Thread.sleep(10000);
		Reporter.log("It should display document on the page");
		Reporter.log("Searchfunctionality with exact phrase index contains search working fine");
		jsclick(ClearButton);
		// log.info(" verify Index contains search:atleast one of the words search");
	}

	// allofthe word search
	public void E_AllOfTheWordSearchIndex() throws Exception {
		Reporter.log("Scenario 05:Search tab Index contains 'AtleastOneOfTheWord'");
		SearchFunction sr = new SearchFunction();
		Thread.sleep(5000);
		Reporter.log("Click on Index contains search 'all of th word' submenu");
		movingElement(forIndxdropdwnicon);
		Reporter.log("Enter value in index contains search textbox");
		jsclick(forAllofthewords);
		sendvalue(IndexContainsSearch, readFromExSearch(1, 0));
		Reporter.log("Click on find button");
		jsclick(FindButton);

		Thread.sleep(8000);
		Reporter.log("It should display the document on the page, Document dislpayed successsfull...");
		try {
		jsclick(metaDataNum3);
		Reporter.log("Index contains search 'all of the word' working fine...");
		}
		catch(Exception e) {
			//
		}


		Thread.sleep(10000);
		Reporter.log("It should display the document on the page, Document dislpayed successsfull...");
		jsclick(metaDataNum3);
		Reporter.log("Index contains search 'all of the word' working fine...");

		Thread.sleep(10000);
		Reporter.log("Click on clear button");
		jsclick(ClearButton);
		// log.info(" verify Index contains search:all of the word search");
	}

	public void AppendToHit() throws InterruptedException, IOException {


		Thread.sleep(3000);
		jsclick(SearchTab);
		Reporter.log("Scenario 06:Search tab - AppendToHitlist checkbox");
		try {
		movingclkElement(IndexContainsSearch);
		}
		catch(JavascriptException e){
			//
		}
		Reporter.log("Enter the value into index contains search text box");
		sendvalue(IndexContainsSearch, "Document");//readFromExSearch(1, 4)
		movingclkElement(FindButton);
		Reporter.log("Click on find button");
		Thread.sleep(8000);
		Reporter.log("It should list the document on document page");
		IndexContainsSearch.clear();
		Reporter.log("Clear the index contains search text box");
		Thread.sleep(3000);
		Reporter.log("Click on append to hit list check box");
		AppendToHitlist.click();
		Reporter.log("Enter the value into index contains search text box ");
		movingclkElement(IndexContainsSearch);

		sendvalue(IndexContainsSearch, "document");// dsdfreadFromExSearch(2, 3)

	

		movingclkElement(FindButton);
		Reporter.log("User click on find button");
		Thread.sleep(10000);
		Reporter.log("Its append the search document in the listed document");
	
		Reporter.log("===========================================================================");

		
	}
	public void Find_In_Hit_List() throws InterruptedException, IOException {

		
		Thread.sleep(3000);
		Reporter.log("scenario 07: Verify search tab - FindInHitlist checkbox");

		FindInHitlist.click();
		Reporter.log("Enter the value in index contains search textbox");
		movingclkElement(FindButton);
		Reporter.log("Click on find in hitlist check box");
		Thread.sleep(3000);
		Reporter.log("Click on find button");
		FindInHitlist.click();
		Thread.sleep(3000);
		Reporter.log("It should  display only the  searched document on the document page");
		IncludeComments.click();
		Reporter.log("===========================================================================");
		Reporter.log("Scneario 08: Search tab - Include comment checkbox");
		Thread.sleep(3000);
		IndexContainsSearch.clear();
		Reporter.log("Enter the value in text contains search text box");

		sendvalue(TextContainsSearch, "new");// vidyareadFromExSearch(1, 3)

		movingclkElement(FindButton);
		Reporter.log("Click on Inclue_comment check box");
		Thread.sleep(10000);
		Reporter.log("Click on find button");
		try {
		jsclick(Metadata);
		
		
		Reporter.log("It should display the document which is containing the comment..");
		Thread.sleep(8000);
		// Reporter.log("Expected result and actual result is same test case
		// passed...");
		jsclick(forComments);
		Thread.sleep(3000);
		jsclick(CancelComments);
		Thread.sleep(5000);
		Reporter.log("Click  on clear button");
		}
		catch(Exception e) {
			//
		}
		Thread.sleep(2000);
		jsclick(ClearButton);
		Reporter.log("It should clear the searched list successfully");
		Thread.sleep(3000);
		Reporter.log("===========================================================================");
		
	}
	public void All_Version() throws InterruptedException, IOException {
		Reporter.log("Scneario 09: Search tab - all version check box");
		movingElement(forIndxdropdwnicon);
		Reporter.log("User enter the value in index contains search text box");
		jsclick(forExactPhraseinde);
		sendvalue(IndexContainsSearch, readFromExSearch(2, 0));
		AllVersion.click();
		Reporter.log("Click on all version check box");
		movingclkElement(FindButton);
		Reporter.log("Click on find button");
		Thread.sleep(10000);
		try {
		jsclick(Metadata);
		}
		catch(Exception e) {
			//
		}
		Reporter.log("It should display the document which in containing version");
		Thread.sleep(3000);
		Reporter.log("Click on Clear button");
		try {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(forallversionshows));
		forallversionshows.click();
		// Reporter.log("All version function working fine");
		Thread.sleep(8000);
		}
		catch(Exception e) {
			//
		}
		
		jsclick(ClearButton);
		// log.info(" verify Allversion/include comments/appendtohitlist /find in hit
		// list functionality working fine");
	}

	// Cabinet/drawer/folder level search in search document location
	public void FolderLevelSearch() throws InterruptedException {
		Reporter.log("Scenario 10: Verify 'Select document location' - folder");
		SearchFunction sr = new SearchFunction();
		Actions act = new Actions(driver);
		Reporter.log("Click on search tab");
		jsclick(SearchTab);
		Thread.sleep(5000);
		Reporter.log("Click on 'Select search location' textbox");
		movingElement(Searchlocation);// used base class
		Reporter.log("Expand a cabinet");
		jsclick(Searchlocation);
		Thread.sleep(5000);
		ElementToBeClickable(cabinet);
		selectElement(cabinet);
		Thread.sleep(5000);
		Reporter.log("Expand a drawer");
		ElementToBeClickable(drawer);
		selectElement(drawer);
		Reporter.log("Select a folder");
		Thread.sleep(3000);
		jsclick(folder);
		Reporter.log("Click on 'Select search location' dialog OK button");
		Thread.sleep(3000);
		jsclick(OKbuttonforsearchlocation);
		Reporter.log("Click on find button");
		Thread.sleep(2000);
		jsclick(FindButton);
		// Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
		Reporter.log("It should display the particular selected folder documents on the page");
		Thread.sleep(6000);
		// Reporter.log("Expected actual same TC passed...");
		jsclick(ClearButton);
		// log.info("Cabinet/drawer/folder level search in search document location
		// working fine");
	}
	
	//Robert Codes
	@FindBy(id = ("createdDateFrom"))
	private WebElement DateFrom;
	@FindBy(xpath = ("//tbody[@class='mc-table__body']//tr[1]//td[6]"))
	private WebElement EnterDateFrom;
	@FindBy(id =("createdDateTo"))
	private WebElement DateTo;
	@FindBy(xpath = ("//tbody[@class='mc-table__body']//tr[2]//td[4]"))
	private WebElement EnterDateTo;
	@FindBy(id = ("mc-btn__ok"))
	private WebElement DataOKButton;
	
	public void SavedDocumentDateEnter() throws InterruptedException, IOException {
		Reporter.log("Scenario 25:Verify Date enter functionality");
		Reporter.log("Click on search tab");
		jsclick(SearchTab);
		Thread.sleep(5000);
		Reporter.log("Click on Datefrom");
		jsclick(DateFrom);
		Thread.sleep(3000);
		Reporter.log("Enter the datefrom");
		jsclick(EnterDateFrom);
		Thread.sleep(2000);
		Reporter.log("Click on ok button");
		jsclick(DataOKButton);
		Thread.sleep(2000);
		Reporter.log("Click on Dateto");
		jsclick(DateTo);
		Thread.sleep(2000);
		Reporter.log("Enter the Dateto");
		jsclick(EnterDateTo);
		Reporter.log("Click on ok button");
		jsclick(DataOKButton);
		Thread.sleep(2000);
		Reporter.log("Click on find");
		FindButton.click();
		jsclick(Refresh_Button(driver));

	}
	
	
	
	
	
	
	
	
	
	
	
	

	// Cabinet/drawer/ level search in search document location
	public void DrawerLevelSearch() throws InterruptedException {
		Reporter.log("Scneario 11: Verify 'Select Document location' - drawer");
		SearchFunction sr = new SearchFunction();
		Actions act = new Actions(driver);
		Reporter.log("Click on search tab");
		jsclick(SearchTab);
		Thread.sleep(5000);
		Reporter.log("Click on 'Select Document location' textbox");
		movingElement(Searchlocation);// used base class
		Reporter.log("Expand a cabinet");
		jsclick(Searchlocation);
		// Reporter.log("USer click on select search location dialog OK button");
		Thread.sleep(5000);
		selectElement(cabinet);
		Thread.sleep(3000);
		Reporter.log("Select a drawer");
		// movingElement(sr.getDrawer());// used base class
		VisiblityOf(drawer);
		jsclick(drawer);
		Thread.sleep(3000);
		Reporter.log("Click on 'Select Document location' dialog OK button");
		jsclick(OKbuttonforsearchlocation);
		Reporter.log("Click on find button");
		jsclick(FindButton);
		// Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
		Reporter.log("It should display the particular drawer document on the page");
		Thread.sleep(6000);
		// Reporter.log("Actual and expected same...TC passed");
		jsclick(ClearButton);
		// log.info("Cabinet/drawer/ level search in search document location working
		// fine");
	}

	// Cabinet level search in search document location
	public void CabinetLevel() throws InterruptedException {
		Reporter.log("Scenario 12: Verify 'Select Document location'- cabinet ");
		SearchFunction sr = new SearchFunction();
		Actions act = new Actions(driver);
		Reporter.log("Click on search tab");
		jsclick(SearchTab);
		Thread.sleep(5000);
		Reporter.log("Click on 'Select Document location' textbox");
		movingElement(Searchlocation);// used base class
		Reporter.log("Expand a cabinet");
		jsclick(Searchlocation);
		Thread.sleep(5000);
		Reporter.log("Click on 'Select Document location' dialog OK button");
		selectElement(cabinet);
		Thread.sleep(3000);
		jsclick(OKbuttonforsearchlocation);
		jsclick(FindButton);
		Reporter.log("Click on find button");
		// Assert.assertTrue(sr.getsoftAssertvalidation().isDisplayed());
		applyWaitsForAll();
		Reporter.log("It should display the searched cabinet document on the page");
		Thread.sleep(10000);
		// Reporter.log("Expected actuall result same.. Test Case passed");
		jsclick(ClearButton);

		// log.info("Cabinet level search in search document location working fine");
	}

	public void DocumentDropDown() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 13: Verify search tab ('Document Type')");
		movingclkElement(forSelectDocdropdownicon);
		Reporter.log("Click on document type dropdown");
		// sr.getforSelectDocdropdown().sendKeys(readFromExSearch(1, 2));
		Thread.sleep(3000);
		Reporter.log("User should select a document type");
		movingclkElement(forCVReports);
		jsclick(FindButton);
		Reporter.log("Click on find button");
		Thread.sleep(10000);
		Reporter.log("It should display the searched document type documents on the page");
		jsclick(ClearButton);
		// Reporter.log("Expected reuslt actual result same...TC passed");
		// log.info("Select document type dropdown: Enter CVReport and click cvreports
		// it shows the cvreports documents.");
	}

	// enter value in field and select the user
	public void DocumentCreatorDropDown() throws Exception {
		Reporter.log("Scenario 14:Verify Search tab  ('document creator')");
		SearchFunction sr = new SearchFunction();
		jsclick(SearchTab);
		Reporter.log("Click on search tab");
		Thread.sleep(5000);
		movingclkElement(forSelectcreatordropdown);
		Reporter.log("Select a document creator from the dropdown");
		// sr.getforSelectcreatordropdownicon().sendKeys(readFromExSearch(1, 4));
		Thread.sleep(3000);
		Reporter.log("Click on find button");
		movingclkElement(forNishacreator);
		FindButton.click();
		Reporter.log("It should display the searched creator documents on the page");
		Thread.sleep(10000);
		ClearButton.click();
		// log.info("Document Creator dropdown working fine..");

	}


	public void Reject_WF() throws InterruptedException {


		Reporter.log("Scenario 14:Verify Search tab-Workflow status(Reject option)");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Reporter.log("Click on workflow status dropdown");
		wait.until(ExpectedConditions.elementToBeClickable(forworkflowdropdown));
		(forworkflowdropdown).click();
		Reporter.log("Select Reject option");
		(forworkflowReject).click();
		Reporter.log("Click on find button");
		jsclick(FindButton);
		Reporter.log("It should display the rejected workflow documents on the page");
		Thread.sleep(15000);
		jsclick(ClearButton);
		Reporter.log("Click on clear button");
		Reporter.log("Listed document cleared successfully...");
		// log.info("workflow rejected: documents displayed successfully");
		Reporter.log("=================================================================");

		
	}
	public void PendingWorkflow_Document() throws InterruptedException {
		Reporter.log("Scenario 15:  Verify Search tab-Workflow status(Pending option)");
		forworkflowdropdown.click();// pending
		Reporter.log("Select the workflow dropdown pending Option");
		forworkflowPending.click();
		Reporter.log("Click on find button");
		jsclick(FindButton);
		Reporter.log("It should display the wrokflow status pending documents on the page");
		Thread.sleep(8000);

		jsclick(ClearButton);
		// log.info("workflow pending: documents displayed successfully");
		Reporter.log("Click on clear button");
		Reporter.log("Listed document cleared successfully...");
		Reporter.log("===============================================================================");

	}
	public void CompletedWF_Document() throws InterruptedException {

		Thread.sleep(4000);
		forworkflowdropdown.click();
		Reporter.log("Scenario 16: Verify Search tab-Workflow status(Workflow completed option)");
		forworkflowCompleted.click();
		Reporter.log("Select a workflow dropdown 'workflow completed' option");
		jsclick(FindButton);
		Reporter.log("USer click on find button");
		Thread.sleep(8000);
		Reporter.log("It should display the wrokflow completed documents on the page");
		jsclick(ClearButton);
		Thread.sleep(3000);
		// log.info("workflow completed: documents displayed successfully");
		Reporter.log("Click on clear button");
		Reporter.log("Listed document cleared successfully...");
		Reporter.log("===============================================================================");
		forworkflowdropdown.click();// Endworkflow
		Reporter.log("Scenario 17: Verify Search tab-Workflow status(Endworkflow option)");
		forworkflowEndWorkflow.click();
		Reporter.log("Select a workflow dropdown  'endworkflow' option");
		jsclick(FindButton);
		Reporter.log("Click on find button");
		Thread.sleep(8000);
		jsclick(ClearButton);
		Reporter.log("It should display the workflow ended documents on the page");
		Thread.sleep(8000);
		// log.info("end workflow: documents displayed successfully");
		Thread.sleep(3000);
		// log.info("workflow completed: documents displayed successfully");
		Reporter.log("Click on clear button");
		Reporter.log("Listed document cleared successfully...");
		Reporter.log("===============================================================================");
	}
	public void TaskCompletedWFDocument() throws InterruptedException {
		forworkflowdropdown.click();
		Reporter.log("Scenario 18: Verify Search tab-Workflow status(TaskCompleted option)");
		forworkflowTaskcomplete.click();// taskcompleted
		Reporter.log("Select a workflow dropdown  Task completed Option");
		jsclick(FindButton);
		Reporter.log("Click on find button");
		Thread.sleep(8000);
		jsclick(ClearButton);
		Thread.sleep(3000);
		Reporter.log("It should display the Task completed documents on the page");
		// log.info("task completed: documents displayed successfully");
		Thread.sleep(3000);
		// log.info("workflow completed: documents displayed successfully");
		Reporter.log("Click on clear button");
		Reporter.log("Listed document cleared successfully...");
		Reporter.log("===============================================================================");
	}

	// showing saved documents
	public void SavingTheSearchDoc() throws InterruptedException, IOException {

		/*
		 * Reporter.log("Scenario 18:Verify Select saved search functionality"); try {
		 * jsclick(SearchTab); } catch(Exception e) { // }
		 */
		try
		{		Reporter.log("Select search tab");
		jsclick(saveDropdown);
		}
		catch(JavascriptException e) {
			//
		}

		Reporter.log("Scenario 18:Verify Select saved search functionality");

		jsclick(SearchTab);
		Reporter.log("Select search tab");
		jsclick(saveDropdown);

		Reporter.log("Click on new search");
		Thread.sleep(3000);
		newsearch.click();
		Reporter.log("Enter value into new search textbox");
		newsearchvalueenter.sendKeys(readFromExSearch(3, 0));
		Thread.sleep(5000);
		Reporter.log("Enter value in index contains search textbox");
		sendvalue(IndexContainsSearch, "Document");//readFromExSearch(1, 3)
		sendvalue(IndexContainsSearch, readFromExSearch(1, 3));
		movingclkElement(forSelectDocdropdownicon);
		Reporter.log("Select a document data type");
		// sr.getforSelectDocdropdown().sendKeys(readFromExSearch(1, 2));
		Thread.sleep(3000);
		Reporter.log("Selecct a document creator");
		movingclkElement(forCVReports);
		FindButton.click();
		Thread.sleep(5000);
		Reporter.log("Click on 'select saved search' save icon");
		movingElement(savebotton);

		jsclick(savebotton);
		Thread.sleep(3000);
		movingclkElement((savedNamecheck));
		Reporter.log("Mouse hover on saved select search dropdown ");
		Thread.sleep(5000);
		Reporter.log("Click on find");
		ClearButton.click();
		Reporter.log("It should display the searched document on the page");
		Reporter.log("Search tab: searched documents saved functionality working fine");
	}

	// TreeIcon search
	public void FolderSerchIcon() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 22: Navigation folder icon search");
		Reporter.log("Click on navigation folder search icon");
		jsclick(fornavigatetofoldersearch);
		Thread.sleep(3000);
		Reporter.log("Enter value into navigation folder search textbox");
		searchTree.sendKeys(readFromExSearch(1, 3));
		Thread.sleep(5000);
		Reporter.log("Click on Keyboard ENTER key");
		searchTree.sendKeys(Keys.RETURN);// tree search
		Thread.sleep(10000);
		Reporter.log("Folder search dialog should be opened");
		Reporter.log("Searched folder documents display on the dialog box successfully");
		WebElement CloseIcon = driver.findElement(By.xpath("//*[@id=\"FolderSearchModelHeaderClose\"]"));
		jsclick(CloseIcon);
		Reporter.log("Click on folder document close icon");
		Thread.sleep(4000);
		// log.info("TreeIcon search functionality works fine");

	}

	// Quick search
	public void QuickSearch() throws Exception {
		Thread.sleep(3000);
		quicksearch.sendKeys(readFromExSearch(2, 1));
		Reporter.log("Scenario 23: Search tab - Quick search");
		Thread.sleep(3000);
		Reporter.log("Enter value in quick search textbox");
		quicksearch.sendKeys(Keys.RETURN);
		Thread.sleep(15000);
		SoftAssert so = new SoftAssert();
		String PageTitle = driver.getTitle();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Reporter.log("Click on Keyboard ENTER key");
		wait.until(ExpectedConditions.visibilityOf(quicksearch));
		so.assertTrue(PageTitle.contains(readFromExSearch(2, 4)));
		Reporter.log("It should display searched document on the page successfully...");
		// log.info("quick search icon works fine");
		// Reporter.log("quick search works fine");
		jsclick(Refresh_Button(driver));
	}

	public void DocumentSearch() throws Exception {

		Reporter.log("Scenario 24:Folder document search");
		SearchDocumentsTabInPage();

		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		Reporter.log("The documents Search from folder completed, working fine");
		// log.info("The documents Search from folder completed, working fine");
	}
}