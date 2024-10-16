package Pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
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

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class ToDoListTab extends BaseClass {

	public ToDoListTab() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//a[@id='myTaskMenu']"))
	private WebElement TodolistTab;

	@FindBy(xpath = ("(//a[@id='createDocument'])[1]"))
	private WebElement newDocumentTab;

	@FindBy(xpath = ("//*[@id=\"createDocuemtnLocation\"]"))
	private WebElement DocumentLocation;

	@FindBy(xpath = ("//div[@id='createDocuemntNavigator']/ul/li[5]/ins"))
	private WebElement cabinet;

	@FindBy(xpath = ("//div[@id='createDocuemntNavigator']/ul/li[5]/ul/li[1]/ins"))
	private WebElement drawer;

	@FindBy(xpath = ("//div[@id='createDocuemntNavigator']/ul/li[5]/ul/li[1]/ul/li/a"))
	private WebElement folder;

	@FindBy(xpath = ("(//button[@id='navigatorTreeOk'])[1]"))
	private WebElement OKbtn;

	@FindBy(xpath = ("(//select[@id='docTypeList'])[1]"))
	private WebElement docTypeDropDown;

	@FindBy(xpath = ("//*[@id=\"docTypeDivElements\"]/select/option[22]"))
	private WebElement DynamicDocumentWF;// u can change the document type by changing the number

	@FindBy(xpath = ("//*[@id=\"docTypeIndicesTable\"]/tbody/tr[1]/td[2]/input"))
	private WebElement User1;

	@FindBy(xpath = ("//*[@id=\"searchDynamicUser\"]"))
	private WebElement findbtn;

	@FindBy(xpath = ("//*[@id=\"spanCheckDynamicUser_vidya\"]"))
	private WebElement User1Vidya;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeCancle5\"]"))
	private WebElement usergrpOKBtn;

	@FindBy(xpath = ("//*[@id='spanCheckDynamicUser_rnisha']"))
	private WebElement RNishaUser;

	@FindBy(xpath = ("//*[@id=\"docTypeIndicesTable\"]/tbody/tr[2]/td[2]/input"))
	private WebElement User2;

	@FindBy(xpath = ("//*[@id=\"docTypeIndicesTable\"]/tbody/tr[3]/td[2]/input"))
	private WebElement User3;

	@FindBy(xpath = ("//*[@id=\"textForUserSearch\"]"))
	private WebElement TextBoxSearch;

	@FindBy(xpath = ("//*[@id=\"spanCheckDynamicUser_dipak\"]"))
	private WebElement dipakUser;

	@FindBy(xpath = ("//*[@id=\"docTypeIndicesTable\"]/tbody/tr[4]/td[2]/input")) // doc key indices
	private WebElement KeyValue;

	@FindBy(xpath = ("//*[@id=\"addPagesDropDown\"]/span"))
	private WebElement moveToPlusIcon;

	@FindBy(xpath = ("//*[@id=\"addDocdropdwn\"]/div[1]/div[1]"))
	private WebElement browseOption;

	@FindBy(xpath = ("(//button[normalize-space()='Create'])[1]"))
	private WebElement CreateBTN;

	@FindBy(xpath = ("(//button[normalize-space()='View'])[1]"))
	private WebElement viewOption;

	@FindBy(xpath = ("//a[@id='newItems']"))
	private WebElement NewItems;

	@FindBy(xpath = ("//*[@id=\"todoListTable\"]/tbody/tr[1]/td[1]"))
	private WebElement Metadata;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/a"))
	private WebElement TestCabinet;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[5]/ins"))
	private WebElement dynamicWfDrawer;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[5]/ul/li[3]/a"))
	private WebElement DynamicWfAutoFolder;

	@FindBy(xpath = ("(//span[@id='viewSendToWrkflw'])[1]"))
	private WebElement sendToWf;

	@FindBy(xpath = ("//*[@id='Ulsidbisendworkflow']//tbody/tr/td[1]"))//Change td to get another
	private WebElement dynamicwfnew;

	@FindBy(xpath = ("(//button[@id='sidbisendworkflowOk'])[1]"))
	private WebElement applyBTN;

	@FindBy(xpath = ("(//button[@id='CommentsMessageModelOk'])[1]"))
	private WebElement sendwfsuccessdialogOKBTN;

	@FindBy(xpath = ("//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]"))
	private WebElement Open1stDocument;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[6]/td[3]"))
	private WebElement OpenDocument;

	@FindBy(xpath = ("/html/body/div[56]/div[59]/div[4]/div[2]/div[1]/div/div[2]/div[2]/table/tbody/tr[1]/td[3]"))
	private WebElement OpenDocumentDWS;

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

	@FindBy(id = "docTypeList")
	private WebElement Click_Document_Type_Dropdown;

	public void getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("Dynamic WorkFlow NR");//Dynamic document type

	}

	public void AnnotationPageSendWF() throws Exception {

		VisiblityOf(TestCabinet);
		Reporter.log("Scenario 01:Workflow with Annotations added check");
		Thread.sleep(4000);
		selectElement(TestCabinet);
		Reporter.log("Expand cabinet");
		Thread.sleep(3000);
		jsclick(dynamicWfDrawer);
		Thread.sleep(4000);
		ElementToBeClickable(DynamicWfAutoFolder);
		selectElement(DynamicWfAutoFolder);
		Thread.sleep(5000);
		VisiblityOf(newDocumentTab);
		jsclick(newDocumentTab);
		Thread.sleep(3000);

		Reporter.log("Click on destination folder dialog OK button");
		Thread.sleep(5000);

		jsclick(docTypeDropDown);
		Reporter.log("Select Dynamic workflow document type");
		Thread.sleep(4000);

		scrollDown(DynamicDocumentWF);
		Reporter.log("Click on User1 textbox");
		DynamicDocumentWF.click();
		Thread.sleep(3000);
		Reporter.log("Select Task user1");
		Reporter.log("Click on Select task user dialog OK button");

		jsclick(User1);
		Thread.sleep(3000);

		jsclick(findbtn);
		Thread.sleep(3000);
		Reporter.log("Click on User2 text box");
		jsclick(RNishaUser);
		Reporter.log("Select Task user2");
		Reporter.log("Click on Select task user dialog OK button");
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		jsclick(User2);
		Reporter.log("Click on User_3 textbox");
		Thread.sleep(3000);
		Reporter.log("Select Task user3");
		Reporter.log("Click on Select task user dialog OK button");
		jsclick(findbtn);
		jsclick(User1Vidya);
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		Reporter.log("USer click on Select user dialog OK button");
		jsclick(User3);
		TextBoxSearch.sendKeys(TodoListExcel(1, 3));
		jsclick(findbtn);
		jsclick(dipakUser);
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		movingclkElement(KeyValue);
		Reporter.log("Enter data in key value");
		KeyValue.sendKeys("AllUserAccept");

		Thread.sleep(3000);
		Reporter.log("Mousehover on add icon");

		movingElement(moveToPlusIcon);
		Thread.sleep(5000);
		Reporter.log("Select a browse option");
		Thread.sleep(5000);
		VisiblityOf(browseOption);
		movingclkElement(browseOption);
		Reporter.log("Add a file by using AutoIT script");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\SIDBIAuto.exe");
		Thread.sleep(7000);
		try {

			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {

			Reporter.log("Page Alert is not present");
		}

		Thread.sleep(5000);
		jsclick(CreateBTN);
		Reporter.log("Click on create button");
		Thread.sleep(15000);
		jsclick(viewOption);
		Reporter.log("Click on view button");
		Thread.sleep(8000);

		VisiblityOf(sendToWf);

		jsclick(sendToWf);
		Thread.sleep(3000);

		jsclick(dynamicwfnew);

		jsclick(applyBTN);
		Thread.sleep(10000);
		jsclick(sendwfsuccessdialogOKBTN);
		jsclick(RefreshButton);
		Thread.sleep(8000);
		VisiblityOf(TodolistTab);
		movingElement(TodolistTab);
		Thread.sleep(4000);
		movingclkElement(TodolistPendingItems);
		Thread.sleep(8000);
		jsclick(Metadata);
		Thread.sleep(3000);
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
		// log.info("New manual for automation first task user vidya has logged in
		// successful");
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
		} catch (Exception e) {
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
		Reporter.log("Select todolist tab");
		jsclick(TodolistTab);
		Reporter.log("Select newitems");
		Thread.sleep(3000);
		jsclick(NewItems);
		Thread.sleep(5000);
		Reporter.log("Open first document");
		jsclick(Open1stDocument);
		Thread.sleep(3000);
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("Alert not presert");
		}
		Thread.sleep(4000);
		Reporter.log("User click on accept button");
		AcceptButton.click();
		Reporter.log("Alert Message is Displayed");
		Thread.sleep(8000);
		// VisiblityOf(UpdateProperties);
		Reporter.log(
				"In this wf only 3 users are available.So the user unable to send the document to 4th user so he add one more user");
		movingclkElement(UpdateProperties);
		Thread.sleep(2000);
		Reporter.log("Select update property");
		jsclick(Update4thUser);
		Reporter.log("CLick user_4 textbox");
		Thread.sleep(2000);
		jsclick(findBTN);
		Reporter.log("User select Ram named user");
		Thread.sleep(2000);
		jsclick(RamUSer);
		Reporter.log("Click on user dialog OK button");
		Thread.sleep(3000);
		jsclick(OKBTNADDName);
		Thread.sleep(3000);
		Reporter.log("Click on properties update save button");
		jsclick(PropertiesUpdateSaveBTN);
		VisiblityOf(UpdateDialogOKBTN);
		jsclick(UpdateDialogOKBTN);
		Thread.sleep(5000);
		Reporter.log("Now the user can able to sent the document to workflow ");
		jsclick(AcceptButton);
		Thread.sleep(3000);
		Reporter.log("User click on accept button");
		WorkflowComments.sendKeys(TodoListExcel(5, 1));
		Reporter.log("USer enter a comment and click on comment dilaog OK button");
		jsclick(WorkflowCommentsOKButton);
		Thread.sleep(8000);
	}

	public void VerifyingAnnotationPageByFourthUSerRAm() throws Exception {

		jsclick(TodolistTab);
		Reporter.log("Select todolist tab");
		Thread.sleep(3000);
		jsclick(NewItems);
		Reporter.log("Select a newitems");
		Thread.sleep(5000);
		Reporter.log("Open a first wf document");
		jsclick(Open1stDocument);
		Thread.sleep(3000);
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("Alert not presert");
		}
		Thread.sleep(7000);
		Reporter.log("Click on accept button");
		AcceptButton.click();
		Reporter.log("The document accepted by 4th user.");
		WorkflowComments.sendKeys(TodoListExcel(6, 1));
		jsclick(WorkflowCommentsOKButton);
		Reporter.log("Workflow with all user accpet condition Scenario working fine");
		Thread.sleep(8000);
	}

	public void SentItemsWithSummary() throws InterruptedException {
		Thread.sleep(2000);
		VisiblityOf(TestCabinet);
		movingDoublecli(TestCabinet, TestCabinet);
		Thread.sleep(2000);
		jsclick(dynamicWfDrawer);
		Thread.sleep(2000);
		movingDoublecli(DynamicWfAutoFolder, DynamicWfAutoFolder);
		VisiblityOf(OpenDocumentDWS);
		jsclick(OpenDocumentDWS);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf((DWSdialogOKBTN)));
		movingclkElement(DWSdialogOKBTN);
		Thread.sleep(3000);
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("Alert not presert");
		}
		Thread.sleep(3000);
		jsclick(SummaryButton);
		Thread.sleep(13000);

		jsclick(summarycancelbtn);
		Reporter.log("Sent items (MetaData) functionality with  summary workflow status validation successfull", true);

	}

	@FindBy(xpath = ("/html/body/div[64]/div[2]/div/div/div/div/div/div/div/div[4]/button"))
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

	@FindBy(xpath = ("(//a[normalize-space()='Properties - Show'])[1]"))
	private WebElement summaryshowproperties;

	@FindBy(xpath = ("(//a[normalize-space()='Summary Report - Show all'])[1]"))
	private WebElement summaryshowreportsshowall;

	@FindBy(xpath = ("(//button[text()='Cancel'])[67]"))
	private WebElement summaryshowreportscancelbtn;

	@FindBy(xpath = ("//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]"))
	private WebElement TodolistDoc;

	@FindBy(xpath = ("//*[@id='todobuttons']/a[1]"))//change the 2
	private WebElement AcceptButton;;

	@FindBy(xpath = ("//*[@id='todobuttons']/a[2]"))
	private WebElement RejectButton;

	@FindBy(xpath = ("//*[@id='todobuttons']/a[3]"))
	private WebElement EndWfButton;

	@FindBy(id = ("summary1"))
	private WebElement SummaryButton;

	@FindBy(xpath = ("//*[@id='todobuttons']/a[5]"))
	private WebElement CommentButton;

	@FindBy(xpath = ("//*[@id=\"taskMenu\"]/li[3]"))
	private WebElement RewiewITems;

	@FindBy(xpath = ("(//a[normalize-space()='Review'])[1]"))
	private WebElement RewiewBTN;

	@FindBy(xpath = ("(//textarea[@id='wfcomments'])[1]"))
	private WebElement CommenttextBox;

	@FindBy(xpath = ("(//button[@id='wfactionOk'])[1]"))
	private WebElement CommenttextBoxOKBTN;

	@FindBy(xpath = ("//textarea[@id='wfcomments']"))
	private WebElement WorkflowComments;

	@FindBy(xpath = ("//button[@id='wfactionOk']"))
	private WebElement WorkflowCommentsOKButton;

	@FindBy(xpath = ("(//h2[@class='headerText'])[52]"))
	private WebElement assertvalid;

	@FindBy(xpath = ("//*[@id=\"taskMenu\"]/li[2]")) // pending items
	private WebElement TodolistPendingItems;

	@FindBy(xpath = ("//*[@id=\"taskMenu\"]/li[4]")) // all items
	private WebElement TodolistallItems;

	@FindBy(xpath = ("//*[@id=\"taskMenu\"]/li[5]"))
	private WebElement TodolistsentItems;

	@FindBy(xpath = ("(//span[@class='jconfirm-title'])[1]"))
	private WebElement opendocwfvalidation;

	@FindBy(xpath = ("//*[@id=\"sendtoworkflow\"]"))
	private WebElement SendToWF;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]"))
	private WebElement CheckBox;

	@FindBy(xpath = ("//*[@id=\"pageheader\"]/div[1]/ul/li[5]"))
	private WebElement DocumentList;

	@FindBy(xpath = ("(//button[@id='CommentsMessageModelOk'])[1]"))
	private WebElement docSendDialogbocOKBTN;

	@FindBy(xpath = ("//*[@id=\"assignedWfTable\"]/tbody/tr[5]/td"))
	private WebElement AnyWorkflow;// new manual for automation///Here u can change the number so that it will
									// change the wf names position

	@FindBy(xpath = ("//*[@id=\"homeMenuBtn\"]/img	"))
	private WebElement RefreshButton;

	public void LogVidyaTaskUser1() throws Exception {
		Thread.sleep(4000);
		LogoutPage();
		Reporter.log("Scenario 02: Task User Log into EWA");

		Thread.sleep(3000);
		WebElement Username = driver.findElement(By.xpath("//input[@id='userName']"));
		Thread.sleep(3000);
		Reporter.log("Enter task user name into user name field ");
		Username.sendKeys(TodoListExcel(1, 1));
		driver.findElement(By.id("loginPassword")).sendKeys("vw");//TodoListExcel(2, 1)
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByIndex(3);
		Thread.sleep(3000);
		Reporter.log("Click on Login Button");
		try {
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
		} catch (Exception e) {
			System.out.println("Captcha is not there");
		}
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.id("submitid"));
		jsclick(ele);
		Thread.sleep(2000);

		try {
			WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
			WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
			if (sessiomsg.isDisplayed()) {
				jsclick(sessiomsgOK);
			}
		} catch (NoSuchElementException e) {
			Reporter.log("Login without session message...");
		}

		Reporter.log("Task user logged into EWA successfully...");
	}

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/a"))
	private WebElement Cabinet;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li/a"))
	private WebElement Drawer;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li/ul/li[1]/a"))
	private WebElement Folder;

	public void SendingDocumentInworkflow() throws InterruptedException {

		Print pojo = new Print();
		Thread.sleep(5000);
		ElementToBeClickable(Cabinet);
		selectElement(Cabinet);
		Reporter.log("Scenario 01: Document send to manual workflow");
		Thread.sleep(3000);
		Reporter.log("Expand the cabinet");
		ElementToBeClickable(Drawer);
		selectElement(Drawer);
		Reporter.log("Expand the drawer");
		Thread.sleep(3000);
		selectElement(Folder);
		Thread.sleep(5000);
		Reporter.log("Open any folder");

		CheckBox.click();
		Reporter.log("Select any document from the document list");

		movingElement(DocumentList);
		Reporter.log("Mousehover on document tab");

		jsclick(SendToWF);
		Thread.sleep(5000);
		Reporter.log("Select sendto workflow option");

		jsclick(AnyWorkflow);
		Reporter.log("Select any workflow");

		jsclick(docSendDialogbocOKBTN);
		Reporter.log("Document send to workflow successfully dialog will be appeared...");
		Thread.sleep(5000);
		Reporter.log("Click confirmation dialog OK button");

		Reporter.log("Document send to manual workflow successfully");

	}

	@FindBy(id = "cvModelLoginValidationMessage")
	private WebElement SessionMessage;

	@FindBy(id = "cvModelLoginValidationOk")
	private WebElement SessionMessageOK;

	public void refrshLogDipakTaskUser() throws Exception {
		LogoutPage();
		Reporter.log("Scenario 06: Task user log into EWA");
		Thread.sleep(3000);
		Reporter.log("Enter valid task user name into user name field");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(TodoListExcel(1, 3));
		Reporter.log("Enter valid password into password field");
		driver.findElement(By.id("loginPassword")).sendKeys(TodoListExcel(2, 3));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByIndex(3);
		Thread.sleep(3000);
		try {
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
		} catch (Exception e) {
			System.out.println("Captcha is not there");
		}
		Thread.sleep(3000);
		Reporter.log("Click login button");
		WebElement ele = driver.findElement(By.id("submitid"));
		jsclick(ele);
		Thread.sleep(3000);
		try {
			WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
			WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
			if (sessiomsg.isDisplayed()) {
				jsclick(sessiomsgOK);
			}
		} catch (NoSuchElementException e) {
			Reporter.log("Login without session  message");
		}
		Reporter.log("Task user log into EWA successfully...");
	}

	public void refrshLogNishaTaskUser() throws Exception {
		LogoutPage();
		Reporter.log("Scenario 4: Task user Log into EWA ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(TodoListExcel(1, 2));
		Reporter.log("Enter valid task name into user name field");
		driver.findElement(By.id("loginPassword")).sendKeys("vw");//TodoListExcel(2, 2)
		Reporter.log("Enter valid password into password field ");
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByIndex(3);
		Thread.sleep(3000);
		Reporter.log("Click Login button");
		try {
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
		} catch (Exception e) {
			System.out.println("Captcha is not there");
		}
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("submitid"));
		jsclick(ele);
		Thread.sleep(3000);
		try {
			WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
			WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
			if (sessiomsg.isDisplayed()) {
				jsclick(sessiomsgOK);
			}
		} catch (NoSuchElementException e) {
			Reporter.log("Login without session message");
		}
		Reporter.log("Task user Logged into EWA successfully...");
	}

	public void RamTaskUser() throws Exception {
		LogoutPage();

		Reporter.log("User logout the session");
		Thread.sleep(3000);
		WebElement UserNam = driver.findElement(By.xpath("//input[@id='userName']"));
		Thread.sleep(3000);
		UserNam.sendKeys(TodoListExcel(5, 0));
		driver.findElement(By.id("loginPassword")).sendKeys("vw");//TodoListExcel(2, 2)
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByIndex(3);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("submitid"));
		jsclick(ele);
		Thread.sleep(3000);
		try {
			WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
			WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
			if (sessiomsg.isDisplayed()) {
				jsclick(sessiomsgOK);
			}
		} catch (NoSuchElementException e) {
			Reporter.log("Login without msg");
		}
		Reporter.log("User login as Ram user");
	}

	public void SelectByUser() throws Exception {
		WebElement selectbyuser = driver.findElement(By.id("rejectTaskCombo"));
		Select s = new Select(selectbyuser);
		s.selectByIndex(1);
	}

	@FindBy(xpath = ("(//select[@id='rejectTaskCombo'])[1]"))
	private WebElement UserSelection;

	@FindBy(xpath = ("//option[text()='(3) Task_3']"))
	private WebElement UserSelectionTask3;
	
	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id='viewDocumentAddPages']")
	private WebElement Browse_Option;

	public void DynamicWorkFlowTodoListFunctionality() throws Exception {

		Thread.sleep(4000);
		Reporter.log("Scenario 01: Document send to - Dynamic workflow");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		VisiblityOf(newDocumentTab);
		Reporter.log("Click on New document tab");
		jsclick(newDocumentTab);
		Thread.sleep(4000);
		Reporter.log("Click on Document location textbox");
		jsclick(DocumentLocation);
		jsclick(cabinet);
		Reporter.log("Expand the cabinet");
		Thread.sleep(4000);
		jsclick(drawer);
		Reporter.log("Expand the drawer");
		Thread.sleep(3000);
		jsclick(folder);
		Reporter.log("Select a folder");

		Thread.sleep(3000);
		jsclick(OKbtn);
		Reporter.log("Click on destination folder dialog OK button");
		Thread.sleep(5000);

		movingclkElement(docTypeDropDown);
		Reporter.log("Select Dynamic workflow document type");
		Thread.sleep(4000);
		getSelect_Document_Type_Dropdown();
		Reporter.log("Click on User1 textbox");

		Thread.sleep(3000);
		Reporter.log("Select Task user1");
		Reporter.log("Click on Select task user dialog OK button");

		jsclick(User1);
		Thread.sleep(3000);

		jsclick(findbtn);
		Thread.sleep(3000);
		Reporter.log("Click on User2 text box");
		jsclick(User1Vidya);
		Reporter.log("Select Task user2");
		Reporter.log("Click on Select task user dialog OK button");
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		jsclick(User2);
		Reporter.log("Click on User_3 textbox");
		Thread.sleep(3000);
		Reporter.log("Select Task user3");
		Reporter.log("Click on Select task user dialog OK button");
		jsclick(findbtn);
		jsclick(RNishaUser);
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		Reporter.log("USer click on Select user dialog OK button");
		jsclick(User3);
		TextBoxSearch.sendKeys(TodoListExcel(1, 3));
		jsclick(findbtn);
		jsclick(dipakUser);
		movingclkElement(usergrpOKBtn);
		Thread.sleep(4000);
		movingclkElement(KeyValue);
		Reporter.log("Enter data in key value");
		KeyValue.sendKeys("Dynamic");

		Thread.sleep(3000);
		Reporter.log("Mousehover on add icon");
		movingElement(Move_To_PlusIcon);

		try {
            Actions act=new Actions(driver);
			act.moveToElement(Browse_Option).click().build().perform();
		} catch (JavascriptException e) {
			System.out.println("Exception there");
		}

		Thread.sleep(25000);
		try {
			Process proc = Runtime.getRuntime().exec("D:\\RNishaAutoIt\\NishaRScript.exe");
			InputStream is = proc.getInputStream();
			int ret = 0;
			while (ret != -1) {
				ret = is.read();

			}
		} catch (Exception e) {
			System.out.println("Creating document without page");
		}
		try {

			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {

			Reporter.log("Page Alert is not present");
		}

		Thread.sleep(5000);
		jsclick(CreateBTN);
		Reporter.log("Click on create button");
		Thread.sleep(15000);
		jsclick(viewOption);
		Reporter.log("Click on view button");
		Thread.sleep(8000);

		jsclick(sendToWf);
		Reporter.log("Click SendtoWorkflow button");
		Thread.sleep(3000);

		jsclick(dynamicwfnew);
		Reporter.log("Select any dynamic workflow");

		jsclick(applyBTN);
		Reporter.log("Click on apply button");
		Thread.sleep(10000);

		jsclick(sendwfsuccessdialogOKBTN);
		Reporter.log("Document sent to workflow Successfully dialog will appear...");
		Reporter.log("Click confirmation dialog OK button");
	}

	public void dynamicWF_MetaDataAgree_Vidya() throws Exception {

		ToDoListTab todo = new ToDoListTab();
		SoftAssert so = new SoftAssert();
		jsclick(Refresh_Button(driver));
		Reporter.log("Scenario 03: Task user1 Accept the dynmaic Workflow document");
		Reporter.log("Select Todolist tab");
		Thread.sleep(3000);
		jsclick(TodolistTab);
		Thread.sleep(3000);
		Reporter.log("Select New items");
		jsclick(NewItems);
		Thread.sleep(5000);
		movingclkElement(Metadata);
		Reporter.log("Expand workflow document metadata");
		Thread.sleep(3000);
		CommentButton.click();
		Reporter.log("Click on comment button");
		CommenttextBox.sendKeys(TodoListExcel(4, 0));
		Thread.sleep(3000);
		Reporter.log("Add comment into comment dialog");
		jsclick(CommenttextBoxOKBTN);
		Reporter.log("Click on comment dialog OK button");
		Thread.sleep(4000);
		Reporter.log("click on Accept button");
		AcceptButton.click();
		Reporter.log("Enter comment into the Accept dialog box");
		so.assertTrue(assertvalid.isDisplayed(), "The workflow status dialog box opened successfull");
		WorkflowComments.sendKeys(TodoListExcel(3, 2));
		jsclick(WorkflowCommentsOKButton);
		Reporter.log("Click on Accept dialog OK button");
		Thread.sleep(8000);
		Reporter.log("TaskUser1 Accept the document successfully...");
		Reporter.log("Task user1 logout the session successfully...");
	}

	public void DynamicWF_user2_RNishaAcceptTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		SoftAssert so = new SoftAssert();
		Reporter.log("Scenario 05: Task user2 Accept dynamic Workflow document ");
		jsclick(TodolistTab);
		Reporter.log("Select Todolist tab");
		Thread.sleep(3000);
		jsclick(NewItems);
		Reporter.log("Select New items");
		VisiblityOf(TodolistDoc);
		jsclick(TodolistDoc);
		Reporter.log("Open a received workflow document");
		Thread.sleep(6000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			System.out.println("alert is not present");
		}
		Thread.sleep(6000);
		jsclick(CommentButton);
		Reporter.log("Click on comment button");
		Thread.sleep(3000);
		Reporter.log("Enter comment and click on comment dialog OK butoton");
		CommenttextBox.sendKeys(TodoListExcel(4, 0));
		Thread.sleep(3000);
		jsclick(CommenttextBoxOKBTN);
		Reporter.log("Comment added successfully...");
		Thread.sleep(4000);
		Reporter.log("Click on Accept button");
		jsclick(AcceptButton);
		Thread.sleep(3000);
		Reporter.log("Enter comment into Accept dialog box");
		WorkflowComments.sendKeys(TodoListExcel(1, 4));
		jsclick(WorkflowCommentsOKButton);
		Reporter.log("Click on accept dialog OK button");
		Thread.sleep(8000);
		Reporter.log("Task user _2 accept the document successfully...");
		Reporter.log("Task user2 logout the session successfully...");
		// log.info("TaskUser2 RNisha has received the document successful.RNisha Accept
		// dynamic wf document");
	}

	public void DynamicWF_user3_DipakRejectTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		Reporter.log("Scenario 07: Task User 3 Reject the dynamic workflow document");
		SoftAssert so = new SoftAssert();
		Reporter.log("Select a todolist tab");
		jsclick(TodolistTab);
		Thread.sleep(3000);
		Reporter.log("Select New items");
		jsclick(NewItems);
		Thread.sleep(6000);
		Reporter.log("Expand any document metadata option");
		VisiblityOf(Metadata);
		movingclkElement(Metadata);
		Thread.sleep(3000);
		Reporter.log("Select Reject button");
		jsclick(RejectButton);
		Thread.sleep(3000);
		Reporter.log("Enter comment in the Reject dialog box");
		WorkflowComments.sendKeys(TodoListExcel(1, 5));
		Thread.sleep(3000);
		WorkflowCommentsOKButton.click();

		Thread.sleep(8000);
		jsclick(Refresh_Button(driver));
		Reporter.log("Click on Reject dialog box OK button");
		Reporter.log("Task user_3 Rejected the document");

	}

	public void SendAndNewItemsMetaDataAgree() throws Exception {
		Reporter.log("Scenario 03:Task User1 Accept the workflow document");
		ToDoListTab todo = new ToDoListTab();
		SoftAssert so = new SoftAssert();
		Thread.sleep(3000);
		jsclick(TodolistTab);
		Reporter.log("Click on Todolist tab");
		Thread.sleep(3000);

		jsclick(NewItems);
		Reporter.log("Select Newitems option");
		Thread.sleep(5000);
		ElementToBeClickable(Metadata);
		movingclkElement(Metadata);
		Thread.sleep(3000);
		Reporter.log("Expand a document metadata option");
		AcceptButton.click();
		Reporter.log("Click on Accept button");
		so.assertTrue(assertvalid.isDisplayed(), "The workflow status dialog box opened successfull");
		WorkflowComments.sendKeys(TodoListExcel(2, 0));
		Reporter.log("Add comment in Accept dialog");
		jsclick(WorkflowCommentsOKButton);
		Reporter.log("Click on Accept dialog OK button");
		Thread.sleep(8000);

		Reporter.log("Task user1 Accept the document successfully...");

		Reporter.log("Task user1 Logout the Session...");
	}

	public void TaskUser2RNishaRejectTheDocument() throws Exception {
		ToDoListTab todo = new ToDoListTab();
		SoftAssert so = new SoftAssert();
		Reporter.log("Scenario 05: Task user2 Reject the workflow document");
		jsclick(TodolistTab);
		Reporter.log("Click on Todolist tab ");
		Thread.sleep(3000);
		jsclick(NewItems);
		Reporter.log("Cick on New items Option");
		Thread.sleep(3000);
		ElementToBeClickable(Metadata);
		movingclkElement(Metadata);
		Reporter.log("Expand workflow document metadata option");
		Thread.sleep(3000);
		jsclick(RejectButton);
		Reporter.log("Click Reject button");
		Thread.sleep(3000);
		Reporter.log("Add comment in Reject dialog box");
		WorkflowComments.sendKeys(TodoListExcel(2, 5));
		WorkflowCommentsOKButton.click();
		Thread.sleep(10000);
		Reporter.log("Click on Reject dialog OK button");
		Reporter.log("Rejected Document  Move to Task User3 successfully...");
		Reporter.log("Click on Reject dialog OK button");
		Reporter.log("Task user 2 logout the session successfully...");
		// log.info("TaskUser2 RNisha has received the document successful.RNisha Reject
		// the document");
	}

	public void SummaryStatusDialogBoxFucntions() throws InterruptedException {

		SoftAssert so = new SoftAssert();
		jsclick(TodolistTab);
		Reporter.log("USer click on todolist tab");
		Thread.sleep(3000);
		jsclick(NewItems);
		Reporter.log("Select new items submenu");
		Thread.sleep(5000);
		VisiblityOf(Metadata);
		Reporter.log("User Expand the todolist newitems documents's metadata");
		clickElement(Metadata);
		Thread.sleep(5000);
		Reporter.log("User click on summary button");
		jsclick(SummaryButton);
		Thread.sleep(5000);
		Reporter.log("USer check the summary of the document");
		jsclick(SummaryButton);
		Reporter.log("User Expand the todolist newitems documents's metadata");
		Reporter.log("Task user3 Dipak has shows the Summary of a document it shows added comments successfully");
		// log.info("Task user3 Dipak has shows the Summary of a document it shows added
		// comments successfully");
	}

	public void DocEndedFromTask3DipakUser() throws Exception {

		Reporter.log("Scenario 07: Task user3 will do End workflow");
		movingElement(TodolistTab);
		Thread.sleep(3000);
		Reporter.log("Click Todo list tab");
		jsclick(NewItems);
		Reporter.log("Select New items");
		Thread.sleep(3000);
		Reporter.log("Expand New items document metadata");
		VisiblityOf(Metadata);
		jsclick(Metadata);
		Reporter.log("Click on Endworkflow button");
		Thread.sleep(3000);
		jsclick(EndWfButton);
		Thread.sleep(3000);
		Reporter.log("Enter comment in Endworkflow dialog");
		WorkflowComments.sendKeys(TodoListExcel(2, 6));
		WorkflowCommentsOKButton.click();
		Reporter.log("Click Endworkflow dialog OK button");
		Thread.sleep(15000);

		Reporter.log("Task user 3 successfully completed the workflow...");
		jsclick(Refresh_Button(driver));
		Thread.sleep(3000);
	}

}
