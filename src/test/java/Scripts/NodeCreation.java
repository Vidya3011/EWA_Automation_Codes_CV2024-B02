package Scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.IAutoConst;
import Generic.Lib;
import Pom.CreateNode;

public class NodeCreation {
	//private static org.apache.logging.log4j.Logger log = LogManager.getLogger(NodeCreation.class);
	//Vidya
	private WebDriver driver;

//	NodeCreation() {
//
//	}

	NodeCreation(WebDriver driver) {
		this.driver = driver;
	}

	// @Test(dependsOnMethods = { "ValidLogin" })
	 @Test
	public void testCreateNode() throws Exception {
		String xlpath = IAutoConst.xlpath;
		int rc = Lib.getRowCount(xlpath, "CreateNode");
		for (int i = 1; i <= rc; i++) {

			String CabinetName = Lib.getCellValue(xlpath, "CreateNode", i, 0);
			Reporter.log("Cabinet:" + CabinetName, true);

			String DrawerName = Lib.getCellValue(xlpath, "CreateNode", i, 1);
			Reporter.log("Drawer:" + DrawerName, true);

			String FolderName = Lib.getCellValue(xlpath, "CreateNode", i, 2);
			Reporter.log("Folder:" + FolderName, true);

			CreateNode node = new CreateNode(driver);
			node.CreateDrawerFolderforNameduser(CabinetName, DrawerName, FolderName);
			
			CreateDocument doc1 = new CreateDocument(driver);
			doc1.testCreateDocument();
					}
	}
}
