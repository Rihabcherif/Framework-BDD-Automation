package com.selenium.e2eTests.moduleBuzz.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.moduleBuzz.pageObjects.ModuleBuzzPage;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.When;

public class ModuleBuzzStepDefinition {
	public WebDriver driver;
	public ModuleBuzzPage moduleBuzzPage = new ModuleBuzzPage();

	public ModuleBuzzStepDefinition() {

		driver = Setup.driver;
	}

	@When("^Je clique sur le buzz$")
	public void jeCliqueSurLeBuzz() throws Throwable {
		PageFactory.initElements(driver, moduleBuzzPage);
		moduleBuzzPage.clickOnBuzz();

	}

	@When("^Je saisie mon nom dans le champs update status \"([^\"]*)\"$")
	public void jeSaisieMonNomDansLeChampsUpdateStatus(String fullName1) throws Throwable {

		moduleBuzzPage.fullName(fullName1);

	}
}