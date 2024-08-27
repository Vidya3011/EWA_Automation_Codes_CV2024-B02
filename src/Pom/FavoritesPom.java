package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseClass;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class FavoritesPom extends BaseClass {

	public FavoritesPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("(//a[@id='navigationMenuBtn'])[1]"))
	private WebElement RoomContextTab;

	@FindBy(xpath = ("//*[@id=\"1119\"]/a"))
	private WebElement CabinetForFav;

	@FindBy(xpath = ("(//span[@id='Navigationcreatefav'])[1]"))
	private WebElement favStarIcon;

	@FindBy(xpath = ("(//input[@id='favUser'])[1]"))
	private WebElement favUserLevel;

	@FindBy(xpath = ("(//input[@id='favSystemSystem'])[1]"))
	private WebElement favSystemLevel;

	@FindBy(xpath = ("(//button[@id='createFavModelOk'])[1]"))
	private WebElement favdialogOKBTN;

	@FindBy(xpath = ("(//div[@id='bookmarkid'])[1]"))
	private WebElement favBookMarkIconTab;

	@FindBy(xpath = ("//*[@id=\"2422\"]/a"))
	private WebElement SystemLevelFavCabinet;

	@FindBy(xpath = ("(//li[@id='loadAllfavrites'])[1]"))
	private WebElement loadAll;

	@FindBy(xpath = ("//*[@id=\"createfavshowAllModelTabel\"]/tbody/tr[1]/td[2]/a[2]"))
	private WebElement DeleteFav;

	@FindBy(xpath = ("(//button[@id='createfavshowAllModelOk'])[1]"))
	private WebElement DeleteFavOkBTN;

	public void FavoriteInUserLevel() throws Exception {

		Thread.sleep(3000);
		jsclick(CabinetForFav);
		Reporter.log("Select a cabinet to set a favorite user level");
		Thread.sleep(3000);
		movingclkElement(favStarIcon);
		Reporter.log("Click on star icon");
		Thread.sleep(3000);
		jsclick(favUserLevel);
		Thread.sleep(3000);
		Reporter.log("Select the user radio button in the favorite dialog");
		jsclick(favdialogOKBTN);
		Reporter.log("Select favorite dialog OK button ");
		Thread.sleep(5000);
		movingclkElement(favBookMarkIconTab);
		Reporter.log("Mouse hover on favorite icon");
		Thread.sleep(8000);
		jsclick(loadAll);
		Reporter.log("Click on ellipse icon from the dropdown");
		Thread.sleep(3000);
		Reporter.log("Show favorite dialog opened");
		movingElement(DeleteFav);
		Reporter.log("Click on delete icon");
		jsclick(DeleteFav);
		Reporter.log("Added favorite item deleted successfully...");
		Thread.sleep(3000);
		jsclick(DeleteFavOkBTN);
		Reporter.log("Close the show favorite dialog");
		Thread.sleep(3000);
		Reporter.log("Favorite User Option verified successfully...");

	}

	public void FavoriteInSystemLevel() throws Exception {

		Thread.sleep(3000);
		jsclick(SystemLevelFavCabinet);
		Reporter.log("Select a cabinet to set a favorite system level");
		Thread.sleep(3000);
		movingclkElement(favStarIcon);
		Reporter.log("Click on star icon");
		Thread.sleep(3000);
		jsclick(favSystemLevel);
		Reporter.log("Select the System radio button in the favorite dialog");
		Thread.sleep(3000);
		jsclick(favdialogOKBTN);
		Reporter.log("Select favorite dialog OK button ");
		Thread.sleep(3000);
		movingclkElement(favBookMarkIconTab);
		Reporter.log("Mouse hover on favorite bookmark icon to show the system level favorite cabinet");
		Thread.sleep(4000);
		Reporter.log("Logout the page");
		LogoutPage();
		Reporter.log("Login as another user");
		loginCVS();
		movingclkElement(favBookMarkIconTab);
		Reporter.log(" Mouse hover on favorite icon");
		Thread.sleep(3000);
		Reporter.log("It should show the favorite cabinet name");
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		Reporter.log("The Favorite System option verified successfully...");
	}

}
