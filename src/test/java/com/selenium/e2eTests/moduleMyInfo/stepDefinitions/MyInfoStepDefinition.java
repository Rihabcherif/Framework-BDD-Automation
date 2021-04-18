package com.selenium.e2eTests.moduleMyInfo.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.moduleMyInfo.pageObjects.MyInfoPage;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.When;

public class MyInfoStepDefinition {

	public WebDriver driver;
	public MyInfoPage myinfoPage = new MyInfoPage();

	public MyInfoStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, myinfoPage);
	}

	@When("^Je clique sur le module My info$")
	public void jeCliqueSurLeModuleMyInfo() throws Throwable {
		myinfoPage.clickOnModuleMyInfo();
	}

	@When("^Je clique sur le bouton Edit$")
	public void jeCliqueSurLeBoutonEdit() throws Throwable {
		myinfoPage.clickOnEditButton();

	}

	@When("^Je saisis le champ Driver's License Number \"([^\"]*)\"$")
	public void jeSaisisLeChampDriverSLicenseNumber(String licenceNumber) throws Throwable {
		myinfoPage.fillLicenceNumber(licenceNumber);

	}

	@When("^Je saisis le champ SSN Number \"([^\"]*)\"$")
	public void jeSaisisLeChampSSNNumber(String ssnNumber) throws Throwable {
		myinfoPage.fillSSNNumber(ssnNumber);

	}

	@When("^Je clique sur le bouton save dans personal$")
	public void jeCliqueSurLeBoutonSaveDansPersonal() throws Throwable {
		myinfoPage.clickOnSaveButton();

	}

	@When("^Je clique sur le bouton Edit dans custom$")
	public void jeCliqueSurLeBoutonEditDansCustom() throws Throwable {
		myinfoPage.clickOnEditCustomButton();

	}

	@When("^Je selectionne blood type \"([^\"]*)\"$")
	public void jeSelectionneBloodType(String drop) throws Throwable {
		myinfoPage.SelectDropDownList(drop);
		

	}

	@When("^Je clique sur le bouton save dans custom$")
	public void jeCliqueSurLeBoutonSaveDansCustom() throws Throwable {
		myinfoPage.clickOnSaveCustomButton();
	}

	@When("^Je clique sur le bouton Add file$")
	public void jeCliqueSurLeBoutonAddFile() throws Throwable {
		myinfoPage.clickOnAddButton();

	}

	@When("^Je clique sur choisir un fichier \"([^\"]*)\"$")
	public void jeCliqueSurChoisirUnFichier(String url) throws Throwable {
		myinfoPage.fillUfile(url);

	}

	@When("^Je clique sur le bouton Upload$")
	public void jeCliqueSurLeBoutonUpload() throws Throwable {
		myinfoPage.clickOnUploadButton();

	}
}
