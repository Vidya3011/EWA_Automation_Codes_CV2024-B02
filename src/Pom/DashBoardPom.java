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
	
	
	@FindBy(xpath = ("/html[1]/body[1]/div[55]/div[59]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]"))
	private WebElement NotificationDocList;
	
	
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
		Reporter.log("Test scenario 01: Verify dashboard search functionality");
		Thread.sleep(5000);
		Reporter.log("User click on dashboard tab");
		jsclick(DashBoardTab);
		Thread.sleep(3000);
		Reporter.log("Dash board opened successfully");
		movingElement(SearchICon);
		Reporter.log("User click search icon from the dashboard page");
		jsclick(SearchICon);
		Thread.sleep(6000);
		Reporter.log("Search page opened successfull...");
		jsclick(SearchFindButton);
		Reporter.log("User click on find button");
		Thread.sleep(6000);
		
		}
	
	public void NotificationIcon() throws Exception  {
		Reporter.log("Scenario 02: Verify dashboard notifiaction functionlity");
		jsclick(DashBoardTab);
		Reporter.log("User click on dashboard tab");
		Thread.sleep(3000);
		movingElement(NotificationICon);
		Reporter.log("User click on notification icon");
		jsclick(NotificationICon);
		Thread.sleep(8000);
		Reporter.log("The notification page opened successfull");
		jsclick(Refresh_Button(driver));
	
	
	}
	
public void TodoListWFDetailsfromDb() throws Exception{
		Thread.sleep(6000);
		Reporter.log("Scenario 03: Verify dashboard todolist dropdown");
		movingclkElement(DashBoardTab);
		Reporter.log("User click on dashboard tab");
	//	Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(TodoListDropDownDashBoard));
		Reporter.log("User click on todo list dropdown");
	   Thread.sleep(3000);
	   movingclkElement(TodoListDropDownDashBoard);
	   Thread.sleep(2000);
		jsclick(newItems);
		Reporter.log("User click on new items submenu");
		wait.until(ExpectedConditions.elementToBeClickable(TodoListDropDownDashBoard));
	    movingclkElement(TodoListDropDownDashBoard);
	    Thread.sleep(3000);
	    Reporter.log("User click on pending items submenu");
	    jsclick(pendingItems);
	    Thread.sleep(3000);
	    movingclkElement(TodoListDropDownDashBoard);
	    jsclick(reviewItems);
	    Reporter.log("User click on review items submenu");
	    Thread.sleep(3000);
	    movingclkElement(TodoListDropDownDashBoard);
	    jsclick(sentItems);
	    Reporter.log("User click on pending items submenu");
	    Thread.sleep(3000);
	    movingclkElement(TodoListDropDownDashBoard);
	    jsclick(allItems);
	    Reporter.log("User click on all items submenu");
	    Thread.sleep(7000);
	    jsclick(nextPage);
	    Reporter.log("User click on next page icon");
	    Thread.sleep(4000);
	    jsclick(nextPage);
	    Thread.sleep(3000);
	    try {
if(nextPage.isDisplayed()) {
	    jsclick(nextPage);
}
}catch(Exception e) {
	Reporter.log("No more pages");
}
	    Thread.sleep(6000);
	   
	   
}


	public void LogoutfromDb() throws Exception{
		Reporter.log("Scenario 05: verify Logout functionlity from the dash board");
		jsclick(DashBoardTab);
		Reporter.log("User click on dashboard tab");
		Thread.sleep(3000);
		movingElement(LogoutFromDashBRD);
		Reporter.log("User click on logout icon");
		jsclick(LogoutFromDashBRD);
		Reporter.log("Session logged out successfull");
		Thread.sleep(6000);
		
		
	}
	
	
	
	@FindBy(xpath = ("//*[@id=\"dock_dashboardCreateDocument\"]"))
	private WebElement CreateDocDB;
	
	
	
public void NewDocumentfromDb() throws Exception{
	Special_Char_FileNames spl=new Special_Char_FileNames();
	Thread.sleep(4000);
	
	Reporter.log("Scenario 06: verify dashboard new document funtionality");
	    jsclick(DashBoardTab);
	    Reporter.log("User click on dashboard tab");
		Thread.sleep(3000);
		movingElement(CreateDocDB);
		Reporter.log("User click on new document icon");
		jsclick(CreateDocDB);
		Reporter.log("The new document page opened succcessfull...");
		Thread.sleep(15000);
	//	spl.Upload_and_verify_Allowing_Percentage_Characterfile();
		Thread.sleep(6000);
		
		
	}
	
	
	
	
	
}
