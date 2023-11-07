package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BaseClass;

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

			
			public WebElement getCabinetForFav() {
				return CabinetForFav;
			}

			public WebElement getFavStarIcon() {
				return favStarIcon;
			}

			public WebElement getFavUserLevel() {
				return favUserLevel;
			}
			public WebElement getRoomContextTab() {
				return RoomContextTab;
			}

			
			
			public WebElement getFavSystemLevel() {
				return favSystemLevel;
			}

			public WebElement getFavdialogOKBTN() {
				return favdialogOKBTN;
			}

			public WebElement getFavBookMarkIconTab() {
				return favBookMarkIconTab;
			}

			public WebElement getSystemLevelFavCabinet() {
				return SystemLevelFavCabinet;
			}

			public WebElement getLoadAll() {
				return loadAll;
			}

			public WebElement getDeleteFav() {
				return DeleteFav;
			}

			public WebElement getDeleteFavOkBTN() {
				return DeleteFavOkBTN;
			} 
	        
		        		     		 
	        		 
	        		 
	        		 
	        		
	        
	        
	        		 
	         
}
