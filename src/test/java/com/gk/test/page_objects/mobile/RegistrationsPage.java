package com.gk.test.page_objects.mobile;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.gk.test.framework.AndroidObject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.net.MalformedURLException;


public class RegistrationsPage extends AndroidObject {
	SoftAssert Assert = new SoftAssert();
	boolean status;


	public RegistrationsPage() {

		PageFactory.initElements(new AppiumFieldDecorator(getAndroidDriver()), this);
	}

	static private final By allowButton = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
	static private final By GetStartedButton = MobileBy.AccessibilityId("Get Started");
	static private final By continueBtn = MobileBy.AccessibilityId("Continue");
	static private final By teams = By.xpath("//android.widget.ImageView[@content-desc=\"Team\"]");
	static private final By addAnotherAc = By.xpath("//*[@text='Add another account']");
	static private final By email = By.className("android.widget.EditText");
	static private final By emailNextBtn = By.xpath("//*[@text='Next']");
	static private final By Password = By.className("android.widget.EditText");
	static private final By skipNumber = By.xpath("//*[@text='Skip']");
	static private final By passNextBtn = By.className("android.widget.Button");
	static private final By iAgree = By.xpath("//*[@text='I agree']");
	static private final By firstGoal = By.xpath("//android.view.View[contains(@content-desc,'Capture your first Goal')]");
	static private final By firstCapture =By.xpath("//android.view.View[contains(@content-desc,'Make your first Capture')]");
	static private final By closeGoalCapture = By.xpath("(//*[@class='android.widget.ImageView'])[1]");
	static private final By signInWithGoogle = By.xpath("//android.widget.ImageView[@content-desc=\"Sign in with Google\"]");
	static private final By ManagerAccount1 = By.xpath("//*[@text='Mayur Rawal']");
	static private final By Home = By.xpath("//android.widget.ImageView[@content-desc=\"Home\"]");
	static private final By onLoop = MobileBy.xpath("(//*[@class='android.widget.ImageView'])[2]");
	static private final By profileName = By.xpath("//*[@content-desc='Private by default']");
	

	static private final By referralCodeScreen = By.xpath("//android.view.View[@content-desc=\"Enter a referral code\"]");
	static private final By referralCode = By.className("android.widget.EditText");
	static private final By dontHaveCode = By.xpath("//android.view.View[@content-desc=\"I don't have a code\"]");
	static private final By joinWaitList = By.xpath("//android.view.View[@content-desc=\"Join the Waitlist\"]/android.widget.TextView");
	static private final By signUpWithEmail = By.xpath("(//*[@class='android.view.View'])[5]");
	static private final By enterName = By .xpath("(//*[@class='android.widget.EditText'])[1]");
	static private final By enterLastName = By.xpath("(//*[@class='android.widget.EditText'])[2]");
	static private final By enterWorkEmail = By.xpath("(//*[@class='android.widget.EditText'])[3]");
	static private final By EnterCompany = By.xpath("(//*[@class='android.widget.EditText'])[4]");
	static private final By getAccess = By.xpath("(//*[@text='GET ACCESS'])");
	static private final By waitlistSpot = By.xpath("(//*[@class='android.widget.TextView'])[8]");


