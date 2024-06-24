package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Document_References extends Generic.BaseClass {

	public static WebElement element = null;

	public Document_References() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"homeMenuBtn\"]")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
	}

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	public WebElement getSelect_Cabinet() {
		return Select_Cabinet;
	}

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	public WebElement getSelect_Drawer() {
		return Select_Drawer;
	}

	@FindBy(xpath = (".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	public WebElement getSelect_Folder() {
		return Select_Folder;

	}

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
	private WebElement Select_Document;

	public WebElement getSelect_Document() {
		return Select_Document;
	}

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]/label/span"))
	private WebElement Check_Document1;

	public WebElement getCheck_Document1() {
		return Check_Document1;
	}

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[2]/td[1]/label/span"))
	private WebElement Check_Document2;

	public WebElement getCheck_Document2() {
		return Check_Document2;
	}

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	public void getMoveTo_Menu_Documents() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Documents).build().perform();

	}

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;
	@FindBy(xpath = "//*[@id=\"docReferencePaste\"]")
	private WebElement ReferencePaste;

	public void getVerify_CopyandPasteReferences_Document() throws InterruptedException {

		jsclick(Copy_ID);
		Thread.sleep(3000);
		jsclick(Check_Document1);
		jsclick(Check_Document2);
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Documents).perform();
		Thread.sleep(2000);
		jsclick(ReferencePaste);
		Thread.sleep(2000);

	}

	@FindBy(xpath = "//body[1]/div[58]/div[65]/div[4]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
	private WebElement Click_References;

	public WebElement getClick_References() {
		return Click_References;
	}

	@FindBy(xpath = ("//*[@id=\"referenceTable\"]/tbody/tr[1]/td[1]"))
	private WebElement Open_ReferenceDOC;

	public WebElement getOpen_ReferenceDOC() {
		return Open_ReferenceDOC;
	}

	@FindBy(xpath = "//*[@id=\"floatRefButton\"]/i")
	private WebElement DeleteReferenceDoc;

	public WebElement getDeleteReferenceDoc() {
		return DeleteReferenceDoc;
	}

	@FindBy(xpath = "/html/body/div[69]/div[2]/div/div/div/div/div/div/div/div[4]/button")
	private WebElement ReferencedocCancelbutton;

	public WebElement getReferencedocCancelbutton() {
		return ReferencedocCancelbutton;
	}

	@FindBy(xpath = "//*[@id=\"recentMenuBtn\"]")
	private WebElement MoveTo_Menu_Recent;

	public void getMoveTo_Menu_Recent() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Recent).build().perform();
	}

	@FindBy(xpath = "//*[@id=\"recentFolders\"]/tbody/tr[1]/td")
	private WebElement Recent_Folder;

	public WebElement get_clickRecent_Folder() {
		return Recent_Folder;
	}
}