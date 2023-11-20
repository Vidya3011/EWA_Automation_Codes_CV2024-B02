package Pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.BaseClass;

public class ToDoListTab extends BaseClass {
	
	public ToDoListTab() {
		
		PageFactory.initElements(driver, this);
		}
	
	
	
	
	@FindBy(xpath = ("//a[@id='myTaskMenu']"))
	private WebElement TodolistTab;
	
	@FindBy(xpath = ("//a[@id='newItems']"))
	private WebElement NewItems;
	
	
			
    @FindBy(xpath = ("//*[@id=\"todoListTable\"]/tbody/tr[1]/td[1]"))
    private WebElement Metadata;		
			
  
	
	public WebElement getTodolistTab() {
		return TodolistTab;
	}

	public WebElement getNewItems() {
		return NewItems;
	}

	public WebElement getMetadata() {
		return Metadata;
	}

	public WebElement getTodolistDoc() {
		return TodolistDoc;
	}

	public WebElement getAcceptButton() {
		return AcceptButton;
	}

	public WebElement getRejectButton() {
		return RejectButton;
	}

	public WebElement getEndWfButton() {
		return EndWfButton;
	}

	public WebElement getSummaryButton() {
		return SummaryButton;
	}

	public WebElement getWorkflowComments() {
		return WorkflowComments;
	}

	public WebElement getWorkflowCommentsOKButton() {
		return WorkflowCommentsOKButton;
	}

	public WebElement getAssertvalid() {
		return assertvalid;
	}
	
	
	
	
	@FindBy(xpath = ("//*[@id=\"1\"]/a"))
	private  WebElement TestCabinet;
	
	@FindBy(xpath = ("//*[@id=\"79760\"]/ins"))
	private WebElement dynamicWfDrawer;
	
	@FindBy(xpath = ("//*[@id=\"81133\"]/a"))
	private WebElement DynamicWfAutoFolder;
	
	@FindBy(xpath = ("(//span[@id='viewSendToWrkflw'])[1]"))
	private  WebElement sendToWf;
	
	@FindBy(xpath = ("(//td[contains(text(),'Dynamic workflow')])[1]"))
	private WebElement dynamicwfnew;
	
	@FindBy(xpath = ("(//button[@id='sidbisendworkflowOk'])[1]"))
	private WebElement applyBTN;
	
	@FindBy(xpath = ("(//button[@id='CommentsMessageModelOk'])[1]"))
	private WebElement sendwfsuccessdialogOKBTN;

	                 //html/body/div[56]/div[59]/div[4]/div[2]/div[3]/div/div[2]/div[2]/table/tbody/tr[1]/td[2]
	@FindBy(xpath = ("//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]"))
	private WebElement Open1stDocument;		
			
	                  
	@FindBy(xpath = ("/html/body/div[57]/div[59]/div[4]/div[2]/div[1]/div/div[2]/div[2]/table/tbody/tr[5]/td[3]"))
	private WebElement OpenDocument;
	
	
	@FindBy(xpath = ("/html/body/div[56]/div[59]/div[4]/div[2]/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[3]"))
	private WebElement OpenDocumentDWS;
	
	
	
	
	//*[@id="editproperties_79774"]
	
	@FindBy(xpath = ("(//a[normalize-space()='Update'])[1]"))
	private WebElement UpdateProperties;
	
	@FindBy(xpath = ("//*[@id=\"Val_274\"]"))
	private WebElement Update4thUser;
	
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
	
	
	
			@FindBy(xpath = ("(//button[@id='ownershipMessageModelOk'])[1]"))
			private WebElement DWSdialogOKBTN;
			
			
			
