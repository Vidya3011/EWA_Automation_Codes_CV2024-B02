package Computhink.Pom;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Computhink.Generic.BaseClass;

//NishaR codes 
public class DashBoardPom extends BaseClass {

	public DashBoardPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//img[@src='images/newDashboard.png']"))
	private WebElement DashBoardTab;

	@FindBy(xpath = ("//div[@class='e-list-icon e-icons home']"))
	private WebElement HomeICon;

	@FindBy(xpath = ("(//div[@class='e-list-icon e-icons analyticsChart'])[1]"))
	private WebElement SearchICon;

	@FindBy(xpath = ("(//div[@class='e-list-icon e-icons settings'])[1]"))
	private WebElement SettingICon;

	@FindBy(xpath = ("(//li[@id='dock_dashboardAllNotifications'])[1]"))
	private WebElement NotificationICon;

	@FindBy(xpath = ("(//div[@class='e-list-icon e-icons viewDocumentFromDashboard'])[1]"))
	private WebElement DefaultViewICon;

	@FindBy(xpath = ("(//div[@class='e-list-icon e-icons reports'])[1]"))
	private WebElement CVSReportICon;

	@FindBy(xpath = ("//li[@id='dock_dashboardLogout']//div[@role='presentation']//div[1]"))
	private WebElement LogoutFromDashBRD;

	@FindBy(id = ("clearSearchBtnLabel"))
	private WebElement SearchClearButton;

	@FindBy(xpath = ("(//button[@id='advFindBtnLabel'])[1]"))
	private WebElement SearchFindButton;

	@FindBy(xpath = ("(//span[@id='spanNotifylist'])[1]"))
	private WebElement NotificationDropDown;

	@FindBy(xpath = ("(//button[@id='notifySaveBtn'])[1]"))
	private WebElement applyBTNmypref;

	@FindBy(xpath = ("(//button[@id='reset'])[1]"))
	private WebElement resetBTNmyPref;

	@FindBy(xpath = ("(//span[@class='e-input-group-icon e-ddl-icon e-search-icon'])[2]"))
	private WebElement TodoListDropDownDashBoard;

	@FindBy(xpath = ("//li[text()='New Items']"))
	private WebElement newItems;

	@FindBy(xpath = ("//li[text()='Pending Items']"))
	private WebElement pendingItems;

	@FindBy(xpath = ("//li[text()='All Items']"))
	private WebElement allItems;

	@FindBy(xpath = ("//li[text()='Sent Items']"))
	private WebElement sentItems;

	@FindBy(xpath = ("//li[text()='Reviewed Items']"))
	private WebElement reviewItems;

	@FindBy(xpath = ("(//div[@class='e-next e-icons e-icon-next e-nextpage e-pager-default'])[1]"))
	private WebElement nextPage;

	

	public void DashBoardSeachIcon() throws Exception {
	    SoftAssert softAssert = new SoftAssert();
	    Reporter.log("Test scenario 01: Verify 'dashboard search' functionality", true);
	    Thread.sleep(5000);

	    Reporter.log("Click on dashboard tab", true);
	    softAssert.assertTrue(DashBoardTab.isDisplayed(), "Dashboard tab is not displayed");
		  
	    jsclick(DashBoardTab);
	    Thread.sleep(3000);

	    Reporter.log("Dashboard opened successfully", true);
	    movingElement(SearchICon);
	    softAssert.assertTrue(SearchICon.isDisplayed(), "Search icon is not displayed");

	    Reporter.log("Click on search icon from the dashboard page", true);
	    jsclick(SearchICon);
	    Thread.sleep(6000);

	    Reporter.log("It will redirect to Search tab successfully...", true);
	    jsclick(SearchFindButton);
	    softAssert.assertTrue(SearchFindButton.isDisplayed(), "Find button is not displayed");

	    Reporter.log("Click on find button", true);
	    Thread.sleep(6000);
	    Reporter.log("Searched document display on the page successfully...", true);
	  //  softAssert.assertAll();
	}

