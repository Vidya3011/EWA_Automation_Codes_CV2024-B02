package Script;

import org.openqa.selenium.WebDriver;

import Pom.ViewerToolbar;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
SendToPrint {

	private WebDriver driver;

	SendToPrint() {

	}

	SendToPrint(WebDriver driver) {
		this.driver = driver;
	}

	public void testSendToPrint() throws Exception {
		ViewerToolbar print = new ViewerToolbar(driver);
		print.SetPrint();
	}
}
