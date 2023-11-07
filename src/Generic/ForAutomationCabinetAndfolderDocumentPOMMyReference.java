package Generic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForAutomationCabinetAndfolderDocumentPOMMyReference extends BaseClass{
	
	
	
	
public ForAutomationCabinetAndfolderDocumentPOMMyReference() {
		
		PageFactory.initElements(driver, this);
		}
	


@FindBy(xpath=("/html/body/div[56]/div[59]/div[1]/div/div[2]/div[2]/ul/li[1]/ins"))
private WebElement TestCabExpIcon;




@FindBy(xpath=("//*[@id=\"2\"]/ins"))
private WebElement TesttestDrawerExpIcon;



@FindBy(xpath=("//*[@id=\"1002\"]/a"))
private WebElement VidyaTestFolder;


@FindBy(xpath=("/html/body/div[56]/div[59]/div[1]/div/div[2]/div[2]/ul/li[13]/ins"))
private WebElement CVAppExpIcon;





@FindBy(xpath=("/html/body/div[56]/div[59]/div[1]/div/div[2]/div[2]/ul/li[25]/ins"))
private WebElement NishaAutoCabExpIcon;
























































//Here Am Going to use HashMapFor All cabinets and drawer xpath 
@BeforeClass
public void ladBrowser() {
	loadBrowser("Chrome");
	//log.info("Chrome Browser started Successfully...");
	
	launchUrl();
	
	//log.info("CVS URL started Successfully...");
}



@Test (priority=1)
public void LoginCV() throws Exception {
	 loginCVS();
	
	//  log.info("CVS User is logged in successfully...");

	  }
	
	
@Test(priority=2)
public void forXpath(){
	
	
	List<WebElement> ForAllCab = driver.findElements(By.id("viewDocumentnavigator"));
	
  for (WebElement all : ForAllCab) {
	  
	  if (all.getText().trim().equals("TestCab")) {
		  		  all.click();
		  break;
		
	}
	  
  }
	 /* String first=all.getText();
	  System.out.println(first);
	  
	  String searchVal = first.substring(0,11);
      if(searchVal != null && searchVal.length()>0) {
      	System.out.println("SearchVal: "+searchVal);
        all.click();
      	break;*/
      
  
	  
  
  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	  
	
		
	
}
}
	
	

	
	
	
	
	
	
	