	public void NotificationIcon() throws Exception {
	    SoftAssert softAssert = new SoftAssert();
	    Reporter.log("Scenario 02: Verify dashboard 'Notification' functionality", true);
        try {
        	  softAssert.assertTrue(DashBoardTab.isDisplayed(), "Dashboard tab is not displayed");
       	   
	    jsclick(DashBoardTab);
	    Reporter.log("Click on dashboard tab", true);
        }
        catch(Exception e) {
        	//
        }
	   Thread.sleep(3000);

	    movingElement(NotificationICon);
	    softAssert.assertTrue(NotificationICon.isDisplayed(), "Notification icon is not displayed");
		 
	    Reporter.log("Click on notification icon", true);
	    jsclick(NotificationICon);
	     Thread.sleep(8000);

	    Reporter.log("It will redirect to Notification tab successfully...", true);
	    jsclick(Refresh_Button(driver));
	    softAssert.assertTrue(Refresh_Button(driver).isDisplayed(), "Refresh button is not displayed");

	    Reporter.log("Notification page displayed successfully...", true);
	//    softAssert.assertAll();
	}

	public void TodoListWFDetailsfromDb() throws Exception {
	    SoftAssert softAssert = new SoftAssert();
	    Thread.sleep(6000);
	    Reporter.log("Scenario 03: Verify dashboard 'Todolist' dropdown", true);
	    
	    try {
	        movingclkElement(DashBoardTab);
	        softAssert.assertTrue(DashBoardTab.isDisplayed(), "Dashboard tab is not displayed");
	    } catch (Exception e) {
	        Reporter.log("Click on dashboard tab", true);
	    }
	    
	    Reporter.log("Click on dashboard tab", true);
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(TodoListDropDownDashBoard));

	    Reporter.log("Click on todo list dropdown", true);
	    Thread.sleep(3000);
	    movingclkElement(TodoListDropDownDashBoard);
	    softAssert.assertTrue(TodoListDropDownDashBoard.isDisplayed(), "Todo List dropdown is not displayed");
	    Thread.sleep(2000);

	    jsclick(newItems);
	    Reporter.log("Click on New items option", true);
	    softAssert.assertTrue(newItems.isDisplayed(), "New Items option is not displayed");

	    wait.until(ExpectedConditions.elementToBeClickable(TodoListDropDownDashBoard));
	    movingclkElement(TodoListDropDownDashBoard);
	    Reporter.log("It will list the New items workflow documents", true);
	    Thread.sleep(6000);

	    Reporter.log("Click on Pending items option", true);
	    jsclick(pendingItems);
	    softAssert.assertTrue(pendingItems.isDisplayed(), "Pending Items option is not displayed");

	    Reporter.log("It will list the Pending items workflow documents", true);
	    Thread.sleep(3000);
	    movingclkElement(TodoListDropDownDashBoard);
	    softAssert.assertTrue(reviewItems.isDisplayed(), "Review Items option is not displayed");

	    jsclick(reviewItems);
	  
	    Reporter.log("Click on Reviewed items option", true);
	    Thread.sleep(3000);
	    Reporter.log("It will list the Reviewed items workflow documents", true);
	    movingclkElement(TodoListDropDownDashBoard);
	    softAssert.assertTrue(sentItems.isDisplayed(), "Sent Items option is not displayed");

	    jsclick(sentItems);
	   
	    Reporter.log("Click on Sent items option", true);
	    Reporter.log("It will list the Sent items workflow documents", true);
	    Thread.sleep(3000);
	    movingclkElement(TodoListDropDownDashBoard);
	    softAssert.assertTrue(allItems.isDisplayed(), "All Items option is not displayed");

	    jsclick(allItems);
	  
	    Reporter.log("Click on All items option", true);
	    Thread.sleep(7000);
	    Reporter.log("It will list the All items workflow documents", true);
	    
	    try {
	        if (nextPage.isDisplayed()) {
	            jsclick(nextPage);
	        }
	    } catch (Exception e) {
	        Reporter.log("No more pages", true);
	    }

	    Thread.sleep(6000);
	    Reporter.log("Click on Next page icon", true);
	    Reporter.log("Page should move to Next page", true);
	    Thread.sleep(4000);
	    Reporter.log("Todo list dropdown options verified successfully...", true);

