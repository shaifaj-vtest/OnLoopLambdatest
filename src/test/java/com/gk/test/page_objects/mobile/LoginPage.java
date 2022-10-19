package com.gk.test.page_objects.mobile;

import com.gk.test.framework.AndroidObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.time.Duration;

public class LoginPage extends AndroidObject {
	SoftAssert Assert = new SoftAssert();
	boolean status;

	public LoginPage() {
		PageFactory.initElements(new AppiumFieldDecorator(getAndroidDriver()), this);
	}

	static private final By allowBtn = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
	static private final By GetStartedBtn = MobileBy.AccessibilityId("Get Started");
	static private final By continueBtn = MobileBy.AccessibilityId("Continue");
	static private final By team = By.xpath("//android.widget.ImageView[@content-desc=\"Team\"]");
	static private final By signinWithGoogle = By.xpath("//android.widget.ImageView[@content-desc=\"Sign in with Google\"]");
	static private final By ManagerAccount = By.xpath("//*[@text='Mayur Rawal']");

	static private final By anotherManagerAccount = By.xpath("//*[@text='Prashant Thombre']");
	static private final By userlogin = By.xpath("//*[@text='Rahul J']");


	static private final By colleagueAccount = By.xpath("//*[@text='Nikita Gorale']");
	//static private final By ManagerAccount = By.xpath("//*[@text='Vivek Dhiran']");
	
	static private final By onLoopHome = MobileBy.xpath("(//*[@class='android.widget.ImageView'])[2]");
	static private final By humbergerMenu= By.xpath("(//*[@class='android.widget.ImageView'])[1]");
	static private final By logOut = By.xpath("//*[contains(@content-desc,'Logout')]");

	static private final By signInWithMicrosoft = By.xpath("//android.widget.ImageView[@content-desc=\"Sign in with Microsoft\"]");

	public void clickOnAllowBtn() throws InterruptedException, MalformedURLException {

		if (getAndroidDriver().findElements(allowBtn).size() > 0)
		{
			applyWaitForElement(allowBtn, 15);
			getAndroidDriver().findElement(allowBtn).click();
			System.out.println("Clicked on Allow Permission for Media And Photos");
			Thread.sleep(3000);

		}else
		{
			System.out.println("Media And Photos Permission Already Allowed ");
		}

	}
	public void clickOnGetStartedBtn() throws MalformedURLException {
		applyWaitForElement(GetStartedBtn, 10);
		getAndroidDriver().findElement(GetStartedBtn).click();
	}

	public void clickOnContinueBtn() throws InterruptedException {
		Thread.sleep(5000);
		getAndroidDriver().findElement(continueBtn).click();
	}

	public void clickOnSignInWithGoogle() throws MalformedURLException {
		applyWaitForElement(signinWithGoogle, 20);
		getAndroidDriver().findElement(signinWithGoogle).click();
	}

	public void clickOnManagerAccount() throws MalformedURLException {
		applyWaitForElement(ManagerAccount, 25);
		getAndroidDriver().findElement(ManagerAccount).click();
		System.out.println("User Clicked on Managers Account");
	}

	public void clickOnAnotherManagerAccount() throws MalformedURLException {
		applyWaitForElement(anotherManagerAccount, 25);
		getAndroidDriver().findElement(anotherManagerAccount).click();
		System.out.println("User Clicked on Prashant Managers Account");
	}

	public void clickOncolleagueAccount() throws MalformedURLException {
		applyWaitForElement(colleagueAccount, 25);
		getAndroidDriver().findElement(colleagueAccount).click();
		System.out.println("User Clicked on colleague Account");
	}

	public void homepageDisplayd() throws MalformedURLException, InterruptedException {
		Thread.sleep(5000);
		applyWaitForElement(team, 30);

		status=getAndroidDriver().findElement(onLoopHome).isDisplayed();
		if (status) {
			System.out.println("User Logged In Successfully");
		}
		Assert.assertTrue(status);
	}
	public void ClickOnHumburgerMenu() throws MalformedURLException {
		applyWaitForElement(humbergerMenu, 25);
		getAndroidDriver().findElement(humbergerMenu).click();


	}
	public void ClickOnLogOut() throws MalformedURLException {
		applyWaitForElement(humbergerMenu, 10);
		getAndroidDriver().findElement(logOut).click();

	}
	public void clickOnSignInWithMicrosoft() throws MalformedURLException {
		applyWaitForElement(signInWithMicrosoft, 25);
		getAndroidDriver().findElement(signInWithMicrosoft).click();
	}

}
