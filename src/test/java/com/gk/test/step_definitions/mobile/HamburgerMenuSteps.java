package com.gk.test.step_definitions.mobile;

import java.net.MalformedURLException;

import com.gk.test.framework.AndroidObject;
import com.gk.test.page_objects.mobile.HamburgerMenuPage;
import com.gk.test.page_objects.mobile.LoginPage;
import com.gk.test.page_objects.mobile.Manager_HomePage;
import com.gk.test.page_objects.mobile.RegistrationsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HamburgerMenuSteps extends AndroidObject {

    private final HamburgerMenuPage Humburger;
    private final RegistrationsPage registrations;
//	private final LoginPage login;
//	private final Manager_HomePage manHome;

    public HamburgerMenuSteps(HamburgerMenuPage humburgerMenu, RegistrationsPage registration, LoginPage login, Manager_HomePage manHome) {
        this.Humburger = humburgerMenu;
        this.registrations = registration;
//		this.login = login;
//		this.manHome = manHome;

    }


    @When("user click on hamburger menu icon")
    public void user_click_on_hamburger_menu_icon() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        Humburger.ClickOnHamburgerMenuMenu();

    }

    @When("user click on invite to my org magic link")
    public void user_click_on_invite_to_my_org_magic_link() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        Humburger.clickOnInviteToMyOrg();

    }

    @Then("user should be able to invite team members through external sharing source in the organization")
    public void user_should_be_able_to_invite_team_members_through_external_sharing_source_in_the_organization()
            throws MalformedURLException, InterruptedException {
        Thread.sleep(5000);
        Humburger.visibilityOfSharingOptions();
    }

    @And("user tap on \"Recommend OnLoop\"")
    public void userTapOnRecommendOnLoop() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        Humburger.clickOnRecommendOnloop();
    }

    @Then("user should be able to invite team members through external sharing source for application download")
    public void userShouldBeAbleToInviteTeamMembersThroughExternalSharingSourceForApplicationDownload() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        Humburger.visibilityOfDownloadOptions();

    }

    @And("user tap on \"Prism summaries\"")
    public void userTapOnPrismSummaries() throws MalformedURLException, InterruptedException {
        Thread.sleep(4000);
        Humburger.user_tap_on_Prism_summaries();
    }

    @Then("user should be able redirected to create Prism Summary page{string}")
    public void user_should_be_able_redirected_to_create_Prism_Summary_page(String colleague) throws MalformedURLException, InterruptedException {
        Thread.sleep(4000);
        Humburger.user_should_be_able_redirected_to_create_Prism_Summary_page();
        Thread.sleep(2000);
        Humburger.clickOnColleagueSearchTxtBx(colleague);
        Thread.sleep(4000);
        Humburger.clickOnGeneratePrismSummaryBtn();
        Thread.sleep(4000);
    }

    @And("user tap on \"Custom Reminder\"")
    public void userTapOnCustomReminder() throws MalformedURLException {
        Humburger.userTapOnCustomReminder();
    }

    @And("user set the reminder")
    public void userSetTheReminder() throws MalformedURLException, InterruptedException {
        Humburger.userSetTheReminder();
    }

    @Then("user should be able save the Custom Reminders")
    public void userShouldBeAbleSaveTheCustomReminders() throws MalformedURLException {
        Humburger.userShouldBeAbleSaveTheCustomReminders();
    }


    @Then("user should be able to click on \"Feature Request\"")
    public void userShouldBeAbleToClickOnFeatureRequest() throws MalformedURLException {
        Humburger.clickOnFeatureRequest();
    }

    @And("user should be able to select {string}Report a bug or Suggest an improvement or Ask a question")
    public void userShouldBeAbleToSelectOptionsReportABugOrSuggestAnImprovementOrAskAQuestion(String value) throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        Humburger.clickOnStartNow();
        Thread.sleep(2000);
        Humburger.needHelpOptions(value);
        Thread.sleep(4000);
    }

    @And("user tap on \"How to use onloop?\"")
    public void userTapOnHowToUseOnloop() throws MalformedURLException {
        Humburger.userTapOnHowToUseOnloop();
    }

    @Then("user should be able redirected to \"Feedback And reflection page\"")
    public void userShouldBeAbleRedirectedToFeedbackAndReflectionPage() throws MalformedURLException {
        Humburger.userShouldBeAbleRedirectedToFeedbackAndReflectionPage();
    }


    @Then("user should be able to click on \"Resource Center\" to redirect to view information about Onloop features")
    public void userShouldBeAbleToClickOnResourceCenterToRedirectToViewInformationAboutOnloopFeatures() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        Humburger.clickOnResourceCenter();
        Thread.sleep(4000);
        Humburger.tapOnResourceCenterBrowserSite();
        Thread.sleep(4000);
        Humburger.resourceCenterMenus();
    }

    @And("user tap on \"Make captures in slack\"")
    public void userTapOnMakeCapturesInSlack() throws MalformedURLException {
        Humburger.userTapOnMakeCapturesInSlack();
    }

    @Then("user should be able to link onloop application profile with Slack")
    public void userShouldBeAbleToLinkOnloopApplicationProfileWithSlack() throws MalformedURLException, InterruptedException {
        Humburger.userShouldBeAbleToLinkOnloopApplicationProfileWithSlack();
        Thread.sleep(4000);
        Humburger.signInWorkSpaceScreen();
//		Thread.sleep(4000);
//		Humburger.slackHomePage();
//		Thread.sleep(4000);

    }


    @And("user tap on \"Follow us on twitter\"")
    public void userTapOnFollowUsOnTwitter() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        Humburger.clickOnFollowUs();
    }

    @Then("user should be able redirected to \"Twitter\" Site")
    public void userShouldBeAbleRedirectedToTwitterSite() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        Humburger.tapOnTwitterURL();
    }

    @And("user scrolls down the screen")
    public void userScrollsDownTheScreen() throws InterruptedException {
        Thread.sleep(2000);
        Humburger.swipe(0.2, 0.2, 0.2, 0.6);
        System.out.println("Scrolled Down");
    }

    @And("user tap on \"Support our growth\"")
    public void userTapOnSupportOurGrowth() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        Humburger.clickOnSupportGrowth();
    }

    @Then("user should be able redirected to Android or IOS app store")
    public void userShouldBeAbleRedirectedToAndroidOrIOSAppStore() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        Humburger.tapOnGooglePlay();
    }

    @And("user is updating his {string}")
    public void userIsUpdatingHisFeelings(String feeling) throws InterruptedException, MalformedURLException {
        Thread.sleep(8000);
        registrations.tapOnHowAreYouFeeling(feeling);
    }



}