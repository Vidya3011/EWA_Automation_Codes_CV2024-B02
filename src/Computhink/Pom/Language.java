package Computhink.Pom;

//Dipak Automation Coading

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.collect.Table.Cell;

import Computhink.Generic.BaseClass;

public class Language extends BaseClass {

	public static WebElement element = null;
	private static final boolean False = false;

	public Language() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Username;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Logout;

	@FindBy(xpath = "//*[@id=\"locale\"]/a[1]")
	private WebElement English_Language;

	@FindBy(xpath = "//*[@id=\"locale\"]/a[2]")
	private WebElement Spanish_Language;

	@FindBy(xpath = "//*[@id=\"locale\"]/a[3]")
	private WebElement French_Language;

	@FindBy(xpath = "//*[@id=\"locale\"]/a[4]")
	private WebElement Dutch_Language;

	@FindBy(xpath = "//*[@id=\"locale\"]/a[5]")
	private WebElement Hindi_Language;

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	@FindBy(xpath = "//*[@id=\"defaultOfficeDocViewListNo\"]")
	private WebElement Select_Office_document_Defaultviewing;

	@FindBy(xpath = "//*[@id=\"defaultPdfDocViewListNo\"]")
	private WebElement Pdf_document_Defaultviewing;

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[1]/div[2]/div[2]")
	private WebElement Passworderror;

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[1]/div[1]/div[2]")
	private WebElement Usernameerror;

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement Roomerror;

	// Spanish Language

	@FindBy(xpath = ("//*[@id=\"createDocument\"]"))
	private WebElement NewDocuments_MenuOption;

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	// Select From Document Navigator

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	@FindBy(xpath = (".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_subFolder;

	// Select from Destination folder Location

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder1;

	@FindBy(xpath = "//*[@id=\"ocrPopUp\"]")
	private WebElement ocrpopup;

	@FindBy(xpath = ".//div[@id='Underscore _.pdf']/div[1]/img[1]")
	private WebElement Open_Underscore_page;

	@FindBy(linkText = "bijwerken")
	private WebElement UpdateDutch_Button;

	@FindBy(linkText = "opslaan")
	private WebElement DutchSave_UpdateButton;

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement DutchUpdate_Ok_button;

	@FindBy(xpath = "//span[normalize-space()='EIGENSCHAPPEN']")
	private WebElement DutchProperties_option;

	@FindBy(xpath = "//td[contains(text(),'MORTHWEST MEDICAT')]")
	private static WebElement ReportNameValueBeforeDoc;

	@FindBy(xpath = "//div[@id='showcustomTodoListModel']//input[@id='searchInput']")
	private WebElement TODOSearchBox;

	@FindBy(xpath = "//td[contains(text(),'Export Documentary Credit (DC) Bill Ne')]")
	private static WebElement ReportNameValueAfterDoc;

	@FindBy(xpath = "//*[@id=\"Hyphen -.tif\"]/div/img")
	private WebElement Open_Hyphen_page;

	@FindBy(xpath = "//*[@id=\"recentMenuBtn\"]")
	private WebElement MoveTo_Menu_Recent;

	@FindBy(xpath = "//*[@id=\"recentFolders\"]/tbody/tr[1]/td")
	private WebElement Recent_Folder;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_Button;

	@FindBy(xpath = "//span[@title='Document Close']")
	private WebElement Close_Document;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"docTypeList\"]")
	private WebElement Click_Document_Type_Dropdown;

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement Usernotexist;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Filenamevalidation;

	@FindBy(xpath = "//*[@id=\"Word document automation.docx\"]/div/img")
	private WebElement Open_Word_page;

	@FindBy(xpath = "//*[@id=\"Excel document automation.xlsx\"]/div/img")
	private WebElement Open_Excel_page;

	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement OKButton;

	@FindBy(xpath = "//*[@id=\"createDocumentMessage\"]")
	private WebElement NavigateDoc;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement NavigateButton;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Formmappingvalidation;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement FormOKbutton;

	@FindBy(xpath = "//*[@id=\"loadmorecount\"]")
	private WebElement Enter_Loadmorecount;

	@FindBy(xpath = "//span[@id='totalSearchCount']")
	private WebElement Verify_Loadmorecount_Searchresult;

	@FindBy(xpath = "//strong[@id='docCount']")
	private WebElement Verify_Loadmorecount_Document_Folder;

	@FindBy(xpath = "//*[@id=\"loadMoreDocList\"]/button")
	private WebElement Loadmorebutton;

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement Click_Search_Option;

	@FindBy(xpath = "//*[@id=\"advFindBtnLabel\"]")
	private WebElement Find_Button;

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement Invalidpassword;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/h3")
	private WebElement MyaccountText;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Create_Button;

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement View_Button;

	@FindBy(xpath = "//*[@id=\"fileInfoButton\"]/span")
	private WebElement Click_FileInfo_Option;

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_Report_Name_Text;

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
	private WebElement Browse_Option;

	@FindBy(xpath = "//*[@id=\"fileNameLabel\"]")
	private WebElement Click_FileInfo_OkButton_withFileName;

	@FindBy(xpath = "//*[@id=\"fileRenameOK\"]")
	private WebElement RemarkOk;

	@FindBy(xpath = "//*[@id=\"btnSignatureAdd\"]/span[1]")
	private WebElement Click_signature_Menuoption;

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement Add_Signature_Onpage;

	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;

	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;

	@FindBy(xpath = "//*[@id=\"menuDropDownButton\"]/span")
	private WebElement Move_to_Annotation_Option_inViewer;

	@FindBy(xpath = "//*[@id=\"lockenable1\"]")
	private WebElement Redaction_Option;

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement Page;

	@FindBy(xpath = ("//*[@id=\"fabButton\"]"))
	private WebElement fabbtn;

	@FindBy(xpath = "//*[@id=\"objectName\"]")
	private WebElement objectname;

	@FindBy(xpath = "//*[@id=\"dlgInput_Input\"]")
	private WebElement input;

	@FindBy(xpath = "//*[@id=\"objectConfirmPassword\"]")
	private WebElement confirmpassword;

	@FindBy(xpath = "//*[@id=\"dlgInput_Apply\"]")
	private WebElement Apply;

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement saveaddpage;

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement okbutton;

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement closedoc;

	@FindBy(xpath = "//*[@id=\"documentSendTo\"]")
	private WebElement sendTo;

	@FindBy(xpath = "//*[@id=\"sendToMail\"]")
	private WebElement sendToMail;

	@FindBy(xpath = "//*[@id=\"convertToPdfChk\"]")
	private WebElement converttopdf;

	@FindBy(xpath = "//*[@id=\"retainPdfColorExport1\"]")
	private WebElement colorexport;

	@FindBy(xpath = "//*[@id=\"convertToPdfQuality\"]")
	private WebElement pdfquality;

	@FindBy(xpath = "//*[@id=\"certifiedCoverPage\"]")
	private WebElement coverpage;

	@FindBy(xpath = "//*[@id=\"compressToZip\"]")
	private WebElement compresszip;

	@FindBy(xpath = "//*[@id=\"sendToPassword\"]")
	private WebElement sendtopassword;

	@FindBy(xpath = "//*[@id=\"zipPasswordInputpdf\"]")
	private WebElement zippassinput;

	@FindBy(xpath = "//*[@id=\"runAnnotations\"]")
	private WebElement Runannotation;

	@FindBy(xpath = "//*[@id=\"toEmial\"]")
	private WebElement toemail;

	@FindBy(xpath = "//*[@id=\"subjectid\"]")
	private WebElement subid;

	@FindBy(xpath = "//*[@id=\"saveSendToDocument\"]")
	private WebElement savesendto;

	@FindBy(xpath = "(//*[@id=\"messageButtonOK\"]")
	private WebElement sentmailOK;

	@FindBy(xpath = ("(//button[@class='modalDialogButtons'])[1]"))
	private WebElement EmailsuccessMessageDialogboxOK;

	@FindBy(xpath = "//*[@id=\"sendToPrint\"]")
	private WebElement sendtoPrint;

	@FindBy(xpath = "//*[@id=\"certifiedCoverPagePrint\"]")
	private WebElement pageprint;

	@FindBy(xpath = "//*[@id=\"includeRouteSummaryPrint\"]")
	private WebElement summaryprint;

	@FindBy(xpath = "//*[@id=\"unlockRedactionsWithPrint\"]")
	private WebElement withunlockredaction;

	@FindBy(xpath = "//*[@id=\"unlockRedactionsPwdPrint\"]")
	private WebElement pwdunlockredaction;

	@FindBy(xpath = "//*[@id=\"printDocumentOnView\"]")
	private WebElement printview;

	@FindBy(xpath = "//*[@id=\"sendToExport\"]")
	private WebElement sendexport;

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_Word_File_Name;

	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement TemplateOK;

	@FindBy(xpath = "//*[@id=\"addExcelFile\"]")
	private WebElement New_Excel_Spreadsheet_Option;

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_Excel_File_Name;

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Advancedviewing;

	@FindBy(xpath = "//*[@id=\"addPdfFile\"]")
	private WebElement New_pdf_Document_Option;

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_pdf_File_Name;

	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement TempOK;

	@FindBy(xpath = "//*[@id=\"retainFormatChkExport\"]")
	private WebElement retainchkexport;

	@FindBy(xpath = "//*[@id=\"includeRouteSummary\"]")
	private WebElement Routesummary;

	@FindBy(xpath = "//*[@id=\"zipPasswordInput\"]")
	private WebElement Zippassword;

	@FindBy(xpath = "//*[@id=\"convertToPdfChkExport\"]")
	private WebElement convertpdfexport;

	@FindBy(xpath = "//*[@id=\"exportAnnotations\"]")
	private WebElement exportannotation;

	@FindBy(xpath = "//*[@id=\"unlockRedactionsWithExport\"]")
	private WebElement exportwith;

	@FindBy(xpath = "//*[@id=\"unlockRedactionsPwdExport\"]")
	private WebElement exportPwd;

	@FindBy(xpath = "//*[@id=\"zipPasswordInput\"]")
	private WebElement Zippasswordinput;

	@FindBy(xpath = "//*[@id=\"pdfPasswordInput\"]")
	private WebElement Pdfpasswordinput;

	@FindBy(xpath = "//*[@id=\"sendToSecureMail\"]")
	private WebElement SecureMail;

	@FindBy(xpath = "//*[@id=\"recepientEmailId\"]")
	private WebElement recpmail;

	@FindBy(xpath = "//*[@id=\"confirmEmailIdSecure\"]")
	private WebElement Confirmemail;

	@FindBy(xpath = "//*[@id=\"modifyPermissionCheckbox\"]")
	private WebElement modifychk;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk32\"]")
	private WebElement navigateOK;

	@FindBy(xpath = "//*[@id=\"recipientMailIdSecond\"]")
	private WebElement recpmailsec;

