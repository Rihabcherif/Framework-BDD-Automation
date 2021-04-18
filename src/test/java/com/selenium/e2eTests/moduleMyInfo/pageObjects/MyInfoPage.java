package com.selenium.e2eTests.moduleMyInfo.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MyInfoPage {

	/* locators */
	final static String MENU_MYINFO_ID = "menu_pim_viewMyDetails";
	final static String EDIT_BUTTON_ID = "btnSave";
	final static String Driver_License_Number_ID = "personal_txtLicenNo";
	final static String SSN_Number_ID = "personal_txtNICNo";
	final static String SAVE_BUTTON_ID = "btnSave";
	final static String EDIT_CUSTOM_BUTTON_ID = "btnEditCustom";
	final static String BLOOD_TYPE_NAME = "custom1";
	final static String SAVE_CUSTOM_BUTTON_ID = "btnSave";
	final static String ADD_BUTTON_ID = "btnAddAttachment";
	final static String UFILE_ID = "ufile";
	final static String UPLOAD_BUTTOM_ID = "btnSaveAttachment";

	/* @FindBy */
	@FindBy(how = How.ID, using = MENU_MYINFO_ID)
	public static WebElement menuMyInfo;
	@FindBy(how = How.ID, using = EDIT_BUTTON_ID)
	public static WebElement btnEdit;
	@FindBy(how = How.ID, using = Driver_License_Number_ID)
	public static WebElement driverLicenceNumber;
	@FindBy(how = How.ID, using = SSN_Number_ID)
	public static WebElement ssnNumber;
	@FindBy(how = How.ID, using = SAVE_BUTTON_ID)
	public static WebElement btnSave;
	@FindBy(how = How.ID, using = EDIT_CUSTOM_BUTTON_ID)
	public static WebElement btnEditCustom;
	@FindBy(how = How.NAME, using = BLOOD_TYPE_NAME)
	public static WebElement editable;
	@FindBy(how = How.ID, using = SAVE_CUSTOM_BUTTON_ID)
	public static WebElement btnSaveCustom;
	@FindBy(how = How.ID, using = ADD_BUTTON_ID)
	public static WebElement btnAdd;
	@FindBy(how = How.ID, using = UFILE_ID)
	public static WebElement btnUfile;
	@FindBy(how = How.ID, using = UPLOAD_BUTTOM_ID)
	public static WebElement btnUpload;

	/* Methods */

	public void clickOnModuleMyInfo() {
		menuMyInfo.click();

	}

	public void clickOnEditButton() {
		btnEdit.click();

	}
	
	public void fillLicenceNumber(String licenceNumber) {
		driverLicenceNumber.sendKeys(licenceNumber);

	}
	
	public void fillSSNNumber(String snnNumber) {
		ssnNumber.sendKeys(snnNumber);

	}
	
	public void clickOnSaveButton() {
		btnSave.click();

	}
	
	public void clickOnEditCustomButton() {
		btnEditCustom.click();
		
	}
	
	public void SelectDropDownList(String drop) {
		Select op = new Select(editable);
		//op.selectByVisibleText(drop);
		op.selectByIndex(3);
		

	}
	
	public void clickOnSaveCustomButton() {
		btnSaveCustom.click();

	}
	
	public void clickOnAddButton() {
		btnAdd.click();

	}
	
	public void fillUfile(String url) {
		btnUfile.sendKeys(url);

	}
	
	public void clickOnUploadButton() {
		btnUpload.click();

	}

}