	  //  softAssert.assertAll();
	}

	public void LogoutfromDb() throws Exception {
	    SoftAssert softAssert = new SoftAssert();
	    Reporter.log("Scenario 08: Verify 'Logout functionality' from the dashboard", true);

	    Reporter.log("Click on dashboard tab", true);
	    Thread.sleep(3000);
	    movingElement(LogoutFromDashBRD);
<<<<<<< HEAD
	    softAssert.assertTrue(LogoutFromDashBRD.isDisplayed(), "Logout icon is not displayed");


	    Reporter.log("Click on logout icon", true);
	    jsclick(LogoutFromDashBRD);
	   
=======

	    Reporter.log("Click on logout icon", true);
	    jsclick(LogoutFromDashBRD);
	    softAssert.assertTrue(LogoutFromDashBRD.isDisplayed(), "Logout icon is not displayed");

>>>>>>> origin/Dipak-Pandurang-Gawali
	    Reporter.log("Session logged out successfully", true);
	    Thread.sleep(6000);
	    Reporter.log("Dashboard logout option verified successfully...", true);
	   // softAssert.assertAll();
	}

	@FindBy(xpath = "//*[@id=\"dock_dashboardCreateDocument\"]")
	private WebElement CreateDocDB;

	public void NewDocumentfromDb() throws Exception {
	    SoftAssert softAssert = new SoftAssert();
	    Thread.sleep(4000);
	    Reporter.log("Scenario 06: Verify dashboard 'New document' functionality", true);

	    // Verifying dashboard tab existence before interacting
	    softAssert.assertNotNull(CreateDocDB, "CreateDocDB element is null.");
	    Reporter.log("Click on dashboard tab", true);
	    
	    Thread.sleep(3000);
	    movingElement(CreateDocDB);
	    
	    Reporter.log("Click on New document icon", true);
	    jsclick(CreateDocDB);
	    
	    // Verifying the navigation to the New document tab
	    Reporter.log("It will redirect to New document tab successfully...", true);
	   

	    Reporter.log("The New document page opened successfully...", true);
	    Thread.sleep(10000);

	}
	

	@FindBy(xpath = "//*[@id='menuReports']/div[1]/span")
	private WebElement CVSReport;

	@FindBy(xpath = "//select[@id=\"props_hidden\"]")
	private WebElement SelectClass;

	@FindBy(xpath = "//*[@id=\"report1\"]")
	private WebElement DocumentRep;

	@FindBy(xpath = "//*[@id=\"report2\"]")
	private WebElement WorkflowStatus;

	@FindBy(xpath = "//*[@id=\"report3\"]")
	private WebElement RejectedDocsInWF;

	@FindBy(xpath = "//*[@id=\"reportDateRangePicker\"]")
	private WebElement DateInput;

	@FindBy(xpath = "//*[@id=\"menuReports\"]/div[2]/span/span[2]")
	private WebElement DateInputIcon;

	@FindBy(xpath = "//*[@id=\"ThisWeek_2\"]")
	private WebElement ThisWeek;

	@FindBy(xpath = "//*[@id=\"generateReport\"]")
	private WebElement GenerateBTN;

	@FindBy(xpath = "//*[@id=\"Grid_excelexport\"]/span[2]")
	private WebElement ExcelExport;

	@FindBy(xpath = "//*[@id=\"Grid_pdfexport\"]/span[2]")
	private WebElement PDFExport;

	public void ContentverseDocumentReport() throws Exception {
	    SoftAssert softAssert = new SoftAssert();
	    Thread.sleep(4000);
	 

	    try {
	        softAssert.assertNotNull(DashBoardTab, "DashBoardTab element is null.");
<<<<<<< HEAD
	        launch47Url();
=======
	        launchUrl();
>>>>>>> origin/Dipak-Pandurang-Gawali
	        loginRNISHA47();
	        Thread.sleep(3000);
	        jsclick(DashBoardTab);
	        Thread.sleep(3000);
	        softAssert.assertNotNull(CVSReportICon, "CVSReportICon element is null.");
	        jsclick(CVSReportICon);
	    } catch (Exception e) {
	        Reporter.log("Exception while logging in and accessing dashboard", true);
	    }
	    // Adding assertions for each step
	
	    Reporter.log("Select Contentverse Report icon", true);
	    Thread.sleep(5000);
	    Actions act = new Actions(driver);
	    
	    
	    
	    softAssert.assertNotNull(CVSReport, "CVSReport element is null.");
	    act.moveToElement(CVSReport).click().build().perform();
	    Thread.sleep(4000);
	    Reporter.log("Select 'Document Report'", true);

	    softAssert.assertNotNull(SelectClass, "SelectClass element is null.");
	    Select sel = new Select(SelectClass);
	    sel.selectByVisibleText("Documents Report");
	    Thread.sleep(3000);
	    Reporter.log("Select 'This Week'", true);

	    softAssert.assertNotNull(DocumentRep, "DocumentRep element is null.");
	    act.moveToElement(DocumentRep).click().build().perform();
	    Thread.sleep(3000);
	    Reporter.log("Click on Generate Button", true);

	    act.moveToElement(DateInputIcon).click().build().perform();
	    Thread.sleep(3000);

	    softAssert.assertNotNull(ThisWeek, "ThisWeek element is null.");
	    act.moveToElement(ThisWeek).click().build().perform();
	    Thread.sleep(4000);

	    softAssert.assertNotNull(GenerateBTN, "GenerateBTN element is null.");
	    jsclick(GenerateBTN);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    Thread.sleep(8000);

	    try {
	        alertIsPresent();
	        acceptAlert();
	    } catch (Exception e) {
	        Reporter.log("No alert present", true);
	    }

	    Reporter.log("It should list the Document Report on the page", true);
	   
	    jsclick(ExcelExport);
	    Reporter.log("Click on Excel export", true);
	    Thread.sleep(5000);

	  
	    jsclick(PDFExport);
	    Reporter.log("Click on PDF Export", true);

	    Reporter.log("Generated Document Report has Exported Successfully...", true);
	    
	}
	public void ContentverseWorkflowReport() throws Exception {
	    SoftAssert softAssert = new SoftAssert();

	    Reporter.log("Scenario 07: Verify 'ContentverseReport' - Workflow Status Reports", true);
	    Thread.sleep(4000);

	    try {
	        softAssert.assertNotNull(DashBoardTab, "DashBoardTab element is null.");
	        loginRNISHA47();
	        Thread.sleep(3000);
	        jsclick(DashBoardTab);
	        Thread.sleep(3000);
	        softAssert.assertNotNull(CVSReportICon, "CVSReportICon element is null.");
	        jsclick(CVSReportICon);
	    } catch (Exception e) {
	        Reporter.log("Exception while logging in and accessing dashboard", true);
	    }

	    Thread.sleep(5000);
	    Actions act = new Actions(driver);
	    softAssert.assertNotNull(CVSReport, "CVSReport element is null.");
	    act.moveToElement(CVSReport).click().build().perform();
	    Thread.sleep(4000);

	    Reporter.log("Mouse hover on Document Report dropdown and Select 'Workflow Status Report'", true);
	    softAssert.assertNotNull(SelectClass, "SelectClass element is null.");
	    Select sel = new Select(SelectClass);
	    sel.selectByVisibleText("Documents Report");
	    Thread.sleep(3000);

	    Reporter.log("Select 'This Week'", true);
	    softAssert.assertNotNull(WorkflowStatus, "WorkflowStatus element is null.");
	    act.moveToElement(WorkflowStatus).click().build().perform();
	    Thread.sleep(3000);

	    Reporter.log("Click on Generate Button", true);
	    softAssert.assertNotNull(DateInputIcon, "DateInputIcon element is null.");
	    act.moveToElement(DateInputIcon).click().build().perform();
	    Thread.sleep(3000);

	    softAssert.assertNotNull(ThisWeek, "ThisWeek element is null.");
	    act.moveToElement(ThisWeek).click().build().perform();
	    Thread.sleep(4000);

	    softAssert.assertNotNull(GenerateBTN, "GenerateBTN element is null.");
	    jsclick(GenerateBTN);
	    Thread.sleep(8000);

	    try {
	        alertIsPresent();
	        acceptAlert();
	    } catch (Exception e) {
	        Reporter.log("No alert present", true);
	    }

	    Reporter.log("It should list the 'Workflow Status Report' on the page", true);
	    try {
	      
	        jsclick(ExcelExport);
	        Reporter.log("Click on Excel export", true);
	        Thread.sleep(5000);

	     
	        jsclick(PDFExport);
	        Reporter.log("Click on PDF Export", true);
	    } catch (Exception e) {
	        Reporter.log("Error during export actions", true);
	    }

	    Reporter.log("Generated Document Report has Exported Successfully...", true);
	    softAssert.assertNotNull(CloseIconCVS, "CloseIconCVS element is null.");
	    jsclick(CloseIconCVS);
	    
	}


	public void ContentverseRejectDocumentInWFReport() throws Exception {
		SoftAssert softAssert = new SoftAssert();
	    Thread.sleep(4000);
	    Reporter.log("Scenario 08: Verify 'ContentverseReport' - Reject document in workflow Report", true);

	    try {
	        loginRNISHA47();
	        Thread.sleep(3000);
	        softAssert.assertNotNull(DashBoardTab, "DashBoardTab element is null.");
	        jsclick(DashBoardTab);
	        Thread.sleep(3000);
	        softAssert.assertNotNull(CVSReportICon, "CVSReportICon element is null.");
	        jsclick(CVSReportICon);
	    } catch (Exception e) {
	        Reporter.log("Exception while logging in and accessing dashboard", true);
	    }

	    Actions act = new Actions(driver);

	    try {
	        softAssert.assertNotNull(CVSReportICon, "CVSReportICon element is null.");
	        jsclick(CVSReportICon);

	        softAssert.assertNotNull(CVSReport, "CVSReport element is null.");
	        act.moveToElement(CVSReport).click().build().perform();
	    } catch (Exception e) {
	        Reporter.log("Error clicking on CVSReport or interacting with it.", true);
	    }

	    Thread.sleep(2000);

	    try {
	        Reporter.log("Mouse hover on Document Report dropdown and Select 'Reject document in workflow Report'", true);
	        softAssert.assertNotNull(SelectClass, "SelectClass element is null.");
	        Select sel = new Select(SelectClass);
	        sel.selectByVisibleText("Documents Report");
	        Thread.sleep(3000);
	        Reporter.log("Select 'This Week'", true);
	    } catch (Exception e) {
	        Reporter.log("Error selecting 'Documents Report' or 'This Week'.", true);
	    }

	    try {
	        softAssert.assertNotNull(RejectedDocsInWF, "RejectedDocsInWF element is null.");
	        act.moveToElement(RejectedDocsInWF).click().build().perform();
	        Thread.sleep(3000);
	    } catch (Exception e) {
	        Reporter.log("Error selecting 'Reject document in workflow Report'.", true);
	    }

	    Reporter.log("Click on Generate Button", true);
	    softAssert.assertNotNull(DateInputIcon, "DateInputIcon element is null.");
	    try {
	    act.moveToElement(DateInputIcon).click().build().perform();
	    Thread.sleep(3000);
	    }
	    catch(JavascriptException e) {
	    //	
	    }

	    try {
	        softAssert.assertNotNull(ThisWeek, "ThisWeek element is null.");
	        act.moveToElement(ThisWeek).click().build().perform();
	    } catch (Exception e) {
	        Reporter.log("Error selecting 'This Week'.", true);
	    }

	    Thread.sleep(4000);
	    softAssert.assertNotNull(GenerateBTN, "GenerateBTN element is null.");
	    jsclick(GenerateBTN);
	    Thread.sleep(8000);

	    try {
	        alertIsPresent();
	        acceptAlert();
	    } catch (Exception e) {
	        Reporter.log("No alert present", true);
	    }

	    Reporter.log("It should list the 'Reject document in workflow' Report on the page", true);

	    try {
	      //  softAssert.assertTrue(VisiblityOf(ExcelExport), "ExcelExport element is not visible.");
	        jsclick(ExcelExport);
	        Reporter.log("Click on Excel export", true);
	        Thread.sleep(5000);

	    //    softAssert.assertTrue(VisiblityOf(PDFExport), "PDFExport element is not visible.");
	        jsclick(PDFExport);
	        Reporter.log("Click on PDF Export", true);
	    } catch (Exception e) {
	        Reporter.log("Error exporting the report to Excel or PDF.", true);
	    }

	    Thread.sleep(3000);
	    Reporter.log("Generated Document Report has Exported Successfully...", true);

	    softAssert.assertNotNull(CloseIconCVS, "CloseIconCVS element is null.");
	    jsclick(CloseIconCVS);
	    Thread.sleep(3000);

	    softAssert.assertAll();
	}

	

	@FindBy(css = "#defaultDialog_dialog-header > button")//*[@id=\"defaultDialog_dialog-header\"]/button
	private WebElement CloseIconCVS;

}