	public void AnnotationPageSendWF() throws Exception {
	    VisiblityOf(TestCabinet);
		movingDoublecli(TestCabinet,TestCabinet);
		Thread.sleep(2000);
		jsclick(dynamicWfDrawer);
		Thread.sleep(2000);
	    movingDoublecli(DynamicWfAutoFolder, DynamicWfAutoFolder);
		VisiblityOf(OpenDocument);
		jsclick(OpenDocument);
		alertIsPresent();
		acceptAlert();
		VisiblityOf(sendToWf);
	
		jsclick(sendToWf);
		Thread.sleep(3000);
	
	    jsclick(dynamicwfnew);
	
	     jsclick(applyBTN);
	     Thread.sleep(10000);
	    jsclick(sendwfsuccessdialogOKBTN);
	    Thread.sleep(3000);
	    VisiblityOf(TodolistTab);
	    jsclick(TodolistTab);
	    Thread.sleep(4000);
	    jsclick(Metadata);
	    VisiblityOf(AcceptButton);
	    jsclick(AcceptButton);
	    Thread.sleep(3000);
	    WorkflowComments.sendKeys("AllAnnotationAddedFirstTaskUserAcceptFromMetadata");
		WorkflowCommentsOKButton.click();
		Thread.sleep(15000);
		}
	
	
	public void SecondUserVidyaForAnnotationWf() throws Exception {
		
		Thread.sleep(8000);
		LogVidyaTaskUser1();
	//	log.info("New manual for automation first task user vidya has logged in successful");
	}
	
	
	public void VerifyingAnnotationPageBySecondUSerVidya() throws Exception {

		
		jsclick(TodolistTab);
		Thread.sleep(3000);
		jsclick(NewItems);
		Thread.sleep(5000);
		VisiblityOf(Open1stDocument);
		jsclick(Open1stDocument);
		Thread.sleep(3000);
		try {
		alertIsPresent();
		acceptAlert();
		}
		catch(Exception e) {
			Reporter.log("AlertNotPresent");
		}
		Thread.sleep(10000);
		jsclick(AcceptButton);
		WorkflowComments.sendKeys(TodoListExcel(4, 2));
		jsclick(WorkflowCommentsOKButton);
		Thread.sleep(8000);
	}
	
	
	
	

	
	
	
	public void LoggedInAsThirdUser() throws Exception {
	
		Thread.sleep(3000);
		refrshLogDipakTaskUser();
		Reporter.log("TaskUser3 Dipak Logged in successful");
	}
	
	
	public void VerifyingAnnotationPageByThirdUSerDipak() throws Exception {

		VisiblityOf(TodolistTab);
		jsclick(TodolistTab);
		Thread.sleep(3000);
		jsclick(NewItems);
		Thread.sleep(5000);
		jsclick(Open1stDocument);
		Thread.sleep(3000);
		alertIsPresent();
		acceptAlert();
		Thread.sleep(4000);
		AcceptButton.click();
		Reporter.log("Alert Message is Displayed");
		Thread.sleep(8000);
		//VisiblityOf(UpdateProperties);
		movingclkElement(UpdateProperties);
		Thread.sleep(2000);
		jsclick(Update4thUser);
		Thread.sleep(2000);
		jsclick(findBTN);
		Thread.sleep(2000);
		jsclick(RamUSer);
		Thread.sleep(3000);
		jsclick(OKBTNADDName);
		Thread.sleep(3000);
	
		jsclick(PropertiesUpdateSaveBTN);
		VisiblityOf(UpdateDialogOKBTN);
		jsclick(UpdateDialogOKBTN);
		Thread.sleep(5000);
		jsclick(AcceptButton);
		Thread.sleep(3000);
		WorkflowComments.sendKeys(TodoListExcel(5, 1));
		jsclick(WorkflowCommentsOKButton);
		Thread.sleep(8000);
	}

	
public void VerifyingAnnotationPageByFourthUSerRAm() throws Exception {

		
		jsclick(TodolistTab);
		Thread.sleep(3000);
		jsclick(NewItems);
		Thread.sleep(5000);
		jsclick(Open1stDocument);
		Thread.sleep(3000);
		alertIsPresent();
		acceptAlert();
		Thread.sleep(10000);
		AcceptButton.click();
		WorkflowComments.sendKeys(TodoListExcel(6, 1));
		jsclick(WorkflowCommentsOKButton);
		Thread.sleep(8000);
	}
	
	
	
	
public void SentItemsWithSummary() throws InterruptedException {
	Thread.sleep(2000);
	VisiblityOf(TestCabinet);
	movingDoublecli(TestCabinet,TestCabinet);
	Thread.sleep(2000);
	jsclick(dynamicWfDrawer);
	Thread.sleep(2000);
    movingDoublecli(DynamicWfAutoFolder, DynamicWfAutoFolder);
	VisiblityOf(OpenDocumentDWS);
	jsclick(OpenDocumentDWS);

	WebDriverWait wait =new WebDriverWait(driver,30);
	Thread.sleep(5000);
    wait.until(ExpectedConditions.visibilityOf((DWSdialogOKBTN)));
    movingclkElement(DWSdialogOKBTN);
    Thread.sleep(3000);
    alertIsPresent();
    acceptAlert();
    Thread.sleep(3000);
	jsclick(SummaryButton);
	Thread.sleep(13000);
	
	jsclick(summarycancelbtn);
    Reporter.log("Sent items (MetaData) functionality with  summary workflow status validation successfull",true);
	
}
	
	
	@FindBy(xpath = ("(//button[text()='Cancel'])[67]"))
	private WebElement summarycancelbtn;
	
