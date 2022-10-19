package com.gk.test.page_objects.mobile;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.gk.test.framework.AndroidObject;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static com.gk.test.framework.helpers.AndroidHelper.getAndroidWebDriver;

public class HamburgerMenuPage extends AndroidObject {
	SoftAssert Assert = new SoftAssert();
	boolean status;
	String content;

	public HamburgerMenuPage() {
		PageFactory.initElements(new AppiumFieldDecorator(getAndroidDriver()), this);
	}


	static private final By HamburgerMenu = By.xpath("(//android.widget.ImageView)[1]");
	static private final By inviteToMyOrg = By.xpath("//android.widget.ImageView[contains(@content-desc,'Invite to my org')]");
	static private final By gmailShare = By.xpath("//*[@text='Gmail']");
	static private final By inviteLinkContent = By.xpath("//*[contains(@text,'Join VTEST - Software Testing in OnLoop!')]");
	static private final By recommendOnloop = By.xpath("//android.widget.ImageView[contains(@content-desc,'Recommend OnLoop')]");
	static private final By sharingOptionPopUp = By.xpath("//*[@resource-id='miui:id/alertTitle']");
	static private final By downloadLinkContent = By.xpath("//*[contains(@text,'OnLoop is a space where teams get better')]");
	static private final By prismSummary = By.xpath("(//*[@class='android.widget.ImageView'])[5]");
	static private final By searchColleagueTxtBx = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
	static private final By generateSummaryScreen = By.xpath("//android.view.View[@content-desc=\"Generate summary\"]");
	static private final By selectColleagueName = By.xpath("(//*[@class='android.view.View']//following::android.view.View)[11]");
	static private final By keepCaptureContent = By.xpath("//android.view.View[contains(@content-desc,'Keep Capturing!')]");
	static private final By unlockPrismContent = By.xpath("//android.view.View[contains(@content-desc,'unlock a Prism summary')]");
	static private final By makeACapture = By.xpath("(//android.widget.Button[@content-desc=\"Make a Capture\"])[1]");
	static private final By makeYourFirstCapture = By.xpath("//android.widget.Button[@content-desc=\"Make your first Capture\"]");
	static private final By generatePrismSummaryBtn = By.xpath("//android.widget.Button[@content-desc=\"Generate Prism summary\"]");
	static private final By updatedPrismSummaryContent = By.xpath("//android.view.View[contains(@content-desc,'updated Prism summary')]");
	static private final By manageRemainder = By.xpath("(//*[@class='android.widget.ImageView'])[6]");
	static private final By iWantTo = By.xpath("//android.widget.ImageView[@content-desc=\"Select an objective\"]");
	static private final By ownMY = By.xpath("(//*[@class='android.view.View'])[12]");
	static private final By saveBtn = By.xpath("//android.widget.Button[@content-desc=\"Save\"]");
	static private final By featureRequest = By.xpath("//android.widget.ImageView[contains(@content-desc,'Feature request')]");
	static private final By howToUseOnloop = By.xpath("(//*[@class='android.widget.ImageView'])[9]");
	static private final By startCastingContent = By.xpath("//*[@resource-id='android:id/message']");
	static private final By cancelBtn = By.xpath("//*[@text='Cancel']");
	static private final By startBtn = By.xpath("//*[@text='Start now']");
	static private final By resourceCenter = By.xpath("//android.widget.ImageView[contains(@content-desc,'Resource Center')]");
	static private final By resourceCenterScreen = By.xpath("(//*[@text='Resource Center'])[2]");
	static private final By resourceCenterMenus = By.xpath("(//*[@class='android.view.View'])");
	static private final By makeCapturesInSlack = By.xpath("(//*[@class='android.widget.ImageView'])[4]");
	static private final By signInWithSlack = By.xpath("//android.widget.ImageView[@index='2']");
	static private final By vtestCorp = By.xpath("//*[@text='First item in group recent workspaces, Vtest Corp']");
	static private final By acceptAndContinue = By.xpath("//*[@text='Accept and continue']");
	static private final By followUs = By.xpath("//android.widget.ImageView[contains(@content-desc,'Follow us on Twitter')]");
	static private final By googlePlay = By.xpath("(//android.widget.ImageView)[10]");
	static private final By supportOurGrowth = By.xpath("//android.widget.ImageView[contains(@content-desc,'Support our growth')]");
	static private final By slackURLTxtBx = By.xpath("//*[@class='android.widget.EditText']");
	static private final By slackURLContinueBtn = By.xpath("//*[@text='Continue']");
	static private final By slackWorkSigninScreen = By.xpath("//*[contains(@text,'vtestcorpworkspace')]");
	static private final By slackWorkEmailTxtBx = By.xpath("(//android.widget.EditText)[1]");
	static private final By slackWorkPassTxtBx = By.xpath("(//android.widget.EditText)[2]");
	static private final By slackWorkSignin = By.xpath("//*[@text='Sign in']");
	static private final By twitterUrl = By.xpath("//*[@text='mobile.twitter.com/OnLoop']");
	static private final By followUsTwitter = By.xpath("//*[@text='Follow @OnLoop']");






