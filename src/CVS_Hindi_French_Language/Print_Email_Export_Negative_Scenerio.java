package CVS_Hindi_French_Language;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.Print;

public class Print_Email_Export_Negative_Scenerio extends BaseClass{
	
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(Print_Email_Export_Negative_Scenerio.class);
	
  /*  @BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
        launchUrl();
        log.info("CVS URL started Successfully...");
    }

	@Test(priority=1)
	public void LogVCS() throws Exception {
		loginCVS();
		log.info("CVS User is logged in successfully...");
	}
*/

    @Test(priority=2)
	private void Email_ConvertPDF_WithAll_Annotations() throws Exception {
		Print pojo = new Print();
		log.info("Verifying Email Functionality");
		jsclick(pojo.getTestCabExpIcon());
		Thread.sleep(5000);
		jsclick(pojo.getTesttestDrawerExpIcon());
		Thread.sleep(3000);
		movingDoublecli(pojo.getVidyaTestFolder(), pojo.getVidyaTestFolder());
		Thread.sleep(5000);
		jsclick(pojo.getDocument());
		Thread.sleep(7000);
		try {
			if (pojo.getLockeddoc().isDisplayed()) {

				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
				jsclick(element1);
			}
		} catch (Exception e) {
			Reporter.log("Locked message displayed", true);
			Thread.sleep(2000);
		}

		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			log.info("AlertISNotPresent");
		}
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getCheckBox()));
		jsclick(pojo.getCheckBox());
		jsclick(pojo.getSendToIcon());
		Thread.sleep(3000);
		jsclick(pojo.getEmailDoc());
		jsclick(pojo.getConvertPDfCheckbox());
		Thread.sleep(3000);
		sendvalue(pojo.getEnterEmail(), "!@#$%^^Nisha@COM@.Com");
		Thread.sleep(3000);
		// sendvalue(pojo.getSubject(), "Nisha.Ammu@123Mail23com");

		jsclick(pojo.getEmailSendOk());
		Thread.sleep(4000);
		System.out.println(pojo.getInvalidEmailMessageValidation().getText());
		Thread.sleep(4000);
		jsclick(pojo.getInvalidDialogBoxOKBTN());
		Thread.sleep(8000);
		log.info("Email Functionality with Invalid alphanumeric mail id", true);
		pojo.getEnterEmail().clear();
		Thread.sleep(2000);
		sendvalue(pojo.getforCCmail(), "Nisha.Ammu@123Mail23com");
		Thread.sleep(3000);
		jsclick(pojo.getEmailSendOk());
		Thread.sleep(4000);
		System.out.println(pojo.getWithoutEmailID().getText());
		Thread.sleep(4000);
		jsclick(pojo.getInvalidDialogBoxOKBTN());
		Thread.sleep(8000);

		// pojo.getEnterEmail().clear();
		Thread.sleep(2000);
		pojo.getforCCmail().clear();
		Thread.sleep(3000);

		jsclick(pojo.getEmailSendOk());
		Thread.sleep(4000);
		System.out.println(pojo.getWithoutEmailID().getText());
		Thread.sleep(4000);
		jsclick(pojo.getInvalidDialogBoxOKBTN());
		log.info("tried to send a blank email", true);
		Thread.sleep(8000);
		jsclick(Refresh_Button(driver));
	}
     
    

}
