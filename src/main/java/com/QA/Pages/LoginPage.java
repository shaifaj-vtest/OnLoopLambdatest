package com.QA.Pages;

import com.QA.Base.BaseTest;
import com.QA.utlis.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BaseTest {
	TestUtils utils = new TestUtils();
	@AndroidFindBy(accessibility = "test-Username")
	@iOSXCUITFindBy(id = "test-Username")
	private MobileElement usernameTxtFld;

	@AndroidFindBy(accessibility = "test-Password")
	@iOSXCUITFindBy(id = "test-Password")
	private MobileElement passwordTxtFld;

	@AndroidFindBy(accessibility = "test-LOGIN")
	@iOSXCUITFindBy(id = "test-LOGIN")
	private MobileElement loginBtn;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
	private MobileElement errTxt;

	public void setUserNAme(String username) {
		clear(usernameTxtFld);
		sendKeys(usernameTxtFld, username, "login with " + username);

	}

	public void setPassword(String password) {
		clear(passwordTxtFld);
		sendKeys(passwordTxtFld, password, "password is " + password);

	}

	public void clickSubmit() {
		click(loginBtn, "press login button");

	}

	public String getErrTxt() {
		String err = getText(errTxt, "error text is - ");
		return err;
	}

}
