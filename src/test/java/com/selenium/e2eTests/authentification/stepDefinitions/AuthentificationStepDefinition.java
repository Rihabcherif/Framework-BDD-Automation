package com.selenium.e2eTests.authentification.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.authentification.pageObjects.AuthentificationPage;
import com.selenium.e2eTests.utils.CommonMethods;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition extends CommonMethods {

	public WebDriver driver;
	public AuthentificationPage authentificationPage = new AuthentificationPage();
	public CommonMethods commonMethods = new CommonMethods();

	public AuthentificationStepDefinition() {
		driver = Setup.driver;
	}

	@Given("^J'ouvre l'application OrangeHRM$")
	public void jOuvreLApplicationOrangeHRM() throws Throwable {
		logger.info("J'ouvre l'application OrangeHRM");
		commonMethods.openApplication();
	}

	@When("^Je saisi le username \"([^\"]*)\"$")
	public void jeSaisiLeUsername(String name) throws Throwable {
		logger.info("Je saisi le username");
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationPage.fillUserName(name);
	}

	@When("^Je saisi le mot de passe \"([^\"]*)\"$")
	public void jeSaisiLeMotDePasse(String password1) throws Throwable {
		logger.info("Je saisi le mot de passe");
		authentificationPage.fillPassWord(password1);
	}

	@When("^Je clique sur le bouton Login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		logger.info("Je clique sur le bouton Login");
		authentificationPage.clickOnBtnLogin();
	}

	@Then("^Redirection vers la page Home de l'application OrangeHRM \"([^\"]*)\"$")
	public void redirectionVersLaPageHomeDeLApplicationOrangeHRM(String textWelcome) throws Throwable {
		logger.info("Redirection vers la page Home de l'application OrangeHRM");
		String adminUser = AuthentificationPage.welcome.getText();
		Assert.assertTrue(adminUser.contains(textWelcome));

	}

}