	@FindBy(xpath = "//*[@id=\"confirmEmailIdSecureSecond\"]")
	private WebElement confirmemailsec;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk33\"]")
	private WebElement navigateOK2;

	@FindBy(xpath = "//*[@id=\"generateDocumentLink\"]")
	private WebElement generatedoc;

	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement Okbutton;

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"commentMessage\"]")
	private WebElement FolderSelectMessage;

	@FindBy(xpath = "//*[@id=\"CommentsMessageModelOk\"]")
	private WebElement CommentOK;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement addpagesMessage;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement CommentOKbutton;

	@FindBy(xpath = "//*[@id=\"saveTemplate\"]")
	private WebElement savetemp;

	@FindBy(xpath = "//*[@id=\"createDocumentClear\"]")
	private WebElement ClearButton;

	@FindBy(xpath = "//*[@id=\"templateErr\"]")
	private WebElement validationerror;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Createdoc;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Reportvaluevalidationerror;

	@FindBy(xpath = "//*[@id=\"documentLinkOk\"]")
	private WebElement doclinkok;

	@FindBy(xpath = "//*[@id=\"messageContentLink\"]")
	private WebElement CopyDoclink;

	@FindBy(xpath = "//*[@id=\"sendDocAsReference\"]")
	private WebElement Referencemail;

	@FindBy(xpath = "//*[@id=\"docOwnerName\"]")
	private WebElement Docownername;

	@FindBy(xpath = "//*[@id=\"detailsBlock\"]/p[2]/span")
	private WebElement openviewonly;

	@FindBy(xpath = "//*[@id=\"ownershipMessageModelOk\"]")
	private WebElement ownershipmessageok;

	@FindBy(xpath = "//*[@id=\"releaseOwnership\"]")
	private WebElement Select_Option_ReleaseOwnership;

	@FindBy(xpath = "//*[@id=\"refreshDocuments\"]")
	private WebElement Select_Option_Refresh;

	@FindBy(xpath = "//*[@id=\"documentSetcolour\"]")
	private WebElement Select_Option_Catagories_andSet_Colors;

	@FindBy(xpath = "//*[@id=\"CustomColourid_5\"]")
	private WebElement Select_Colors;

	@FindBy(xpath = "//*[@id=\"cutid\"]")
	private WebElement Cut_ID;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]/label/span")
	private WebElement check;

	@FindBy(xpath = "//*[@id=\"delDocument\"]")
	private WebElement deletedoc;

	@FindBy(xpath = "//*[@id=\"deleteMessageOk\"]")
	private WebElement deleteOK;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]/label/span")
	private WebElement checkdoc;

	@FindBy(xpath = "//*[@id=\"documentcreatefav\"]")
	private WebElement createFavorite;

	@FindBy(xpath = "//*[@id=\"createFavText\"]")
	private WebElement createFavoriteText;

	@FindBy(xpath = "//*[@id=\"createFavModelOk\"]")
	private WebElement createFavoriteOK;

	@FindBy(xpath = "//*[@id=\"bookmarkid\"]/img")
	private WebElement bookmark;

	@FindBy(xpath = "//*[@id=\"loadAllfavrites\"]")
	private WebElement loadfav;

	@FindBy(xpath = "//*[@id=\"searchFav\"]")
	private WebElement Searchfav;

	@FindBy(xpath = "//*[@id=\"createfavshowAllModelTabel\"]/tbody/tr[1]/td[1]")
	private WebElement doc;

	@FindBy(xpath = "//*[@id=\"sendtoworkflow\"]")
	private WebElement Workflow;

	@FindBy(css = "#assignedWfTable .odd:nth-child(13) > td")
	private WebElement AutoWorkflow;

	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement customdoc;

	@FindBy(xpath = "//*[@id=\"ownershipMessageModelOk\"]")
	private WebElement ownershipok;

	@FindBy(xpath = "//*[@id=\"notificationSettings\"]")
	private WebElement notification;

	@FindBy(xpath = "//*[@id=\"contentverseRef\"]")
	private WebElement contref;

	@FindBy(xpath = "//*[@id=\"documentHistory\"]")
	private WebElement dochistory;

	@FindBy(css = "//*[@id=\"dropdownNotifylist\"]")
	private WebElement notifylist;

	@FindBy(xpath = "//*[@id=\"spanCheckNotifications_1\"]")
	private WebElement checknotification;

	@FindBy(xpath = "//*[@id=\"notifySaveBtn\"]")
	private WebElement savenotify;

	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement customdocname;

	@FindBy(xpath = "//*[@id=\"general\"]/div/div[1]/span")
	private WebElement general;

	@FindBy(xpath = "//th[contains(text(),'DOCUMENT SIZE')]")
	private static WebElement DocumentSize;

	@FindBy(xpath = "//th[contains(text(),'CURRENT DATE')]")
	private static WebElement Currentdate;

	@FindBy(xpath = "//th[contains(text(),'REPORTNAME')]")
	private static WebElement REPORTNAME;

	@FindBy(xpath = "//*[@id=\"myTaskMenu\"]")
	private WebElement MoveTo_ToDoList_Option;

	@FindBy(xpath = "//*[@id=\"CustomUserTitleToDoList\"]/h2")
	private static WebElement titlevalidation;

	@FindBy(xpath = "//*[@id=\"tittleoftodoListcustom\"]/h2")
	private static WebElement textvalidation;

	@FindBy(xpath = "//*[@id=\"CustomListTodoOK\"]")
	private static WebElement ToDoList_Ok_Button_CustomList;

	@FindBy(xpath = "//*[@id=\"folderLocationForSearch\"]")
	private static WebElement Document_Location;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk1\"]")
	private static WebElement Ok_button;

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	// Custom Columns

	@FindBy(xpath = "//*[@id=\"CustomList\"]")
	private WebElement CustomColumnOptionRoom;

	@FindBy(xpath = "//*[@id=\"todoAll\"]")
	private WebElement Select_All_Item;

	@FindBy(xpath = "//*[@id=\"todoResetColumns\"]")
	private WebElement To_Do_Resetcolumn_Option;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Text key\"]")
	private WebElement Select_Indices01;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Numeric 123\"]")
	private WebElement Select_Indices02;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Date 123\"]")
	private WebElement Select_Indices03;

	@FindBy(xpath = "//*[@id=\"setCustomListdropdown\"]")
	private WebElement Click_DropdownOption;

	@FindBy(xpath = "//*[@id=\"roomLevel\"]")
	private WebElement Set_RoomLevel_Indices;

	@FindBy(xpath = "//*[@id=\"Resetcolumns\"]")
	private WebElement Room_Reset_CustomColumns;

	@FindBy(xpath = "//*[@id=\"culstomcolsearch\"]")
	private WebElement Search_Custom_Columns_option;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Document Size\"]")
	private WebElement Search_Select_Indices01;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Student Name\"]")
	private WebElement Search_Select_Indices02;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_ReportName\"]")
	private WebElement Search_Select_Indices03;

	@FindBy(xpath = "//*[@id=\"Defaultcolsearch\"]")
	private WebElement Search_ResetColumn;

	@FindBy(xpath = "//*[@id=\"resetColumsOk\"]")
	private WebElement Reset_Column_OK_Button;

	@FindBy(xpath = "//*[@id=\"todoCustomColumns\"]")
	private WebElement ToDoList_Custom_Columns_option;

	@FindBy(xpath = "//*[@id=\"navigationMenuBtn\"]")
	private WebElement MoveTo_Menu_RoomName;

	@FindBy(xpath = "//*[@id=\"CustomUserTitle\"]/h2")
	private WebElement titelvalidation;

	@FindBy(xpath = "//*[@id=\"setCustomListlabel\"]")
	private WebElement textlvalidation;
	@FindBy(xpath = "//*[@id=\"tittleofcustom\"]/h2")
	private WebElement textlvalidation2;

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement ele;

	@FindBy(xpath = "//*[@id=\"formMapper\"]")
	private WebElement Click_Formmapper;

	@FindBy(xpath = "//select[@id='formField1']")
	private WebElement Select_Formfield;

	@FindBy(xpath = "//button[@id='setFormMapping']")
	private WebElement FormOK;

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Verify_DuplicateTemp_Message;

	@FindBy(xpath = "//span[@id='pdfViewerDiv_formdesignerIcon']")
	private WebElement pdfViewer;

	@FindBy(xpath = "//*[@id=\"pdfViewerDiv_formdesigner_textbox\"]")
	private WebElement Textbox;

	@FindBy(css = "#pdfViewerDiv_textLayer_0")
	private WebElement Add_Textbox_Onpage;

	@FindBy(xpath = "//th[contains(text(),'DATE 123')]")
	private static WebElement DATE;

	@FindBy(xpath = "//th[contains(text(),'NUMERIC 123')]")
	private static WebElement NUMERIC;

	@FindBy(xpath = "//th[contains(text(),'TEXT KEY')]")
	private static WebElement TEXT;

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement Default_Button_CustomList;

	@FindBy(xpath = "//*[@id=\"CustomListCancel\"]")
	private static WebElement Cancel_Button_CustomList;

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement MoveTo_Search_Option;

	@FindBy(xpath = "//*[@id=\"CustomUserTitle\"]/h2")
	private WebElement Search_titelvalidation;

	@FindBy(xpath = "//*[@id=\"tittleofcustom\"]/h2")
	private WebElement Search_textvalidation;

	@FindBy(xpath = "//*[@id=\"CustomListOK\"]")
	private static WebElement Search_Ok_Button_CustomList;

	@FindBy(xpath = ("//tbody/tr[1]/td[1]/label[1]/span[1]"))
	private WebElement Select_Document;

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Click_Username;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Click_LogoutOption;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document;

	@FindBy(xpath = "//*[@id=\"CustomListCancel\"]")
	private WebElement cancelbutton;

	@FindBy(xpath = "//*[@id=\"CustomListTodoCancel\"]")
	private WebElement cancelTODObutton;

	@FindBy(xpath = "//*[@id=\"customTodoListModelClose\"]")
	private WebElement CrosscancelTODObutton;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValuesTodolist_Workflow Status\"]")
	private WebElement ToDoList_Select_Indices01;

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBoxTODO;

	@FindBy(xpath = "//th[contains(text(),'WORKFLOW STATUS')]")
	private static WebElement WORKFLOWSTATUS;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]")
	private static WebElement getSelect_Document;

	@FindBy(id = "sendtoworkflow")
	private static WebElement sendWorkflow;

	@FindBy(css = "#assignedWfTable td")
	private static WebElement WFAssign;

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;

	@FindBy(xpath = "//*[@id=\"pasteid\"]")
	private WebElement Paste_ID;

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBox;

	@FindBy(xpath = "//*[@id=\"customListModelClose\"]")
	private WebElement Crosscancel;

	@FindBy(xpath = "//*[@id=\"viewerZoomId\"]")
	private WebElement Select_Dropdown_Actual_Size;

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement Save_button;

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement DocumentSave_Ok_button;

	@FindBy(linkText = "actualizar")
	private WebElement UpdateSpanish_Button;

	@FindBy(linkText = "salvar")
	private WebElement SpanishSave_UpdateButton;

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement SpanishUpdate_Ok_button;

	@FindBy(xpath = "//span[normalize-space()='PROPIEDADES']")
	private WebElement SpanishProperties_option;

	@FindBy(linkText = "ReportName")
	private WebElement ReportName;

	@FindBy(xpath = "//*[@id=\"showHideThumbnail\"]/span")
	private WebElement showHideThumbnail;

	@FindBy(xpath = "//*[@id=\"documentTemplates\"]")
	private WebElement Templates_MenuOption;

	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle\"]")
	private WebElement Cancel_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"createTemplateBtn\"]")
	private WebElement Save_Template_Button;

	@FindBy(xpath = "//*[@id=\"createTemplateCancel\"]")
	private WebElement Template_Description_No_button;

	@FindBy(xpath = "//*[@id=\"templateName\"]")
	private WebElement Template_NameTextbox;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement Template_Created_OK_button;

	@FindBy(xpath = "//*[@id=\"documentTemplates\"]")
	private WebElement Moveto_Templates_Option;;

	@FindBy(xpath = "//*[@id=\"templateDescription\"]")
	private WebElement Template_Description_Messagebox;

	@FindBy(xpath = "//*[@id=\"createTemplateOk\"]")
	private WebElement Template_Description_OK_button;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Template_Created_Message_Verify;

	@FindBy(id = "Template_Automation1")
	private WebElement Select_Created_Template;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Created_button;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_button;

	@FindBy(xpath = "//*[@id=\"editTemplate1\"]")
	private WebElement Click_Edit_Template_Button;

	@FindBy(xpath = "//*[@id=\"editTemplateDescription\"]")
	private WebElement EditTemplate_Description_Messagebox;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement EditTemplate_Created_OK_button;

	@FindBy(xpath = "//*[@id=\"delTemp\"]")
	private WebElement Delete_Template_Button;

	@FindBy(xpath = "//*[@id=\"deleteTemplateOk\"]")
	private WebElement Delete_Template_OK_Button;

	@FindBy(xpath = "//*[@id=\"editTemplateCancel\"]")
	private WebElement EditTemplate_Description_No_button;

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Advancedviewing;

	@FindBy(xpath = ("//*[@id=\"addWordFile\"]"))
	private WebElement New_Word_Document_Option;

	@FindBy(xpath = "//*[@id=\"editTemplateOk\"]")
	private WebElement EditTemplate_Description_OK_button;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement EditTemplate_Created_Message_Verify;

	@FindBy(xpath = "//*[@id=\"rubberBandInteractiveMode_shortcut\"]/span")
	private WebElement ClickOCR;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[1]/a"))
	private WebElement Search_Cabinet;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[1]/ul/li[1]/a"))
	private WebElement Search_Drawer;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[1]/ul/li/ul/li[1]/a"))
	private WebElement Search_Folder;

	@FindBy(xpath = "//button[@id='CustomListOK']")
	private static WebElement Ok_Button_CustomList;

	public void Verify_Reset_CustomColumsnRoom() {

		if (Room_Reset_CustomColumns.isEnabled() == true) {
			jsclick(Room_Reset_CustomColumns);
		}
	}

	public void Verify_Reset_CustomColumsnSearch() {

		if (Search_ResetColumn.isEnabled() == true) {
			jsclick(Search_ResetColumn);
		}
	}

	public void Verify_Reset_CustomColumsnTodolist() {

		if (To_Do_Resetcolumn_Option.isEnabled() == true) {
			jsclick(To_Do_Resetcolumn_Option);
		}
	}

	public void getSet_OCR_ToDocument() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Page;
		action.dragAndDropBy(element, -300, -20).build().perform();
		jsclick(Page);
	}

	public void getSelect_Office_document_Defaultviewing() {
		Select sel = new Select(Select_Office_document_Defaultviewing);
		sel.selectByVisibleText("Default viewing");
	}

	public void getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		drop.selectByVisibleText("Default viewing");
	}

	public void loginwithoutUsername() throws Exception {
		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		Reporter.log("Do not entered username into username field", true);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		Reporter.log("Select a Room", true);
		Thread.sleep(3000);
		try {
			Thread.sleep(6000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(6000);

		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void loginwithoutPassword() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		driver.findElement(By.id("loginPassword")).clear();
		Reporter.log("Do not entered password into password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		Reporter.log("Select a Room", true);
		Thread.sleep(3000);
		try {
			Thread.sleep(6000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(6000);

		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void loginwithoutRoomname() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByIndex(0);
		Reporter.log("Select Please select a room Option", true);
		Thread.sleep(3000);
		try {
			Thread.sleep(6000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(6000);

		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void getUsernameerror() {

		String expectedtext = "Please enter username";
		String actualtext = Usernameerror.getText();
		Assert.assertEquals(actualtext, expectedtext);
		Reporter.log(Usernameerror.getText() + " validation message should show", true);

	}

	public void getPassworderror() {

		String expectedtext = "Please enter password";
		String actualtext = Passworderror.getText();
		Assert.assertEquals(actualtext, expectedtext);
		Reporter.log(Passworderror.getText() + " validation message should show", true);

	}

	public void getRoomerror() {

		String expectedtext = "Select a room";
		String actualtext = Roomerror.getText();
		Assert.assertEquals(actualtext, expectedtext);
		Reporter.log(Roomerror.getText() + " validation message should show when none of above room selected for Login",
				true);

	}

	public void InvalidUsername() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter Invalid Username into Username field", true);
		driver.findElement(By.id("loginPassword")).clear();
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		Reporter.log("Select a Room", true);
		Thread.sleep(3000);
		try {
			Thread.sleep(6000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(6000);

		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void InvalidPassword() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		driver.findElement(By.id("loginPassword")).clear();
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter Invalid Password into Password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		Reporter.log("Select a Room", true);
		Thread.sleep(3000);
		try {
			Thread.sleep(6000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(6000);

		try {
			WebElement sessionmsg = driver.findElement(By.xpath("//*[@id=\"cvModelLoginValidationMessage\"]"));
			WebElement sessionmsgNO = driver.findElement(By.xpath("//*[@id=\"cvModelLoginValidationCancel\"]"));
			Reporter.log(sessionmsg.getText() + "this message is displayed", true);
			sessionmsgNO.click();
			Thread.sleep(2000);
			Reporter.log("Click on the No button", true);

		} catch (Exception e1) {
			// Session message is not displayed
		}

		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void getUsernotexist() {

		String expectedtext = "The username or password was incorrect";
		String actualtext = Usernotexist.getText();
		Assert.assertEquals(actualtext, expectedtext);
		Reporter.log(Usernotexist.getText() + " validation message should show", true);

	}

	public void getInvalidpassword() {

		String expectedtext = "The username or password was incorrect";
		String actualtext = Invalidpassword.getText();
		Assert.assertEquals(actualtext, expectedtext);
		Reporter.log(Invalidpassword.getText() + " validation message should show", true);

	}

	public void French_Myaccount_Text_Laguage() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "Mon compte";
		String actualtext2 = MyaccountText.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		Reporter.log("Change Laguage in French and My Account Text is: " + MyaccountText.getText(), true);

	}

	public void Dutch_Myaccount_Text_Laguage() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "Mijn rekening";
		String actualtext2 = MyaccountText.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		Reporter.log("Change Laguage in Dutch and My Account Text is: " + MyaccountText.getText(), true);

	}

	public void Hindi_Myaccount_Text_Laguage() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "मेरा खाता";
		String actualtext2 = MyaccountText.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		Reporter.log("Change Laguage in Hindi and My Account Text is: " + MyaccountText.getText(), true);

	}

	public void English_Myaccount_Text_Laguage() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "My Account";
		String actualtext2 = MyaccountText.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		Reporter.log("Change Laguage in English and My Account Text is: " + MyaccountText.getText(), true);

	}

	public void Spanish_Myaccount_Text_Laguage() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "Mi cuenta";
		String actualtext2 = MyaccountText.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		Reporter.log("Change Laguage in spanish and My Account Text is : " + MyaccountText.getText(), true);

	}

	public WebElement getgetSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;
	}

	public WebElement getMove_To_PlusIcon() {
		WebElement ele = Move_To_PlusIcon;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return ele;
	}

	public void getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
	}

	public void getClick_FileInfo_Option() {
		WebElement ele = Click_FileInfo_Option;
		ele.click();
	}

	public void getClick_FileInfo_OkButton_withFileName() {
		WebElement Filename = Click_FileInfo_OkButton_withFileName;
		Reporter.log("File name is:" + Filename.getText(), true);
		WebElement ele = RemarkOk;
		ele.click();

	}

	public void getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Signature_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();
	}

	public void getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys(Language_excelRead(2, 1));
		jsclick(verifypassok);

	}

	public void getMove_to_Annotation_Option_inViewer() throws Exception {
		WebElement ele = Move_to_Annotation_Option_inViewer;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

	}

	public void getRedaction_Option() throws Exception {
		WebElement ele1 = Redaction_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	public void getSet_Redaction_ToDocument() throws Exception {

		Actions act = new Actions(driver);
		act.click(Redaction_Option).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
		Thread.sleep(3000);
		objectname.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(input);
		Thread.sleep(6000);
		input.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(6000);
		jsclick(confirmpassword);
		Thread.sleep(6000);
		confirmpassword.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(Apply);

	}

	public void getSelect_Dropdown_Actual_Size() {
		Select sel = new Select(Select_Dropdown_Actual_Size);
		sel.selectByVisibleText("Actual Size");
	}

	public void getSet_OCR_ToDocumentPDF() throws Exception {

		Actions action = new Actions(driver);
		WebElement element = Page;
		action.dragAndDropBy(element, -150, -20).build().perform();
		jsclick(Page);

	}

	public void getTemplate_Description_Messageboxvalue() throws Exception {
		Template_Description_Messagebox.sendKeys(Language_excelRead(2, 2));

	}

	public void getTemplate_NameTextboxvalue() throws Exception {
		Template_NameTextbox.sendKeys(Language_excelRead(1, 2));

	}

	public void getTemplate_Created_Message_Verify() {

		String expectedtext = "Template Created Successfully!";
		String actualtext = Template_Created_Message_Verify.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public void getMoveto_Templates_Option() {
		WebElement ele = Moveto_Templates_Option;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

	}

	public void getSelect_ReportName_Testvalue() throws Exception {
		Enter_Report_Name_Text.sendKeys(Language_excelRead(3, 2));
	}

	public void getEditTemplate_Description_Messageboxvalue() throws Exception {
		EditTemplate_Description_Messagebox.sendKeys(Language_excelRead(4, 2));
	}

	public void getEditTemplate_Created_Message_Verify() {

		String expectedtext = "Template Edited Successfully!";
		String actualtext = EditTemplate_Created_Message_Verify.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public void getSelect_Office_document_Advancedviewing() {
		Select sel = new Select(Select_Office_document_Advancedviewing);
		sel.selectByVisibleText("Advanced viewing");

	}

	public void getNew_Word_Document_Option() {
		WebElement ele1 = New_Word_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	public void getEnter_Word_File_Name() throws Exception {
		WebElement ele = Enter_Word_File_Name;
		ele.sendKeys(Language_excelRead(5, 2));
		TemplateOK.click();

	}

	// New Excel Spreadsheet

	public void getNew_Excel_Spreadsheet_Option() {
		WebElement ele1 = New_Excel_Spreadsheet_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	public void getEnter_Excel_File_Name() throws Exception {
		WebElement ele1 = Enter_Excel_File_Name;
		ele1.sendKeys(Language_excelRead(6, 2));
		TemplateOK.click();

	}

	public void getPdf_document_Advancedviewing() {
		Select drop = new Select(Pdf_document_Advancedviewing);
		drop.selectByVisibleText("Advanced viewing");

	}

	public void getNew_pdf_Document_Option() {
		WebElement ele1 = New_pdf_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
	}

	public void getEnter_pdf_File_Name() throws Exception {
		WebElement ele1 = Enter_pdf_File_Name;
		ele1.sendKeys(Language_excelRead(7, 2));
		Thread.sleep(3000);
		TempOK.click();

	}

	public WebElement getAdd_Textbox_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Textbox_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();
		return Add_Textbox_Onpage;
	}

	public void getSelect_Formfield() {
		Select sel = new Select(Select_Formfield);
		sel.selectByVisibleText("Textbox1");
	}

	public void getVerify_DuplicateTemp_Message() {
		WebElement Message = Verify_DuplicateTemp_Message;
		Reporter.log(Message.getText(), true);

	}

	public void getFolderSelectMessage() {

		String expectedtext = "Please select a folder to create document";
		String actualtext = FolderSelectMessage.getText();
		Assert.assertEquals(actualtext, expectedtext);
		Reporter.log(FolderSelectMessage.getText(), true);
		jsclick(CommentOK);
	}

	public void getFolder_ErrorMessage() {

		String expectedtext = "Please add pages to the template before creating!";
		String actualtext = addpagesMessage.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(addpagesMessage.getText(), true);
		jsclick(CommentOKbutton);

	}

	public void getvalidationerror() {

		String expectedtext = "*Template name should be specified.";
		String actualtext = validationerror.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(validationerror.getText(), true);

	}

	public void getReportvaluevalidationerror() {

		String expectedtext = "ReportName*  	field is required";
		String actualtext = Reportvaluevalidationerror.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(Reportvaluevalidationerror.getText(), true);
		jsclick(CommentOKbutton);

	}

	public void getFilenamevalidation() {

		String expectedtext = "Please enter file name ";
		String actualtext = Filenamevalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(Filenamevalidation.getText(), true);
		jsclick(CommentOKbutton);

	}

	public void getNavigateDoc() {

		String expectedtext = "Document created successfully";
		String actualtext = NavigateDoc.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(NavigateDoc.getText(), true);
		jsclick(NavigateButton);

	}

	public void getFormmappingvalidation() {

		String expectedtext = "Please add form fields before mapping.";
		String actualtext = Formmappingvalidation.getText();
		Assert.assertEquals(actualtext, expectedtext);
		Reporter.log(Formmappingvalidation.getText(), true);
		jsclick(FormOKbutton);

	}
	// Load More count

	public void getEnter_Loadmorecount() throws Exception {
		WebElement ele = Enter_Loadmorecount;
		ele.clear();
		ele.sendKeys(CountexcelRead(1, 4));

	}

	public void getVerify_Loadmorecount_Searchresult() throws Exception {
		WebElement count = Verify_Loadmorecount_Searchresult;
		Reporter.log("The " + count.getText());

	}

	public void getVerify_Loadmorecount_Document_Folder() throws Exception {
		WebElement DocDisplay = Verify_Loadmorecount_Document_Folder;
		Reporter.log("Verify and " + DocDisplay.getText());

	}

	public WebElement getMoveTo_Menu_RoomName() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_RoomName).perform();
		return MoveTo_Menu_RoomName;
	}

	public void gettitelvalidation() {

		String expectedtext = "Custom List";
		String actualtext = titelvalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public void getextvalidation() {

		String expectedtext = "Set custom columns";
		String actualtext = textlvalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		String expectedtext2 = "Select the indices you want display for documents";
		String actualtext2 = textlvalidation2.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Text verification failed");

	}

	public void Verify_Indicess_Value() throws InterruptedException {

		Thread.sleep(4000);

		String expectedtext = "DATE 123";
		String actualtext = DATE.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log("Indices01 value displayed successfully" + DATE.getText(), true);
		Thread.sleep(4000);
		String expectedtext1 = "NUMERIC 123";
		String actualtext1 = NUMERIC.getText();
		Assert.assertEquals(actualtext1, expectedtext1, "Text verification failed");
		Reporter.log("Indices02 value displayed successfully" + NUMERIC.getText(), true);
		Thread.sleep(4000);
		String expectedtext2 = "TEXT KEY";
		String actualtext2 = TEXT.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		Reporter.log("Indices03 value displayed successfully" + TEXT.getText(), true);

	}

	public static void Default_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Default_Button_CustomList);
	}

	public static void Cancel_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Cancel_Button_CustomList);

	}

	public void Select_DropdownValue() {
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"setCustomListdropdown\"]"));
		jsclick(dropdown.findElement(By.xpath("//*[@id=\"roomLevel\"]")));

	}

	public void Verify_CompactView_checkbox() {
		if (driver.findElement(By.id("displayCompactViewOfList")).isSelected() == true) {
			jsclick(driver.findElement(By.id("displayCompactViewOfList")));
		}

	}

	// Search *

	public void MoveTo_Search_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Search_Option).perform();

	}

	public void getSearch_titelvalidation() {

		String expectedtext = "Custom List";
		String actualtext = Search_titelvalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public void getSearch_textvalidation() {

		String expectedtext = "Select the indices you want display for documents";
		String actualtext = Search_textvalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public static void Search_Ok_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Search_Ok_Button_CustomList);
	}

	public void Search_Verify_Indicess_Value4() throws InterruptedException {

		Thread.sleep(4000);

		String expectedtext = "DOCUMENT SIZE";
		String actualtext = DocumentSize.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log("Indices value displayed successfully" + DocumentSize.getText(), true);

	}

	public void Search_Verify_Indicess_Value5() throws InterruptedException {

		Thread.sleep(4000);

		String expectedtext = "CURRENT DATE";
		String actualtext = Currentdate.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log("Indices value displayed successfully" + Currentdate.getText(), true);

	}

	public void Search_Verify_Indicess_Value6() throws InterruptedException {

		Thread.sleep(4000);

		String expectedtext = "REPORTNAME";
		String actualtext = REPORTNAME.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log("Indices value displayed successfully" + REPORTNAME.getText(), true);

	}

	// ToDoList

	public void MoveTo_ToDoList_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_ToDoList_Option).perform();

	}

	public void ToDoList_titelvalidation() {

		String expectedtext = "Custom List";
		String actualtext = titlevalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public void ToDoList_textvalidation() {

		String expectedtext = "Select the indices you want display for documents";
		String actualtext = textvalidation.getText();
		Assert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	public void getMoveTo_Menu_Documents() {
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void getVerify_CopyandPaste_Document() throws InterruptedException {

		jsclick(Copy_ID);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		jsclick(Paste_ID);

	}

	public void getSearchBoxIndices1() throws Exception {
		SearchBox.sendKeys(Language_excelRead(1, 3));

	}

	public void getSearchBoxIndices2() throws Exception {
		SearchBox.sendKeys(Language_excelRead(2, 3));

	}

	public void getSearchBoxIndices3() throws Exception {
		SearchBox.sendKeys(Language_excelRead(3, 3));

	}

	public void getSearchBoxIndices4() throws Exception {
		SearchBox.sendKeys(Language_excelRead(4, 3));
	}

	public void getSearchBoxIndices5() throws Exception {
		SearchBox.sendKeys(Language_excelRead(5, 3));

	}

	public void getSearchBoxIndices6() throws Exception {
		SearchBox.sendKeys(Language_excelRead(6, 3));

	}

	public void getSearchBoxIndices7() throws Exception {
		jsclick(SearchBoxTODO);
		SearchBoxTODO.sendKeys(Language_excelRead(7, 3));

	}

	public void ToDoList_Verify_Indicess_Value() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "WORKFLOW STATUS";
		String actualtext2 = WORKFLOWSTATUS.getText();
		Assert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		Reporter.log("Indices value displayed successfully" + WORKFLOWSTATUS.getText(), true);

	}

	public void getVerify_Ownership_Message() throws InterruptedException {

		jsclick(ownershipmessageok);

	}

	public void getSelect_Option_ReleaseOwnership() {
		WebElement ele1 = Select_Option_ReleaseOwnership;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	public void getSelect_Option_Refresh() {
		WebElement ele1 = Select_Option_Refresh;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	public void getSelect_Option_Catagories_andSet_Colors() throws InterruptedException {
		Thread.sleep(6000);
		jsclick(Select_Option_Catagories_andSet_Colors);
		Thread.sleep(4000);
		jsclick(Select_Colors);

	}

	public void getVerify_CutandPaste_Document() throws InterruptedException {

		jsclick(Cut_ID);
		Thread.sleep(6000);
		jsclick(Select_subFolder);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(Paste_ID);

	}

	public void getVerify_Delete_Document() throws InterruptedException {
		jsclick(check);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(deletedoc);
		Thread.sleep(6000);
		jsclick(deleteOK);

	}

	public void getVerify_CreateFavorites_Document() throws Exception {

		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(createFavorite);
		Thread.sleep(4000);
		createFavoriteText.clear();
		Thread.sleep(4000);
		createFavoriteText.sendKeys(Language_excelRead(8, 2));
		Thread.sleep(6000);
		jsclick(createFavoriteOK);

	}

	public void getOpen_CreateFavorites_Document() throws Exception {
		Thread.sleep(6000);
		element = bookmark;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(4000);
		jsclick(loadfav);
		Thread.sleep(8000);
		jsclick(Searchfav);
		Thread.sleep(8000);
		Searchfav.sendKeys(Language_excelRead(8, 2));
		Thread.sleep(8000);
		jsclick(doc);

	}

	public void getCreate_SendToWorkflow_Document() throws Exception {

		jsclick(Workflow);
		Thread.sleep(4000);
		jsclick(AutoWorkflow);
		Thread.sleep(4000);
		jsclick(customdoc);
		Thread.sleep(6000);
		WebElement Message1 = Docownername;
		Reporter.log("Take Ownership Message " + Message1.getText(), true);
		Thread.sleep(4000);
		WebElement Message2 = openviewonly;
		Reporter.log("Take Ownership Message " + Message2.getText(), true);
		Thread.sleep(4000);
		jsclick(ownershipok);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(4000);
		movingclkElement(closedoc);

	}

	public void getCreate_Notification_Document() throws Exception {

		Thread.sleep(6000);
		jsclick(notification);
		Thread.sleep(110000);
		jsclick(contref);
		jsclick(dochistory);
		Thread.sleep(6000);
		jsclick(notifylist);
		Thread.sleep(6000);
		jsclick(checknotification);
		jsclick(savenotify);
		Thread.sleep(6000);
		jsclick(Select_Folder);
		Thread.sleep(6000);
		jsclick(customdocname);
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		jsclick(general);
		Thread.sleep(8000);

	}

	public void getSave_Signature_Document() throws Exception {
		jsclick(saveaddpage);
		Thread.sleep(8000);
		jsclick(okbutton);

	}

	public void getSentTo_Mail_asCopy() throws Exception {

		jsclick(sendTo);
		Thread.sleep(6000);
		jsclick(sendToMail);
		Thread.sleep(3000);
		jsclick(converttopdf);
		Thread.sleep(3000);
		jsclick(colorexport);
		Thread.sleep(6000);
		jsclick(pdfquality);
		Thread.sleep(6000);
		Select sel = new Select(pdfquality);
		sel.selectByVisibleText("Best Quality");
		Thread.sleep(6000);
		jsclick(coverpage);
		Thread.sleep(6000);
		jsclick(compresszip);
		Thread.sleep(6000);
		jsclick(sendtopassword);
		Thread.sleep(6000);
		jsclick(zippassinput);
		Thread.sleep(6000);
		zippassinput.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(6000);
		jsclick(Runannotation);
		Thread.sleep(6000);
		jsclick(toemail);
		Thread.sleep(6000);
		toemail.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(6000);
		jsclick(subid);
		Thread.sleep(6000);
		subid.sendKeys(Language_excelRead(9, 2));
		Thread.sleep(4000);
		jsclick(savesendto);
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);

	}

	public void getSentTo_Mail_asReference() throws Exception {

		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendToMail);
		Thread.sleep(3000);
		jsclick(Referencemail);
		Thread.sleep(3000);
		Select sel = new Select(pdfquality);
		sel.selectByVisibleText("Best Quality");
		jsclick(toemail);
		Thread.sleep(3000);
		toemail.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(subid);
		Thread.sleep(3000);
		subid.sendKeys(Language_excelRead(9, 2));
		Thread.sleep(4000);
		jsclick(savesendto);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);

	}

	public void getSentTo_Print() throws Exception {
		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendtoPrint);
		Thread.sleep(4000);
		jsclick(pageprint);
		Thread.sleep(4000);
		jsclick(summaryprint);
		Thread.sleep(4000);
		jsclick(withunlockredaction);
		Thread.sleep(4000);
		jsclick(pwdunlockredaction);
		pwdunlockredaction.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(4000);
		jsclick(printview);

	}

	public void getSentTo_Export() throws Exception {
		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendexport);
		Thread.sleep(3000);
		jsclick(retainchkexport);
		jsclick(Routesummary);
		Thread.sleep(3000);
		jsclick(savesendto);
		Thread.sleep(19000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action2 = new Actions(driver);
		action2.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendexport);
		Thread.sleep(3000);
		jsclick(convertpdfexport);
		jsclick(exportannotation);
		jsclick(exportwith);
		jsclick(exportPwd);
		Thread.sleep(3000);
		exportPwd.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(Zippasswordinput);
		Thread.sleep(3000);
		Zippasswordinput.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(Pdfpasswordinput);
		Thread.sleep(3000);
		Pdfpasswordinput.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(savesendto);
		Thread.sleep(6000);
	}

	public void getSentTo_SecureLink() throws Exception {
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(SecureMail);
		Thread.sleep(4000);
		jsclick(recpmail);
		Thread.sleep(3000);
		recpmail.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(Confirmemail);
		Thread.sleep(3000);
		Confirmemail.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);
		recpmailsec.sendKeys(Language_excelRead(1, 4));
		jsclick(confirmemailsec);
		Thread.sleep(3000);
		confirmemailsec.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);
	}

	public void getSentTo_GenerateDocumentLink() throws Exception {
		Thread.sleep(3000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(generatedoc);
		Thread.sleep(4000);
		jsclick(doclinkok);
		Thread.sleep(6000);
	}

	public void getOCRReportnamevalidation_BeforeCreateDOC() {

		String expectedtext = "MORTHWEST MEDICAT";
		String actualtext = ReportNameValueBeforeDoc.getText();
		Assert.assertEquals(actualtext, expectedtext);
		Reporter.log("Report Name is: " + ReportNameValueBeforeDoc.getText(), true);

	}

	public void getOCRReportnamevalidation_AfterCreateDOC() {

		String expectedtext = "Export Documentary Credit (DC) Bill Ne";
		String actualtext = ReportNameValueAfterDoc.getText();
		Assert.assertEquals(actualtext, expectedtext);
		Reporter.log("Report Name is: " + ReportNameValueAfterDoc.getText(), true);
	}

	public void getMoveTo_Menu_Recent() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Recent).perform();
	}

	// Test Login Language validations

	public void verify_Spanish_Language() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Spanish Language ", true);
		Refresh_Button();
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(4000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(4000);
		Reporter.log("Click on My Preferences option", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		Reporter.log("Select Pdf Document and set as Default view", true);
		movingclkElement(Apply_button);
		Thread.sleep(4000);
		Reporter.log("Click on Apply button", true);
		LogoutPage();
		jsclick(Spanish_Language);
		Thread.sleep(4000);
		Reporter.log("Click on Spanish Language", true);
		LogDipakUser();
		Thread.sleep(4000);
		Reporter.log("Login EWA With User credential", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Username);
		Thread.sleep(4000);
		Reporter.log("Click on Username", true);
		Spanish_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		Reporter.log("Verified My Account name in Spanish laguage", true);
		LogoutPage();
		Thread.sleep(4000);
		Reporter.log("Click on Logout Option", true);
		Reporter.log("Spanish Language verified Successfully", true);
	}

	public void verify_French_Language() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying French Language ", true);
		jsclick(French_Language);
		Thread.sleep(4000);
		Reporter.log("Click on French Language", true);
		LogDipakUser();
		Thread.sleep(4000);
		Reporter.log("Login EWA with User credential ", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Username);
		Thread.sleep(4000);
		Reporter.log("Click on Username", true);
		French_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		Reporter.log("Verified My Account text in French Language", true);
		LogoutPage();
		Thread.sleep(4000);
		Reporter.log("Click on Logout Option", true);
		Reporter.log("French Language verified Successfully", true);
	}

	public void verify_Dutch_Language() throws Exception {

		Reporter.log("Test Scenario 3 : Verifying Dutch Language ", true);
		jsclick(Dutch_Language);
		Thread.sleep(4000);
		Reporter.log("Click on Dutch Language", true);
		LogDipakUser();
		Thread.sleep(4000);
		Reporter.log("Login EWA with User credential ", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Username);
		Thread.sleep(4000);
		Reporter.log("Click on Username", true);
		Dutch_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		Reporter.log("Verified My Account text in Dutch language", true);
		LogoutPage();
		Thread.sleep(4000);
		Reporter.log("Click on Logout Option", true);
		Reporter.log("Dutch Language verified Successfully", true);
	}

	public void verify_Hindi_Language() throws Exception {

		Reporter.log("Test Scenario 4 : Verifying Hindi Language ", true);
		jsclick(Hindi_Language);
		Thread.sleep(4000);
		Reporter.log("Click on Hindi Language", true);
		LogDipakUser();
		Thread.sleep(4000);
		Reporter.log("Login EWA with User credential", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Username);
		Thread.sleep(4000);
		Reporter.log("Click on Username", true);
		Hindi_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		Reporter.log("Verified My Account Text in Hindi Language", true);
		LogoutPage();
		Thread.sleep(4000);
		Reporter.log("Click on Logout Option", true);
		Reporter.log("Hindi Language verified Successfully", true);
	}

	public void verify_English_Language() throws Exception {

		Reporter.log("Test Scenario 5 : Verifying English Language ", true);
		jsclick(English_Language);
		Thread.sleep(4000);
		Reporter.log("Click on English Language Option", true);
		LogDipakUser();
		Thread.sleep(4000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Login EWA with User credential", true);
		jsclick(Username);
		Thread.sleep(4000);
		Reporter.log("Click on Username", true);
		English_Myaccount_Text_Laguage();
		Thread.sleep(4000);
		Reporter.log("Verified My Account in English Language", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("English Language verified Successfully", true);

	}

	// Verifying Dutch Language //

	public void CreateandOpen_NewDocument_Dutch_Language() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Create and Open New Document Dutch Language ", true);
		Refresh_Button();
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office documentv and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf documentv and set as Default View", true);
		getSelect_Dropdown_Actual_Size();
		Thread.sleep(6000);
		Reporter.log("Select Viewer zoom and set as Actual Size", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		LogoutPage();
		jsclick(Dutch_Language);
		Thread.sleep(6000);
		Reporter.log("Click on Dutch Language", true);
		LogDipakUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with User credential", true);
		Refresh_Button();
		Thread.sleep(6000);
		jsclick(NewDocuments_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on New Documents Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("Folder is selected for Create New Documents", true);
		OK_Button_BrowseforFolder.click();
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getgetSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		Reporter.log("Select a Document Type dropdown", true);
		Enter_Report_Name_Text.sendKeys(Language_excelRead(11, 2));
		Thread.sleep(6000);
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(6000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hyphen.exe");
		Thread.sleep(6000);
		Reporter.log("By using AutoIT add file from external folder", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		Reporter.log("Document Uploaded successfully", true);
		jsclick(ClickOCR);
		Thread.sleep(6000);
		Reporter.log("Click on OCR menu Option", true);
		getSet_OCR_ToDocumentPDF();
		Thread.sleep(6000);
		Reporter.log("Set OCR On page", true);
		jsclick(ReportName);
		Thread.sleep(6000);
		Reporter.log("Click on Report Name and set OCR Value as Report Name", true);
		jsclick(Create_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Navigate button", true);
		getOCRReportnamevalidation_BeforeCreateDOC();
		Thread.sleep(6000);
		Reporter.log("Verifying OCR Report name ", true);
		jsclick(ReportNameValueBeforeDoc);
		Thread.sleep(6000);
		Reporter.log("Report name Verified and Open Document", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu Option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("New Document Create and open in Dutch language", true);

	}

	public void Verify_OCR_afterCreatingDocument() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying OCR after Creating Document ", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(3000);
		Reporter.log("Browse Document Page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Underscore.exe");
		Thread.sleep(6000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Underscore_page);
		Thread.sleep(6000);
		Reporter.log("Open Document Page from Document List", true);
		jsclick(UpdateDutch_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		jsclick(ClickOCR);
		Thread.sleep(6000);
		Reporter.log("Click on OCR button", true);
		getSet_OCR_ToDocument();
		Thread.sleep(6000);
		Reporter.log("Set OCR To Document", true);
		jsclick(ReportName);
		Thread.sleep(6000);
		Reporter.log("Click on Report Name and set OCR Extarcted Name", true);
		jsclick(DutchSave_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Save button", true);
		jsclick(DutchUpdate_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(DutchProperties_option);
		Thread.sleep(6000);
		Reporter.log("Click on Properties Option", true);
		movingclkElement(closedoc);
		Thread.sleep(6000);
		Reporter.log("Close the document Page", true);
		getOCRReportnamevalidation_AfterCreateDOC();
		Thread.sleep(6000);
		Reporter.log("Verifying OCR Name as Document name", true);
		jsclick(ReportNameValueAfterDoc);
		Reporter.log("After Creating Document OCR Functionality verified Sucessfully", true);

	}

	public void Addsignature_Dutch_Language() throws Exception {

		Reporter.log("Test Scenario 3 : Add signature Dutch Language ", true);
		Thread.sleep(6000);
		jsclick(Click_signature_Menuoption);
		Thread.sleep(6000);
		Reporter.log("Click on Signature menu Option", true);
		try {
			getinputpassword();
			Thread.sleep(6000);
			Reporter.log("Enter a Password", true);
		} catch (Exception e) {
			System.out.println("signature is not password protected...");
		}
		getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Reporter.log("Add signature on page", true);
		Reporter.log("signature added Successfully on  Document", true);
	}

	public void getAddRedaction_Dutch_Language() throws Exception {

		Reporter.log("Test Scenario 4 : Add Redaction Dutch Language ", true);
		Thread.sleep(6000);
		getMove_to_Annotation_Option_inViewer();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Annotation menu Option", true);
		getRedaction_Option();
		Thread.sleep(6000);
		Reporter.log("Click on Redaction Option", true);
		getSet_Redaction_ToDocument();
		Thread.sleep(6000);
		Reporter.log("Set Redaction on Page", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Redaction added Successfully on  Document", true);
	}

	public void getShowHideThumbnail_Dutch_Language() throws Exception {

		Reporter.log("Test Scenario 5 : Show Hide Thumbnail Dutch Language ", true);
		Thread.sleep(6000);
		jsclick(showHideThumbnail);
		Thread.sleep(6000);
		Reporter.log("Click on Show Hide Thumbnail", true);
		jsclick(showHideThumbnail);
		Thread.sleep(6000);
		Reporter.log("Verifying showing Thumbnail and Again Click Show Hide Thumbnail", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("Show Hide Thumbnail options verified", true);
	}

	// Create Template in Dutch laguage

	public void getverify_to_CreateorBrowse_Template_Defaultviewing() throws Exception {

		Reporter.log("Test Scenario 6 : Verifying to Create or Browse Template Default viewing ", true);
		Refresh_Button();
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf document and set as Default View", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on Template Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select Document type dropdown", true);
		jsclick(Enter_Report_Name_Text);
		Thread.sleep(6000);
		Reporter.log("Click on Report Name", true);
		getSelect_ReportName_Testvalue();
		Thread.sleep(6000);
		Reporter.log("Enter Report Name", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(6000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(6000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Save_Template_Button);
		Reporter.log("Save Template button clicked successfully", true);
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		Reporter.log("Click on No button", true);
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Save Template button", true);
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		Reporter.log("Click on Template Name Textbox", true);
		getTemplate_NameTextboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter Template Name into Template Name field", true);
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		Reporter.log("Click on Template Description message box", true);
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter Template Description message into Description field", true);
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		Reporter.log("Verified Template Created successfully", true);
		jsclick(Template_Created_OK_button);
		Thread.sleep(6000);
		Reporter.log("Verifying to CreateorBrowse Template Defaultviewing", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
	}

	public void getVerify_to_Edit_and_Delete_DefaultTemplate() throws Exception {

		Reporter.log("Test Scenario 7 : Verifying to Edit and Delete Default Template ", true);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(Select_Created_Template);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		Reporter.log("Select Created Template", true);
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Edit Template Fab button", true);
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		Reporter.log("Click on Template Description message box", true);
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		Reporter.log("Edit Template Description", true);
		jsclick(EditTemplate_Description_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		jsclick(EditTemplate_Created_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on  Ok button", true);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		Reporter.log("Select Created Template", true);
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on  Delete Template Fab button", true);
		jsclick(Delete_Template_OK_Button);
		Reporter.log("Click on  Ok button", true);
		Reporter.log("Template Deleted Successfully", true);

	}

	public void getverify_to_CreateorBrowse_Template_Advancedviewing_OfficeDoc() throws Exception {

		Reporter.log("Test Scenario 8 : Verifying to Create or Browse Template Advanced viewing OfficeDoc ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Advancedviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office Document and set as Advanced View", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on  Destination Folder Textbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select Document Type dropdown", true);
		jsclick(Enter_Report_Name_Text);
		Thread.sleep(6000);
		Reporter.log("Click on  Report Name Textbox", true);
		getSelect_ReportName_Testvalue();
		Thread.sleep(6000);
		Reporter.log("Enter value Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(6000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficeDoc.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		jsclick(Save_Template_Button);
		Reporter.log("Save Template button clicked successfully", true);
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		Reporter.log("Click on No button", true);
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Save Template button", true);
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		Reporter.log("Click on Template Name  Textbox", true);
		getTemplate_NameTextboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter value Template Name field", true);
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		Reporter.log("Click on Template Description messagebox", true);
		getTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter message Template Description field", true);
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		Reporter.log("Template Created successfully Verified", true);
		jsclick(Template_Created_OK_button);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Verifying to CreateorBrowse OfficeDoc Template advancedviewing", true);

	}

	public void getVerify_to_Edit_and_Delete_AdvancedTemplate_OfficeDoc() throws Exception {

		Reporter.log("Test Scenario 9 : Verifying to Edit and Delete Advanced Template Office Doc ", true);
		Refresh_Button();
		Thread.sleep(6000);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		Reporter.log("Select Created Template", true);
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Edit Template", true);
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		Reporter.log("Click on Edit Template Description messagebox", true);
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		Reporter.log("Edit Template Description", true);
		jsclick(EditTemplate_Description_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		jsclick(EditTemplate_Created_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		Reporter.log("Select Created Template", true);
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Delete Template Fab button", true);
		jsclick(Delete_Template_OK_Button);
		Reporter.log("Template Deleted Successfully", true);

	}

	public void getverify_to_Create_Formmapping_PDFTemplate_Advancedviewing() throws Exception {

		Reporter.log("Test Scenario 10 : Verifying to Create Formmapping PDF Template Advanced viewing ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getPdf_document_Advancedviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and set as Advanced View", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on Template Tab", true);
		Destination_Folder_Textbox.click();
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("Folder is selected for Templates", true);
		OK_Button_BrowseforFolder.click();
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select Document type dropdown", true);
		jsclick(Enter_Report_Name_Text);
		Thread.sleep(6000);
		Reporter.log("Click on Report Name Textbox", true);
		getSelect_ReportName_Testvalue();
		Thread.sleep(6000);
		Reporter.log("Enter value Report Name field", true);
		getMove_To_PlusIcon();
		getNew_pdf_Document_Option();
		Thread.sleep(6000);
		Reporter.log("Browse a Document", true);
		getEnter_pdf_File_Name();
		Thread.sleep(6000);
		Reporter.log("Enter Pdf File Name", true);
		jsclick(pdfViewer);
		Thread.sleep(6000);
		Reporter.log("Click on Pdf Viewerr", true);
		jsclick(Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Textbox", true);
		jsclick(Add_Textbox_Onpage);
		Thread.sleep(6000);
		Reporter.log("Select and add Textbox on  Page", true);
		jsclick(Click_Formmapper);
		Reporter.log("Click on  Form mapping", true);
		getSelect_Formfield();
		Thread.sleep(6000);
		Reporter.log("Select Form field", true);
		jsclick(FormOK);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Save Template button", true);
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		Reporter.log("Click on Template name textbox", true);
		getTemplate_NameTextboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter Template Name", true);
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		Reporter.log("Click on Template Description messagebox", true);
		getTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter message in Template Description", true);
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		Reporter.log("Verified Template Created successfully", true);
		jsclick(Template_Created_OK_button);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Verifying to CreateorBrowse Formmapping Template advancedviewing", true);

	}

	public void getVerify_to_Edit_and_Delete_Formfield() throws Exception {

		Reporter.log("Test Scenario 11: Verifying to Edit and Delete Form field ", true);
		Refresh_Button();
		Thread.sleep(6000);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		Reporter.log("Select Created Template", true);
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Edit Template Fab button", true);
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		Reporter.log("Click on Edit Template Description messagebox", true);
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		Reporter.log("Edit a Template", true);
		jsclick(EditTemplate_Description_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		jsclick(EditTemplate_Created_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		Reporter.log("Select Created Template", true);
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Delete Template Fab button", true);
		jsclick(Delete_Template_OK_Button);
		Reporter.log("Formmapping Template Deleted Successfully", true);
	}

	public void getSet_Defaultview() throws Exception {

		Reporter.log("Test Scenario 12 :Set Default view ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office Document and set as Default view", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and set as Default view", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
	}

	// Verifying Load more in Search and Folder in Spanish laguage

	public void getVerify_Load_MoreCount_On_Search() throws Exception {

		Reporter.log("Test Scenario 13 : Verifying Load More Count On Search ", true);
		Refresh_Button();
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on  Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getEnter_Loadmorecount();
		Thread.sleep(6000);
		Reporter.log("Enter Load more count", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		getVerify_Loadmorecount_Searchresult();
		Thread.sleep(6000);
		Reporter.log("Verified Load more count on Search Result", true);
		jsclick(Loadmorebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Load More button", true);
		getVerify_Loadmorecount_Searchresult();
		Thread.sleep(6000);
		Reporter.log("Minumum number of Load More count on Search Verified successfully", true);
	}

	public void getVerify_Load_MoreCount_On_Folder() throws Exception {

		Reporter.log("Test Scenario 14 : Verifying Load More Count On Folder ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("Expand a Folder", true);
		getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(6000);
		Reporter.log("Verified Load More count On Folder Document", true);
		jsclick(Loadmorebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Load more button", true);
		getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(6000);
		Reporter.log("Minumum number of Load More count on Folder Verified successfully", true);

	}

	// Verifying Custom Columns in Spanish Language

	// Custom columns for Room

	public void getOpen_Custom_List_Dialog_And_Verify_Title_Roomcolumn() throws InterruptedException {

		Reporter.log("Test Scenario 15 : Open Custom List Dialog And Verifying Title Room column ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		try {
			Verify_Reset_CustomColumsnRoom();
			Thread.sleep(6000);
			Reporter.log("Click on Reset Column Option", true);
			jsclick(Reset_Column_OK_Button);
			Reporter.log("Click on Ok button", true);
			Thread.sleep(6000);
			Reporter.log("Custom columns Reset Successfully on Room Level", true);
			movingElement(MoveTo_Menu_RoomName);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(12000);
		Reporter.log("Click on Custom Column Option", true);
		gettitelvalidation();
		Reporter.log("Custom List title validate", true);
	}

	public void getVerify__Text_of_Custom_List_Dialog_Roomcolumn() throws InterruptedException {

		Reporter.log("Test Scenario 16 : Verifying  Text of Custom List Dialog Room column ", true);
		Thread.sleep(6000);
		getextvalidation();
		Reporter.log("Custom List Dialog Text verified", true);
	}

	public void getSet_And_Verify_Custom_Columns_NodeLevel() throws Exception {

		Reporter.log("Test Scenario 17 : Set And Verifying Custom Columns Node Level ", true);
		Thread.sleep(6000);
		getSearchBoxIndices1();
		Thread.sleep(6000);
		Reporter.log("Enter Indices Value In Search box", true);
		jsclick(Select_Indices01);
		Thread.sleep(6000);
		Reporter.log("Select Entered Indices", true);
		getSearchBoxIndices2();
		Thread.sleep(6000);
		Reporter.log("Enter Indices Value In Search box", true);
		jsclick(Select_Indices02);
		Thread.sleep(6000);
		Reporter.log("Select Entered Indices", true);
		getSearchBoxIndices3();
		Thread.sleep(6000);
		Reporter.log("Enter Indices Value In Search box", true);
		jsclick(Select_Indices03);
		Thread.sleep(6000);
		Reporter.log("Select Entered Indices", true);
		jsclick(Ok_Button_CustomList);
		Reporter.log("All Indices Selected Successfully", true);
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		Verify_CompactView_checkbox();
		Thread.sleep(6000);
		Reporter.log("Check Compact View Checkbox", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		Verify_Indicess_Value();
		Thread.sleep(6000);
		Reporter.log("Custom Columns is set Node Level successfully", true);

	}

	public void getVerify_Default_Custom_Columns() throws InterruptedException {

		Reporter.log("Test Scenario 18 : Verifying Default Custom Columns ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Roomname  Tab", true);
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(6000);
		Reporter.log("Click on Custom Columns Option", true);
		Default_Button_CustomList();
		Thread.sleep(6000);
		Reporter.log("Click on Custom List Default button", true);
		jsclick(Ok_Button_CustomList);
		Reporter.log("Set and Verifying Default Custom columns successfully", true);
	}

	public void getVerify_Cancel_Button_of_CustomList() throws InterruptedException {

		Reporter.log("Test Scenario 19 : Verifying Cancel button of Custom List ", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover on Roomname Tab", true);
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(6000);
		Reporter.log("Click on Custom Column Option", true);
		Cancel_Button_CustomList();
		Reporter.log("Cancle button is clicked", true);
		Reporter.log("Verified Cancel button of Custom List ", true);
	}

	public void getVerify_Custom_Columns_RoomLevel() throws InterruptedException {

		Reporter.log("Test Scenario 20 : Verifying Custom Columns Room Level ", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover on Roomname Tab", true);
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(6000);
		Reporter.log("Click on Custom Column Option", true);
		jsclick(Click_DropdownOption);
		Reporter.log("Click on dropdown Option", true);
		Select_DropdownValue();
		Thread.sleep(6000);
		Reporter.log("Select Dropdown Value", true);
		jsclick(Set_RoomLevel_Indices);
		Thread.sleep(6000);
		Reporter.log("Set Room Level Indices", true);
		jsclick(Ok_Button_CustomList);
		Reporter.log("Indices is Selected Successfully for RoomLevel", true);

	}

	public void getVerify_Reset_Columns_Functionality() throws InterruptedException {

		Reporter.log("Test Scenario 21 : Verifying Reset Columns Functionality ", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover on Roomname Tab", true);
		jsclick(Room_Reset_CustomColumns);
		Thread.sleep(6000);
		Reporter.log("Click on Reset Columns", true);
		jsclick(Reset_Column_OK_Button);
		Reporter.log("Custom columns Reset Successfully", true);

	}

	// Custom columns for Search

	public void getOpen_Custom_List_Dialog_And_Verify_Title_Searchcolumn() throws InterruptedException {

		Reporter.log("Test Scenario 22:Open Custom List Dialog And Verifying Title Search column ", true);
		MoveTo_Search_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Search Tab", true);
		try {
			Verify_Reset_CustomColumsnSearch();
			Thread.sleep(6000);
			Reporter.log("Click on Reset Column Option", true);
			jsclick(Reset_Column_OK_Button);
			Thread.sleep(6000);
			Reporter.log("Click on Ok button", true);
			Thread.sleep(6000);
			Reporter.log("Custom columns Reset Successfully on Search Level", true);
			movingElement(MoveTo_Search_Option);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(Search_Custom_Columns_option);
		Thread.sleep(12000);
		Reporter.log("Click on  Custom Column Option", true);
		getSearch_titelvalidation();
		Reporter.log("Search Custom List title validate", true);
	}

	public void getVerify__Text_of_Custom_List_Dialog_Searchcolumn() throws InterruptedException {

		Reporter.log("Test Scenario 23 :Verifying  Text of Custom List Dialog Search column ", true);
		Thread.sleep(6000);
		getSearch_textvalidation();
		Reporter.log("Search Custom List Dialog Text verified", true);
	}

	public void getVerify_Set_Custom_Columns_for_Search() throws Exception {

		Reporter.log("Test Scenario 24 : Verifying Set Custom Columns for Search ", true);
		Thread.sleep(6000);
		getSearchBoxIndices4();
		Thread.sleep(6000);
		Reporter.log("Search Indices 1 in Search box", true);
		jsclick(Search_Select_Indices01);
		Thread.sleep(6000);
		Reporter.log("Select Search Indices 1", true);
		getSearchBoxIndices5();
		Thread.sleep(6000);
		Reporter.log("Search Indices 2 in Search box", true);
		jsclick(Search_Select_Indices02);
		Thread.sleep(6000);
		Reporter.log("Select Search Indices 2", true);
		getSearchBoxIndices6();
		Thread.sleep(6000);
		Reporter.log("Search Indices 3 in Search box", true);
		jsclick(Search_Select_Indices03);
		Thread.sleep(6000);
		Reporter.log("Select Search Indices 3", true);
		jsclick(Search_Ok_Button_CustomList);
		Reporter.log("All Indices Selected Successfully", true);
		Thread.sleep(6000);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		jsclick(Document_Location);
		Thread.sleep(6000);
		Reporter.log("Click on Document Location", true);
		selectElement(Search_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Search_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Search_Folder);
		Thread.sleep(6000);
		Reporter.log("Expand a Folder", true);
		jsclick(Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		Search_Verify_Indicess_Value4();
		Thread.sleep(6000);
		Reporter.log("Verified Selected Indices 1", true);
		Search_Verify_Indicess_Value5();
		Thread.sleep(6000);
		Reporter.log("Verified Selected Indices 2", true);
		Search_Verify_Indicess_Value6();
		Thread.sleep(6000);
		Reporter.log("Verified Selected Indices 3", true);
		Reporter.log("Custom column is set successfully for Search Functionality", true);
	}

	public void getVerify_Reset_Columns_for_Search() throws InterruptedException {

		Reporter.log("Test Scenario 25 : Verifying Reset Columns for Search ", true);
		MoveTo_Search_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Search Tab", true);
		jsclick(Search_ResetColumn);
		Thread.sleep(6000);
		Reporter.log("Click on Reset Column", true);
		jsclick(Reset_Column_OK_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on  Find button", true);
		Reporter.log("Reset Custom Columns Successfully for Search", true);

	}

	// Custom column for ToDolist

	public void getOpen_Custom_List_Dialog_And_Verify_Title_ToDoList() throws InterruptedException {

		Reporter.log("Test Scenario 26 : Open Custom List Dialog And Verifying Title ToDoList ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		MoveTo_ToDoList_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		try {
			Verify_Reset_CustomColumsnTodolist();
			Thread.sleep(6000);
			Reporter.log("Click on Reset Column Option", true);
			jsclick(Reset_Column_OK_Button);
			Reporter.log("Click on Ok button", true);
			Thread.sleep(6000);
			Reporter.log("Custom columns Reset Successfully on TodoList Level", true);
			movingElement(MoveTo_ToDoList_Option);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(ToDoList_Custom_Columns_option);
		Thread.sleep(12000);
		Reporter.log("Click on  Custom Column Option", true);
		ToDoList_titelvalidation();
		Reporter.log("ToDoList Custom List title validate", true);
	}

	public void getVerify__Text_of_Custom_List_Dialog_ToDoList() throws Exception {

		Reporter.log("Test Scenario 27 : Verifying  Text of Custom List Dialog ToDoList ", true);
		Thread.sleep(6000);
		ToDoList_textvalidation();
		Thread.sleep(6000);
		Reporter.log("Custom List Dialog Text verified", true);
		jsclick(ToDoList_Select_Indices01);
		Thread.sleep(6000);
		Reporter.log("Select Indices 1", true);
		jsclick(ToDoList_Ok_Button_CustomList);
		Reporter.log("Click on  Ok button", true);
		Reporter.log("Indices Selected Successfully", true);
	}

	public void getVerify_Set_Custom_Columns_for_ToDoList() throws Exception {

		Reporter.log("Test Scenario 28 : Verifying Set Custom Columns for ToDoList ", true);
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		jsclick(sendWorkflow);
		Thread.sleep(6000);
		Reporter.log("Click on SendToWorkflow Option", true);
		jsclick(WFAssign);
		Thread.sleep(6000);
		Reporter.log("Send document to Workflow", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		Reporter.log("Copy and Paste Document Successfully", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		MoveTo_ToDoList_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(Select_All_Item);
		Thread.sleep(6000);
		Reporter.log("Click on All Item Option", true);
		Reporter.log("Custom column is set successfully for ToDoList Functionality", true);
	}

	public void getReset_Custom_Columns_for_ToDoList() throws InterruptedException {

		Reporter.log("Test Scenario 29 : Reset Custom Columns for ToDoList ", true);
		Thread.sleep(6000);
		MoveTo_ToDoList_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(To_Do_Resetcolumn_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Reset Column Option", true);
		jsclick(Reset_Column_OK_Button);
		Reporter.log("ToDoList Custom column Reset Successfully", true);

	}

	// Document Context Menu

	public void getVerify_Refresh_Option() throws Exception {

		Reporter.log("Test Scenario 30 : Verifying Refresh Option ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		getSelect_Option_Refresh();
		Thread.sleep(6000);
		Reporter.log("Click on Reffresh Option", true);
		Reporter.log("Refresh Functionality verified Successfully on Documents", true);
	}

	public void getVerify_Categories_Option() throws Exception {

		Reporter.log("Test Scenario 31 : Verifying Categories Option ", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Reporter.log("Mousehover on Documents Tab", true);
		getSelect_Option_Catagories_andSet_Colors();
		Reporter.log("Click on  Catagories Option and set", true);
		Reporter.log("Categories on Documents Functionality verified Successfully", true);

	}

	public void getVerify_copy_and_paste_Option() throws Exception {

		Reporter.log("Test Scenario 32 : Verifying copy and paste Option ", true);
		Thread.sleep(6000);
		getMoveTo_Menu_Documents();
		Reporter.log("Mousehover on Documents Tab", true);
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		Reporter.log("copy and paste Documents Functionality verified Successfully", true);
	}

	public void getVerify_cut_and_paste_Option() throws Exception {

		Reporter.log("Test Scenario 33 : Verifying cut and paste Option ", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		getVerify_CutandPaste_Document();
		Thread.sleep(6000);
		Reporter.log("cut and paste Document Functionality verified Successfully", true);
	}

	public void getVerify_Delete_Option() throws Exception {

		Reporter.log("Test Scenario 34 : Verifying Delete Option ", true);
		getVerify_Delete_Document();
		Thread.sleep(6000);
		Reporter.log("Document Delete Functionality verified Successfully", true);
	}

	public void Verify_CreateFavorites_Documents() throws Exception {

		Reporter.log("Test Scenario 35 : Verifying Create Favorites Document ", true);
		Verify_CreateFavorites_Document();
		Reporter.log("Verified Create Favorites Document ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getOpen_CreateFavorites_Document();
		Reporter.log("CreateFavorites Document Functionality verified Successfully", true);
	}

	public void getVerify_Notification_on_Document() throws Exception {

		Reporter.log("Test Scenario 36 : Verifying Notification on Document ", true);

		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		Reporter.log("Copy and Paste Document", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		getCreate_Notification_Document();
		Thread.sleep(6000);
		Reporter.log("Create Notification on Document", true);
		jsclick(Click_signature_Menuoption);
		Thread.sleep(6000);
		Reporter.log("Click on Signature option", true);
		getinputpassword();
		Thread.sleep(6000);
		Reporter.log("Enter a Password", true);
		getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Reporter.log("Add signature on page", true);
		getSave_Signature_Document();
		Thread.sleep(6000);
		Reporter.log("Click save button and save added signature", true);
		movingclkElement(closedoc);
		Reporter.log("Close Document", true);
		Reporter.log("Notification_on_Document Functionality verified Successfully", true);

	}

	public void getVerify_SendTo_Mail() throws Exception {

		Reporter.log("Test Scenario 37 : Verifying SendTo Mail ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check a Document from document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		getSentTo_Mail_asReference();
		Thread.sleep(6000);
		Reporter.log("SendTo Mail asReference Functionality verified Successfully", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		getSentTo_Mail_asCopy();
		Thread.sleep(6000);
		Reporter.log("SendTo Mail asCopy Functionality verified Successfully", true);
	}

	public void getVerify_SendTo_Print() throws Exception {

		Reporter.log("Test Scenario 38 : Verifying Send To Print ", true);
		getSentTo_Print();
		Reporter.log("SendTo Print Functionality verified Successfully", true);

	}

	public void getVerify_SendTo_Export() throws Exception {

		Reporter.log("Test Scenario 39 : Verifying Send To Export ", true);
		getSentTo_Export();
		Reporter.log("SendTo Export Functionality verified Successfully", true);

	}

	public void getVerify_SendTo_GenerateDocumentLink() throws Exception {

		Reporter.log("Test Scenario 40 : Verifying SendTo Generate Document Link ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		getSentTo_GenerateDocumentLink();
		Thread.sleep(6000);
		Reporter.log("Send document to Generate Document Link", true);
		Refresh_Button();
		Reporter.log("Click on Refresh button", true);
		Reporter.log("SendTo GenerateDocumentLink Functionality verified Successfully", true);
	}

	public void getVerify_SendTo_SecureLink() throws Exception {

		Reporter.log("Test Scenario 41 : Verifying SendTo SecureLink ", true);
		Thread.sleep(6000);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getSentTo_SecureLink();
		Thread.sleep(6000);
		Reporter.log("Send document to Secure Link", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("SendTo SecureLink Functionality verified Successfully", true);

	}

	// Verifying Spanish Language

	public void CreateandOpen_NewDocument_Spanish_Language_with_OCR() throws Exception {

		Reporter.log("Test Scenario 1 :Create and Open New Document Spanish Language with OCR Functionality ", true);
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences OptionS", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and set as Default View", true);
		getSelect_Dropdown_Actual_Size();
		Thread.sleep(6000);
		Reporter.log("Select Viewer zoom and set as Actual size Option", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		LogoutPage();
		jsclick(Spanish_Language);
		Thread.sleep(6000);
		Reporter.log("Click on Spanish Laguage Option", true);
		LogDipakUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with User credintial", true);
		jsclick(NewDocuments_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on New Documents Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log(" select a Folder", true);
		Reporter.log("Folder is selected for Create New Documents", true);
		OK_Button_BrowseforFolder.click();
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select Document type Dropdown", true);
		Enter_Report_Name_Text.sendKeys(Language_excelRead(10, 2));
		Thread.sleep(6000);
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(3000);
		Reporter.log("Browse Document Page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Underscore.exe");
		Thread.sleep(6000);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		jsclick(ClickOCR);
		Thread.sleep(6000);
		Reporter.log("Click on OCR menu Option", true);
		getSet_OCR_ToDocument();
		Thread.sleep(6000);
		Reporter.log("Set OCR and Extract Report Name", true);
		jsclick(ReportName);
		Thread.sleep(6000);
		Reporter.log("Click on Report Name Message", true);
		jsclick(Create_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Navigate button", true);
		getOCRReportnamevalidation_AfterCreateDOC();
		Thread.sleep(6000);
		Reporter.log("Validate Document name with Report name", true);
		jsclick(ReportNameValueAfterDoc);
		Thread.sleep(6000);
		Reporter.log("Verifying after create Document OCR Report name", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying file name and Click on  Ok button", true);
		Reporter.log("New Document Create and open in Spanish language", true);
		Reporter.log("OCR Functionality verified successfully", true);
		movingElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(6000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hyphen.exe");
		Thread.sleep(6000);
		jsclick(Open_Hyphen_page);
		Thread.sleep(6000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(UpdateSpanish_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		jsclick(ClickOCR);
		Thread.sleep(6000);
		Reporter.log("Click on OCR menu Option", true);
		getSet_OCR_ToDocumentPDF();
		Thread.sleep(6000);
		Reporter.log("Set Ocr to Document page", true);
		jsclick(ReportName);
		Thread.sleep(6000);
		Reporter.log("Click on Report Name", true);
		jsclick(SpanishSave_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Save button", true);
		jsclick(SpanishUpdate_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save menu button", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(SpanishProperties_option);
		Thread.sleep(6000);
		Reporter.log("Click on Properties Option", true);
		movingclkElement(closedoc);
		Thread.sleep(6000);
		Reporter.log("Click on Viewer Close button ", true);
		getOCRReportnamevalidation_BeforeCreateDOC();
		Thread.sleep(6000);
		Reporter.log("Verifying Report Name as Document Name", true);
		jsclick(ReportNameValueBeforeDoc);
		Thread.sleep(6000);
		Reporter.log("OCR Functionality Verified successfully", true);
	}

	public void Addsignature_Spanish_Language() throws Exception {

		Reporter.log("Test Scenario 2 :Add signature Spanish Language ", true);
		Thread.sleep(6000);
		jsclick(Click_signature_Menuoption);
		Thread.sleep(6000);
		Reporter.log("Click on Signature menu Option", true);
		try {
			getinputpassword();
			Thread.sleep(6000);
			Reporter.log("Enter Signature password in password textbox", true);
		} catch (Exception e) {
			System.out.println("signature is not password protected...");
		}
		getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Reporter.log("Click on signature menu and add signature on  Page", true);
		Reporter.log("signature added Successfully on  Document", true);
	}

	public void AddRedaction_Spanish_Language() throws Exception {

		Reporter.log("Test Scenario 3 :Add Redaction Spanish Language", true);
		Thread.sleep(6000);
		getMove_to_Annotation_Option_inViewer();
		Thread.sleep(6000);
		Reporter.log("Move to Annotation menu Option in Viewer", true);
		getRedaction_Option();
		Thread.sleep(6000);
		Reporter.log("Select Redaction from Annotation Menu", true);
		getSet_Redaction_ToDocument();
		Thread.sleep(6000);
		Reporter.log("Set Redaction on Page", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on save button", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Redaction added Successfully on  Document", true);
	}

	public void ShowHideThumbnail_Spanish_Language() throws Exception {

		Reporter.log("Test Scenario 4 :Show Hide Thumbnail Spanish Language", true);
		Thread.sleep(6000);
		jsclick(showHideThumbnail);
		Thread.sleep(6000);
		Reporter.log("Click on Show Hide Thumbnail Menu Option", true);
		jsclick(showHideThumbnail);
		Thread.sleep(6000);
		Reporter.log("again Click on Show Hide Thumbnail Menu Option", true);
		Refresh_Button();
		Reporter.log("Click on Refresh button", true);
		Reporter.log("Show Hide Thumbnail options verified", true);
	}

	// Create Template in Spanish laguage

	public void verify_to_CreateorBrowse_Template_Defaultviewing() throws Exception {

		Reporter.log("Test Scenario 5 :Verifying to Create or Browse Template Default viewing ", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office Document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and set as Default View", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on Template Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select Document Type value", true);
		jsclick(Enter_Report_Name_Text);
		Thread.sleep(6000);
		Reporter.log("Click on Report Name textbox", true);
		getSelect_ReportName_Testvalue();
		Thread.sleep(6000);
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(6000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(6000);
		Reporter.log("Browse Document page2", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		jsclick(Save_Template_Button);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		Reporter.log("Click on Template Description No button ", true);
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Save Template button", true);
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		Reporter.log("Click on Template Name Textbox", true);
		getTemplate_NameTextboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter Template Name", true);
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		Reporter.log("Click on Template Description messagebox", true);
		getTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter message under Template Description message box", true);
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Template Description Ok button", true);
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		Reporter.log("Verified Template created successfully", true);
		jsclick(Template_Created_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Verifying to CreateorBrowse Template Defaultviewing", true);
		Refresh_Button();
		Reporter.log("Click on Refresh button", true);
		Thread.sleep(6000);

	}

	public void Verify_to_Edit_and_Delete_DefaultTemplate() throws Exception {

		Reporter.log("Test Scenario 6 :Verifying to Edit and Delete Default Template ", true);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Template Tab", true);
		jsclick(Select_Created_Template);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		Reporter.log("Select and open Created Template", true);
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Edit Template Fab button", true);
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		Reporter.log("Click on Edit Template Description and Clear it", true);
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter message into Edited messagebox field", true);
		jsclick(EditTemplate_Description_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		jsclick(EditTemplate_Created_OK_button);
		Thread.sleep(6000);
		Reporter.log("Verifying Template edited successfully and click on  Ok button", true);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Template Tab", true);
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		Reporter.log("Select Created Template ", true);
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Delete Template Fab button", true);
		jsclick(Delete_Template_OK_Button);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Template Deleted Successfully", true);

	}

	public void verify_to_CreateorBrowse_Template_Advancedviewing_OfficeDoc() throws Exception {

		Reporter.log("Test Scenario 7 :Verifying to Create or Browse Template Advanced viewing Office Doc", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		getSelect_Office_document_Advancedviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office Document and set as Advanced view", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on Template Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select Document Type Dropdown", true);
		jsclick(Enter_Report_Name_Text);
		Thread.sleep(6000);
		Reporter.log("Click on Report name", true);
		getSelect_ReportName_Testvalue();
		Thread.sleep(6000);
		Reporter.log("Enter value into Report name field", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		movingclkElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Thread.sleep(6000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficeDoc.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		jsclick(Save_Template_Button);
		Reporter.log("Save Template button clicked successfully", true);
		jsclick(Template_Description_No_button);
		Thread.sleep(6000);
		Reporter.log("Click on No button", true);
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Save Template button", true);
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		Reporter.log("Click on Template Name Textbox", true);
		getTemplate_NameTextboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter value into Template Name textbox", true);
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		Reporter.log("Click on Template Description messagebox", true);
		getTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter Template Description", true);
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		Reporter.log("Verified and Template created succesfully", true);
		jsclick(Template_Created_OK_button);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Verifying to CreateorBrowse OfficeDoc Template advancedviewing", true);

	}

	public void Verify_to_Edit_and_Delete_AdvancedTemplate_OfficeDoc() throws Exception {

		Reporter.log("Test Scenario 8 :Verifying to Edit and Delete Advanced Template Office Doc", true);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Template Tab", true);
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		Reporter.log("Select Created Template", true);
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Edit Template Fab button", true);
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		Reporter.log("Click on Edit Template description messagebox", true);
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter message in Edit Template Description", true);
		jsclick(EditTemplate_Description_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		jsclick(EditTemplate_Created_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Template Tab", true);
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		Reporter.log("Select Created Template", true);
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Delete Template Fab button", true);
		jsclick(Delete_Template_OK_Button);
		Reporter.log("Template Deleted Successfully", true);

	}

	public void verify_to_Create_Formmapping_PDFTemplate_Advanced_viewing() throws Exception {

		Reporter.log("Test Scenario 9 :Verifying to Create Formmapping PDFTemplate Advanced viewing", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		getPdf_document_Advancedviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and set as Advanced View", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Templates_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on Template Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder TextBox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(getgetSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select Document type dropdown ", true);
		jsclick(Enter_Report_Name_Text);
		Thread.sleep(6000);
		Reporter.log("Click on Report name Textbox", true);
		getSelect_ReportName_Testvalue();
		Thread.sleep(3000);
		Reporter.log("Enter value into Report name field", true);
		getMove_To_PlusIcon();
		getNew_pdf_Document_Option();
		Thread.sleep(6000);
		Reporter.log("Browse Document", true);
		getEnter_pdf_File_Name();
		Thread.sleep(6000);
		Reporter.log("Enter pdf file name", true);
		jsclick(pdfViewer);
		Thread.sleep(6000);
		Reporter.log("Click on Pdf Viewer Option", true);
		jsclick(Textbox);
		Thread.sleep(6000);
		Reporter.log("Select TextBox from Viewer", true);
		jsclick(Add_Textbox_Onpage);
		Thread.sleep(6000);
		Reporter.log("Select and add Textbox on  Page", true);
		jsclick(Click_Formmapper);
		Thread.sleep(6000);
		Reporter.log("Click on Form mapping Option", true);
		getSelect_Formfield();
		Thread.sleep(6000);
		Reporter.log("Select Form field", true);
		jsclick(FormOK);
		Thread.sleep(6000);
		Reporter.log("Click on Form mapping dialog Ok button", true);
		jsclick(Save_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on  Save Template button", true);
		jsclick(Template_NameTextbox);
		Thread.sleep(6000);
		Reporter.log("Click on Template name Textbox", true);
		getTemplate_NameTextboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter Template name", true);
		jsclick(Template_Description_Messagebox);
		Thread.sleep(6000);
		Reporter.log("Click on Template Description message box", true);
		getTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter message Template Description box", true);
		jsclick(Template_Description_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getTemplate_Created_Message_Verify();
		Thread.sleep(6000);
		Reporter.log("Template Created Successfully Verified", true);
		jsclick(Template_Created_OK_button);
		Reporter.log("Click on ok button", true);
		Reporter.log("Verifying to CreateorBrowse Formmapping Template advancedviewing", true);

	}

	public void Verify_to_Edit_and_Delete_Formfield() throws Exception {

		Reporter.log("Test Scenario 10 :Verifying to Edit and Delete Form field ", true);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Template Tab", true);
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		Reporter.log("Select created Template", true);
		jsclick(Click_Edit_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Edit Template Fab button", true);
		EditTemplate_Description_Messagebox.clear();
		Thread.sleep(6000);
		Reporter.log("Click on Edit Template Description message box", true);
		getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(6000);
		Reporter.log("Enter message in Edit Template Description messagebox", true);
		jsclick(EditTemplate_Description_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		jsclick(EditTemplate_Created_OK_button);
		Thread.sleep(6000);
		Reporter.log("Click on Template edited Ok button", true);
		getMoveto_Templates_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Template Tab", true);
		jsclick(Select_Created_Template);
		Thread.sleep(6000);
		Reporter.log("Select Created Template", true);
		jsclick(Delete_Template_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Delete Template button", true);
		jsclick(Delete_Template_OK_Button);
		Reporter.log("Click on OK button", true);
		Reporter.log("Formmapping Template Deleted Successfully", true);

	}

	public void Set_Defaultview() throws Exception {

		Reporter.log("Test Scenario 11 : Set Defaultview", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office Document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and set as Default View", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
	}

	// Verifying Load more in Search and Folder in Spanish laguage

	public void Verify_Load_MoreCount_On_Search() throws Exception {

		Reporter.log("Test Scenario 12 :Verifying Load More Count On Search ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click My Preferences", true);
		getEnter_Loadmorecount();
		Thread.sleep(6000);
		Reporter.log("Enter Load more value", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		getVerify_Loadmorecount_Searchresult();
		Thread.sleep(6000);
		Reporter.log("Verifying Load more count Search", true);
		jsclick(Loadmorebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Load more button", true);
		getVerify_Loadmorecount_Searchresult();
		Thread.sleep(6000);
		Reporter.log("Verifying Load more Result", true);
		Reporter.log("Minumum number of Load More count on Search Verified successfully", true);

	}

	public void Verify_Load_MoreCount_On_Folder() throws Exception {

		Reporter.log("Test Scenario 13 :Verifying Load More Count On Folder", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log(" select a Folder", true);
		getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(6000);
		Reporter.log("Verified Load more count On Folder Document", true);
		jsclick(Loadmorebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Load more button", true);
		getVerify_Loadmorecount_Document_Folder();
		Reporter.log("Verifying Load more count Document Folder", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("Minumum number of Load More count on Folder Verified successfully", true);

	}

	// Verifying Custom Columns in Spanish Language

	// Custom columns for Room

	public void Open_Custom_List_Dialog_And_Verify_Title_Roomcolumn() throws InterruptedException {

		Reporter.log("Test Scenario 14 :Open Custom List Dialog And Verifying Title Room column ", true);
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		try {
			Verify_Reset_CustomColumsnRoom();
			Thread.sleep(6000);
			Reporter.log("Click on Reset Column Option", true);
			jsclick(Reset_Column_OK_Button);
			Reporter.log("Click on Ok button", true);
			Thread.sleep(6000);
			Reporter.log("Custom columns Reset Successfully on Room Level", true);
			movingElement(MoveTo_Menu_RoomName);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(12000);
		Reporter.log("Click on Custom Column Option", true);
		gettitelvalidation();
		Reporter.log("Custom List title validate", true);
	}

	public void Verify__Text_of_Custom_List_Dialog_Roomcolumn() throws InterruptedException {

		Reporter.log("Test Scenario 15 :Verifying  Text of Custom List Dialog Roomcolumn ", true);
		Thread.sleep(6000);
		getextvalidation();
		Reporter.log("Custom List Dialog Text verified", true);
	}

	public void Set_And_Verify_Custom_Columns_NodeLevel() throws Exception {

		Reporter.log("Test Scenario 16 :Set And Verifying Custom Columns NodeLevel", true);
		Thread.sleep(6000);
		getSearchBoxIndices1();
		Thread.sleep(6000);
		Reporter.log("Enter Indices 1 value in search Box", true);
		jsclick(Select_Indices01);
		Thread.sleep(6000);
		Reporter.log("Select Entered Indices 1 Value", true);
		getSearchBoxIndices2();
		Thread.sleep(6000);
		Reporter.log("Enter Indices 2 value in search Box", true);
		jsclick(Select_Indices02);
		Thread.sleep(6000);
		Reporter.log("Select Entered Indices 2 Value", true);
		getSearchBoxIndices3();
		Thread.sleep(6000);
		Reporter.log("Enter Indices 3 value in search Box", true);
		jsclick(Select_Indices03);
		Thread.sleep(6000);
		Reporter.log("Select Entered Indices 3 Value", true);
		jsclick(Ok_Button_CustomList);
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		Verify_CompactView_checkbox();
		Thread.sleep(6000);
		Reporter.log("Check Compact View Checkbox", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		Verify_Indicess_Value();
		Thread.sleep(6000);
		Reporter.log("Verifying Added Indices Value", true);
		Reporter.log("Custom Columns is set Node Level successfully", true);

	}

	public void Verify_Default_Custom_Columns() throws InterruptedException {

		Reporter.log("Test Scenario 17 : Verifying Default Custom Columns", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Click on Room name Tab", true);
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(6000);
		Default_Button_CustomList();
		Thread.sleep(6000);
		Reporter.log("Click on Custom List dialog Default ButtonC", true);
		jsclick(Ok_Button_CustomList);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Set and Verifying Default Custom columns successfully", true);

	}

	public void Verify_Cancel_Button_of_CustomList() throws InterruptedException {

		Reporter.log("Test Scenario 18 :Verifying Cancel button of Custom List ", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(6000);
		Reporter.log("Click on Custom Column Option", true);
		Cancel_Button_CustomList();
		Reporter.log("Click on Custom Column Cancel button", true);

	}

	public void Verify_Custom_Columns_RoomLevel() throws InterruptedException {

		Reporter.log("Test Scenario 19 :Verifying Custom Columns Room Level", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(6000);
		Reporter.log("Click on Custom Column Option", true);
		jsclick(Click_DropdownOption);
		Reporter.log("Click on  Custom columns Dropdown option and select Indices Level", true);
		Select_DropdownValue();
		Thread.sleep(6000);
		Reporter.log("Select Room Level Indices", true);
		jsclick(Set_RoomLevel_Indices);
		Thread.sleep(6000);
		jsclick(Ok_Button_CustomList);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Indices is Selected Successfully for RoomLevel", true);

	}

	public void Verify_Reset_Columns_Functionality() throws InterruptedException {

		Reporter.log("Test Scenario 20 :Verifying Reset Columns Functionality ", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Room_Reset_CustomColumns);
		Thread.sleep(6000);
		Reporter.log("Click on Reset Custom column Option", true);
		jsclick(Reset_Column_OK_Button);
		Reporter.log("Click on Ok button ", true);
		Reporter.log("Custom columns Reset Successfully", true);

	}

	// Custom columns for Search

	public void Open_Custom_List_Dialog_And_Verify_Title_Searchcolumn() throws InterruptedException {

		Reporter.log("Test Scenario 21 : Open Custom List Dialog And Verifying Title Search column ", true);
		MoveTo_Search_Option();
		Thread.sleep(6000);
		Reporter.log("	Mousehover to Search Tab", true);
		try {
			Verify_Reset_CustomColumsnSearch();
			Thread.sleep(6000);
			Reporter.log("Click on Reset Column Option", true);
			jsclick(Reset_Column_OK_Button);
			Thread.sleep(6000);
			Reporter.log("Click on Ok button", true);
			Thread.sleep(6000);
			Reporter.log("Custom columns Reset Successfully on Search Level", true);
			movingElement(MoveTo_Search_Option);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(Search_Custom_Columns_option);
		Thread.sleep(12000);
		Reporter.log("Click on Custom Column Option", true);
		getSearch_titelvalidation();
		Reporter.log("Search Custom List title validate", true);

	}

	public void Verify__Text_of_Custom_List_Dialog_Searchcolumn() throws InterruptedException {

		Reporter.log("Test Scenario 22 : Verifying Text of Custom List Dialog Search column ", true);
		Thread.sleep(6000);
		getSearch_textvalidation();
		Reporter.log("Search Custom List Dialog Text verified", true);

	}

	public void Verify_Set_Custom_Columns_for_Search() throws Exception {

		Reporter.log("Test Scenario 23 :Verifying Set Custom Columns for Search ", true);
		Thread.sleep(6000);
		getSearchBoxIndices4();
		Thread.sleep(6000);
		Reporter.log("Enter Indices 4 value in Search Box", true);
		jsclick(Search_Select_Indices01);
		Thread.sleep(6000);
		Reporter.log("Select Search Indices ", true);
		getSearchBoxIndices5();
		Thread.sleep(6000);
		Reporter.log("Enter Indices 5 value in Search Box", true);
		jsclick(Search_Select_Indices02);
		Thread.sleep(6000);
		Reporter.log("Select Search Indices ", true);
		getSearchBoxIndices6();
		Thread.sleep(6000);
		Reporter.log("Enter Indices 6 value in Search Box", true);
		jsclick(Search_Select_Indices03);
		Thread.sleep(6000);
		Reporter.log("Select Search Indices", true);
		jsclick(Search_Ok_Button_CustomList);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		jsclick(Document_Location);
		Thread.sleep(6000);
		Reporter.log("Click on  Document Location textbox", true);
		selectElement(Search_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Search_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Search_Folder);
		Thread.sleep(6000);
		Reporter.log(" select a Folder", true);
		jsclick(Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		Search_Verify_Indicess_Value4();
		Thread.sleep(6000);
		Reporter.log("Verified added Indices Custom Columns", true);
		Search_Verify_Indicess_Value5();
		Thread.sleep(6000);
		Reporter.log("Verified Indices Value", true);
		Search_Verify_Indicess_Value6();
		Thread.sleep(6000);
		Reporter.log("Custom column is set successfully for Search Functionality", true);

	}

	public void Verify_Reset_Columns_for_Search() throws InterruptedException {

		Reporter.log("Test Scenario 24 :Verifying Reset Columns for Search ", true);
		MoveTo_Search_Option();
		Thread.sleep(6000);
		Reporter.log("	Mousehover to Search Tab", true);
		jsclick(Search_ResetColumn);
		Thread.sleep(6000);
		Reporter.log("Click on Reset Columns Option", true);
		jsclick(Reset_Column_OK_Button);
		Thread.sleep(6000);
		Reporter.log("Verifying pop up and click on  Ok button", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		Reporter.log("Reset Custom Columns Successfully for Search", true);

	}

	// Custom column for ToDolist

	public void Open_Custom_List_Dialog_And_Verify_Title_ToDoList() throws InterruptedException {

		Reporter.log("Test Scenario 25 : Open Custom List Dialog And Verifying Title ToDoList ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		MoveTo_ToDoList_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover to ToDoList Tab", true);
		try {
			Verify_Reset_CustomColumsnTodolist();
			Thread.sleep(6000);
			Reporter.log("Click on Reset Column Option", true);
			jsclick(Reset_Column_OK_Button);
			Reporter.log("Click on Ok button", true);
			Thread.sleep(6000);
			Reporter.log("Custom columns Reset Successfully on TodoList Level", true);
			movingElement(MoveTo_ToDoList_Option);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(ToDoList_Custom_Columns_option);
		Thread.sleep(12000);
		Reporter.log("Click on Custom Column Option", true);
		ToDoList_titelvalidation();
		Reporter.log("ToDoList Custom List title validate", true);

	}

	public void Verify__Text_of_Custom_List_Dialog_ToDoList() throws Exception {

		Reporter.log("Test Scenario 26 :Verifying  Text of Custom List Dialog ToDoList", true);
		Thread.sleep(6000);
		ToDoList_textvalidation();
		Thread.sleep(6000);
		Reporter.log("Verified TodoList Custom column dialog Text", true);
		Reporter.log("Custom List Dialog Text verified", true);

	}

	public void Verify_Set_Custom_Columns_for_ToDoList() throws Exception {

		Reporter.log("Test Scenario 27 :Verifying Set Custom Columns for ToDoList ", true);
		jsclick(ToDoList_Select_Indices01);
		Thread.sleep(6000);
		jsclick(ToDoList_Ok_Button_CustomList);
		Reporter.log("Indices value Selected Successfully", true);
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document page", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Move to Documents Tab", true);
		jsclick(sendWorkflow);
		Thread.sleep(6000);
		Reporter.log("Click on Send to Workflow", true);
		jsclick(WFAssign);
		Thread.sleep(6000);
		Reporter.log("Select and click Workflow name", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check document page from document list", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Documents Tab", true);
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		Reporter.log("Select Document and do Copy and Paste Document successfully", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		MoveTo_ToDoList_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover to ToDoList Tab", true);
		jsclick(Select_All_Item);
		Thread.sleep(6000);
		Reporter.log("Click on All Item Option", true);
		ToDoList_Verify_Indicess_Value();
		Reporter.log("Custom column is set successfully for ToDoList Functionality", true);

	}

	public void Reset_Custom_Columns_for_ToDoList() throws InterruptedException {

		Reporter.log("Test Scenario 28 :Reset Custom Columns for ToDoList ", true);
		Thread.sleep(6000);
		MoveTo_ToDoList_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover to ToDoList Tab", true);
		jsclick(To_Do_Resetcolumn_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Reset Column", true);
		jsclick(Reset_Column_OK_Button);
		Reporter.log("Click on Ok button", true);
		Reporter.log("ToDoList Custom column Reset Successfully", true);

	}

	// Document Context Menu

	public void Verify_Refresh_Option() throws Exception {

		Reporter.log("Test Scenario 29  Verifying Refresh Option ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Documents Tab", true);
		getSelect_Option_Refresh();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("Refresh Functionality verified Successfully on Documents", true);
	}

	public void Verify_Categories_Option() throws Exception {

		Reporter.log("Test Scenario 30 : Verifying Categories Option ", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Reporter.log("Mousehover to Documents Tab", true);
		getSelect_Option_Catagories_andSet_Colors();
		Reporter.log("Select Option Catagories and set Color", true);
		Reporter.log("Categories on Documents Functionality verified Successfully", true);

	}

	public void Verify_copy_and_paste_Option() throws Exception {

		Reporter.log("Test Scenario 31 :Verifying copy and paste Option ", true);
		Thread.sleep(6000);
		getMoveTo_Menu_Documents();
		Reporter.log("Mousehover to Documents Tab", true);
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		Reporter.log("Verified Copy and Paste Document successfully", true);

	}

	public void Verify_cut_and_paste_Option() throws Exception {

		Reporter.log("Test Scenario 32 :Verifying cut and paste Option ", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Documents Tab", true);
		getVerify_CutandPaste_Document();
		Thread.sleep(6000);
		Reporter.log("cut and paste Document Functionality verified Successfully", true);
	}

	public void Verify_Delete_Option() throws Exception {

		Reporter.log("Test Scenario 33 :Verifying Delete Option", true);
		getVerify_Delete_Document();
		Thread.sleep(6000);
		Reporter.log("Document Delete Functionality verified Successfully", true);
	}

	public void Verify_CreateFavorites_Document() throws Exception {

		Reporter.log("Test Scenario 34 :Verifying Create Favorites Document", true);
		Verify_CreateFavorites_Document();
		Reporter.log("Verified and Create Favorites Document", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getOpen_CreateFavorites_Document();
		Reporter.log("CreateFavorites Document Functionality verified Successfully", true);
	}

	public void Verify_Notification_on_Document() throws Exception {

		Reporter.log("Test Scenario 35 : Verifying Notification on Document ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Reporter.log("Mousehover to Documents Tab", true);
		getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		Reporter.log("Verified Copy and Paste Document successfully", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Documents Tab", true);
		getCreate_Notification_Document();
		Thread.sleep(6000);
		Reporter.log("Verified and Create Notification on Document", true);
		jsclick(Click_signature_Menuoption);
		Thread.sleep(6000);
		Reporter.log("Click on Signature menu option", true);
		getinputpassword();
		Thread.sleep(6000);
		Reporter.log("Enter a Password", true);
		getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Reporter.log("add signature successfully on page ", true);
		getSave_Signature_Document();
		Thread.sleep(6000);
		Reporter.log("Click on save document menu option", true);
		movingclkElement(closedoc);
		Reporter.log("Click on Close document Viewer option", true);
		Reporter.log("Notification_on_Document Functionality verified Successfully");

	}

	public void Verify_SendTo_Mail() throws Exception {

		Reporter.log("Test Scenario 36 :Verifying SendTo Mail ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Documents Tab", true);
		getSentTo_Mail_asReference();
		Thread.sleep(6000);
		Reporter.log("SendTo Mail asReference Functionality verified Successfully", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Documents Tab", true);
		getSentTo_Mail_asCopy();
		Thread.sleep(6000);
		Reporter.log("SendTo Mail asCopy Functionality verified Successfully", true);
	}

	public void Verify_SendTo_Print() throws Exception {

		Reporter.log("Test Scenario 37 :Verifying Send To Print", true);
		getSentTo_Print();
		Reporter.log("SendTo Print Functionality verified Successfully");

	}

	public void Verify_SendTo_Export() throws Exception {

		Reporter.log("Test Scenario 38 :Verifying Send To Export ", true);
		getSentTo_Export();
		Reporter.log("SendTo Export Functionality verified Successfully", true);

	}

	public void Verify_SendTo_GenerateDocumentLink() throws Exception {

		Reporter.log("Test Scenario 39:Verifying Send To Generate DocumentLink ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		getSentTo_GenerateDocumentLink();
		Thread.sleep(6000);
		Reporter.log("Verified and sent Generate Document Link", true);
		Refresh_Button();
		Reporter.log("Click on Refresh button", true);
		Reporter.log("SendTo GenerateDocumentLink Functionality verified Successfully", true);
	}

	public void Verify_SendTo_SecureLink() throws Exception {

		Reporter.log("Test Scenario 40 :Verifying Send To SecureLink ", true);
		Thread.sleep(6000);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Check Document from document List", true);
		getSentTo_SecureLink();
		Thread.sleep(6000);
		Reporter.log("Verifying and send document to Secure link", true);
		Reporter.log("SendTo SecureLink Functionality verified Successfully", true);

	}

	// Login Validation

	public void Verifying_Login_EWA_with_blank_Username() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 2 : Verifying Login EWA with blank username ", true);
		pojo.loginwithoutUsername();
		Thread.sleep(2000);
		pojo.getUsernameerror();
	}

	public void Verifying_Login_EWA_with_blank_Password() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 3 : Verifying Login EWA with blank password", true);
		Thread.sleep(2000);
		pojo.loginwithoutPassword();
		Thread.sleep(2000);
		pojo.getPassworderror();
	}

	public void Verifying_Login_EWA_without_Selecting_Roomname() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 4 : Verifying Login EWA without selecting roomname ", true);
		Thread.sleep(2000);
		pojo.loginwithoutRoomname();
		Thread.sleep(2000);
		pojo.getRoomerror();
	}

	public void Verifying_Login_EWA_with_Invalid_Username() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 5 : Verifying Login EWA with invalid username ", true);
		Thread.sleep(2000);
		pojo.InvalidUsername();
		Thread.sleep(4000);
		pojo.getUsernotexist();
		Thread.sleep(2000);
	}

	public void Verifying_Login_EWA_with_Invalid_Password() throws Exception {

		Language pojo = new Language();
		Reporter.log("Test Scenario 6 : Verifying Login EWA with invalid password ", true);
		Thread.sleep(2000);
		pojo.InvalidPassword();
		Thread.sleep(4000);
	}

	public void Verifying_No_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying No button of Session for user is already active dialog box ", true);
		Already_Logged_User();
		Thread.sleep(2000);
		Reporter.log("Verified No button of Session for user is already active dialog box ", true);

	}

	public void Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Reporter.log("Test Scenario 7 : Verifying Yes button of Session for user is already active dialog box ", true);
		Thread.sleep(2000);
		LogDipakUser();
		Thread.sleep(2000);
		Reporter.log("Verified Yes button of Session for user is already active dialog box ", true);
		Refresh_Button();
	}
}