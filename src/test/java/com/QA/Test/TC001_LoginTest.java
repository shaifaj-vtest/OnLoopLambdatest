package com.QA.Test;

import java.io.InputStream;
import java.lang.reflect.Method;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QA.Base.BaseTest;
import com.QA.Pages.LoginPage;

import com.QA.utlis.TestUtils;

public class TC001_LoginTest extends BaseTest {
	LoginPage loginPage;
//	ProductsPage productsPage;
	JSONObject loginUsers;
	TestUtils utils = new TestUtils();

	@BeforeClass
	public void beforeClass() throws Exception {
		InputStream datais = null;
		try {
			String dataFileName = "data/loginUsers.json";
			datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
			JSONTokener tokener = new JSONTokener(datais);
			loginUsers = new JSONObject(tokener);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if (datais != null) {
				datais.close();
			}
		}
		closeApp();
		launchApp();
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeMethod
	public void beforeMethod(Method m) {
		utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
		loginPage = new LoginPage();
	}

	@AfterMethod
	public void afterMethod() {
		closeApp();
		launchApp();
	}

	@Test
	public void invalidUserName() {
		loginPage.setUserNAme(loginUsers.getJSONObject("invalidUser").getString("username"));
		loginPage.setPassword(loginUsers.getJSONObject("invalidUser").getString("password"));
		loginPage.clickSubmit();

		String actualErrTxt = loginPage.getErrTxt();
		String expectedErrTxt = getStrings().get("err_invalid_username_or_password");

		Assert.assertEquals(actualErrTxt, expectedErrTxt);
	}

	@Test
	public void invalidPassword() {
		loginPage.setUserNAme(loginUsers.getJSONObject("invalidPassword").getString("username"));
		loginPage.setPassword(loginUsers.getJSONObject("invalidPassword").getString("password"));
		loginPage.clickSubmit();

		String actualErrTxt = loginPage.getErrTxt();
		String expectedErrTxt = getStrings().get("err_invalid_username_or_password");

		Assert.assertEquals(actualErrTxt, expectedErrTxt);
	}

	@Test
	public void successfulLogin() {
		loginPage.setUserNAme(loginUsers.getJSONObject("validUser").getString("username"));
		loginPage.setPassword(loginUsers.getJSONObject("validUser").getString("password"));
		loginPage.clickSubmit();

	}
}
