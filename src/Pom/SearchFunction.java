package Pom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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

public class SearchFunction extends BaseClass {
	
	public static WebElement element=null;

	public SearchFunction() {
		PageFactory.initElements(driver, this);
	}
	
	
	 public String getSearchString() {
			String searchVal = "";
			// JDBC URL, username, and password of MySQL server
	        String jdbcUrl = "jdbc:sqlserver://10.4.10.13:1433;DatabaseName=Win2019_TestRoom;SelectMethod=direct;";
	        String username = "sa";
	        String password = "Syntax@10";

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
//	                int id = resultSet.getInt("id");
//	                String Nodeid = resultSet.getString("Nodeid");
	               // int PageNo=resultSet.getInt("PageNo");
	                String pagecontents= resultSet.getString("PageContents");
	                
	                // Add more columns as needed

	                // Print the data
	                System.out.println("PageContents" +pagecontents);
	               // System.out.println("ID: " + id + ", Nodeid: " + Nodeid+ "PageContents" +pagecontents);
	                searchVal = pagecontents.substring(0, pagecontents.indexOf(" "));
	                if(searchVal != null && searchVal.length()>0) {
	                	System.out.println("SearchVal: "+searchVal);
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
	        String jdbcUrl = "jdbc:sqlserver://10.4.10.13:1433;DatabaseName=Win2019_TestRoom;SelectMethod=direct;";
	        String username = "sa";
	        String password = "Syntax@10";

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
//	                int id = resultSet.getInt("id");
//	                String Nodeid = resultSet.getString("Nodeid");
	               // int PageNo=resultSet.getInt("PageNo");
	                String pagecontents= resultSet.getString("PageContents");
	                
	                // Add more columns as needed

	                // Print the data
	                System.out.println("PageContents" +pagecontents);
	               // System.out.println("ID: " + id + ", Nodeid: " + Nodeid+ "PageContents" +pagecontents);
	                searchVal = pagecontents.substring(21, 28);
	                if(searchVal != null && searchVal.length()>0) {
	                	System.out.println("SearchVal: "+searchVal);
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

	@FindBy(xpath = ("(//a[text()='CVApp Test'])[1]"))
	private WebElement cabinet;

	@FindBy(xpath = ("//a[text()='CVMobile App 2022']"))
	private WebElement drawer;

	@FindBy(xpath = ("//a[text()='Test apk']"))
	private WebElement folder;

	@FindBy(id = ("navigatorTreeOk1"))
	private WebElement OKbuttonforsearchlocation;

	@FindBy(xpath = ("(//th[text()='DOCUMENT NAME'])[5]"))
	private WebElement softAssertValidation;

	public WebElement getsoftAssertvalidation() {
		return softAssertValidation;
	}

	@FindBy(xpath = ("//li[text()='CVReports1']"))
	private WebElement forCVReports;

	public WebElement getforCVReports() {
		return forCVReports;
	}
	
	
	@FindBy(xpath = ("//li[text()='CVReports']"))
	private WebElement forCVReportsCSR;

	public WebElement getforCVReportsCSR() {
		return forCVReportsCSR;
	}
	
	
	
	
	@FindBy(xpath = ("(//div[@class='elementHeader'])[3]"))
	private WebElement forComments;

	public WebElement getforComments() {
		return forComments;
	}
	
	@FindBy(xpath = ("(//div[@class='elementHeader'])[5]"))
	private WebElement forallversionshows;

	public WebElement getforallversionshows() {
		return forallversionshows;
	}
	@FindBy(xpath = ("//*[@id=\"cancelComments\"]"))
	private WebElement CancelComments;

	public WebElement getCancelComments() {
		return CancelComments;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@FindBy(xpath = ("//li[text()='aaa']"))
	private WebElement foraaaDoc;

	public WebElement getforaaaDoc() {
		return foraaaDoc;
	}

	@FindBy(xpath = ("//input[@class='e-input-filter e-input']"))
	private WebElement forSelectcreatordropdownicon;

	public WebElement getforSelectcreatordropdownicon() {
		return forSelectcreatordropdownicon;
	}

	@FindBy(xpath = ("(//select[@class='e-multi-hidden'])[2]"))
	private WebElement forSelectcreatordropdown;

	public WebElement getforSelectcreatordropdown() {
		return forSelectcreatordropdown;
	}

	@FindBy(xpath = ("//li[text()='nisha']"))
	private WebElement forNishacreator;

	public WebElement getforNishacreator() {
		return forNishacreator;
	}

	@FindBy(xpath = ("//input[@class='e-input-filter e-input']"))
	private WebElement forSelectDocdropdown;

	public WebElement getforSelectDocdropdown() {
		return forSelectDocdropdown;
	}

	@FindBy(xpath = ("//*[@id=\"searchArea\"]/fieldset/div[6]/div[1]/div/div/span[5]"))
	private WebElement forSelectDocdropdownicon;

	public WebElement getforSelectDocdropdownicon() {
		return forSelectDocdropdownicon;
	}

	@FindBy(xpath = ("//*[@id=\"20\"]"))
	private WebElement forworkflowReject;

	public WebElement getforworkflowReject() {
		return forworkflowReject;
	}

	@FindBy(xpath = ("//*[@id=\"21\"]"))
	private WebElement forworkflowPending;

	public WebElement getforworkflowPending() {
		return forworkflowPending;
	}

	@FindBy(xpath = ("//*[@id=\"22\"]"))
	private WebElement forworkflowCompleted;

	public WebElement getforworkflowCompleted() {
		return forworkflowCompleted;
	}

	@FindBy(xpath = ("//*[@id=\"23\"]"))
	private WebElement forworkflowEndWorkflow;

	public WebElement getforworkflowEndWorkflow() {
		return forworkflowEndWorkflow;
	}

	@FindBy(xpath = ("//*[@id=\"24\"]"))
	private WebElement forworkflowTaskcomplete;

	public WebElement getforworkflowTaskcomplete() {
		return forworkflowTaskcomplete;
	}

	public WebElement getFortextcontainsdrpdwnicon() {
		return fortextcontainsdrpdwnicon;
	}
	
	@FindBy(xpath = ("//a[@id='myTaskMenu']"))
	private WebElement TodolistTab;
	
	@FindBy(xpath = ("//a[@id='newItems']"))
	private WebElement NewItems;
	
	//forSeconndDochtml[1]/body[1]/div[56]/div[59]/div[4]/div[2]/div[4]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[3]
	
	
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
	private  WebElement sendToWf;
	
	@FindBy(xpath = ("(//td[normalize-space()='Dynamic wf new'])[1]"))
	private WebElement dynamicwfnew;
	
	@FindBy(xpath = ("(//button[@id='sidbisendworkflowOk'])[1]"))
	private WebElement applyBTN;
	
	@FindBy(xpath = ("(//button[@id='CommentsMessageModelOk'])[1]"))
	private WebElement sendwfsuccessdialogOKBTN;
	
	
	
	
	@FindBy(id = ("Val_305"))
	private WebElement TextKey;
	
	public void SearchTodoListFunctionality() throws Exception {
		
		jsclick(SearchTab);
		Thread.sleep(3000);
		jsclick(IndexContainsSearch);
		//IndexContainsSearch.sendKeys("abcd");
		forworkflowdropdown.click();// Endworkflow
		forworkflowEndWorkflow.click();
		jsclick(FindButton);
		Thread.sleep(8000);
		jsclick(OpenDocumentForTodoSearch);
		try {
		alertIsPresent();
		acceptAlert();
		}catch(Exception e) {
			Reporter.log("Alert is not present");
		}
		Thread.sleep(2000);
		jsclick(UpdateProperties);
		WebElement docTypeDropDown = driver.findElement(By.xpath("(//select[@id='viewDocumentTypeList'])[1]"));
		jsclick(docTypeDropDown);
		Thread.sleep(4000);
        scrollDown(DynamicNewDoc);
		DynamicNewDoc.click();
		Thread.sleep(3000);
		movingclkElement(TextKey);
		TextKey.sendKeys("Automation Test Demo");
		WebElement User1 = driver.findElement(By.xpath("//*[@id=\"Val_306\"]"));
		jsclick(User1);
		Thread.sleep(3000);
		WebElement findbtn = driver.findElement(By.xpath("//*[@id=\"searchDynamicUser\"]"));
		jsclick(findbtn);
		Thread.sleep(3000);
		WebElement User1Vidya = driver.findElement(By.xpath("//*[@id=\"spanCheckDynamicUser_vidya\"]"));
		jsclick(User1Vidya);
		WebElement usergrpOKBtn = driver.findElement(By.xpath("//*[@id=\"navigatorTreeCancle5\"]"));
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		WebElement User2 = driver.findElement(By.xpath("//*[@id=\"Val_307\"]"));
		jsclick(User2);
		Thread.sleep(3000);
		jsclick(findbtn);
		WebElement RNishaUser = driver.findElement(By.xpath("//*[@id=\"spanCheckDynamicUser_RNisha\"]"));
		jsclick(RNishaUser);
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		WebElement User3 = driver.findElement(By.xpath("//*[@id=\"Val_308\"]"));
		jsclick(User3);
		jsclick(findbtn);
		jsclick(RamUSer);
		jsclick(findbtn);
		movingclkElement(usergrpOKBtn);
		Thread.sleep(3000);
		jsclick(PropertiesUpdateSaveBTN);
		Thread.sleep(3000);
		VisiblityOf(UpdateDialogOKBTN);
		jsclick(UpdateDialogOKBTN);
		Thread.sleep(2000);
		jsclick(sendToWf);
		VisiblityOf(dynamicwfnew);
		 jsclick(dynamicwfnew);
		 Thread.sleep(2000);
         jsclick(applyBTN);
	     Thread.sleep(10000);
	    jsclick(sendwfsuccessdialogOKBTN);
	    Thread.sleep(3000);
	   
	    }
	
	@FindBy(xpath = ("//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]"))
	private WebElement Open1stDocument;	
	
	
	 @FindBy(xpath =("//*[@id=\"cvDocumentClose\"]/span"))
     private WebElement PageCloseIcon;
	
	public void SearchPendingDocAndAccept() throws Exception  {
		
		ToDoListTab todo = new ToDoListTab();
		
		jsclick(todo.getTodolistTab());
		Thread.sleep(3000);
		jsclick(todo.getNewItems());
		Thread.sleep(3000);
		VisiblityOf(Open1stDocument);
		jsclick(Open1stDocument);
		Thread.sleep(3000);
		alertIsPresent();
		acceptAlert();
		jsclick(PageCloseIcon);
		Thread.sleep(3000);
		jsclick(SearchTab);
		Thread.sleep(4000);
		
		forworkflowdropdown.click();// pending
		forworkflowPending.click();
		jsclick(FindButton);
		Thread.sleep(8000);
		ElementToBeClickable(MetadataSearch);
		jsclick(MetadataSearch);
		Thread.sleep(3000);
		jsclick(todo.getAcceptButton());
		todo.getWorkflowComments().sendKeys(TodoListExcel(7, 0));
		Thread.sleep(3000);
		jsclick(todo.getWorkflowCommentsOKButton());
		Thread.sleep(8000);
	}
	
	
public void SearchTodolistEndByUSerRAm() throws Exception {
      
	ToDoListTab todo = new ToDoListTab();
		Thread.sleep(4000);
		movingElement(TodolistTab);
		Thread.sleep(3000);
		jsclick(NewItems);
		Thread.sleep(5000);
		jsclick(Open1stDocument);
		Thread.sleep(3000);
		alertIsPresent();
		acceptAlert();
		Thread.sleep(6000);
		jsclick(todo.getEndWfButton());
		Thread.sleep(2000);
		todo.getWorkflowComments().sendKeys(TodoListExcel(7, 1));
		Thread.sleep(3000);
		jsclick(todo.getWorkflowCommentsOKButton());
		Thread.sleep(8000);
	}
	
	
	
	
	
	
	
	
	
	
			
   
	@FindBy(xpath = ("//*[@id=\"searchArea\"]/fieldset/div[8]/div/span"))
	private WebElement forworkflowdropdown;

	public WebElement getforworkflowdropdown() {
		return forworkflowdropdown;
	}

	public WebElement getForallofthewordsinText() {
		return forallofthewordsinText;
	}

	public WebElement getForatleasetoneofthewordText() {
		return foratleasetoneofthewordText;
	}

	public WebElement getForAtpartofthewordText() {
		return forAtpartofthewordText;
	}

	public WebElement getForAllofthewords() {
		return forAllofthewords;
	}

	public WebElement getSearchlocation() {
		return Searchlocation;
	}

	public WebElement getCabinetCSR() {
		return cabinetCSR;
	}

	public WebElement getDrawerCSR() {
		return drawerCSR;
	}

	public WebElement getFolderCSR() {
		return folderCSR;
	}

	@FindBy(xpath =("//*[@id=\"1\"]/a"))
    private WebElement cabinetCSR;
	
	
	@FindBy(xpath =("//*[@id=\"2\"]/a"))
    private WebElement drawerCSR;
	
	@FindBy(xpath =("//*[@id=\"3\"]/a"))
    private WebElement folderCSR;
	
	
	public WebElement getCabinet() {
		return cabinet;
	}

	public WebElement getDrawer() {
		return drawer;
	}

	public WebElement getFolder() {
		return folder;
	}
	
	
	
	
	
	
	
	public WebElement getOKbuttonforsearchlocation() {
		return OKbuttonforsearchlocation;
	}

	
	public WebElement getforAllofthewords() {
		return forAllofthewords;
	}

	public WebElement getforAtpartofthewordText() {
		return forAtpartofthewordText;
	}

	public WebElement getforatleasetoneofthewordText() {
		return foratleasetoneofthewordText;
	}

	public WebElement getfortextcontainsdrpdwnicon() {
		return fortextcontainsdrpdwnicon;
	}

	public WebElement getforallofthewordsinText() {
		return forallofthewordsinText;
	}
	
	@FindBy(xpath = ("//input[@id='indexPhrase2']"))
	private WebElement forExactPhraseText;

	public WebElement getforExactPhraseText() {
		return forExactPhraseText;
	}
	
	@FindBy(xpath = ("//li[@id='indexOptionMenu_1']"))
	private WebElement forExactPhraseinde;

	public WebElement getforExactPhraseinde() {
		return forExactPhraseinde;
	}
	
	
	
	
	

	@FindBy(xpath = ("//a[@id='navigationMenuBtn']"))
	private WebElement fornavigatetofoldersearch;

	public WebElement getfornavigatetofoldersearch() {
		return fornavigatetofoldersearch;
	}

	@FindBy(id = ("searchTree"))
	private WebElement searchTree;

	public WebElement getsearchTree() {
		return searchTree;
	}

	@FindBy(id = ("search-text"))
	private WebElement quicksearch;

	public WebElement getquicksearch() {
		return quicksearch;
	}

	public WebElement getClearButton() {
		return ClearButton;
	}

	public WebElement getSearchTab() {
		return SearchTab;
	}

	public WebElement getIndexContainsSearch() {
		return IndexContainsSearch;
	}

	public WebElement getTextContainsSearch() {
		return TextContainsSearch;
	}

	public WebElement getSearchDoctype() {
		return SearchDoctype;
	}

	public WebElement getSearchDocCreator() {
		return SearchDocCreator;
	}

	public WebElement getCreatedFrom() {
		return CreatedFrom;
	}

	public WebElement getCreatedTo() {
		return CreatedTo;
	}

	public WebElement getAllVersion() {
		return AllVersion;
	}

	public WebElement getIncludeComments() {
		return IncludeComments;
	}

	public WebElement getAppendToHitlist() {
		return AppendToHitlist;
	}

	public WebElement getFindInHitlist() {
		return FindInHitlist;
	}

	public WebElement getFindButton() {
		return FindButton;
	}

	public WebElement getForIndxdropdwnicon() {
		return forIndxdropdwnicon;
	}

	public WebElement getForatleastoneword() {
		return foratleastoneword;
	}

	@FindBy(xpath = ("/html/body/div[62]/div[2]/div[2]/table/tbody/tr[2]/td[5]"))
	private WebElement CreatedToDate;

	
	
	@FindBy(xpath = ("/html/body/div[63]/div[2]/div[2]/table/tbody/tr[1]/td[6]"))
	private WebElement Createdfromdate;

	public WebElement getCreatedfromdate() {
		return Createdfromdate;
	}
	
	
	@FindBy(xpath = ("//*[@id=\"mc-btn__ok\"]"))
	private WebElement DatePickerOKBTN;

	public WebElement getDatePickerOKBTN() {
		return DatePickerOKBTN;
	}
	
	

	 @FindBy(xpath = ("(//td[@class=' details-control'])[1]"))
	    private WebElement Metadata;
	 
	 
	 public WebElement getMetadata() {
			return Metadata;
		}
	 
	
	 @FindBy(xpath = ("//*[@id=\"searchTableRow_79807\"]/td[2]"))
	    private WebElement MetadataSearch;
	 
	 public void getRandomSelectDoc() throws Exception {
		 
		 
		List<WebElement> names=driver.findElements(By.id("searchDiv1"));
		for (WebElement allname : names) {
			String options=allname.getText();
			if (options.contains("123")) {
				jsclick(getmetaDataNum2());
				break;
			}
			/*else if(options.contains("Vidya")) {
				
				jsclick(getinMiddleDocOFSeachMetaData());
				System.out.println("Random search done by nishaR");
			}*/
			
		}
		//System.out.println(names); 
	
		 
	 }
	 @FindBy(xpath = ("(//li[@id='1'])[1]"))
		private WebElement Cabinet1;

		@FindBy(xpath = ("//*[@id=\"2\"]/a"))
		private WebElement Drawer2;
	 
	 
	 @FindBy(xpath = ("//*[@id=\"1002\"]/a"))
		private WebElement FolderVidya;
		
		
		
		public WebElement getCabinet1() {
			return Cabinet1;
		}

		

		public WebElement getDrawer2() {
			return Drawer2;
		}

		

		public WebElement getFolderVidya() {
			return FolderVidya;
		}

	 
	
		
		
		//*[@id="documentListTable"]/tbody/tr/td[3]
		
		@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr/td[3]")
		private WebElement SearchDocOpen;
		
		
		@FindBy(xpath = "(//input[@id='tableFilter'])[1]")
		private WebElement DocIdSearch;
	 
	public void SearchDocumentsTabInPage() throws Exception {
		Thread.sleep(3000);
       movingDoublecli(getCabinet1(), getCabinet1()); 
        movingDoublecli(getDrawer2(), getDrawer2());
		movingDoublecli(getFolderVidya(), getFolderVidya());
		Thread.sleep(8000);
        WebElement ele =(DocIdSearch);
			jsclick(ele);
			Thread.sleep(4000);
			ele.sendKeys(readFromExSearch(3, 2));
			Thread.sleep(8000);
			//Thread.sleep(4000);
			ele.clear();
			Thread.sleep(3000);
			ele.sendKeys(readFromExSearch(3, 3));
			Thread.sleep(7000);
			ele.clear();
			ele.sendKeys(readFromExSearch(3, 4));
			Thread.sleep(8000);
			ele.clear();
			ele.sendKeys(readFromExSearch(3, 5));
			Thread.sleep(7000);
			}
		
	public void SearchDocumentsInTodolistsearchtab() throws Exception	{
		 WebElement ele =(DocIdSearch);
			jsclick(ele);
			Thread.sleep(4000);
			ele.sendKeys("TestingDemoForSearchTodo");
			Thread.sleep(8000);
	}
		
	

	@FindBy(xpath = ("/html/body/div[62]/div[2]/div[2]/table/tbody/tr[2]/td[3]"))
	private WebElement Modifiedfromdate;
	public WebElement getModifiedfromdate() {
		return Modifiedfromdate;
	}

	@FindBy(xpath = ("/html/body/div[62]/div[2]/div[2]/table/tbody/tr[2]/td[5]"))
	private WebElement ModifiedTodate;

	public WebElement getModifiedTodate() {
		return ModifiedTodate;
	}

	@FindBy(xpath = ("(//input[@id='ModifiedDateFrom'])[1]"))
	private WebElement ModifiedFrom;

	public WebElement getModifiedFrom() {
		return ModifiedFrom;
	}

	@FindBy(xpath = ("(//input[@id='ModifiedDateTo'])[1]"))
	private WebElement ModifiedTo;

	public WebElement getModifiedTo() {
		return ModifiedTo;
	}

	public WebElement getforCreatedToDate() {
		return CreatedToDate;
	}

	@FindBy(id = ("savedSearchName"))
	private WebElement saveDropdown;

	public WebElement getsaveDropdown() {
		return saveDropdown;
	}

	@FindBy(xpath = ("//img[@id='saveBtnForSaveSearchName']"))
	private WebElement savebotton;

	public WebElement getsavebotton() {
		return savebotton;
	}
	@FindBy(xpath = ("(//option[@value='0'])[5]"))
	private WebElement newsearch;

	public WebElement getnewsearch() {
		return newsearch;
	}

	@FindBy(xpath = ("//*[@id=\"searchTableRow_25339\"]/td[3]"))
	private WebElement opendocfortext;

	public WebElement getopendocfortext() {
		return opendocfortext;
	}
	
	@FindBy(xpath = ("//*[@id=\"searchTableRow_131\"]/td[3]"))
	private WebElement opendocfortextSQL;

	public WebElement getopendocfortextSQL() {
		return opendocfortextSQL;
	}
	
	
	
	
	
	@FindBy(xpath = ("//*[@id=\"docViewerMetaData\"]"))
	private WebElement newdocscroll;

	public WebElement getnewdocscroll() {
		return newdocscroll;
	}

	
	@FindBy(xpath = ("//*[@id=\"Screenshot_OTP.jpg\"]/div/img"))
    private WebElement highlightdocview;
	
	
	
      public WebElement gethighlightdocview() {
      return highlightdocview;
			}
      
      public static void ScrollDownBTNText() {
			WebElement scroll = driver.findElement(By.xpath("(//canvas[@class='lt-imageviewer-eventcanvas'])[3]"));
           scrollDown(scroll);
			
  }  
      
      
  public static void ScrollDownButton() {
			WebElement scroll = driver.findElement(By.xpath("(//button[normalize-space()='LOAD MORE...'])[1]"));
             scrollDown(scroll);
			
    }
	
  @FindBy(xpath = ("//*[@id=\"searchTableRow_7619\"]/td[3]"))
	private WebElement opendocforallwrdtext;

	public WebElement getopendocforallwrdtext() {
		return opendocforallwrdtext;
	}
  
  
	
  @FindBy(xpath = ("(//button[normalize-space()='LOAD MORE...'])[1]"))
	private WebElement loadMore;

	public WebElement getloadMore() {
		return loadMore;
	}
	
	
	@FindBy(id = ("newSavedSearchName"))
	private WebElement newsearchvalueenter;

	public WebElement getnewsearchvalueenter() {
		return newsearchvalueenter;
	}
	
	@FindBy(xpath = ("(//td[@class=' details-control'])[32]"))
	private WebElement inMiddleDocOFSeachMetaData;

	public WebElement getinMiddleDocOFSeachMetaData() {
	return inMiddleDocOFSeachMetaData;
			}
	
	@FindBy(xpath = ("(//td[@class=' details-control'])[66]"))
	private WebElement afterLoadmoreSeachMetaData;

	public WebElement getafterLoadmoreSeachMetaData() {
	return afterLoadmoreSeachMetaData;
			}
	@FindBy(xpath = ("(//td[@class=' details-control'])[2]"))
	private WebElement metaDataNum2;

	public WebElement getmetaDataNum2() {
	return metaDataNum2;
			}
	@FindBy(xpath = ("(//td[@class=' details-control'])[5]"))
	private WebElement metaDataNum3;

	public WebElement getmetaDataNum3() {
	return metaDataNum3;
			}
	
	
	
			@FindBy(xpath = ("//*[@id=\"searchTableRow_3057\"]/td[3]"))
	private WebElement forRandomdocOpen;

	public WebElement getforRandomdocOpen() {
		return forRandomdocOpen;
	}		

	@FindBy(xpath = ("//select[@id='savedSearchName']"))
	private WebElement savedNamecheck;

	public WebElement getsavedNamecheck() {
		return savedNamecheck;
	}

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

	

}