	public void ClickOnHamburgerMenuMenu() throws MalformedURLException {
		applyWaitForElement(HamburgerMenu, 15);
		getAndroidDriver().findElement(HamburgerMenu).click();
		System.out.println("User Clicked on Hamburger Menu on Home Page");
	}

	public void clickOnInviteToMyOrg() throws MalformedURLException {
		applyWaitForElement(inviteToMyOrg, 20);
		getAndroidDriver().findElement(inviteToMyOrg).click();
		System.out.println("User Clicked on option Invite To My Org");

	}

	public void visibilityOfSharingOptions() throws MalformedURLException {
		applyWaitForElement(gmailShare, 20);
		status = getAndroidDriver().findElement(gmailShare).isDisplayed();
		if (status) {
			System.out.println("User is on External Sharing List");
			getAndroidDriver().findElement(gmailShare).click();
			System.out.println("User Clicked On Gmail to Share Link Through External Source");
			applyWaitForElement(inviteLinkContent, 20);
			content = getAndroidDriver().findElement(inviteLinkContent).getAttribute("text");
			System.out.println("Invite Link:" + "\n" + content);
		} else {
			System.out.println("User is Not on External Sharing List");
		}
		Assert.assertTrue(status);
		Assert.assertAll();
		System.out.println("User is able to invite team members through external sharing source in the organization");

	}

	public void clickOnRecommendOnloop() throws MalformedURLException {
		applyWaitForElement(recommendOnloop, 20);
		getAndroidDriver().findElement(recommendOnloop).click();
		System.out.println("User Clicked on Recommend On loop Option");

	}

	public void visibilityOfDownloadOptions() throws MalformedURLException {
		applyWaitForElement(sharingOptionPopUp, 20);
		status = getAndroidDriver().findElement(sharingOptionPopUp).isDisplayed();
		if (status) {
			System.out.println("User is on External Sharing List");
			getAndroidDriver().findElement(gmailShare).click();
			System.out.println("User Clicked On Gmail to Share Link to downloading App");
			applyWaitForElement(downloadLinkContent, 20);
			content = getAndroidDriver().findElement(downloadLinkContent).getAttribute("text");
			System.out.println("App Downloading Link:" + "\n" + content);
		} else {
			System.out.println("User is Not on External Sharing List");
		}
		Assert.assertTrue(status);
		Assert.assertAll();
		System.out.println("User is able to invite team members through external sharing source for application download");

	}

	public void user_tap_on_Prism_summaries() throws MalformedURLException {
		applyWaitForElement(prismSummary, 10);
		getAndroidDriver().findElement(prismSummary).click();
		System.out.println("Clicked on Prism Summary");

	}

	public void user_should_be_able_redirected_to_create_Prism_Summary_page() throws MalformedURLException {
		applyWaitForElement(generateSummaryScreen, 20);
		status = getAndroidDriver().findElement(generateSummaryScreen).isDisplayed();
		if (status) {
			System.out.println("User is on Generate Prism Summary Page");
		} else {
			System.out.println("User is Not on Generate Prism Summary Page");
		}
		Assert.assertTrue(status);
		Assert.assertAll();

	}

	public void clickOnColleagueSearchTxtBx(String colleague) throws MalformedURLException {
		applyWaitForElement(searchColleagueTxtBx, 20);
		getAndroidDriver().findElement(searchColleagueTxtBx).click();
		getAndroidDriver().findElement(searchColleagueTxtBx).sendKeys(colleague);
		applyWaitForElement(selectColleagueName, 30);
		getAndroidDriver().findElement(selectColleagueName).click();
		System.out.println("Who is this Prism Summary About?:" + colleague);

	}

