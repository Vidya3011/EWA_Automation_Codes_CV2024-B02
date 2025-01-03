package Scripts;

import org.openqa.selenium.WebDriver;


import Generic.IAutoConst;
import Generic.Lib;
import Pom.NewDocument;
import Pom.ViewerToolbar;

public class Viewer {
	//private static org.apache.logging.log4j.Logger log = LogManager.getLogger(Viewer.class);
//vidya
	private String[] fileNames;
	// private int count;
	private WebDriver driver;

	Viewer() {

	}

	Viewer(WebDriver driver) {
		this.driver = driver;
	}

	public void testViewerToolbar() throws Exception {
		ViewerToolbar view = new ViewerToolbar(driver);
		Thread.sleep(2000);
		view.SetComments();
		//view.DownloadAllPages();
		
		 Thread.sleep(2000); 
		 view.SetFullScreen(); 
		 Thread.sleep(2000);
		  view.SetCopyPaste(); 
		  view.SetDeletePage(); 
		  Thread.sleep(2000);
		  view.SetSavePage();
		  Thread.sleep(5000); 
		  view.setConvToPDF();
		  Thread.sleep(15000); 
		  view.DownloadAllPages(); 
		  Thread.sleep(5000);
		 view.DownloadFirstPage(); 
		 Thread.sleep(5000); 
		 view.SetCloseViewer();
		 Thread.sleep(2000);
		 LogoutPage logout=new LogoutPage(driver);
		 logout.testLogout();
		 

		  /*String xlpath = IAutoConst.xlpath;
			int rc = Lib.getRowCount(xlpath, "SplitRange");
			for (int i = 1; i <= rc; i++) {

				String StartPage = Lib.getCellValue(xlpath, "SplitRange", i, 0);
				StartPage = StartPage.substring(0, StartPage.length()-2);
				Reporter.log("StartRange:" + StartPage, true);

				String EndPage = Lib.getCellValue(xlpath, "SplitRange", i, 1);
				EndPage = EndPage.substring(0, EndPage.length()-2);
				Reporter.log("EndRange:" + EndPage, true);
				

				for (int j = 0; j < fileNames.length; j++) {
					String fileName = fileNames[j];
					String fileExt = fileName.substring(fileName.length() - 4, fileName.length());
					if (".tif".equalsIgnoreCase(fileExt) || ".tiff".equalsIgnoreCase(fileExt)) {
						Reporter.log("FileName Ext : " + fileName.substring(fileName.length() - 4, fileName.length()),
								true);
						view.SetSplitPageTiff(fileNames[j] , 3);
						// System.out.println("FileName Ext : "+fileName.substring(fileName.length()-4),
						// fileName.length()));
					} else if (".pdf".equalsIgnoreCase(fileExt)) {
						view.SetSplitPagePdf(fileName, StartPage, EndPage,j);
					}
				}*/
				
			}
			 
			
			
	

	/*
	 * public int getCount() { return count; }
	 * 
	 * public void setCount(int count) { this.count = count; }
	 */

	public String[] getFilenames() {
		return fileNames;
	}

	public void setFilenames(String[] filenames) {
		this.fileNames = filenames;
	}

}