	public static  By gotIt = By.xpath("//android.widget.Button[@content-desc=\"Got it!\"]");
	static private final By mySelfBtn = By.xpath("//android.widget.ImageView[@content-desc=\"Myself\"]");
	static private final By mySelfScreen = By.xpath("//android.view.View[@content-desc=\"Myself\"]");
	static private final By editMySelf = By.xpath("(//*[@class='android.widget.ImageView'])[1]");
	static private final By editMyProfile = By.xpath("//android.view.View[@content-desc=\"Edit My Profile\"]");
	static private final By editMyManager = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
	static private final By selectMangerScreen = By.xpath("//android.view.View[@content-desc=\"Select manager\"]");
	static private final By whoIsManager = By.xpath("//android.view.View[contains(@content-desc,'Search for your manager')]");
	static private final By searchManager = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
	static private final By selectSearchedManager = By.xpath("(//*[@class='android.view.View'])[10]");
	static private final By MemberAccount = By.xpath("//*[contains(@text,'Azar')]");
	static private final By companyEmailTxt = By.xpath("//android.view.View[contains(@content-desc,'Verify your company email')]");
	static private final By verifyMailedCode = By.className("android.widget.EditText");
	static private final By verifyCodeTxt = By.xpath("//android.view.View[contains(@content-desc,'Doing this will help')]");
	static private final By companyEmailId = By.className("android.widget.EditText");
	static private final By sendEmail = By.xpath("//android.widget.Button[@content-desc=\"Send email\"]");
	static private final By aboutYourScreen = By.xpath("//android.view.View[@content-desc=\"About you\"]");
	static private final By yourNameTxt = By.xpath("//android.view.View[@content-desc=\"What is your name?\"]");
	static private final By addNameTxt = MobileBy.AccessibilityId("Please add your first and last name");
	static private final By nameTxtBx = By.xpath("android.widget.EditText");
	static private final By nameNextBtn = By.xpath("android.widget.Button");
	static private final By managePeopleTxt = By.xpath("//android.view.View[@content-desc=\"Do you manage people?\"]");
	static private final By manageYes = By.xpath("//android.widget.ImageView[contains(@content-desc,'Yes, I do')]");
	static private final By manageNo = By.xpath("//android.widget.ImageView[contains(@content-desc,'Not right now')]");
	static private final By manageNextBtn = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");
	static private final By whosManagerTxt = By.xpath("//android.view.View[@content-desc=\"Who is your manager?\"]");
	static private final By whosManagerContent = By.xpath("//android.view.View[contains(@content-desc,'already in OnLoop')]");
	static private final By searchManagerTxtBx =By.xpath("//*[contains(@text,'Search by name')]");
	static private final By dontHaveManager = By.xpath("//android.view.View[@content-desc=\"I don't have a manager\"]");
	static private final By selectManager = By.xpath("(//*[contains(@text,'Search by name')]//following::android.view.View)[3]");
	static private final By buildingHabitScreen = By.xpath("//android.view.View[@content-desc=\"Building the habit\"]");
	static private final By buildingHabitPageTxt = By.xpath("//android.view.View[@content-desc=\"You're on your way to making a difference with your team!\"]");
	static private final By imReadyBtn = By.xpath("//android.widget.Button[@content-desc=\"I'm ready!\"]");
	static private final By skipBtn = By.xpath("//android.widget.Button[@content-desc=\"Skip\"]");
	static private final By customReminderScreen = By.xpath("//android.view.View[@content-desc=\"Custom Reminder\"]");
	static private final By objectiveList = By.xpath("//android.widget.ImageView[@content-desc=\"Select an objective\"]");
	static private final By selectObjective = By.xpath("//android.view.View[@content-desc=\"Empower and develop my Team\"]");
	static private final By selectDaysTxt = By.xpath("//android.view.View[@content-desc=\"on these days...\"]");
	static private final By S = By.xpath("(//android.view.View[@content-desc=\"S\"])[1]");
	static private final By M = By.xpath("(//android.view.View[@content-desc=\"M\"])");
	static private final By T = By.xpath("(//android.view.View[@content-desc=\"T\"])[1]");
	static private final By W = By.xpath("(//android.view.View[@content-desc=\"W\"])");
	static private final By T1 = By.xpath("(//android.view.View[@content-desc=\"T\"])[2]");
	static private final By F = By.xpath("(//android.view.View[@content-desc=\"F\"])");
	static private final By S1 = By.xpath("(//android.view.View[@content-desc=\"S\"])[2]");
	static private final By ReminderTxt = By.xpath("//android.view.View[@content-desc=\"I want to be reminded in the...\"]");
	static private final By morning = By.xpath("//android.widget.ImageView[contains(@content-desc,'Morning')]");
	static private final By afternoon = By.xpath("//android.widget.ImageView[contains(@content-desc,'Afternoon')]");
	static private final By evening = By.xpath("//android.widget.ImageView[contains(@content-desc,'Evening')]");
	static private final By selectTimeScreen = By.xpath("//android.view.View[contains(@content-desc,'Select a time')]");
	static private final By selectTime = By.xpath("(//*[@class='android.view.View'])[14]");
	static private final By saveTimeBtn = By.xpath("//android.widget.Button[@content-desc=\"Save\"]");
	static private final By saveCustomReminderBtn = By.xpath("//android.widget.Button[@content-desc=\"Save\"]");
	static private final By getConnectedScreen = By.xpath("//android.view.View[@content-desc=\"Get Connected\"]");
	static private final By inviteText = By.xpath("//android.view.View[contains(@content-desc,'Invite your colleagues')]");
	static private final By shareLinkExternally = By.xpath("//android.widget.ImageView[@content-desc=\"Share link externally\"]");
	static private final By linkCopied = By.xpath("(//*[@resource-id='android:id/icon'])[4]");
	static private final By connectedContinueBtn = By.className("android.widget.Button");