	public void clickOnGeneratePrismSummaryBtn() throws MalformedURLException, InterruptedException {
		swipe(0.2,0.2,0.2,0.4);
		if (getAndroidDriver().findElements(keepCaptureContent).size() > 0) {
			applyWaitForElement(keepCaptureContent, 20);
			content = getAndroidDriver().findElement(keepCaptureContent).getAttribute("content-desc");
			System.out.println(content);
			if(getAndroidDriver().findElements(makeACapture).size()>0){
				applyWaitForElement(makeACapture, 20);
				getAndroidDriver().findElement(makeACapture).click();
				System.out.println("User Clicked on Make a Capture Button");
			}
			else{
				applyWaitForElement(makeYourFirstCapture, 20);
				getAndroidDriver().findElement(makeYourFirstCapture).click();
				System.out.println("User Clicked on Make Your First Capture Button");
			}

		} else if (getAndroidDriver().findElements(unlockPrismContent).size() > 0) {
			applyWaitForElement(unlockPrismContent, 20);
			content = getAndroidDriver().findElement(unlockPrismContent).getAttribute("content-desc");
			System.out.println(content);
			if(getAndroidDriver().findElements(makeACapture).size()>0){
				applyWaitForElement(makeACapture, 20);
				getAndroidDriver().findElement(makeACapture).click();
				System.out.println("User Clicked on Make a Capture Button");
			}
			else{
				applyWaitForElement(makeYourFirstCapture, 20);
				getAndroidDriver().findElement(makeYourFirstCapture).click();
				System.out.println("User Clicked on Make Your First Capture Button");
			}
		} else if (getAndroidDriver().findElements(updatedPrismSummaryContent).size() > 0) {
			applyWaitForElement(updatedPrismSummaryContent, 20);
			content = getAndroidDriver().findElement(updatedPrismSummaryContent).getAttribute("content-desc");
			System.out.println(content);
			if(getAndroidDriver().findElements(makeACapture).size()>0){
				applyWaitForElement(makeACapture, 20);
				getAndroidDriver().findElement(makeACapture).click();
				System.out.println("User Clicked on Make a Capture Button");
			}
			else{
				applyWaitForElement(makeYourFirstCapture, 20);
				getAndroidDriver().findElement(makeYourFirstCapture).click();
				System.out.println("User Clicked on Make Your First Capture Button");
			}
		}else {
			applyWaitForElement(generatePrismSummaryBtn, 20);
			getAndroidDriver().findElement(generatePrismSummaryBtn).click();
			System.out.println("User Clicked on Generate Prism Summary Button");
		}
	}

	public void userTapOnCustomReminder() throws MalformedURLException {
		applyWaitForElement(manageRemainder, 15);
		getAndroidDriver().findElement(manageRemainder).click();
		System.out.println("User Clicked On Manage Remainder");
	}

	public static int GetRandomWeekdays() {
		int min = 3;
		int max = 9;
		//System.out.println("Random value in int from "+min+" to "+max+ ":");
		int a = (int) Math.floor(Math.random() * (max - min + 1) + min);
		System.out.println("Random value in int from minimum to maximum :" + a);
		return a;
	}

	public static int GetRandomTimeslot() {
		int min = 11;
		int max = 13;
		//System.out.println("Random value in int from "+min+" to "+max+ ":");
		int b = (int) Math.floor(Math.random() * (max - min + 1) + min);
		System.out.println("Random value in int from minimum to maximum :" + b);
		return b;
	}

	public static int GetRandomTime() {
		int min = 9;
		int max = 20;
		//System.out.println("Random value in int from "+min+" to "+max+ ":");
		int c = (int) Math.floor(Math.random() * (max - min + 1) + min);
		System.out.println("Random value in int from minimum to maximum :" + c);
		return c;

	}

	public void userSetTheReminder() throws MalformedURLException, InterruptedException {
		applyWaitForElement(iWantTo, 10);
		getAndroidDriver().findElement(iWantTo).click();
		applyWaitForElement(ownMY, 10);
		getAndroidDriver().findElement(ownMY).click();
		System.out.println("User Clicked On I want to...");
		Thread.sleep(3000);
		//applyWaitForElement(By.xpath("//android.view.View[@index='" + GetRandomWeekdays() + "']"), 10);
		getAndroidDriver().findElement(By.xpath("//android.view.View[@index='" + GetRandomWeekdays() + "']")).click();
		System.out.println("User Clicked on Weekday");
		Thread.sleep(3000);
		//applyWaitForElement(By.xpath("(//*[@class='android.widget.ImageView'])['" + GetRandomTimeslot() + "']"), 10);
		getAndroidDriver().findElement(By.xpath("//android.widget.ImageView[@index='" + GetRandomTimeslot() + "']")).click();
		System.out.println("User Clicked on Timeslot");
		Thread.sleep(3000);
		//applyWaitForElement(By.xpath("(//*[@class='android.view.View'])['"+GetRandomTime()+"']"),10);
		getAndroidDriver().findElement(By.xpath("(//*[@class='android.view.View'])[" + GetRandomTime() + "]")).click();
		System.out.println("User Selected time");

	}