	public WebElement getsummarycancelbtn() {
		return summarycancelbtn;
	}
	
	@FindBy(id = ("showTaskDescription"))
	private WebElement summaryshowdiscription;
	
	public WebElement getsummaryshowdiscription() {
		return summaryshowdiscription;
	}
	
	@FindBy(xpath = ("(//button[@type='button'][normalize-space()='Cancel'])[5]"))
	private WebElement summaryshowdiscriptioncancelbtn;
	
	public WebElement getsummaryshowdiscriptioncancelbtn() {
		return summaryshowdiscriptioncancelbtn;
	}
	
	@FindBy(xpath = ("(//a[normalize-space()='Properties - Show'])[1]"))
	private WebElement summaryshowproperties;
	
	public WebElement getsummaryshowproperties() {
		return summaryshowproperties;
	}
	
	@FindBy(xpath = ("(//a[normalize-space()='Summary Report - Show all'])[1]"))
	private WebElement summaryshowreportsshowall;
	
	public WebElement getsummaryshowreportsshowall() {
		return summaryshowreportsshowall;
	}
	
	@FindBy(xpath = ("(//button[text()='Cancel'])[67]"))
	private WebElement summaryshowreportscancelbtn;
	
	public WebElement getsummaryshowreportscancel() {
		return summaryshowreportscancelbtn;
	}
	
	
	@FindBy(css = ("#todoPending"))
	private WebElement TodolistPendingItems;
	
	public WebElement getTodolistPendingItems() {
		return TodolistPendingItems;
	}
	
	@FindBy(xpath = ("(//a[text()='All Items'])[2]"))
	private WebElement TodolistallItems;
	
	public WebElement getTodolistallItems() {
		return TodolistallItems;
	}
	@FindBy(xpath = ("//a[text()='Sent Items']"))
	private WebElement TodolistsentItems;
	public WebElement getTodolistsentItems() {
		return TodolistsentItems;
	}
	
	
	
	
	
	
	@FindBy(xpath = ("(//span[@class='jconfirm-title'])[1]"))
	private WebElement opendocwfvalidation;
	public WebElement getopendocwfvalidation() {
		return opendocwfvalidation;
	}
	
	
	 @FindBy(xpath = ("//*[@id=\"homeMenuBtn\"]/img	"))
		private WebElement RefreshButton;				
	 
