package Script;

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

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Print_Email_Export_Negative_Scenerio extends BaseClass {

	private static org.apache.logging.log4j.Logger log = LogManager
			.getLogger(Print_Email_Export_Negative_Scenerio.class);

	/*
	 * @BeforeClass public void ladBrowser() { loadBrowser("Chrome"); launchUrl();
	 * log.info("CVS URL started Successfully..."); }
	 * 
	 * @Test(priority=1) public void LogVCS() throws Exception { loginCVS();
	 * log.info("CVS User is logged in successfully..."); }
	 */

	@Test(priority = 2)
	private void TC_1_Email_Print_Export_Negative_Script() throws Exception {
		Print pojo = new Print();
		pojo.Email_ConvertPDF_WithAll_Annotations_Invalid();
	}

}