	public void userShouldBeAbleSaveTheCustomReminders() throws MalformedURLException {
		applyWaitForElement(saveBtn, 10);
		getAndroidDriver().findElement(saveBtn).click();
		getAndroidDriver().findElement(saveBtn).click();
		System.out.println("User Saved Remainder");
	}

	public void clickOnFeatureRequest() throws MalformedURLException {
		applyWaitForElement(featureRequest, 20);
		getAndroidDriver().findElement(featureRequest).click();
		System.out.println("User Clicked on Feature Request");
	}

	public void clickOnCancel() throws MalformedURLException {
		content = getAndroidDriver().findElement(startCastingContent).getAttribute("text");
		applyWaitForElement(startCastingContent, 20);
		applyWaitForElement(cancelBtn, 20);
		getAndroidDriver().findElement(cancelBtn).click();
		System.out.println(content + "\n" + "User Clicked on Cancel Button");
	}

	public void clickOnStartNow() throws MalformedURLException {
		applyWaitForElement(startCastingContent, 20);
		content = getAndroidDriver().findElement(startCastingContent).getAttribute("text");
		applyWaitForElement(startBtn, 20);
		getAndroidDriver().findElement(startBtn).click();
		System.out.println(content + "\n" + "User Clicked on Start Now Button");
	}

	public void needHelpOptions(String value) throws MalformedURLException {
		applyWaitForElement(By.xpath("//*[@text='Report a bug']"), 20);
		getAndroidDriver().findElement(By.xpath("//*[@text='" + value + "']")).click();
		System.out.println("User Clicked on :" + value);
	}


	public void resourceCenterMenus() throws MalformedURLException {
		applyWaitForElement(resourceCenterMenus, 20);
		List<WebElement> d = (getAndroidWebDriver().findElements(resourceCenterMenus));
		//iterate list
		System.out.println("Size is" + d.size());
		for (int i = 0; i < d.size(); i++) {
			//check expected data
			String s = d.get(i).getAttribute("text");
			System.out.println("values are:" + s);
			if (s.contentEquals("Tags")) {
				d.get(i).click();
				System.out.println("Clicked on:" + i);
				break;
			}
		}
	}

	public void userTapOnHowToUseOnloop() throws MalformedURLException {
		applyWaitForElement(howToUseOnloop, 10);
		getAndroidDriver().findElement(howToUseOnloop).click();
		System.out.println("User Clicked on How To Use Onloop");

	}

	public void userShouldBeAbleRedirectedToFeedbackAndReflectionPage() throws MalformedURLException {
		applyWaitForElement(By.xpath("//*[@class='android.view.View']"), 10);
		boolean Display = getAndroidDriver().findElement(By.xpath("//*[@class='android.view.View']")).isDisplayed();
		System.out.println("Feedback And reflection page is Displayed :" + Display);
	}

	public void clickOnResourceCenter() throws MalformedURLException {
		applyWaitForElement(resourceCenter, 20);
		getAndroidDriver().findElement(resourceCenter).click();
		System.out.println("User Clicked on Resource Center Button");
	}

	public void tapOnResourceCenterBrowserSite() throws MalformedURLException {
		applyWaitForElement(resourceCenterScreen, 30);
		status = getAndroidDriver().findElement(resourceCenterScreen).isDisplayed();
		if (status) {
			System.out.println("User is on “Resource Center“ to view information about Onloop features");
		} else {
			System.out.println("User is Not Redirected to “Resource Center“ to view information about Onloop features");
		}
		Assert.assertTrue(status);
		Assert.assertAll();
	}

	public void userTapOnMakeCapturesInSlack() throws MalformedURLException {
		applyWaitForElement(makeCapturesInSlack, 10);
		getAndroidDriver().findElement(makeCapturesInSlack).click();
		System.out.println("User Clicked on make captures in slack");
	}

