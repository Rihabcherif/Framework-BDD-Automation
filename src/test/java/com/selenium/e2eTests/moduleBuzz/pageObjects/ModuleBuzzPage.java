package com.selenium.e2eTests.moduleBuzz.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ModuleBuzzPage {

	/* Locators */
	final static String BUZZ_ID = "menu_buzz_viewBuzz";
	final static String FULLNAME_ID = "createPost_content";

	/* @FindBY */
	@FindBy(how = How.ID, using = BUZZ_ID)
	public static WebElement buzzItem;
	@FindBy(how = How.ID, using = FULLNAME_ID)
	public static WebElement fullName;

	/* Methods */

	public void clickOnBuzz() {
		buzzItem.click();
	}

	public void fullName(String fullName1) {
		fullName.sendKeys(fullName1);
	}

}
