package com.gk.test.step_definitions.mobile;

import java.net.MalformedURLException;

import com.gk.test.framework.AndroidObject;
import com.gk.test.page_objects.mobile.LoginPage;
import com.gk.test.page_objects.mobile.RegistrationsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationsSteps extends AndroidObject {

	private final RegistrationsPage registrationsPage;
	private final LoginPage loggin;

	public RegistrationsSteps(RegistrationsPage regis,LoginPage log) {
		this.registrationsPage = regis;
		this.loggin = log;
	}

	@Given("^app should be installed$")
	public void appShouldBeInstalled() throws InterruptedException {
		System.out.println("OnLoop is Installed");
		Thread.sleep(10);
	}

	@When("^user click on app$")
	public void userClickOnApp() throws MalformedURLException, InterruptedException {
		System.out.println("User clicked on OnLoop ");
		registrationsPage.clickOnAllowBtn();
		Thread.sleep(3000);
		registrationsPage.clickOnGetStartedBtn();
		System.out.println("Clicked on Get Started");
		Thread.sleep(2000);

	}
	@And("^swipe Left$")
	public void swipe_Left() throws InterruptedException, MalformedURLException {
		System.out.println("Swipe the Intro Screens");
		registrationsPage.swipe(0.2,0.2,0.5,0.2);
		registrationsPage.swipe(0.2,0.2,0.5,0.2);
		registrationsPage.swipe(0.2,0.2,0.5,0.2);
		registrationsPage.swipe(0.2,0.2,0.5,0.2);
		Thread.sleep(1000);
		System.out.println("Swiped successfully");
		registrationsPage.clickOnContinueBtn();
		System.out.println("Clicked on Continue Button");
		Thread.sleep(3000);
	}

	@And("^Click on Continue Button$")

	public void Click_on_Continue_Button() throws InterruptedException, MalformedURLException {
		registrationsPage.clickOnContinueBtn();
		System.out.println("Clicked on Continue button");
		Thread.sleep(3000);
	}
	@And("Click on Sign in with Google")
	public void clickOnSignInWithGoogle() throws  MalformedURLException {
		registrationsPage.clickOnSigninWithGoogle();
		System.out.println("Clicked on Sign with Google");

	}

	@And("user clicked on don't have referral so redirected to waitlist")
	public void userClickedOnDontHaveReferralSoRedirectedToWaitlist() throws InterruptedException, MalformedURLException {
		Thread.sleep(3000);
		registrationsPage.ClickDontHaveReferral();
		System.out.println("Clicked on Don't have Referral and It will redirected to Onloop.com");
		Thread.sleep(6000);
		registrationsPage.clickOnWaitlist();
		System.out.println("Clicked on Join Waitlist");
		Thread.sleep(4000);
		registrationsPage.clickSignupWithEmail();
		System.out.println("Clicked on Signup with Email");
		Thread.sleep(3000);
		registrationsPage.enterSignupDetails();
		System.out.println("Entered All Required Signup Details");
		Thread.sleep(3000);
		registrationsPage.clickOnGetAccessBtn();
		System.out.println("Clicked on Clicked Get Access");
		Thread.sleep(7000);
	}
	@Then("User should be on waitlist.")
	public void userShouldBeOnWaitlist() throws InterruptedException, MalformedURLException {
		registrationsPage.waitlistSpot();
		System.out.println("User is on Waitlist screen");
		Thread.sleep(6000);
	}


	@When("^Choose an account$")
	public void choose_an_account() {
		System.out.println("Choose an User Account");

	}

	@Then("user should be able to SignUp successfully.")
	public void userShouldBeAbleToSignUpSuccessfully() throws MalformedURLException, InterruptedException {
		Thread.sleep(8000);
		registrationsPage.homepageDisplayd();
		Thread.sleep(3000);
		registrationsPage.clickOnFirstGoal();
		Thread.sleep(3000);
		loggin.ClickOnHumburgerMenu();
		System.out.println("clicked on Humburger Menu");
		Thread.sleep(3000);
		loggin.swipe(0.2,0.2,0.2,0.8);
		Thread.sleep(1000);
		loggin.ClickOnLogOut();
		System.out.println("clicked on Logout");
		Thread.sleep(6000);

	}

	@Given("user should already get the link")
	public void userShouldAlreadyGetTheLink() {
		System.out.println("User Already Clicked on Link");

	}

	@And("user installed app")
	public void userInstalledApp() throws MalformedURLException, InterruptedException {
		System.out.println("OnLoop already Installed");
		registrationsPage.clickOnAllowBtn();
////		System.out.println("Clicked on Allow Permission");
		Thread.sleep(3000);
		registrationsPage.clickOnGetStartedBtn();
		System.out.println("Clicked on Get Started");
		Thread.sleep(3000);
	}

	@And("user should be on referral code screen")
	public void userShouldBeOnReferralCodeScreen() throws MalformedURLException, InterruptedException {
		Thread.sleep(8000);
		registrationsPage.ReferralCodeScreen();
	}

	@When("user enter referral code")
	public void userEnterAsReferralCode() throws InterruptedException, MalformedURLException {
		Thread.sleep(3000);
		registrationsPage.enterReferralCode();

	}
	@And("user enter {string}")
	public void userEnterCompanyEmail(String email)throws InterruptedException, MalformedURLException  {
		Thread.sleep(6000);
		registrationsPage.EnterCompanyEmailId(email);
		Thread.sleep(2000);
	}
	@And("user enter {string} and {string}")
	public void userEnterEmailCodeAndProfileName(String code,String profileName) throws InterruptedException, MalformedURLException {
		Thread.sleep(4000);
		registrationsPage.EnterEmailedCode(code);
		Thread.sleep(4000);
		registrationsPage.enterProfileName(profileName);
		Thread.sleep(4000);

	}
	@And("user search and select his {string}")
	public void userSearchAndSelectHisManager(String manager) throws InterruptedException, MalformedURLException {
		Thread.sleep(4000);
		registrationsPage.searchManagerName(manager);
	}
	@And("user click on don't have manager")
	public void userClickOnDontHaveManager() throws InterruptedException, MalformedURLException {
		Thread.sleep(4000);
		registrationsPage.clickDontHaveManager();
		Thread.sleep(5000);

	}

	@And("user select \"I do manage people\" on manager selection screen")
	public void userSelectIDoManagePeopleOnManagerSelectionScreen() throws MalformedURLException, InterruptedException {
		Thread.sleep(5000);
		registrationsPage.clickManagePeopleYes();
		Thread.sleep(3000);
		registrationsPage.clickManageNextBtn();
		System.out.println("User has clicked on Yes I Do");
		Thread.sleep(3000);
	}
	@And("user has to select option am ready for building habit and custom reminders")
	public void userHasToSelectOptionAnReadyForOfBuildingHabitAndCustomReminders() throws MalformedURLException, InterruptedException {
		Thread.sleep(8000);
		registrationsPage.TapOnBuildingHabitScreen();
		Thread.sleep(2000);
		registrationsPage.clickAmReadyBtn();
		Thread.sleep(4000);
		registrationsPage.TapOnCustomReminder();
		Thread.sleep(2000);
		registrationsPage.ClickOnDays();
		Thread.sleep(2000);
		registrationsPage.clickOnMorning();
		Thread.sleep(2000);
		registrationsPage.clickOnAfterNoon();
		Thread.sleep(2000);
		registrationsPage.clickOnEvening();
		Thread.sleep(2000);
		registrationsPage.clickOnSaveReminderBtn();
		Thread.sleep(4000);
		registrationsPage.getConnectedScreen();
		Thread.sleep(2000);
		registrationsPage.clickConnectedContinueBtn();
		Thread.sleep(4000);
	}
	@And("user skipped building habit screen")
	public void userSkippedBuildingHabitScreen() throws InterruptedException, MalformedURLException {
		Thread.sleep(4000);
		registrationsPage.clickSkipBtn();
		Thread.sleep(4000);
		registrationsPage.getConnectedScreen();
		Thread.sleep(2000);
		registrationsPage.clickShareLinkExternally();
		Thread.sleep(4000);
		registrationsPage.clickConnectedContinueBtn();
		Thread.sleep(4000);

	}

	@Then("user should be able to SignUp onloop as manager and logout successfully.")
	public void userShouldBeAbleToSignUpOnloopAsManagerAndLogoutSuccessfully() throws MalformedURLException, InterruptedException {
		Thread.sleep(8000);
		registrationsPage.homepageDisplayd();
		Thread.sleep(3000);
		loggin.ClickOnHumburgerMenu();
		System.out.println("clicked on Humburger Menu");
		Thread.sleep(3000);
		loggin.swipe(0.2,0.2,0.2,0.8);
		Thread.sleep(1000);
		loggin.ClickOnLogOut();
		System.out.println("clicked on Logout");
	}

	@And("click on add another account")
	public void clickOnAddAnotherAccount() throws MalformedURLException, InterruptedException {
		registrationsPage.clickOnSigninWithGoogle();
		System.out.println("User Clicked on Sign in with Google");
		Thread.sleep(2000);
		registrationsPage.clickOnAddAnotherAc();
		System.out.println("Clicked on Add Another Account");
		Thread.sleep(1000);
		
	}

	@And("enter {string} and {string}")
	public void enterUsernameAndPassword(String name, String password) throws MalformedURLException, InterruptedException {
		Thread.sleep(4000);
		registrationsPage.clickEmail(name);
		System.out.println("User Has Entered Username");
		Thread.sleep(2000);
		registrationsPage.clickOnNxt();
		System.out.println("Clicked on Next Button");
		Thread.sleep(2000);
		registrationsPage.ClickPassword(password);
		System.out.println("User Has Entered Password");
		Thread.sleep(1000);
		registrationsPage.clickOnNxtForPassword();
		//System.out.println("Clicked on Next Button");
	}

	@Given("user should be on select manager page")
	public void userShouldBeOnSelectManagerPage() throws MalformedURLException, InterruptedException {
		loggin.clickOnAllowBtn();
		System.out.println("User Clicked Allow Permission");
		Thread.sleep(3000);
		loggin.clickOnGetStartedBtn();
		System.out.println("User Clicked Get Stared");
		Thread.sleep(3000);
		System.out.println("Swipe the page");
		registrationsPage.swipe(0.2,0.2,0.5,0.2);
		registrationsPage.swipe(0.2,0.2,0.5,0.2);
		registrationsPage.swipe(0.2,0.2,0.5,0.2);
		registrationsPage.swipe(0.2,0.2,0.5,0.2);
		Thread.sleep(1000);
		System.out.println("Swiped successfully");
		registrationsPage.clickOnContinueBtn();
		System.out.println("Clicked on Continue Button");
		Thread.sleep(3000);
		loggin.clickOnSignInWithGoogle();
		System.out.println("User Clicked on Sign with Google");
		Thread.sleep(3000);
		registrationsPage.clickMembersAccount();
		System.out.println("User Clicked Member's Account");
		Thread.sleep(3000);
		registrationsPage.homepageDisplayd();
		Thread.sleep(3000);
		registrationsPage.clickOnMyself();
		System.out.println("User Clicked Myself");
		Thread.sleep(2000);
		registrationsPage.clickGotIt();
		System.out.println("Clicked on Got It");
		Thread.sleep(1000);
		registrationsPage.mySelfScreen();
		registrationsPage.clickEditMyself();
		System.out.println("User Clicked on Edit");
		Thread.sleep(2000);
		registrationsPage.editMyProfileScreen();
		Thread.sleep(1000);
		registrationsPage.clickEditMyManager();
		System.out.println("User Edited Add My Manager");
		Thread.sleep(2000);

	}

	@When("user search manager name {string} in search box")
	public void userSearchManagerNameInSearchBox(String value) throws MalformedURLException, InterruptedException {
		Thread.sleep(2000);
		registrationsPage.TapOnSelectMangerScreen();
		registrationsPage.enterManagerName(value);
		System.out.println("User Entered Manager Name");
		Thread.sleep(2000);


	}

	@Then("user should be able to select mayur as manager")
	public void userShouldBeAbleToSelectAsManager() {
		System.out.println("User Selected Mayur as Manager ");
	}

	@And("user select manager from myself screen")
	public void userSelectManagerFromMyselfScreen() throws MalformedURLException, InterruptedException {
		registrationsPage.homepageDisplayd();
		Thread.sleep(2000);
		registrationsPage.clickOnTeam();
		System.out.println("User Clicked on Team");
		Thread.sleep(2000);
		registrationsPage.clickMyDirects();
		System.out.println("User Clicked on My Directs");
		Thread.sleep(2000);

	}

	@Then("user should login as manager")
	public void userShouldLoginAsManager() throws MalformedURLException, InterruptedException {
		registrationsPage.clickMyDirectSettings();
		Thread.sleep(3000);
	}



}



