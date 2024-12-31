package Computhink.Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
ExpandNodesNR extends BaseClass {

	@BeforeClass
	public void loadBrowser() throws Exception {
		loadBrowser("Chrome");

		// log.info("Chrome Browser Launched");
		Reporter.log("Chrome Browser launched Successfully...");
		launchUrl();
		// launchLocalUrl();
		Reporter.log("Contentverse URL launched successfully...");
		// log.info("Contentverse URL launched successfully...");
	}

	@Test(priority = 1)
	public void TC_1_Login() throws Exception {
		// LogoutPage();
		loginCVS();

		// Reporter.log("Rnisha user logged in
		// 'CVWin19Server.Win2019_TestRoom'successfully... ");
		// .info("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successfully...
		// ");
	}

	public static void expandCabinets() throws Exception {
		Actions actions = new Actions(driver);

		// Loop through each cabinet and double-click to expand
		int cabinetCount = driver.findElements(By.xpath("//div[@id='viewDocumentnavigator']/ul/li")).size();
		for (int i = 1; i <= cabinetCount; i++) {

			WebElement cabinet = driver.findElement(By.xpath("//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/a"));
			Thread.sleep(3000);
			actions.doubleClick(cabinet).perform();
			Reporter.log("Expand a cabinet " + i, true);

			// Check if the current cabinet is the one we want to fully expand
			if (i == 2) {
				// Find the list of drawer elements within the current cabinet
				int drawerCount = driver
						.findElements(By.xpath("//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/ul/li")).size();

				// Loop through each drawer and double-click to expand
				for (int j = 1; j <= drawerCount; j++) {
					WebElement drawer = driver.findElement(
							By.xpath("//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/ul/li[" + j + "]/a"));
					Thread.sleep(3000);
					actions.doubleClick(drawer).perform();
					Reporter.log("Expand a drawer " + j, true);

					// Check if the current drawer is the one we want to fully expand
					if (j == 1) {
						// Find the list of folder elements within the current drawer
						int folderCount = driver
								.findElements(By.xpath(
										"//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/ul/li[" + j + "]/ul/li"))
								.size();

						// Double-click on the first folder only
						if (folderCount > 0) {
							WebElement folder = driver.findElement(By.xpath(
									"//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/ul/li[" + j + "]/ul/li[1]/a"));
							Thread.sleep(3000);
							actions.doubleClick(folder).perform();
							Reporter.log("Expand a folder 1" + folder, true);

							// Perform any additional actions on the expanded folder here

							// Break after expanding the first folder
							break;
						}
					}
				}
				// Break after expanding the specific cabinet and drawer
				break;
			}
		}
	}
}
