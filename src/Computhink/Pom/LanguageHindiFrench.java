package Computhink.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Computhink.Generic.BaseClass;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class LanguageHindiFrench extends BaseClass {

	public LanguageHindiFrench() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "logedinusername")
	private WebElement Username;

	public WebElement getUsername() {
		return Username;
	}

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}

	@FindBy(xpath = "//a[normalize-space()='English']")
	private WebElement English_Language;

	@FindBy(xpath = "//a[normalize-space()='Spanish']")
	private WebElement Spanish_Language;

	@FindBy(xpath = "//*[@id=\"locale\"]/a[3]")
	private WebElement French_Language_Click;

	@FindBy(xpath = "//*[@id=\"locale\"]/a[5]")
	private WebElement Hindi_Language;

	public WebElement getHindi_Language() {
		return Hindi_Language;
	}

	@FindBy(id = "imgSettings")
	private WebElement Setting_Icon;

	@FindBy(css = "#myPreferencesSettingsNav > p")
	private WebElement My_Preferencesetting;

	@FindBy(xpath = "//button[@id='myPreferencesSubmit']")
	private WebElement Apply_button;

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Defaultviewing;

	public WebElement getSelect_Office_document_Defaultviewing() {
		Select sel = new Select(Select_Office_document_Defaultviewing);
		sel.selectByVisibleText("Default viewing");
		return Select_Office_document_Defaultviewing;
	}

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Defaultviewing;

	public WebElement getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		drop.selectByVisibleText("Default viewing");
		return Pdf_document_Defaultviewing;
	}

	@FindBy(xpath = "//img[@src='images/newRe.png']")
	private WebElement Refreshbutton;

	@FindBy(xpath = "//a[normalize-space()='Cerrar sesión']")
	private WebElement spanishLogout;

	@FindBy(xpath = "//a[normalize-space()='Connectez - Out']")
	private WebElement FrenchLogout;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement HindiLogout;

	public void HindiLanguageScript() throws Exception {

		Thread.sleep(3000);
		jsclick(Hindi_Language);

	}

	public void frenchLanguageScript() throws Exception {

		Thread.sleep(3000);
		jsclick(French_Language_Click);

	}

}