	static private final By teamScreen = By.xpath("//android.view.View[@content-desc=\"Team\"]");
	static private final By myDirects = By.xpath("//*[contains(@content-desc,'My Directs')]");
	static private final By myDirectsScreen = By .xpath("//android.view.View[@content-desc=\"My Directs\"]");
	static private final By myDirectsSettings = By.xpath("(//*[@class=\"android.widget.ImageView\"])[2]");
	static private final By teamSettingScreen = By.xpath("//android.view.View[@content-desc=\"Team Settings\"]");
	static private final By youAreOwnerText = By.xpath("//android.view.View[contains(@content-desc,'Only you can')]");
	static private final By nameLogo = By.className("android.widget.ScrollView");

	static private final By wellnessClose = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
	static private final By wellnessIntro = By.xpath("//android.view.View[@content-desc=\"INTRODUCTION\"]");

	static public final By yourFeelingScreen = By.xpath("//android.view.View[@content-desc=\"How are you feeling right now?\"]");
	static private final By shareWellnessContent = By.xpath("//android.view.View[contains(@content-desc,'Share your Wellness')]");
	static private final By feelings = By.xpath("(//android.widget.ImageView)[2]");
	static private final By checkInLater = By.xpath("//android.widget.ImageView[@content-desc=\"Check-in Later\"]");


	public void clickOnAllowBtn() throws MalformedURLException, InterruptedException {

		//Boolean isPresent;
//		if (getAndroidDriver().findElements(allowButton).size() > 0) {
			applyWaitForElement(allowButton, 15);
			getAndroidDriver().findElement(allowButton).click();
			System.out.println("Clicked on Allow Access for Media and Photos");
			Thread.sleep(3000);

//		} else {
//			System.out.println("Access Permission Already Allowed ");
//		}
	}

	public void clickOnGetStartedBtn() throws MalformedURLException {
		applyWaitForElement(GetStartedButton, 10);
		getAndroidDriver().findElement(GetStartedButton).click();
	}

	public void clickOnContinueBtn() throws MalformedURLException {
		applyWaitForElement(continueBtn, 20);
		getAndroidDriver().findElement(continueBtn).click();
	}

	public void clickOnSigninWithGoogle() throws MalformedURLException {
		applyWaitForElement(signInWithGoogle, 20);
		getAndroidDriver().findElement(signInWithGoogle).click();
	}

	public void clickOnAddAnotherAc() throws MalformedURLException {
		applyWaitForElement(addAnotherAc, 20);
		getAndroidDriver().findElement(addAnotherAc).click();
	}

	public void clickOnEmail() throws MalformedURLException {
		applyWaitForElement(email, 25);
		getAndroidDriver().findElement(email).click();
		getAndroidDriver().findElement(email).sendKeys("mayur.rawal@vtestcorp.com");

	}

	public void clickEmail(String name) throws MalformedURLException {
		applyWaitForElement(email, 25);
		getAndroidDriver().findElement(email).click();
		getAndroidDriver().findElement(email).sendKeys(name);

	}

	public void clickOnNxt() throws MalformedURLException {
		applyWaitForElement(emailNextBtn, 10);
		getAndroidDriver().findElement(emailNextBtn).click();
		System.out.println("Clicked on Next Button");

	}

