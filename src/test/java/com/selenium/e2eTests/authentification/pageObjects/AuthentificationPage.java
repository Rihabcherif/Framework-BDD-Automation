package com.selenium.e2eTests.authentification.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationPage {

	/* Locators */
	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSWORD_ID = "txtPassword";
	final static String BUTTON_LOGIN_ID = "btnLogin";
	final static String WELCOME_ID = "welcome";

	/* @FindBy */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSWORD_ID)
	public static WebElement password;
	@FindBy(how = How.ID, using = BUTTON_LOGIN_ID)
	public static WebElement btnLogin;
	@FindBy(how = How.ID, using = WELCOME_ID)
	public static WebElement welcome;

	/* Methods */
	public void fillUserName(String name) {
		userName.sendKeys(name);
	}

	public void fillPassWord(String password1) {
		password.sendKeys(password1);
	}

	public void clickOnBtnLogin() {
		btnLogin.click();

	}


}
