package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

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
		
		jsclick(DashBoardTab);
		Thread.sleep(3000);
		movingElement(SearchICon);
		jsclick(SearchICon);
		Thread.sleep(6000);
		jsclick(SearchFindButton);
		Thread.sleep(6000);
		}
	
	public void NotificationIcon() throws Exception  {
		jsclick(DashBoardTab);
		Thread.sleep(3000);
		movingElement(NotificationICon);
		jsclick(NotificationICon);
		Thread.sleep(8000);
	    movingDoublecli(NotificationDocList, NotificationDocList);
	    Thread.sleep(3000);
	    Thread.sleep(3000);
	   
		jsclick(NotificationDropDown);
		Thread.sleep(3000);
		try {
			WebElement FolderDocoption = driver
					.findElement(By.xpath("//span[text()='Folder / Document /  Sub Folder is created']"));
			if (FolderDocoption.isDisplayed()) {
				jsclick(resetBTNmyPref);
				Thread.sleep(2000);
				jsclick(FolderDocoption);
				jsclick(applyBTNmypref);
				Thread.sleep(10000);
			}
		} catch (Exception e) {
			Reporter.log("Folder/document/subfolder changes notified");
		}
		Thread.sleep(3000);
	
	
	}
	
public void TodoListWFDetailsfromDb() throws Exception{
		
		jsclick(DashBoardTab);
	//	Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(TodoListDropDownDashBoard));
	   Thread.sleep(3000);
	   movingclkElement(TodoListDropDownDashBoard);
	   Thread.sleep(2000);
		jsclick(newItems);
	    
	    movingclkElement(TodoListDropDownDashBoard);
	    jsclick(pendingItems);
	    Thread.sleep(3000);
	    movingclkElement(TodoListDropDownDashBoard);
	    jsclick(allItems);
	    Thread.sleep(3000);
	    movingclkElement(TodoListDropDownDashBoard);
	    jsclick(sentItems);
	    Thread.sleep(3000);
	    movingclkElement(TodoListDropDownDashBoard);
	    jsclick(reviewItems);
	    Thread.sleep(7000);
	    jsclick(nextPage);
	    Thread.sleep(4000);
	    jsclick(nextPage);
	    Thread.sleep(3000);
	    jsclick(nextPage);
	    Thread.sleep(6000);
	    Thread.sleep(3000);
	   
}
	public void LogoutfromDb() throws Exception{
		
		jsclick(DashBoardTab);
		Thread.sleep(3000);
		movingElement(LogoutFromDashBRD);
		jsclick(LogoutFromDashBRD);
		Thread.sleep(6000);
		
		
	}
	
}