	public void userShouldBeAbleToLinkOnloopApplicationProfileWithSlack() throws MalformedURLException {
		applyWaitForElement(signInWithSlack, 40);
		getAndroidDriver().findElement(signInWithSlack).click();
		System.out.println("User Clicked on Sign in with slack");
		//sign in with another workspace
		applyWaitForElement(slackURLTxtBx, 20);
		getAndroidDriver().findElement(slackURLTxtBx).sendKeys("vtestcorpworkspace");
		applyWaitForElement(slackURLContinueBtn, 10);
		getAndroidDriver().findElement(slackURLContinueBtn).click();
		System.out.println("User Clicked on Continue Button");
	}
	public void signInWorkSpaceScreen() throws MalformedURLException {
		applyWaitForElement(slackWorkSigninScreen,30);
		status = getAndroidDriver().findElement(slackWorkSigninScreen).isDisplayed();
		if (status) {
			content = getAndroidDriver().findElement(slackWorkSigninScreen).getAttribute("text");
			System.out.println(content);
//			applyWaitForElement(slackWorkEmailTxtBx, 20);
//			getAndroidDriver().findElement(slackWorkEmailTxtBx).sendKeys("azarsayyed@vtestcorp.com");
//			getAndroidDriver().hideKeyboard();
//			System.out.println("User has Entered Work Email");
//			applyWaitForElement(slackWorkPassTxtBx, 20);
//			getAndroidDriver().findElement(slackWorkPassTxtBx).sendKeys("Vtest@123");
//			getAndroidDriver().hideKeyboard();
//			System.out.println("User has Entered Work Password");
//			applyWaitForElement(slackWorkSignin, 20);
//			getAndroidDriver().findElement(slackWorkSignin).click();
//			System.out.println("User Clicked on Sign in Button");
		}
	}
	public void slackHomePage() throws MalformedURLException {
		applyWaitForElement(vtestCorp, 20);
		getAndroidDriver().findElement(vtestCorp).click();
		System.out.println("User Clicked on Vtest corp");
		System.out.println("waiting element to scroll down to be clickable");
		//used explicit wait for waiting the element to scroll down
		WebDriverWait wait = new WebDriverWait(getAndroidDriver(), 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(acceptAndContinue));
		//used actions to scroll down
		Actions act = new Actions(getAndroidDriver());
		act.moveToElement((WebElement) acceptAndContinue).click().perform();
		System.out.println("User Clicked on Accept and Continue");
		boolean linked = getAndroidDriver().findElement(By.xpath("//*[@text='Finally link OnLoop to Slack']")).isDisplayed();
		System.out.println("Slack acc is linked " + linked);
	}

	public void displaySlackLinkDetails() throws MalformedURLException {
		//after clicking on make capture in slack, it shows slack is linked(code_below)

		boolean Display = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc=\"Slack is linked!\"]")).isDisplayed();
		System.out.println("Slack Page is Displayed :" + Display);
		applyWaitForElement(By.xpath("(//*[@class='android.view.View'])[6]"), 10);
		Assert.assertTrue(getAndroidDriver().findElement(By.xpath("(//*[@class='android.view.View'])[6]")).isDisplayed());
		System.out.println("Slack Page is Displayed");
	}

	public void clickOnFollowUs() throws MalformedURLException {
		applyWaitForElement(followUs,20);
		getAndroidDriver().findElement(followUs).click();
		System.out.println("User Clicked on Follow Us on Twitter Menu");
	}
	public void tapOnTwitterURL() throws MalformedURLException {
		applyWaitForElement(twitterUrl,30);
		status=getAndroidDriver().findElement(twitterUrl).isDisplayed();
				if(status){
					System.out.println("User is on Twitter Mobile Site");
					applyWaitForElement(followUsTwitter,40);
					getAndroidDriver().findElement(followUsTwitter).click();
					System.out.println("User Clicked on Follow Button");
				}
				else {
					System.out.println("User is not Redirected to Twitter Mobile Site");
				}
		Assert.assertTrue(status);
		Assert.assertAll();
	}

	public void tapOnGooglePlay() throws MalformedURLException {
		applyWaitForElement(googlePlay,20);
		status=getAndroidDriver().findElement(googlePlay).isDisplayed();
		if(status) {
			System.out.println("User is Redirected to Google Play Store");
		}
		else {
			System.out.println("User is Not Redirected to Google Play Store");
		}
		Assert.assertTrue(status);
		Assert.assertAll();
	}

	public void clickOnSupportGrowth() throws MalformedURLException {
		applyWaitForElement(supportOurGrowth,20);
		getAndroidDriver().findElement(supportOurGrowth).click();
		System.out.println("User Clicked on Support Our Growth");
	}
}