	 public WebElement getRefreshButton() {
			return RefreshButton;
		}		
	
	 
	 public void LogVidyaTaskUser1() throws Exception {
		     LogoutPage();
		      Thread.sleep(3000);
		      WebElement Username=driver.findElement(By.xpath("//input[@id='userName']"));
				Thread.sleep(3000);
				Username.sendKeys(TodoListExcel(1, 1));
				driver.findElement(By.id("loginPassword")).sendKeys(TodoListExcel(2, 1));
				WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
				a1 = new Actions(driver);
				a1.moveToElement(room).click().build().perform();
				WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
				ro.click();
				WebElement ele=driver.findElement(By.id("submitid"));jsclick(ele);
				Thread.sleep(2000);
				Thread.sleep(3000);
				try {
					WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
					WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
					if(sessiomsg.isDisplayed()) {
				    jsclick(sessiomsgOK);
					}
					}
				catch (NoSuchElementException e) {
					Reporter.log("Login without msg");
				}
			}
			
	 
	 
	
	 public void SendingDocumentInworkflow() throws InterruptedException {
	       
		 Print pojo = new Print();
			movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
			Thread.sleep(3000);
			ElementToBeClickable(pojo.getDrawer());
			movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
			Thread.sleep(3000);
			movingDoublecli(pojo.getFolder(), pojo.getFolder());
			Thread.sleep(5000);                                
			WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"documentListTable\"]/tbody/tr[13]/td[1]"));
		    checkbox.click();
		    WebElement doc = driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[1]/ul/li[5]"));
		   movingElement(doc);
		   WebElement SendToWf = driver.findElement(By.xpath("//*[@id=\"sendtoworkflow\"]"));jsclick(SendToWf);
		   Thread.sleep(5000);
		  // SendToWf.sendKeys(WorkflowName);
		   WebElement NewManualforautococ= driver.findElement(By.xpath("//td[text()='New Manual for Automation']"));
          jsclick( NewManualforautococ);
          WebElement docSendDialogbocOKBTN= driver.findElement(By.xpath("(//button[@id='CommentsMessageModelOk'])[1]"));
		   jsclick(docSendDialogbocOKBTN);
		   Thread.sleep(5000);
		  
		   Reporter.log("document sent to workflow successfully");
			
		}
	
	 
	 
	 @FindBy(id = "cvModelLoginValidationMessage")
		private WebElement SessionMessage;

		@FindBy(id = "cvModelLoginValidationOk")
		private WebElement SessionMessageOK;
	 
	 
		public WebElement getSessionMessageOK() {
			return SessionMessageOK;
		}
	 
	 
	 
	 
	 
	
	 public void refrshLogDipakTaskUser() throws Exception {
		       LogoutPage();
		      Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(TodoListExcel(1, 3));
				driver.findElement(By.id("loginPassword")).sendKeys(TodoListExcel(2, 3));
				WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
				a1 = new Actions(driver);
				a1.moveToElement(room).click().build().perform();
				WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
				ro.click();
				WebElement ele=driver.findElement(By.id("submitid"));jsclick(ele);
				Thread.sleep(3000);
				try {
					WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
					WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
					if(sessiomsg.isDisplayed()) {
				    jsclick(sessiomsgOK);
					}
					}
				catch (NoSuchElementException e) {
					Reporter.log("Login without msg");
				}
			}
			
				
	 
	 
	 public void refrshLogNishaTaskUser() throws Exception {
			 LogoutPage();
		      Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(TodoListExcel(1, 2));
				driver.findElement(By.id("loginPassword")).sendKeys(TodoListExcel(2, 2));
				WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
				a1 = new Actions(driver);
				a1.moveToElement(room).click().build().perform();
				WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
				ro.click();
				WebElement ele=driver.findElement(By.id("submitid"));jsclick(ele);
				Thread.sleep(3000);
				try {
					WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
					WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
					if(sessiomsg.isDisplayed()) {
				    jsclick(sessiomsgOK);
					}
					}
				catch (NoSuchElementException e) {
					Reporter.log("Login without msg");
				}
			}
			
	 public void RamTaskUser() throws Exception {
      	LogoutPage();
	      Thread.sleep(3000);
			WebElement UserNam = driver.findElement(By.xpath("//input[@id='userName']"));
			  Thread.sleep(3000);
			  UserNam.sendKeys(TodoListExcel(5, 0));
			driver.findElement(By.id("loginPassword")).sendKeys(TodoListExcel(2, 2));
			WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
			a1 = new Actions(driver);
			a1.moveToElement(room).click().build().perform();
			WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
			ro.click();
			WebElement ele=driver.findElement(By.id("submitid"));jsclick(ele);
			Thread.sleep(3000);
			try {
				WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
				WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
				if(sessiomsg.isDisplayed()) {
			    jsclick(sessiomsgOK);
				}
				}
			catch (NoSuchElementException e) {
				Reporter.log("Login without msg");
			}
		}
	 
	 
	 public void SelectByUser() throws Exception {
		 WebElement selectbyuser = driver.findElement(By.id("rejectTaskCombo"));
		 Select s=new Select(selectbyuser);
		 s.selectByIndex(1);
	 }
	 
	 @FindBy(xpath = ("(//select[@id='rejectTaskCombo'])[1]"))
	 private WebElement UserSelection;
	 
	 @FindBy(xpath = ("//option[text()='(3) Task_3']"))
	 private WebElement UserSelectionTask3;
	 
	 public void TaskUser2RNishaRejectTheDocfromSearch() throws Exception {
			ToDoListTab todo = new ToDoListTab();
			
			jsclick(todo.getTodolistTab());
			Thread.sleep(3000);
			jsclick(todo.getNewItems());
			Thread.sleep(6000);
			ElementToBeClickable(Metadata);
			movingclkElement(Metadata);
	        Thread.sleep(3000);
			jsclick(RejectButton);
			Thread.sleep(3000);
			ElementToBeClickable(UserSelection);
            movingclkElement(UserSelection);
            Thread.sleep(3000);
            SelectByUser();
           Thread.sleep(10000);
			WorkflowComments.sendKeys(TodoListExcel(2, 5));
			Thread.sleep(3000);
			WorkflowCommentsOKButton.click();
			Thread.sleep(15000);

	 }

	 public static void WorkflowStatusDropdownForSearch() throws Exception {
			SearchFunction sr = new SearchFunction();
	        WebDriverWait wait=new WebDriverWait(driver,30);
	        jsclick(sr.getSearchTab());
			
			(sr.getforworkflowdropdown()).click();// Endworkflow
			(sr.getforworkflowEndWorkflow()).click();
			jsclick(sr.getFindButton());
			sr.SearchDocumentsInTodolistsearchtab();
			Thread.sleep(15000);
			jsclick(sr.getClearButton());
			Thread.sleep(8000);
			
			
			
	}
	 
	 
	
	 
	 
	 
	 
	 public void DynamicWorkFlowTodoListFunctionality() throws Exception {
		WebElement newDocumentTab = driver.findElement(By.xpath("(//a[@id='createDocument'])[1]"));
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		jsclick(newDocumentTab);
		WebElement DocumentLocation = driver.findElement(By.xpath("(//input[@id='createDocuemtnLocation'])[1]"));
		Thread.sleep(4000);
		jsclick(DocumentLocation);
		WebElement cabinet = driver.findElement(By.xpath("//*[@id=\"12103\"]/ins"));
		jsclick(cabinet);

		Thread.sleep(4000);
	   WebElement drawer = driver.findElement(By.xpath("//*[@id=\"12104\"]/ins"));
	   jsclick(drawer);
	   Thread.sleep(3000);
		WebElement folder = driver.findElement(By.xpath("//a[text()='Test apk']"));
	   movingclkElement(folder);
		WebElement OKbtn = driver.findElement(By.xpath("(//button[@id='navigatorTreeOk'])[1]"));
		Thread.sleep(3000);
		jsclick(OKbtn);
		Thread.sleep(5000);
		WebElement docTypeDropDown = driver.findElement(By.xpath("(//select[@id='docTypeList'])[1]"));
		movingclkElement(docTypeDropDown);
		Thread.sleep(4000);
		WebElement DynamicDocumentWF = driver.findElement(By.xpath("//option[text()='Dynamic document type']"));
		scrollDown(DynamicDocumentWF);
		DynamicDocumentWF.click();
		Thread.sleep(3000);
		WebElement User1 = driver.findElement(By.xpath("//*[@id=\"indices_65\"]"));
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
		WebElement User2 = driver.findElement(By.xpath("//*[@id=\"indices_66\"]"));
		jsclick(User2);
		Thread.sleep(3000);
		jsclick(findbtn);
		WebElement RNishaUser = driver.findElement(By.xpath("//*[@id=\"spanCheckDynamicUser_RNisha\"]"));
		jsclick(RNishaUser);
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		WebElement User3 = driver.findElement(By.xpath("//*[@id=\"indices_67\"]"));
		jsclick(User3);
		WebElement TextBoxSearch = driver.findElement(By.xpath("//*[@id=\"textForUserSearch\"]"));
		TextBoxSearch.sendKeys(TodoListExcel(1, 3));
		jsclick(findbtn);
		WebElement dipakUser = driver.findElement(By.xpath("//*[@id=\"spanCheckDynamicUser_dipak\"]"));
		jsclick(dipakUser);
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		WebElement KeyValue = driver.findElement(By.id("indices_278"));
		movingclkElement(KeyValue);
	    KeyValue.sendKeys("Dynamic");
		
		Thread.sleep(3000);
		WebElement moveToPlusIcon = driver.findElement(By.xpath("//*[@id=\"addPagesDropDown\"]/span"));
		movingElement(moveToPlusIcon);
		Thread.sleep(2000);
		WebElement browseOption = driver.findElement(By.xpath("//*[@id=\"viewDocumentAddPages\"]"));
	    Thread.sleep(1000);
		movingclkElement(browseOption);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Dollar.exe");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.alertIsPresent());
		 acceptAlert();
		 Thread.sleep(5000);
		 WebElement CreateBTN= driver.findElement(By.xpath("(//button[normalize-space()='Create'])[1]"));
		 jsclick(CreateBTN);
		 Thread.sleep(15000);
		WebElement viewOption = driver.findElement(By.xpath("(//button[normalize-space()='View'])[1]"));
		 jsclick(viewOption);
		 Thread.sleep(8000);
		 WebElement signaturetab = driver.findElement(By.xpath("(//span[@class='text'])[57]"));
		 jsclick(signaturetab);
		 Thread.sleep(4000);
		 WebElement page = driver.findElement(By.xpath("(//canvas[@class='lt-imageviewer-eventcanvas'])[3]"));
		 clickElement(page);
		 WebElement savetab = driver.findElement(By.xpath("//div[@id='saveAddedPages']//span[1]"));
		 jsclick(savetab);
		 Thread.sleep(8000);
		 WebElement saveOKBTN = driver.findElement(By.xpath("(//button[@id='messageButtonOK42'])[1]"));
		 jsclick(saveOKBTN);
		 Thread.sleep(3000);
	//	WebElement sendToWf = driver.findElement(By.xpath("(//span[@id='viewSendToWrkflw'])[1]"));
		jsclick(sendToWf);
		Thread.sleep(3000);
	//	WebElement dynamicwfnew = driver.findElement(By.xpath("(//td[contains(text(),'Dynamic workflow')])[1]"));
	    jsclick(dynamicwfnew);
	 //   WebElement applyBTN = driver.findElement(By.xpath("(//button[@id='sidbisendworkflowOk'])[1]"));
	     jsclick(applyBTN);
	     Thread.sleep(10000);
	//    WebElement sendwfsuccessdialogOKBTN = driver.findElement(By.xpath("(//button[@id='CommentsMessageModelOk'])[1]"));
	    jsclick(sendwfsuccessdialogOKBTN);
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 



	@FindBy(xpath = ("//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]"))
	private WebElement TodolistDoc;
	
	@FindBy(xpath = ("//a[@id='accept']"))
	private WebElement AcceptButton;
;
	
	@FindBy(xpath = ("//a[@id='reject']"))
	private WebElement RejectButton;
	
	@FindBy(xpath = ("//a[@id='endwf']"))
	private WebElement EndWfButton;
	
	@FindBy(xpath = ("/html/body/div[57]/div[59]/div[4]/div[2]/div[4]/div/div[2]/div[2]/table/tbody/tr[2]/td/div/div[1]/div/div/div/div[2]/a"))
	private WebElement SummaryButton;
	
	@FindBy(xpath = ("(//a[normalize-space()='Comment'])[1]"))
	private WebElement CommentButton;
	
	public WebElement getCommentButton() {
		return CommentButton;
	}
			
			@FindBy(xpath = ("//*[@id=\"todoReviewed\"]"))
	private WebElement RewiewITems;
	
	public WebElement getRewiewITems() {
		return RewiewITems;
	}
	@FindBy(xpath = ("(//a[normalize-space()='Review'])[1]"))
	private WebElement RewiewBTN;
	
	public WebElement getRewiewBTN() {
		return RewiewBTN;
	}	
			
	
			
	@FindBy(xpath = ("(//textarea[@id='wfcomments'])[1]"))
	private WebElement CommenttextBox;
			
	public WebElement getCommenttextBox() {
	return CommenttextBox;
			}
	
	
	@FindBy(xpath = ("(//button[@id='wfactionOk'])[1]"))
	private WebElement CommenttextBoxOKBTN;
			
	public WebElement getCommenttextBoxOKBTN() {
	return CommenttextBoxOKBTN;
			}
	
	@FindBy(xpath = ("//textarea[@id='wfcomments']"))
	private WebElement WorkflowComments;
	
	@FindBy(xpath = ("//button[@id='wfactionOk']"))
	private WebElement WorkflowCommentsOKButton;
	
	@FindBy(xpath = ("(//h2[@class='headerText'])[52]"))
	private WebElement assertvalid;
	


}