	public void ClickOnPassword() throws MalformedURLException {
		applyWaitForElement(Password, 10);
		getAndroidDriver().findElement(Password).click();
		getAndroidDriver().findElement(Password).sendKeys("Onloop@123");
	}

	public void ClickPassword(String password) throws MalformedURLException {
		applyWaitForElement(Password, 10);
		getAndroidDriver().findElement(Password).click();
		getAndroidDriver().findElement(Password).sendKeys(password);
	}

	public void clickOnNxtForPassword() throws MalformedURLException, InterruptedException {
		applyWaitForElement(passNextBtn, 10);
		getAndroidDriver().findElement(passNextBtn).click();
		System.out.println("Clicked on Next Button");
		Thread.sleep(3000);
//		applyWaitForElement(skipBtn,10);
		if(getAndroidDriver().findElements(skipNumber).size() > 0){
			getAndroidDriver().findElement(skipNumber).click();
			System.out.println("Clicked on Skip");

		}
		else {
			applyWaitForElement(iAgree, 10);
			getAndroidDriver().findElement(iAgree).click();
			System.out.println("Clicked on I Agree");
		}

	}

	public void clickOnFirstGoal() throws MalformedURLException {
		applyWaitForElement(firstGoal, 10);
		getAndroidDriver().findElement(firstGoal).click();
		applyWaitForElement(closeGoalCapture, 10);
		getAndroidDriver().findElement(closeGoalCapture).click();
	}

