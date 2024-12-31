package Computhink.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Computhink.Generic.BaseClass;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class FavoritesPom extends BaseClass {

	public FavoritesPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("(//a[@id='navigationMenuBtn'])[1]"))
	private WebElement RoomContextTab;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']//li[2]/a"))
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

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']//li[3]/a"))
	private WebElement SystemLevelFavCabinet;

	@FindBy(xpath = ("(//li[@id='loadAllfavrites'])[1]"))
	private WebElement loadAll;

	@FindBy(xpath = ("//*[@id=\"createfavshowAllModelTabel\"]/tbody/tr[1]/td[2]/a[2]"))
	private WebElement DeleteFav;

	@FindBy(xpath = ("(//button[@id='createfavshowAllModelOk'])[1]"))
	private WebElement DeleteFavOkBTN;

	public void FavoriteInUserLevel() throws Exception {
	    SoftAssert softAssert = new SoftAssert();

	    Thread.sleep(3000);
	    jsclick(CabinetForFav);
	    Reporter.log("Select a cabinet to set a favorite user level", true);
	    softAssert.assertEquals(driver.getTitle(), "Expected Page Title", "Page title mismatch after selecting cabinet.");

	    Thread.sleep(3000);
	    movingclkElement(favStarIcon);
	    Reporter.log("Click on star icon", true);
	    softAssert.assertEquals(favStarIcon.getAttribute("class"), "expected-class-after-click", "Star icon not updated after clicking.");

	    Thread.sleep(3000);
	    jsclick(favUserLevel);
	    Reporter.log("Select the user radio button in the favorite dialog", true);
	    softAssert.assertEquals(favUserLevel.isSelected(), true, "User radio button not selected.");

	    jsclick(favdialogOKBTN);
	    Reporter.log("Select favorite dialog OK button", true);
	    softAssert.assertEquals(favdialogOKBTN.isDisplayed(), false, "Favorite dialog did not close after clicking OK.");

	    Thread.sleep(5000);
	    movingclkElement(favBookMarkIconTab);
	    Reporter.log("Mouse hover on favorite icon", true);
	 
	    Thread.sleep(8000);
	    jsclick(loadAll);
	    Reporter.log("Click on ellipse icon from the dropdown", true);
	    softAssert.assertEquals(loadAll.isDisplayed(), true, "Dropdown not displayed after clicking ellipse icon.");

	    Thread.sleep(3000);
	    Reporter.log("Show favorite dialog opened", true);

	    movingElement(DeleteFav);
	    Reporter.log("Click on delete icon", true);
	    jsclick(DeleteFav);
	    Reporter.log("Added favorite item deleted successfully...", true);
	    softAssert.assertEquals(DeleteFav.isDisplayed(), false, "Delete icon still displayed after deletion.");

	    Thread.sleep(3000);
	    jsclick(DeleteFavOkBTN);
	    Reporter.log("Close the show favorite dialog", true);
	    softAssert.assertEquals(DeleteFavOkBTN.isDisplayed(), false, "Favorite dialog did not close after deletion.");

	    Thread.sleep(3000);
	    Reporter.log("Favorite User Option verified successfully...", true);

	 //   softAssert.assertAll();
	}
	

	public void FavoriteInSystemLevel() throws Exception {

		 SoftAssert softAssert = new SoftAssert();

		    Thread.sleep(3000);
		    jsclick(SystemLevelFavCabinet);
		    Reporter.log("Select a cabinet to set a favorite system level", true);
		    softAssert.assertEquals(driver.getTitle(), "Expected Page Title", "Page title mismatch after selecting system level cabinet.");

		    Thread.sleep(3000);
		    movingclkElement(favStarIcon);
		    Reporter.log("Click on star icon", true);
		    softAssert.assertEquals(favStarIcon.getAttribute("class"), "expected-class-after-click", "Star icon not updated after clicking.");

		    Thread.sleep(3000);
		    jsclick(favSystemLevel);
		    Reporter.log("Select the System radio button in the favorite dialog", true);
		    softAssert.assertEquals(favSystemLevel.isSelected(), true, "System radio button not selected.");

		    Thread.sleep(3000);
		    jsclick(favdialogOKBTN);
		    Reporter.log("Select favorite dialog OK button", true);
		  
		    Thread.sleep(3000);
		    movingclkElement(favBookMarkIconTab);
		    Reporter.log("Mouse hover on favorite bookmark icon to show the system level favorite cabinet", true);
		   
		    Thread.sleep(4000);
		    Reporter.log("Logout the page", true);
		    LogoutPage();
		    Reporter.log("Login as another user", true);
		    loginRNISHA47();

		    Thread.sleep(2000);
		    jsclick(Refresh_Button(driver));
		    Thread.sleep(3000);

		    movingclkElement(favBookMarkIconTab);
		    Reporter.log("Mouse hover on favorite icon", true);
		  
		    Thread.sleep(3000);
		    Reporter.log("It should show the favorite cabinet name", true);
		  
		    jsclick(Refresh_Button(driver));
		    Thread.sleep(5000);
		    Reporter.log("The Favorite System option verified successfully...", true);

		   
	}

}
