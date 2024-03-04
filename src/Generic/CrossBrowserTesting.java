package Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pom.AdvancedViewer;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting extends BaseClass {
	
	@Parameters("browser")
	@Test(priority=1)
	private void LaunchCVSBrow(String brow) throws Exception {
		
		
		
		if (brow.equals("chromebrowser")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
				driver = new ChromeDriver();
			
				
			}
			
		else if (brow.equals("edgebrowser")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		driver.get("http://10.4.10.60:8080/CVWeb/cvLgn");
		driver.manage().window().maximize();
		
		WebElement UserName=driver.findElement(By.xpath("//input[@id='userName']"));
		Thread.sleep(3000);
		UserName.sendKeys(readFromExLogin(2, 0));
		driver.findElement(By.id("loginPassword")).sendKeys(readFromExLogin(2, 1));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		a1 = new Actions(driver);
		a1.moveToElement(room).click().build().perform();
		WebElement roomCV = driver.findElement(By.xpath("//*[@id=\"rooms\"]/option[4]"));
		roomCV.click();
		WebElement LoginBTN=driver.findElement(By.id("submitid"));
		jsclick(LoginBTN);
		Thread.sleep(3000);
		try {
			WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
			WebElement sessiomsgOK = driver.findElement(By.xpath("//*[@id=\"cvModelLoginValidationCancel\"]"));
			if(sessiomsg.isDisplayed()) {
		    jsclick(sessiomsgOK);
		    loginSQL2022RAM();
		   }
		}
			catch(Exception e) {
				System.out.println("Noaletrt");
			}
		
		}
			
	@Test(priority=2,invocationCount=1000)
	public void CrossBrw() throws Exception{
	
	AdvancedViewer ad=new AdvancedViewer();
	ad.AdvancedViewPDFDocument_SQL();
	Reporter.log("PDF Document verified successfull");
	
	}
	
	}


		

	
	
	