	public void tapOnHowAreYouFeeling(String values) throws MalformedURLException {
		applyWaitForElement(yourFeelingScreen,20);
		String value=getAndroidDriver().findElement(yourFeelingScreen).getAttribute("content-desc");
		applyWaitForElement(shareWellnessContent,20);
		String content=getAndroidDriver().findElement(shareWellnessContent).getAttribute("content-desc");
		System.out.println(value+"\n"+content);
		applyWaitForElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'"+values+"')]"),30);
		String todaysFeeling = getAndroidDriver().findElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'"+values+"')]")).getAttribute("content-desc");
		getAndroidDriver().findElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'"+values+"')]")).click();
		System.out.println("Todays Feeling:"+todaysFeeling);
	}

	public void clickOnCheckInLater() throws MalformedURLException {
		applyWaitForElement(checkInLater,20);
		getAndroidDriver().findElement(checkInLater).click();
		System.out.println("User Clicked on Check in Later");

	}

	public void homepageDisplayd() throws MalformedURLException, InterruptedException {
		Thread.sleep(5000);
		if (getAndroidDriver().findElements(firstCapture).size() > 0) {
			Thread.sleep(2000);
			getAndroidDriver().findElement(firstCapture).click();
			Thread.sleep(2000);
			getAndroidDriver().findElement(closeGoalCapture).click();
			System.out.println("User SignUp successfully");
			Thread.sleep(2000);
		}
		else if (getAndroidDriver().findElements(firstGoal).size() > 0) {
				getAndroidDriver().findElement(firstGoal).click();
				Thread.sleep(2000);
				getAndroidDriver().findElement(closeGoalCapture).click();
				System.out.println("User SignUp successfully");
				Thread.sleep(4000);
		}
		else if (getAndroidDriver().findElements(onLoop).size() > 0) {
				System.out.println("User Login successfully on OnLoop & Its on Home Page!");
		}
//
//		else {
//			System.out.println("User is Not able to Login on Onloop!");
//		}
		Thread.sleep(2000);
			applyWaitForElement(profileName, 20);
			String name = getAndroidDriver().findElement(profileName).getAttribute("content-desc");
			System.out.println("Profile:" + name);

	}


	public void ReferralCodeScreen() throws MalformedURLException {
		applyWaitForElement(referralCodeScreen, 10);
		status = getAndroidDriver().findElements(referralCodeScreen).isEmpty();
		if (!status) {
			System.out.println("User is on referral code screen");
		} else {
			System.out.println("User Not on referral code screen");
		}
		Assert.assertFalse(status);
		Assert.assertAll();
	}

	public void enterReferralCode() throws MalformedURLException {
		applyWaitForElement(referralCode, 10);
		getAndroidDriver().findElement(referralCode).click();
		getAndroidDriver().findElement(referralCode).sendKeys("TESTR");
		System.out.println("User has Entered Referral Code");
	}
	public void ClickDontHaveReferral() throws MalformedURLException {
		applyWaitForElement(dontHaveCode,10);
		getAndroidDriver().findElement(dontHaveCode).click();
	}
	public void clickOnWaitlist() throws MalformedURLException {
		applyWaitForElement(joinWaitList,10);
		getAndroidDriver().findElement(joinWaitList).click();
	}
	public void clickSignupWithEmail() throws MalformedURLException {
		applyWaitForElement(signUpWithEmail,10);
		getAndroidDriver().findElement(signUpWithEmail).click();
	}
	public void enterSignupDetails() throws MalformedURLException {
		applyWaitForElement(enterName, 10);
		getAndroidDriver().findElement(enterName).click();
		getAndroidDriver().getKeyboard().sendKeys("Azzy");
		applyWaitForElement(enterLastName, 10);
		getAndroidDriver().findElement(enterLastName).click();
		getAndroidDriver().getKeyboard().sendKeys("syed");
		applyWaitForElement(enterWorkEmail, 10);
		getAndroidDriver().findElement(enterWorkEmail).click();
		getAndroidDriver().getKeyboard().sendKeys("aza@vestcorp.com");
		applyWaitForElement(EnterCompany, 10);
		getAndroidDriver().findElement(EnterCompany).click();
		getAndroidDriver().getKeyboard().sendKeys("VTEST");
		getAndroidDriver().hideKeyboard();
	}
	public void clickOnGetAccessBtn() throws MalformedURLException {
		applyWaitForElement(getAccess,20);
		getAndroidDriver().findElement(getAccess).click();

	}
	@SuppressWarnings("CommentedOutCode")
	public void waitlistSpot() throws MalformedURLException {
		applyWaitForElement(waitlistSpot,20);
		//String value=getAndroidDriver().findElement(waitlistSpot).getText();
		//System.out.println("Your current spot on the Waitlist:"+value);

	}
	public void EnterCompanyEmailId(String email) throws MalformedURLException {
		applyWaitForElement(companyEmailTxt,20);
		String value=getAndroidDriver().findElement(companyEmailTxt).getAttribute("content-desc");
		System.out.println("Enter your Company Email:"+"\n"+value);
		applyWaitForElement(companyEmailId,10);
		getAndroidDriver().findElement(companyEmailId).sendKeys(email);
		applyWaitForElement(sendEmail,30);
		getAndroidDriver().findElement(sendEmail).click();
		System.out.println("User has Entered Company Email");
	}
	public void EnterEmailedCode(String code) throws MalformedURLException {
		applyWaitForElement(verifyCodeTxt,20);
		String value = getAndroidDriver().findElement(verifyCodeTxt).getAttribute("content-desc");
		System.out.println("Verify where you work:"+"\n"+value);
		applyWaitForElement(verifyMailedCode, 10);
		getAndroidDriver().findElement(verifyMailedCode).clear();
		getAndroidDriver().findElement(verifyMailedCode).sendKeys(code);
		System.out.println("User has Entered Security Code");
	}
	public void enterProfileName(String profileName) throws MalformedURLException {
		applyWaitForElement(yourNameTxt,10);
		String Content = getAndroidDriver().findElement(yourNameTxt).getAttribute("content-desc");
		String value = getAndroidDriver().findElement(addNameTxt).getAttribute("content-desc");
		System.out.println(Content+"\n"+value);
		applyWaitForElement(nameTxtBx,10);
		getAndroidDriver().findElement(nameTxtBx).sendKeys(profileName);
		applyWaitForElement(nameNextBtn,30);
		getAndroidDriver().findElement(nameNextBtn).click();
		System.out.println("User has Entered Profile Name and Clicked on Next");

	}
	public void clickManagePeopleYes() throws MalformedURLException {
		applyWaitForElement(managePeopleTxt,10);
		String value=getAndroidDriver().findElement(managePeopleTxt).getAttribute("content-desc");
		System.out.println(value);
		applyWaitForElement(manageYes,10);
		String text=getAndroidDriver().findElement(manageYes).getAttribute("content-desc");
		System.out.println(text);
		getAndroidDriver().findElement(manageYes).click();
	}
	public void clickManagePeopleNo() throws MalformedURLException {
		String value=getAndroidDriver().findElement(managePeopleTxt).getAttribute("content-desc");
		System.out.println(value);
		applyWaitForElement(manageNo,10);
		String text=getAndroidDriver().findElement(manageNo).getAttribute("content-desc");
		System.out.println(text);
		getAndroidDriver().findElement(manageNo).click();
	}

	public void clickManageNextBtn() throws MalformedURLException {
		applyWaitForElement(manageNextBtn,10);
		getAndroidDriver().findElement(manageNextBtn).click();
	}
	public void searchManagerName(String manager) throws MalformedURLException {
		applyWaitForElement(whosManagerTxt,10);
		String text=getAndroidDriver().findElement(whosManagerTxt).getAttribute("content-desc");
		String value=getAndroidDriver().findElement(whosManagerContent).getAttribute("content-desc");
		System.out.println(text+"\n"+value);
		applyWaitForElement(searchManagerTxtBx,10);
		getAndroidDriver().findElement(searchManagerTxtBx).click();
		getAndroidDriver().findElement(searchManagerTxtBx).sendKeys(manager);
		applyWaitForElement(selectManager,20);
		getAndroidDriver().findElement(selectManager).click();
		System.out.println("User has searched and Selected his Manager");
	}
	public void clickDontHaveManager() throws MalformedURLException {
		applyWaitForElement(dontHaveManager,10);
		getAndroidDriver().findElement(dontHaveCode).click();
		System.out.println("User clicked on Don't Have a Manager");

	}
	public void TapOnBuildingHabitScreen() throws MalformedURLException {
		applyWaitForElement(buildingHabitScreen,10);
		if(getAndroidDriver().findElement(buildingHabitScreen).isDisplayed()){
			System.out.println("User is on Building Habit Page");
			applyWaitForElement(buildingHabitPageTxt,10);
			String value=getAndroidDriver().findElement(buildingHabitPageTxt).getAttribute("content-desc");
			System.out.println(value);

		}
		else{
			System.out.println("User is not on Building Habit Page");
		}
	}
	public void clickAmReadyBtn() throws MalformedURLException {
		applyWaitForElement(imReadyBtn,10);
		getAndroidDriver().findElement(imReadyBtn).click();
		System.out.println("User Clicked on I'm Ready! ");
	}
	public void clickSkipBtn() throws MalformedURLException {
		applyWaitForElement(skipBtn,10);
		getAndroidDriver().findElement(skipBtn).click();
		System.out.println("User Clicked on Skip");
	}
	public void TapOnCustomReminder() throws MalformedURLException {
//		applyWaitForElement(customReminderScreen, 10);
		if (getAndroidDriver().findElement(customReminderScreen).isDisplayed()) {
			System.out.println("User is on Custom Reminder Page");
		} else {
			System.out.println("User is not on Custom Reminder Page");
		}
		applyWaitForElement(objectiveList, 10);
		getAndroidDriver().findElement(objectiveList).click();
		System.out.println("User clicked on Object List");
		applyWaitForElement(selectObjective, 10);
		getAndroidDriver().findElement(selectObjective).click();
		System.out.println("User has Selected Objective From List");
	}
	public void ClickOnDays() throws MalformedURLException {
		applyWaitForElement(selectDaysTxt,15);
		String value=getAndroidDriver().findElement(selectDaysTxt).getAttribute("content-desc");
		System.out.println(value);

		applyWaitForElement(S, 10);
		getAndroidDriver().findElement(S).click();
		System.out.println("User has Selected Sunday");

		applyWaitForElement(M, 10);
		getAndroidDriver().findElement(M).click();
		System.out.println("User has Selected Monday");

		applyWaitForElement(T, 10);
		getAndroidDriver().findElement(T).click();
		System.out.println("User has Selected Tuesday");

		applyWaitForElement(W, 10);
		getAndroidDriver().findElement(W).click();
		System.out.println("User has Selected Wednesday");

		applyWaitForElement(T1, 10);
		getAndroidDriver().findElement(T1).click();
		System.out.println("User has Selected Thursday");

		applyWaitForElement(F, 10);
		getAndroidDriver().findElement(F).click();
		System.out.println("User has Selected Friday");

		applyWaitForElement(S1, 10);
		getAndroidDriver().findElement(S1).click();
		System.out.println("User has Selected Saturday");
	}
	public void clickOnMorning() throws MalformedURLException {
		applyWaitForElement(morning,10);
		getAndroidDriver().findElement(morning).click();
		applyWaitForElement(selectTimeScreen,30);
		String Text=getAndroidDriver().findElement(selectTimeScreen).getAttribute("content-desc");
		applyWaitForElement(selectTime,30);
		String value=getAndroidDriver().findElement(selectTime).getAttribute("content-desc");
		getAndroidDriver().findElement(selectTime).click();
		System.out.println("I Want to be Reminded in the"+"\n"+Text+":"+value);
		applyWaitForElement(saveTimeBtn,10);
		getAndroidDriver().findElement(saveTimeBtn).click();
		System.out.println("Clicked on Save Button");
	}
	public void clickOnAfterNoon() throws MalformedURLException {
		applyWaitForElement(afternoon,10);
		getAndroidDriver().findElement(afternoon).click();
		applyWaitForElement(selectTimeScreen,30);
		String Text=getAndroidDriver().findElement(selectTimeScreen).getAttribute("content-desc");
		String value=getAndroidDriver().findElement(selectTime).getAttribute("content-desc");
		getAndroidDriver().findElement(selectTime).click();
		System.out.println("I Want to be Reminded in the"+"\n"+Text+":"+value);
		applyWaitForElement(saveTimeBtn,10);
		getAndroidDriver().findElement(saveTimeBtn).click();
		System.out.println("Clicked on Save Button");
	}
	public void clickOnEvening() throws MalformedURLException {
		applyWaitForElement(evening,10);
		getAndroidDriver().findElement(evening).click();
		applyWaitForElement(selectTimeScreen,30);
		String Text=getAndroidDriver().findElement(selectTimeScreen).getAttribute("content-desc");
		String value=getAndroidDriver().findElement(selectTime).getAttribute("content-desc");
		getAndroidDriver().findElement(selectTime).click();
		System.out.println("I Want to be Reminded in the"+"\n"+Text+":"+value);
		applyWaitForElement(saveTimeBtn,10);
		getAndroidDriver().findElement(saveTimeBtn).click();
		System.out.println("Clicked on Save Button");
	}
	public void clickOnSaveReminderBtn() throws MalformedURLException {
		applyWaitForElement(saveCustomReminderBtn,10);
		getAndroidDriver().findElement(saveCustomReminderBtn).click();
		System.out.println("Clicked on Save Reminder Button");
	}
	public void getConnectedScreen() throws MalformedURLException {
		applyWaitForElement(getConnectedScreen,10);
		status=getAndroidDriver().findElement(getConnectedScreen).isDisplayed();
		if(status){
			String value=getAndroidDriver().findElement(inviteText).getAttribute("content-desc");
			System.out.println("User is on Get Connected Page"+"\n"+value);
		}
		else{
			System.out.println("User is not on Get Connected Page");
		}
	}
	public void clickShareLinkExternally() throws MalformedURLException {
		applyWaitForElement(shareLinkExternally,10);
		getAndroidDriver().findElement(shareLinkExternally).click();
		System.out.println("User Clicked on Share Link Externally");
		applyWaitForElement(linkCopied,20);
		getAndroidDriver().findElement(linkCopied).click();
		System.out.println("User Clicked on Copy the Link");

	}
	public void clickConnectedContinueBtn() throws MalformedURLException {
		applyWaitForElement(connectedContinueBtn,10);
		getAndroidDriver().findElement(connectedContinueBtn).click();
		System.out.println("User Clicked on Continue");
	}



	public void clickMembersAccount() throws MalformedURLException {
		applyWaitForElement(MemberAccount, 10);
		getAndroidDriver().findElement(MemberAccount).click();
	}


	public void clickOnMyself() throws MalformedURLException {
		applyWaitForElement(mySelfBtn, 10);
		getAndroidDriver().findElement(mySelfBtn).click();
	}

	public void clickGotIt() throws MalformedURLException {
		applyWaitForElement(gotIt, 10);
		getAndroidDriver().findElement(gotIt).click();
	}

	public void mySelfScreen() throws MalformedURLException {
		applyWaitForElement(mySelfScreen, 10);
		status = getAndroidDriver().findElement(mySelfScreen).isDisplayed();
		if (status) {
			System.out.println("User is on Myself Screen");
		} else {
			System.out.println("User is Not on Myself Screen");
		}
		Assert.assertTrue(status);
		Assert.assertAll();
	}

	public void clickEditMyself() throws MalformedURLException {
		applyWaitForElement(editMySelf, 10);
		getAndroidDriver().findElement(editMySelf).click();
	}

	public void editMyProfileScreen() {
		status = getAndroidDriver().findElement(editMyProfile).isDisplayed();
		if (status) {
			System.out.println("User is on Edit My Profile Screen");
		} else {
			System.out.println("User is Not on Edit My Profile");
		}
	}

	public void clickEditMyManager() throws MalformedURLException {
		applyWaitForElement(editMyManager, 10);
		getAndroidDriver().findElement(editMyManager).click();
	}

	public void TapOnSelectMangerScreen() {
		status = getAndroidDriver().findElement(selectMangerScreen).isDisplayed();
		if (status) {
			System.out.println("User is on Select Manager Screen");
			String value = getAndroidDriver().findElement(whoIsManager).getAttribute("content-desc");
			System.out.println("Who is your manager" + "\n" + value);
		} else {
			System.out.println("User is Not on Select Manager Screen");
		}

	}

	public void enterManagerName(String arg0) throws MalformedURLException {
		applyWaitForElement(searchManager, 10);
		getAndroidDriver().findElement(searchManager).sendKeys(arg0);
		applyWaitForElement(selectSearchedManager, 10);
		getAndroidDriver().findElement(selectSearchedManager).click();

	}
	public void clickOnTeam() throws MalformedURLException {

		applyWaitForElement(teams,10);
		getAndroidDriver().findElement(teams).click();
		applyWaitForElement(gotIt,10);
		getAndroidDriver().findElement(gotIt).click();
		System.out.println("User Clicked on Got It");
		applyWaitForElement(teamScreen,10);
		status=getAndroidDriver().findElement(teamScreen).isDisplayed();
		if(status){
			System.out.println("User is on Team Screen");
		}
		else{
			System.out.println("User is Not on Team Screen");
		}
		Assert.assertTrue(status);
		Assert.assertAll();


	}
	public void clickMyDirects() throws MalformedURLException {
		applyWaitForElement(myDirects,10);
		getAndroidDriver().findElement(myDirects).click();
		applyWaitForElement(myDirectsScreen,10);
		status=getAndroidDriver().findElement(myDirectsScreen).isDisplayed();
		if(status){
			System.out.println("User is on My Direct Screen");
		}
		else {
			System.out.println("User is Not on My Direct Screen");
		}

	}
	public void clickMyDirectSettings() throws MalformedURLException {
		applyWaitForElement(myDirectsSettings,10);
		getAndroidDriver().findElement(myDirectsSettings).click();
		applyWaitForElement(teamSettingScreen,10);
		status=getAndroidDriver().findElement(teamSettingScreen).isDisplayed();
		if(status){
			System.out.println("User is on Team Settings Screen");
			String value=getAndroidDriver().findElement(youAreOwnerText).getAttribute("content-desc");
			System.out.println("You're the Owner of My Direct:"+"\n"+value);
		}
		else{
			System.out.println("User is Not on Team Settings Screen");
		}

	}
}

