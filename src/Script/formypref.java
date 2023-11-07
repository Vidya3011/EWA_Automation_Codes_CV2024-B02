package Script;

import org.testng.annotations.Test;

public class formypref {
	@Test(priority=1)
	public void mypreferencetest() throws Exception {
	My_Preferences_Add_signature sign=new My_Preferences_Add_signature();
	sign.LandBrowser();
	sign.Login_EWA();
	sign.Verify_Upload_New_Signature();

	My_Preferences_DateFormat date=new My_Preferences_DateFormat();
	date.Verify_DateFormat_Default();
	date.Verify_DateFormat_DD_MM_YYYY();
	date.Verify_DateFormat_MM_DD_YYYY();
	date.Verify_DateFormat_YYYY_MM_DD();
	
	My_Preferences_Defaultviewing defa=new My_Preferences_Defaultviewing();
	defa.Verify_Defaultviewing_Convert_To_PDF();
	defa.Verify_Defaultviewing_Native_Format();
	
	 
	  My_Preferences_Viewer_Zoom zoom=new  My_Preferences_Viewer_Zoom();
	  zoom.Verify_Viewer_Zoom_Actual_Size();
	  zoom.Verify_Viewer_Zoom_Fit_Entire_Image();
	  zoom.Verify_Viewer_Zoom_Fit_To_Height();
	  zoom.Verify_Viewer_Zoom_Fit_To_Width();
	
	
	My_Preferences_Download_Allfiles dwnload=new My_Preferences_Download_Allfiles();
	dwnload.Verify_Download_All_Files();
  
	My_Preferences_Enable_Dashboard dashbrd=new My_Preferences_Enable_Dashboard();
	dashbrd.Verify_Enable_Dashboard();
	
	My_Preferences_Load_more_count load=new My_Preferences_Load_more_count();
	load.Verify_Load_MoreCount_On_Folder();
	load.Verify_Load_MoreCount_On_Search();
	load.Verify_Maximum_Load_MoreCount_On_Folder();
	load.Verify_Maximum_Load_MoreCountOn_Search();
	
	My_Preferences_Office_documents office =new My_Preferences_Office_documents();
	office.Verify_Browse_Office_documents_Advancedviewing();
	office.Verify_Browse_Office_documents_Defaultviewing();
	office.Verify_NewExcelSpreadsheet_Office_documents_Advancedviewing();
	office.Verify_NewWordDocuments_Office_documents_Advancedviewing();
	
	My_preferences_Pdf_documents pdf=new My_preferences_Pdf_documents();
	pdf.Verify_Browse_Pdf_documents_Advancedviewing();
	pdf.Verify_Browse_PDF_documents_Defaultviewing();
	pdf.Verify_Create_New_pdf_document_Advancedviewing();
	
	My_Preferences_PDF_with_Overlay over=new My_Preferences_PDF_with_Overlay();
	over.Verify_PDF_with_Overlay_Disable();
	over.Verify_PDF_with_Overlay_Enable();
	
	My_Preferences_QuickFind quick=new My_Preferences_QuickFind();
	quick.Verify_QuickFind_BothSearch();
	quick.Verify_QuickFind_DocIdSearch();
	quick.Verify_QuickFind_IndexSearch();
	quick.Verify_QuickFind_TextSearch();
	
	 My_Preferences_Redaction_View_Password paswrd=new  My_Preferences_Redaction_View_Password();
	 paswrd.Verify_Redaction_View_Password();
	 paswrd.Verify_Reset_My_Preferences();
	 
	 My_Preferences_Themes them=new My_Preferences_Themes();
	  them.Verify_Themes();
	}
	
	@Test(priority=2)
	public void spclChar() throws Exception {
	
		Special_Char_FileNames nam=new Special_Char_FileNames();
		nam.Upload_and_verify_Allowing_Accent_Characterfile();
		nam.Upload_and_verify_Allowing_Ampersant_Characterfile();
		nam.Upload_and_verify_Allowing_Attherate_Characterfile();
		nam.Upload_and_verify_Allowing_Caret_Characterfile();
		nam.Upload_and_verify_Allowing_Comma_Characterfile();
		nam.Upload_and_verify_Allowing_Dollar_Characterfile();
		nam.Upload_and_verify_Allowing_Equals_Characterfile();
		nam.Upload_and_verify_Allowing_Exclamatory_Characterfile();
		nam.Upload_and_verify_Allowing_Flowerbracket_Characterfile();
		nam.Upload_and_verify_Allowing_Hash_Characterfile();
		nam.Upload_and_verify_Allowing_Hyphen_Characterfile();
	}
		
	
	
}
