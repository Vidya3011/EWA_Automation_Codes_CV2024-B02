package Computhink.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class Export extends Computhink.Generic.BaseClass {

	public Export() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement MyAccount;

	@FindBy(xpath = "//*[@id='idSidenav']/ul/li[5]/a")
	private WebElement Export;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/a"))
	private WebElement Select_CabinetDest;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li/a"))
	private WebElement Select_DrawerDest;

	@FindBy(xpath = ("//*[@id=\"notificationMenu\"]"))
	private WebElement NotificationTab;

	@FindBy(xpath = ("//a[@id='advSearchMenuBtn']"))
	private WebElement SearchTab;

	@FindBy(xpath = ("//*[@id=\"advFindBtnLabel\"]"))
	private WebElement findBTN;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li/ul/li/a"))
	private WebElement Select_FolderDest;

	public void ExportBlankDocumenList() throws Exception {
		Thread.sleep(3000);
		Reporter.log("Step Details: Exporting blank document list", true);
		jsclick(MyAccount);
		Reporter.log("Click on  My account tab.", true);
		Actions act = new Actions(driver);
		Reporter.log(
				"Logout, What's New, HelpExport, Offline documents, DocuSign documents,Download Outlook drag and dropChange password options are available ",
				true);
		act.moveToElement(Export).click().build().perform();
		Reporter.log("Click on Export button. ", true);
		Reporter.log("DocumentList(Current Date)_(DocumentID).csv file will get downloaded", true);
		Reporter.log("Click on the downloaded .csv file");
		Reporter.log(
				"An excel file with following headings will open:Document name, Type, Pages, Created on, Last modified.\r\n"
						+ "If there is no data then it will display as ' No data available in table'",
				true);

	}

	public void ExportDocumenList() throws Exception {
		Thread.sleep(3000);
		Reporter.log("Step Details: Exporting document list", true);
		Actions act = new Actions(driver);
		Reporter.log("Navigate a tree till folder level\r\n" + "Lists the documents present in that folder", true);
		act.moveToElement(Select_CabinetDest).doubleClick().build().perform();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(Select_DrawerDest));
		act.moveToElement(Select_DrawerDest).doubleClick().build().perform();
		wait.until(ExpectedConditions.visibilityOf(Select_FolderDest));
		Thread.sleep(3000);

		act.moveToElement(Select_FolderDest).doubleClick().build().perform();
		Thread.sleep(8000);
		Reporter.log("Go to My accounts Tab", true);
		jsclick(MyAccount);
		Reporter.log("Export button is enabled", true);
		Thread.sleep(4000);
		Reporter.log("Click on Export Button", true);
		Reporter.log("DocumentList(Current Date)_(DocumentID).csv file will get downloaded", true);
		act.moveToElement(Export).click().build().perform();
		Reporter.log("An excel file with following headings will open \r\n"
				+ "Document name, Type, Pages, Created on, Last modified, Comments, References", true);

	}

	public void ExportingDocumentListSearchListWithCustomColumns() throws Exception {

	}

	public void ExportingBlankSearch() throws Exception {
		Reporter.log("Step Details: Exporting blank search list", true);
		Thread.sleep(3000);
		Reporter.log("Click on  Search tab and search any value.", true);
		jsclick(SearchTab);
		Thread.sleep(5000);
		VisiblityOf(findBTN);
		Reporter.log("Click on My accounts tab.", true);
		jsclick(findBTN);
		Reporter.log("Export button is enabled", true);
		Thread.sleep(8000);
		Reporter.log("Click on Export button.", true);
		jsclick(MyAccount);
		Thread.sleep(3000);
		Reporter.log("SearchList(CurentDate)_(DocumentID).csv file will get downloaded. ", true);
		VisiblityOf(Export);
		jsclick(Export);
		Reporter.log(
				"A Downloaded excel file has following headings:Document name, Type, Pages, Created on, Last modified.\r\n"
						+ "As there is no values, it will display as 'No data available in table'",
				true);
		jsclick(Refresh_Button(driver));
		Thread.sleep(3000);

	}

	public void DisabledExport() throws Exception {

		Reporter.log("Step Details: Disabled Export", true);
		Thread.sleep(4000);
		jsclick(NotificationTab);
		Thread.sleep(5000);
		jsclick(MyAccount);
		Reporter.log("Click on My accounts tab.", true);

		Reporter.log("Export button is disabled", true);

	}

}