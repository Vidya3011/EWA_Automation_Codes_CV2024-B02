package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Script.Special_Char_FileNames;

public class DashBoardPom extends Generic.BaseClass {

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
		Reporter.log("Test scenario 01: Verify 'dashboard search' functionality");
		Thread.sleep(5000);
		Reporter.log("Click on dashboard tab");
		jsclick(DashBoardTab);
		Thread.sleep(3000);
		Reporter.log("Dashboard opened successfully");
		movingElement(SearchICon);
		Reporter.log("Click on search icon from the dashboard page");
		jsclick(SearchICon);
		Thread.sleep(6000);
		Reporter.log("It will redirect to Search tab successfully...");
		jsclick(SearchFindButton);
		Reporter.log("Click on find button");
		Thread.sleep(6000);
		Reporter.log("Searched document display on the page successfully...");
		
		}
	
	public void NotificationIcon() throws Exception  {
		Reporter.log("Scenario 02: Verify dashboard 'Notifiaction' functionality");
		jsclick(DashBoardTab);
		Reporter.log("Click on dashboard tab");
		Thread.sleep(3000);
		movingElement(NotificationICon);
		Reporter.log("Click on notification icon");
		jsclick(NotificationICon);
		Thread.sleep(8000);
		Reporter.log("It will redirect to Notification tab successfully...");
		jsclick(Refresh_Button(driver));
		Reporter.log("Notification page displayed successfully...");
	
	}
	
public void TodoListWFDetailsfromDb() throws Exception{
		Thread.sleep(6000);
		Reporter.log("Scenario 03: Verify dashboard 'Todolist' dropdown");
		movingclkElement(DashBoardTab);
		Reporter.log("Click on dashboard tab");
	//	Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(TodoListDropDownDashBoard));
		Reporter.log("Click on todo list dropdown");
	   Thread.sleep(3000);
	   movingclkElement(TodoListDropDownDashBoard);
	   Thread.sleep(2000);
		jsclick(newItems);
		Reporter.log("Click on New items option");
		wait.until(ExpectedConditions.elementToBeClickable(TodoListDropDownDashBoard));
	    movingclkElement(TodoListDropDownDashBoard);
		Reporter.log("It will list the  New items  workflow documents");
	    Thread.sleep(3000);
	    Reporter.log("Click on Pending items option");
	    jsclick(pendingItems);
	    Reporter.log("It will list the  Pending items  workflow documents");
	    Thread.sleep(3000);
	    movingclkElement(TodoListDropDownDashBoard);
	    jsclick(reviewItems);
	    Reporter.log("Click on Reviewed items option");
	    Thread.sleep(3000);
	    Reporter.log("It will list the  Reviewed items  workflow documents");
	    movingclkElement(TodoListDropDownDashBoard);
	    jsclick(sentItems);
	    Reporter.log("Click on sent items option");
	    Reporter.log("It will list the  Sent items  workflow documents");
	    Thread.sleep(3000);
	    movingclkElement(TodoListDropDownDashBoard);
	    jsclick(allItems);
	    Reporter.log("Click on All items option");
	    Thread.sleep(7000);
	    Reporter.log("It will list the  All items  workflow documents");
	    try {
	    	   if(nextPage.isDisplayed()) {
	    		    jsclick(nextPage);
	    	   }
	    	  
	    	}catch(Exception e) {
	    		Reporter.log("No more pages");
	    	   }
	    		    Thread.sleep(6000);
	  Reporter.log("Click on Next page icon");
	    Reporter.log("Page should move to Next page");
	    Thread.sleep(4000);
	    Reporter.log("Todo list dropdown options verified successfully...");
	  
	    try {
   if(nextPage.isDisplayed()) {
	    jsclick(nextPage);
   }
  
}catch(Exception e) {
	Reporter.log("No more pages");
   }
	    Thread.sleep(2000);
	   
	   
}


	public void LogoutfromDb() throws Exception{
		Reporter.log("Scenario 05: verify 'Logout functionlity' from the dashboard");
		jsclick(DashBoardTab);
		Reporter.log("Click on dashboard tab");
		Thread.sleep(3000);
		movingElement(LogoutFromDashBRD);
		Reporter.log("Click on logout icon");
		jsclick(LogoutFromDashBRD);
		Reporter.log("Session logged out successfully");
		Thread.sleep(6000);
		Reporter.log("Dashboard logout option verified successfully...");
		
		
	}
	
	
	
	@FindBy(xpath = ("//*[@id=\"dock_dashboardCreateDocument\"]"))
	private WebElement CreateDocDB;
	
	
	
public void NewDocumentfromDb() throws Exception{
	Special_Char_FileNames spl=new Special_Char_FileNames();
	Thread.sleep(4000);
	
	Reporter.log("Scenario 06: verify dashboard 'New document' funtionality");
	  //  jsclick(DashBoardTab);
	    Reporter.log("Click on dashboard tab");
		Thread.sleep(3000);
		movingElement(CreateDocDB);
		Reporter.log("Cick on New document icon");
		jsclick(CreateDocDB);
		Reporter.log("It will redirect to New document tab successfully...");
		Reporter.log("The New document page opened succcessfully...");
		Thread.sleep(10000);
	
	}
	
	
	
	
	
}
