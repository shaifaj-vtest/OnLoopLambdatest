package com.gk.test.step_definitions.mobile;

import com.gk.test.framework.AndroidObject;
import com.gk.test.page_objects.mobile.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.jcip.annotations.ThreadSafe;

import java.net.MalformedURLException;

public class Manager_HomeSteps extends AndroidObject {

    private final RegistrationsPage registrations;
    private final LoginPage login;
    private final Manager_HomePage manHome;
    public final HamburgerMenuPage hamburger;

    public Manager_HomeSteps(RegistrationsPage regis, LoginPage log, Manager_HomePage ManHome, HamburgerMenuPage ham) {
        this.registrations = regis;
        this.login = log;
        this.manHome = ManHome;
        this.hamburger = ham;

    }


    @Given("user is logged in as manager")
    public void userIsLoggedInAsManager() throws MalformedURLException, InterruptedException {
        getAndroidDriver().resetApp();
        Thread.sleep(2000);
        registrations.clickOnAllowBtn();
        Thread.sleep(2000);
        registrations.clickOnGetStartedBtn();
        System.out.println("User Clicked Get Started");
        Thread.sleep(2000);
        System.out.println("Swipe the Intro Pages");
        registrations.swipe(0.2, 0.2, 0.5, 0.2);
        registrations.swipe(0.2, 0.2, 0.5, 0.2);
        registrations.swipe(0.2, 0.2, 0.5, 0.2);
        registrations.swipe(0.2, 0.2, 0.5, 0.2);
        Thread.sleep(1000);
        System.out.println("Swiped Successfully");
        registrations.clickOnContinueBtn();
        System.out.println("Clicked on Continue Button");
        Thread.sleep(2000);
        registrations.clickOnSigninWithGoogle();
        System.out.println("User Clicked on Sign with Google");
        Thread.sleep(2000);
        login.clickOnManagerAccount();
//        registrations.clickOnAddAnotherAc();
//        System.out.println("User Clicked on Add Another Account");
//        Thread.sleep(4000);
//        registrations.clickOnEmail();
//        System.out.println("User Entered Email Id");
//        Thread.sleep(2000);
//        registrations.clickOnNxt();
//        Thread.sleep(2000);
//        registrations.ClickOnPassword();
//        System.out.println("User Entered Password");
//        Thread.sleep(2000);
//        registrations.clickOnNxtForPassword();
        Thread.sleep(8000);
    }

    @When("user is on home page")
    public void userIsOnHomePage() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        registrations.homepageDisplayd();
        Thread.sleep(3000);
    }

    @Then("user should be able to see Total capture count")
    public void userShouldBeAbleToSeeTotalCaptureCount() throws MalformedURLException, InterruptedException {
        manHome.TapOnTotalCapture();
        Thread.sleep(3000);
    }


    @Given("user should be on home page")
    public void userShouldBeOnHomePage() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        registrations.homepageDisplayd();

    }

    @Then("captures should be listed down for all colleagues")
    public void capturesShouldBeListedDownForAllColleagues() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        manHome.TapOnCapturedColleagues();
        Thread.sleep(2000);
    }

    @And("user click on add colleague icon")
    public void userBeInAnAddColleaguePage() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        manHome.clickAddColleague();
        Thread.sleep(2000);

    }

    @When("user click on invite now button")
    public void userClickOnInviteNowButton() throws MalformedURLException, InterruptedException {
        manHome.clickInviteNow();
        System.out.println("User Clicked on Invite Now");
        Thread.sleep(2000);
    }

    @And("user add {string} into colleague name text box")
    public void userAddNameIntoColleagueNameTextBox(String arg0) throws InterruptedException {
        manHome.enterColleagueName(arg0);
        System.out.println("User Clicked and Entered Name of Colleague");
        Thread.sleep(2000);
    }

    @And("user add {string} into invited by text box")
    public void userAddIntoInvitedByTextBox(String arg1) throws MalformedURLException, InterruptedException {
        manHome.enterColleagueMailId(arg1);
        System.out.println("User Clicked and Entered Mail Id of Colleague");
        Thread.sleep(6000);
    }

    @And("click on send invite")
    public void clickOnSendInvite() throws MalformedURLException, InterruptedException {
        manHome.clickSendInviteButton();
        System.out.println("User Clicked on Send Invite Button");
        Thread.sleep(6000);
        if (getAndroidDriver().findElement(Manager_HomePage.inviteSentTxt).isDisplayed()) {
            manHome.tapOnInviteSentText();
        } else {
            manHome.clickSendInviteButton();
            System.out.println("User Clicked on Send Invite Button");
            Thread.sleep(6000);
            manHome.tapOnInviteSentText();
        }
        Thread.sleep(2000);
        manHome.clickMayBeLater();
        System.out.println("User Clicked Capture May be Later");
        Thread.sleep(2000);
        manHome.clickBackButton();
        Thread.sleep(4000);
    }

    @Then("user should be able to send request to two more colleagues")
    public void userShouldBeAbleToSendRequestTwoMoreColleague() throws InterruptedException {
        System.out.println("User Has Sent the Request to Colleague");
        Thread.sleep(2000);
    }

    @When("user click on add icon\\(Plus Sign)")
    public void userClickOnAddIconPlusSign() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickCaptureBtn();
        System.out.println("User clicked on Capture Button");
    }

    @Then("user should be able to redirected to capture page")
    public void userShouldBeAbleToRedirectedToCapturePage() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.tapOnCaptureThoughtScreen();

    }

    @When("user click on celebrate tab icon")
    public void user_click_on_celebrate_tab_icon() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        manHome.clickOnCelebrate();
        Thread.sleep(4000);
        manHome.searchColleague();
        System.out.println("User Clicked on Search Colleagues");
        Thread.sleep(3000);
        manHome.selectColleague();
        System.out.println("User Selected Colleagues");
        Thread.sleep(3000);

    }

    @And("user need to select and write compulsory tabs")
    public void userNeedToSelectAndWriteCompulsoryTabs() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        manHome.enterStoodOutComment();
        System.out.println("User has Entered Comments");
        Thread.sleep(3000);
        manHome.selectTagCategory();
        System.out.println("User has Selected Tag Category");
        Thread.sleep(3000);
        manHome.selectRelevantTags();
        System.out.println("User has Selected Relevant Tags");
        Thread.sleep(3000);
//        manHome.clickSavePrivatelyBtn();
//        System.out.println("User Clicked on Save Privately");
//        Thread.sleep(3000);
//        manHome.clickSharePrivatelyBtn();
//        System.out.println("User Clicked on Share Privately");
//        Thread.sleep(3000);
    }


    @Then("user should be able to capture celebrate for colleague")
    public void user_should_be_able_to_capture_celebrate_for_colleague() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.clickOnSaveButton();
        System.out.println("User Clicked Save Capture");
        Thread.sleep(3000);
    }


    @When("user click on search box")
    public void userClickOnSearchBox() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        manHome.clickOnSearchTxtBx();
        System.out.println("User Clicked on Search");

    }

    @And("user should be able to write any {string}")
    public void userShouldBeAbleToWriteAnyName(String colleague) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.selectSearchedName(colleague);
        System.out.println("User Selected Searched Name");

    }

    @Then("searched name profile should be displayed with organization")
    public void searchedNameProfileShouldBeDisplayedWithOrganization() throws InterruptedException, MalformedURLException {
        Thread.sleep(6000);
        manHome.tapOnProfileDetails();
        Thread.sleep(4000);
        manHome.clickBackButton();
        Thread.sleep(4000);

    }

    @When("user click on \"Create private colleague\"")
    public void userClickOnCreatePrivateColleague() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        manHome.clickCreatePrivateColleagueBtn();
    }

    @And("user add colleague {string} in text box")
    public void userAddColleagueInTextBox(String name) throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        manHome.TapOnCreateColleagueScreen(name);
        Thread.sleep(3000);
        manHome.clickOnCreatePvtColleague();
    }

    @Then("user should be added as private colleague and should be able to  click maybe later")
    public void userShouldBeAddedAsPrivateColleagueAndShouldBeAbleToClickMaybeLater() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        manHome.profileCreatedPopUp();
        Thread.sleep(2000);
        manHome.clickMayBeLater();
        Thread.sleep(4000);
        manHome.tapOnNewProfile();
        Thread.sleep(2000);
        manHome.clickBackButton();
        Thread.sleep(2000);
        System.out.println("User Redirected to Home Page");
        Thread.sleep(4000);
    }


    @And("user tap on \"filters\"")
    public void userTapOnFilters() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        manHome.clickOnFilters();
    }

    @And("user set criteria in filters {string}{string}{string}")
    public void userSetCriteriaInFilters(String from, String name, String sort) throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        manHome.viewCaptureFrom(from);
        Thread.sleep(2000);
        manHome.clickOnCalender();
        Thread.sleep(4000);
        manHome.selectDateRange();
        Thread.sleep(2000);
        manHome.clickOnSaveButton();
        Thread.sleep(3000);
        manHome.selectView(name);
        Thread.sleep(2000);
        manHome.swipe(0.2, 0.2, 0.2, 0.6);
        System.out.println("Scrolled Down");
        Thread.sleep(2000);
        manHome.selectSortBy(sort);
        Thread.sleep(2000);
    }

    @Then("user should see the changes on home page")
    public void userShouldSeeTheChangesOnHomePage() throws MalformedURLException, InterruptedException {
        manHome.clickApplyFilterBtn();
        Thread.sleep(4000);
        swipe(0.2, 0.2, 0.2, 0.6);
        System.out.println("Scrolled Down to See Filtered Changes");
        Thread.sleep(2000);
        swipe(0.2, 0.8, 0.2, 0.2);
        System.out.println("Scrolled Up to See Filtered Changes");
    }

    @When("user click on inbox icon")
    public void userClickOnInboxIcon() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnInbox();
    }

    @Then("Notification and request tab should be displayed")
    public void notificationAndRequestTabShouldBeDisplayed() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.clickOnNotificationTab();
        Thread.sleep(2000);
        manHome.clickOnRequestTab();
        Thread.sleep(6000);
    }

    @Given("team member should already send manager request to manager")
    public void teamMemberShouldAlreadySendManagerRequestToManager() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Team Member has Already Sent a Request to be Manager");
    }

    @Then("user should be able to get notification And accept the request")
    public void userShouldBeAbleToGetNotificationAndAcceptTheRequest() throws MalformedURLException, InterruptedException {
        Thread.sleep(4000);
        manHome.clickOnNotificationTab();
        Thread.sleep(4000);
        manHome.clickOnAddAsManagerRequest();
        Thread.sleep(4000);
    }

    @Given("Team member should react before on capture")
    public void teamMemberShouldReactBeforeOnCapture() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Team Member has Already Reacted on Capture");
    }

    @Then("user should get the notification for capture react")
    public void userShouldGetTheNotificationForCaptureReact() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        manHome.clickOnCaptureCompleteNotification();
        Thread.sleep(4000);
        manHome.TapOnCaptureRequest();
        Thread.sleep(6000);
    }

    @And("click on request tab")
    public void clickOnRequestTab() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnRequestTab();
    }

    @And("filter screen should be displayed{string} ,select date with given option")
    public void filterScreenShouldBeDisplayedSelectDateWithGivenOption(String from) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.viewCaptureFrom(from);
        Thread.sleep(2000);
        manHome.clickOnCalender();
        Thread.sleep(4000);
        manHome.selectDateRange();
        Thread.sleep(2000);
        manHome.clickOnSaveButton();
    }

    @And("select sort by option{string}")
    public void selectSortByOptionSort(String sort) throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        manHome.selectSortBy(sort);
    }

    @And("select request status option{string}")
    public void selectRequestStatusOption(String status) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.selectRequestStatus(status);
        Thread.sleep(2000);
        manHome.swipe(0.2, 0.2, 0.2, 0.6);
        System.out.println("Scrolled Down");
    }

    @And("select sent or received by option{string}")
    public void selectSentOrReceivedByOption(String sentReceivedBy) throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        manHome.selectSentOrReceivedBy(sentReceivedBy);
    }

    @And("click on apply")
    public void clickOnApply() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        manHome.clickApplyFilterBtn();
    }

    @Then("user should be able to see filter capture request")
    public void userShouldBeAbleToSeeFilterCaptureRequest() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        manHome.displayFilter();
        Thread.sleep(6000);
    }


    @And("user click on filter again")
    public void userClickOnFilterAgain() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        manHome.displayFilter();
        Thread.sleep(4000);
        manHome.clickOnFilters();
    }

    @And("user click on reset in filter popup page")
    public void userClickOnResetInFilterPopupPage() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnReset();

    }

    @Then("user should be able to see all captures")
    public void userShouldBeAbleToSeeAllCaptures() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        manHome.clickApplyFilterBtn();
        Thread.sleep(2000);
        manHome.swipe(0.2, 0.2, 0.2, 0.6);
        System.out.println("Scrolled Down to See Filtered Changes");
        Thread.sleep(2000);
        manHome.swipe(0.2, 0.8, 0.2, 0.2);
        System.out.println("Scrolled Up to See Filtered Changes");
        Thread.sleep(2000);
        manHome.displayFilter();
        Thread.sleep(6000);

    }

    @When("user scroll down{string}")
    public void userScrollDown(String name) throws InterruptedException {
        Thread.sleep(2000);
        manHome.scrollTillElement(name);
        System.out.println("User Scrolled Down");
    }

    @Then("user should be able to click on Colleagues profile {string} and View profile")
    public void userShouldBeAbleToClickOnColleaguesProfileNameAndViewProfile(String name) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnColleagueProfile(name);

//        Thread.sleep(2000);
//        manHome.tapOnProfileDetails();
    }


    @And("user should be able to click \"i\" icon on profile")
    public void userShouldBeAbleToClickIconOnProfile() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnIIcon();
    }


    @Then("user should be able to click on back \"<--\"")
    public void userShouldBeAbleToClickOnBack() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickBackButton();

    }


    @And("user should be able to click on \"Delete\" icon")
    public void userShouldBeAbleToClickOnIconDeleteIcon() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnDeleteIcon();
    }


    @Then("user should be able to view delete popup and will click on \"Delete\" button")
    public void userShouldBeAbleToViewDeletePopupAndWillClickOnDeleteButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnDeleteBtn();
        Thread.sleep(6000);
    }


    @And("user should be able to click on \"Cancel\" button")
    public void userShouldBeAbleToClickOnButtonCancelButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnCancelBtn();
        Thread.sleep(2000);
        manHome.clickOnDeleteIcon();
    }

    @Then("user should be able to see celebrate tab on profile")
    public void userShouldBeAbleToSeeCelebrateTabOnProfile() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnCelebrate();
    }

    @Then("user should be able to see capture count of celebrates")
    public void userShouldBeAbleToSeeCaptureCountOfCelebrates() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.tapOnTotalCelebrates();
    }

    @Then("user should be see improve tab and able to click on Improve tab on profile")
    public void userShouldBeSeeImproveTabAndAbleToClickOnImproveTabOnProfile() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnImprove();
    }


    @Then("user should be able to see top tags for celebrate in \"Top Celebrate tags\" field")
    public void userShouldBeAbleToSeeTopTagsForCelebrateInField() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnViewAllTags();
        Thread.sleep(2000);
        manHome.tapOnTopTags();
        Thread.sleep(2000);
        manHome.clickOnCelebrate();
        Thread.sleep(2000);
        manHome.tapOnCelebrateTags();
    }

    @And("user click on filter")
    public void userClickOnFilter() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnFilters();
    }

    @And("user select filter as user want{string}{string}{string}")
    public void userSelectFilterAsUserWant(String from, String capture, String sort) throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.viewCaptureFrom(from);
        Thread.sleep(2000);
        manHome.clickOnCalender();
        Thread.sleep(2000);
        manHome.selectDateRange();
        Thread.sleep(2000);
        manHome.clickOnSaveButton();
        Thread.sleep(2000);
        manHome.selectCaptureBy(capture);
        Thread.sleep(2000);
        manHome.selectSortBy(sort);
    }

    @Then("user should be able to click on apply filter and see count of filter")
    public void userShouldBeAbleToClickOnApplyFilter() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.clickApplyFilterBtn();
        Thread.sleep(2000);
        manHome.displayFilter();
        Thread.sleep(2000);
        manHome.swipe(0.2, 0.2, 0.2, 0.6);
        System.out.println("User Scrolled Down to View Filtered Changes");
        manHome.swipe(0.2, 0.6, 0.2, 0.2);
        System.out.println("User Scrolled Up to View Filtered Changes");
    }

    @And("user click on filter when he comes on colleague's profile")
    public void userClickOnFilterWhenHeComesOnColleagueSProfile() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnFilters();
    }

    @Then("user should be able to click on reset and filter should be reset")
    public void userShouldBeAbleToClickOnResetAndFilterShouldBeReset() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnReset();
        Thread.sleep(2000);
        manHome.clickApplyFilterBtn();
        Thread.sleep(2000);
        manHome.displayFilter();
        Thread.sleep(2000);
    }

    @And("user click \"?\" in profile near prism summary field")
    public void userClickInProfileNearPrismSummaryField() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnQuestionMark();
        Thread.sleep(2000);
    }

    @Then("popup window should be displayed for providing instruction to write prism summary")
    public void popupWindowShouldBeDisplayedForProvidingInstructionToWritePrismSummary() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.tapOnContributingPopUp();
        Thread.sleep(2000);
    }


    @Then("user should be able to see count of celebrate capture and click on \"Make a Capture\" button in prism summary")
    public void userShouldBeAbleToSeeCountOfCelebrateCaptureAndClickOnButtonInPrismSummary() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        hamburger.clickOnGeneratePrismSummaryBtn();
        Thread.sleep(2000);
    }

    @And("user scroll down screen")
    public void userScrollDownScreen() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.tapOnNoCapture();
    }

    @Then("user should be able to see the capture history")
    public void userShouldBeAbleToSeeTheCaptureHistory() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.tapOnSharedOn();
    }

    @Then("user should be able to click on any capture from history")
    public void userShouldBeAbleToClickOnAnyCaptureFromHistory() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.selectHistoryCapture();
        Thread.sleep(2000);
    }

    @And("user select reaction symbol{string}")
    public void userSelectReactionSymbol(String symbol) throws MalformedURLException, InterruptedException {
        Thread.sleep(6000);
        manHome.tapOnViewCapture();
        Thread.sleep(2000);
        try {
            manHome.clickOnReactionSymbols(symbol);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @And("user add text{string}")
    public void userAddText(String value) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.enterReply(value);
    }

    @Then("user should be able to click send button")
    public void userShouldBeAbleToClickSendButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnsendArrow();
    }

    @And("user click on improve tab")
    public void userClickOnImproveTab() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnImprove();

    }

    @Then("user should be able to see count of improves in same tab")
    public void userShouldBeAbleToSeeCountOfImprovesInSameTab() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.tapOnTotalCelebrates();
        Thread.sleep(3000);
    }

    @Then("user should be able to see top tags in same tab of improves")
    public void userShouldBeAbleToSeeTopTagsInSameTabOfImproves() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnViewAllTags();
        Thread.sleep(2000);
        manHome.tapOnTopTags();
        Thread.sleep(2000);
        manHome.clickOnImproveTags();
        Thread.sleep(2000);

    }

    @And("user clicked on improve tab")
    public void userClickedOnImproveTab() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        manHome.clickOnImprove();
    }

    @Then("user should be able to see count of capture and click on \"Make a Capture\" button in prism summary of improve")
    public void userShouldBeAbleToSeeCountOfCaptureAndClickOnButtonInPrismSummaryOfImprove() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        hamburger.clickOnGeneratePrismSummaryBtn();
        Thread.sleep(2000);
    }

    @When("user click on Colleague account{string}")
    public void userClickOnColleagueAccountName(String name) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnColleagueProfile(name);
    }


    @And("user click on goal tab")
    public void userClickOnGoalTab() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.clickOnGoalTab();
        System.out.println("User clicked On Goal tab");

    }

    @Then("user should be able to see goals profile")
    public void userShouldBeAbleToSeeGoalsProfile() throws MalformedURLException, InterruptedException {
        System.out.println("User is able to see goals profile");
    }

    @Then("user should be able to select goal tab")
    public void userShouldBeAbleToSelectGoalTab() throws MalformedURLException {
        manHome.GoalTabSelected();
        System.out.println("User is On Goal Tab");
    }

    @And("user clik on Ongoing Goals")
    public void userClikOnOngoingGoals() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.clickOnOngoingGoals();
        System.out.println("User clicked On OnGoingGoals tab");
    }

    @And("user clik on filter tab")
    public void userClikOnGoalFilters() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnGoalsFilters();
        System.out.println("User clicked On Goals filters tab");
    }

    @And("user make changes as required{string}{string}{string}")
    public void userMakeChangesAsRequiredFromGoalTypeGoalstatusPriorityCreatedBySortBy(String from, String goaltype, String goalStatus) throws Exception {
        Thread.sleep(2000);
        manHome.SelectViewGoalfrom(from);
        System.out.println("User clicked On All time");
        Thread.sleep(4000);

        manHome.clickOnCalender();
        Thread.sleep(2000);
        manHome.selectDateRange();
        Thread.sleep(2000);
        manHome.clickOnSaveButton();
        Thread.sleep(2000);

        Thread.sleep(2000);
        manHome.ClickOnGoalType(goaltype);
        System.out.println("User select goal type");

        Thread.sleep(2000);
        manHome.ClickOnGoalStatus(goalStatus);
        System.out.println("User select Goal status");
    }

    @And("user make changes as required next{string}{string}{string}")
    public void userMakeChangesAsRequiredNextPriorityCreatedBySortBy(String Priority, String createdBy, String sortBy) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnGoalPriority(Priority);
        System.out.println("User select Goal priority");
        Thread.sleep(2000);
        manHome.verticalSwipeByPercentages(0.6, 0.3, 0.5);
        System.out.println("User swipe vertically");

        Thread.sleep(2000);
        manHome.ClickOnGoalCreatedBy(createdBy);
        System.out.println("User select Goal CreatedBy");

        Thread.sleep(2000);
        manHome.ClickOnGoalSortBy(sortBy);
        System.out.println("User select Goal SortBy");
    }


    @Then("user should be able to click on filter tab")
    public void userShouldBeAbleToClickOnFilterTab() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.FiltersOptionsDisplayed();
        System.out.println("User is on Goals Filters tab");

    }


    @Then("user should see filter is applied")
    public void userShouldSeeFilterIsApplied() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.FilterButtonEnabled();
        //    System.out.println("User is able to see filter button is Enabled");
    }

    @Then("user Click On ApplyFilter")
    public void userClickOnApplyFilter() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnApplyFilter();
        System.out.println("User Click On Apply Filter");

    }

    @Then("user should be able to see count of filter after applying for goal")
    public void userShouldBeAbleToSeeCountOfFilterAfterApplyingForGoal() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.CountOfFilter();
    }


    @And("user click on reset")
    public void userClickOnReset() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnReset();
        System.out.println("User Click On reset button");
    }

    @Then("user should be able to click on Apply filter to reset filter")
    public void userShouldBeAbleToClickOnToResetFilter(String arg0) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnApplyFilter();
        System.out.println("User Click On Apply Filter again");

    }

    @Then("user should be able to see count none on filter")
    public void userShouldBeAbleToSeeCountNoneOnFilter() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.CountOfFilter();
    }

    @Then("user should be able to see count of goals")
    public void userShouldBeAbleToSeeCountOfGoals() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.CountOfGoals();
        Thread.sleep(2000);
    }

    @And("user scroll down till ongoing goals field come{string}")
    public void userScrollDownTillOngoingGoalsFieldComeOngoingGoals(String ongoingGoals) throws InterruptedException {
        Thread.sleep(2000);
        manHome.scrollTillElement(ongoingGoals);
        System.out.println("User Scrolled Down");
    }

    @Then("user should be able to click on any ongoing goal{string}")
    public void userShouldBeAbleToClickOnAnyOngoingGoalOngoingGoals(String ongoingGoals) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnOngoingGoalsField(ongoingGoals);
        Thread.sleep(4000);
        System.out.println("User is on View Goal Page");

    }

    @Then("user should be able to press back arrow button icon from view goal page")
    public void userShouldBeAbleToPressBackArrowButtonIconFromViewGoalPage() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnBackArrow();
        System.out.println("User Cliked On Back Arrow and return to Goals Profile");
    }

    @Then("user should be able to click on \"edit\" icon button")
    public void userShouldBeAbleToClickOnEditIconButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnEditIcon();
        System.out.println("User Cliked On Edit Icon");
    }

    @Then("user should be able to click on \"Mark as complete button\"")
    public void userShouldBeAbleToClickOnMarkAsCompleteButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnMarkasComplete();
        Thread.sleep(4000);
        System.out.println("User Cliked On Mark as Complete");
    }

    @Then("user should be click on \"Cancel\" button")
    public void userShouldBeClickOnCancelButton() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.ClickOnCancelButton();
        Thread.sleep(4000);
        System.out.println("User Cliked On cancel Button");
    }


    @Then("user should be able to click on \"complete\" button")
    public void userShouldBeAbleToClickOnCompleteButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnCompleteBtn();
        Thread.sleep(8000);
        System.out.println("User Cliked On Complete Button");
    }

    @Then("user should be able to click on conversation tab")
    public void userShouldBeAbleToClickOnConversationTab() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnConversationTab();
        System.out.println("User Cliked On Conversation Tab");
    }

//    @And("user add text")
//    public void userAddText() throws InterruptedException, MalformedURLException {
//        Thread.sleep(2000);
//        manHome.addText();
//        Thread.sleep(4000);
//        System.out.println("User Add text in Text box");
//    }

    @Then("user should be able to see conversation with date and time")
    public void userShouldBeAbleToSeeConversationWithDateAndTime() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.tapOnConversationDetails();
    }

    @Then("user should be able to click on insight tab")
    public void userShouldBeAbleToClickOnInsightTab() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.clickOnInsightsTab();
    }

    @Then("user should be able to click on \"Capture progress\" button")
    public void userShouldBeAbleToClickOnButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnCaptureProgressBtn();
        manHome.tapOnCaptureThoughtScreen();
    }

    @Then("user click on Circle to add count on top for milestone of goal with subtype project and also click on Make a capture")
    public void userClickOnCircleToAddCountOnTopForMilestoneOfGoalWithSubtypeProjectAndAlsoClickOnMakeACapture() throws InterruptedException, MalformedURLException {
//        Thread.sleep(2000);
//        manHome.TapOnProjectStatus();
        Thread.sleep(2000);
        manHome.swipe(0.2, 0.2, 0.2, 0.4);
        System.out.println("Scrolled Up Till Milestones");
        Thread.sleep(2000);
        manHome.TapOnMilestonesRadioButton();
        Thread.sleep(4000);
    }


    @Then("user should be able to select reaction symbol from suggestion icon list")
    public void userShouldBeAbleToSelectReactionSymbolFromSuggestionIconList() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnReactionSymbol();
        Thread.sleep(4000);
        System.out.println("User Cliked On Reaction Symbol");
    }

    @Then("user should be able to add text in textbox")
    public void userShouldBeAbleToAddTextInTextbox() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.AddTextInGoalsConversation();
        Thread.sleep(4000);
        System.out.println("User Add Text In Textbox");
    }

    @Then("user should be able to see Goal subtype for capture")
    public void userShouldBeAbleToSeeGoalSubtypeForCapture() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.TapOnGoalTypes();
        Thread.sleep(2000);
    }

    @And("user click on \"Edit or add milestones\" button")
    public void userClickOnEditOrAddMilestonesButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.swipe(0.2, 0.2, 0.2, 0.6);
        System.out.println("User Scrolled Down");
        Thread.sleep(2000);
        manHome.clickOnEditOrAddMilestonesBtn();

    }

    @And("user redirected to \"Edit my goal\" page")
    public void userRedirectedToEditMyGoalPage() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.TapOnEditGaolPage();
    }

    @And("user click on \"add another milestone\"")
    public void userClickOnAddAnotherMilestone() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnAddAnotherMilestonesBtn();
    }

    @And("user write milestone name")
    public void userWriteMilestoneName() {
        System.out.println("User Clicked on Add Another Milestones And Added the same");
    }

    @Then("user click on \"Save goal\" with all milestones whicha are added recently")
    public void userClickOnSaveGoalWithAllMilestonesWhichaAreAddedRecently() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnSaveGoal();
        Thread.sleep(4000);
    }

    @And("user scroll down till Any ongoing project goals{string}")
    public void userScrollDownTillAnyOngoingProjectGoalsOngoingProjectGoals(String OngoingProjectGoals) throws InterruptedException {
        Thread.sleep(2000);
        manHome.scrollTillElement(OngoingProjectGoals);
        System.out.println("User Scrolled Down");
    }

    @And("user click on Any ongoing project goals{string}")
    public void userClickOnAnyOngoingProjectGoalsOngoingProjectGoals(String OngoingProjectGoals) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnOngoingProjectGoalsField(OngoingProjectGoals);
        Thread.sleep(4000);
    }

    @And("user click on \"+Add notes\" button or Edit button at right top")
    public void userClickOnButtonOrEditButtonAtRightTop() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickEditButton();
    }

    @And("user scroll down to till{string}")
    public void userScrollDownToTillAdditionalContext(String additonalContext) throws InterruptedException {
        Thread.sleep(3000);
        manHome.scrollTillElement(additonalContext);
        System.out.println("User Scrolled Down");
        Thread.sleep(4000);
    }


    @And("user add text into it")
    public void userAddTextIntoIt() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.AddText();
    }

    @And("user click on \"Save Goal\" button")
    public void userClickOnSaveGoalButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnSaveGoal();
    }

    @And("user come to myself page")
    public void userComeToMyselfPage() {
        System.out.println("User Is on myself page");
    }

    @And("click on same project ongoing goal{string}")
    public void clickOnSameProjectOngoingGoalOngoingProjectGoals(String OngoingProjectGoals) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnOngoingProjectGoalsField(OngoingProjectGoals);
        Thread.sleep(4000);
    }

    @And("user scroll down to till")
    public void userScrollDownToTill() throws InterruptedException {
        Thread.sleep(3000);
        manHome.PointerSwipe(538, 1860, 507, 361);
        System.out.println("User Scrolled Down");
        Thread.sleep(4000);
    }

    @Then("user should be able to see with additional button user can fill {string}")
    public void userShouldBeAbleToSeeWithAdditionalButtonUserCanFill(String arg0) throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.AdditionalContextDisplyed();
        Thread.sleep(4000);
    }


    @And("user scroll down till Any hard skill capture{string}")
    public void userScrollDownTillAnyHardSkillCaptureOngoingHardSkillGoal(String ongoingHardSkillGoal) throws InterruptedException {
        Thread.sleep(2000);
        manHome.scrollTillElement(ongoingHardSkillGoal);
        System.out.println("User Scrolled Down");
    }

    @And("user click on Any hard skill capture in ongoing goal{string}")
    public void userClickOnAnyHardSkillCaptureInOngoingGoalOngoingHardSkillGoal(String ongoingHardSkillGoal) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnOngoingHardSkillGoalsField(ongoingHardSkillGoal);
        Thread.sleep(4000);
    }

    @Then("User should be able to click and go in hard skill {string} page")
    public void userShouldBeAbleToClickAndGoInHardSkillPage(String arg0) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.TapOnGoalTypes();
        Thread.sleep(4000);
    }


    @Then("user should be able to click on {string} button icon")
    public void userShouldBeAbleToClickOnButtonIcon(String arg0) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnBackButton();
    }

    @And("user click on \"Capture progress\" button")
    public void userClickOnCaptureProgressButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.verticalSwipeByPercentages(0.9, 0.6, 0.9);
        Thread.sleep(2000);
        manHome.clickOnCaptureProgressBtn();
    }

    @And("user comes on \"capture a thought\" page")
    public void userComesOncaptureAThoughtPage() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.tapOnCaptureThoughtScreen();
    }

    @And("user makes a celebrate capture")
    public void userMakesACelebrateCapture() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnCelebrate();
        Thread.sleep(2000);
        manHome.enterStoodOutComment();
        Thread.sleep(2000);
        manHome.selectTagCategory();
        Thread.sleep(2000);
        manHome.selectRelevantTags();
    }

    @And("click on \"save and share \"")
    public void clickOnsaveandshare() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnSaveandShareButton();
    }

    @And("click on Save Capture Privately")
    public void clickOnSaveCapturePrivately() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnSaveCapturePrivately();
    }

    @And("user scroll down and go to timeline filed")
    public void userScrollDownAndGoToTimelineFiled() throws InterruptedException {
        Thread.sleep(3000);
        manHome.PointerSwipe(576, 2106, 591, 251);
        Thread.sleep(5000);
    }


    @And("user click On \"Share\" button")
    public void userClickOnShareButton() throws MalformedURLException, InterruptedException {
        Thread.sleep(5000);
        manHome.ClickOnShareButton();
    }

    @And("user click on \"Share privetly with [Name]\" option")
    public void userClickOnSharePrivatelyWithNameOption() throws InterruptedException, MalformedURLException {
        Thread.sleep(5000);
        manHome.clickSharePrivatelyBtn();

    }

    @And("user click on \"share Privetly\"")
    public void userClickOnSharePrivetly() throws MalformedURLException, InterruptedException {
        Thread.sleep(5000);
        manHome.ClickOnSharePrivately();
        manHome.PointerSwipe(478, 631, 714, 2043);
    }

    @And("user scroll up and go to Overview filed")
    public void userScrollUpAndGoToOverviewFiled() throws InterruptedException {
        Thread.sleep(3000);
        manHome.PointerSwipe(748, 568, 789, 2165);
        Thread.sleep(5000);
    }

    @And("user should be able to see count of {int} celebrate is increasing in managers side count")
    public void userShouldBeAbleToSeeCountOfCelebrateIsIncreasingInManagersSideCount(int arg0) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.CountOfManegersCelebrate();
    }

    @And("user should be able to see count of {int} celebrate is increasing in self-celebrate captures")
    public void userShouldBeAbleToSeeCountOfCelebrateIsIncreasingInSelfCelebrateCaptures(int arg0) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.CountOfUsersCelebrate();
    }

    @Then("user should be able to see count of celebrate in overview")
    public void userShouldBeAbleToSeeCountOfCelebrateInOverview() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.CountOfCelebrateInOverview();
    }

    @And("click on same hard skill capture{string}")
    public void clickOnSameHardSkillCaptureOngoingHardSkillGoal(String ongoingHardSkillGoal) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.ClickOnOngoingHardSkillGoalsField(ongoingHardSkillGoal);
        Thread.sleep(4000);
    }











    @When("user click on Colleague account")
    public void user_Click_On_Colleague_Account() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        manHome.clickOnCollegueAccount();
        Thread.sleep(2000);
    }

    @And("user click on Any ongoing Target goals{string}")
    public void click_On_Any_Ongoing_TargetGoals(String goal)throws InterruptedException,MalformedURLException
    {
        Thread.sleep(2000);
        manHome.scrollTillElement(goal);
        manHome.clickOnTragetGoal();
        Thread.sleep(6000);
    }

    @And("user click on edit button , User will rediredted to edit my goal page")
    public void click_on_edit_button()throws InterruptedException,MalformedURLException
    {
        Thread.sleep(2000);
        manHome.clickOnEditButton();
        Thread.sleep(4000);

    }

    @And("user make changes in capture as required{string}")
    public void makeChangesAsClickOnTheGetBetter(String goalType)throws InterruptedException,MalformedURLException
    {
        Thread.sleep(4000);
        manHome.clickOnMediumButton(goalType);
        Thread.sleep(4000);
        System.out.println("User click on Goal Type");
    }

    @And ("user click on Save goal button")
    public void clickOnSaveButton()throws InterruptedException,MalformedURLException
    {
        Thread.sleep(2000);
        manHome.clickOnSavebutton();
        Thread.sleep(6000);
    }

    @Then ("user should be able to Add missing field from ongoing goals for target")
    public void userAddedMissingFields()
    {
        System.out.println("User added missing fields");
    }


    @And("user click on Any hard skill capture in ongoing goal")
    public void user_click_on_Any_hard_skill_capture_in_ongoing_goal()throws InterruptedException,MalformedURLException {
        // Write code here that turns the phrase above into concrete actions

        Thread.sleep(2000);
        manHome.clickOnHardSkillButton();
        Thread.sleep(2000);


    }

    @When("user click on Additional context :")
    public void user_click_on(String name)throws InterruptedException,MalformedURLException
    {
        Thread.sleep(4000);

        manHome.clickOnAdditionalContext(name);
        Thread.sleep(4000);
        System.out.println("User click on additional context");

    }

    @When("user enter data as required")
    public void user_enter_data_as_required() throws InterruptedException,MalformedURLException
    {
        Thread.sleep(2000);
        manHome.enterDataOnAdditionalContext();
        Thread.sleep(2000);
        System.out.println("Data entered Successfully");
        manHome.clickOnDoneButton();
        Thread.sleep(2000);


    }

    @Then("user should be  add notes to hardskill project from ongoing goals")
    public void user_should_be_add_notes_to_hardskill_project_from_ongoing_goals() {
        System.out.println("User successfully added notes to hardskill project from ongoing goals");

    }


    @Given("users should be login")
    public void usersShouldBeLogin() throws InterruptedException, MalformedURLException {

        getAndroidDriver().resetApp();
        Thread.sleep(2000);
        registrations.clickOnAllowBtn();
        Thread.sleep(2000);
        registrations.clickOnGetStartedBtn();
        System.out.println("User Clicked Get Started");
        Thread.sleep(2000);
        System.out.println("Swipe the Intro Pages");
        registrations.swipe(0.2, 0.2, 0.5, 0.2);
        registrations.swipe(0.2, 0.2, 0.5, 0.2);
        registrations.swipe(0.2, 0.2, 0.5, 0.2);
        registrations.swipe(0.2, 0.2, 0.5, 0.2);
        Thread.sleep(1000);
        System.out.println("Swiped Successfully");
        registrations.clickOnContinueBtn();
        System.out.println("Clicked on Continue Button");
        Thread.sleep(2000);
        registrations.clickOnSigninWithGoogle();
        System.out.println("User Clicked on Sign with Google");
        Thread.sleep(2000);
        login.clickOncolleagueAccount();
        Thread.sleep(8000);
    }

    @When("user click on myself account from colleague field")
    public void userClickOnMyselfAccountFromColleagueField() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.clickColleagueMyself();
    }

    @And("user click on Got it! button")
    public void userClickOnGotItButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnGotIt();
    }

    @And("user scroll down till Go to learn")
    public void userScrollDownTillGoToLearn() throws InterruptedException {
        Thread.sleep(3000);
        manHome.verticalSwipeByPercentages(0.9,0.6,0.9);
        Thread.sleep(5000);
    }


    @And("user click on \"Go to Learn\" button from Insights tab")
    public void userClickOnGoToLearnButtonFromInsightsTab() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        manHome.clickOnGoToLearn();
    }

    @And("user click on \"Welcome to Learn feed\" Got It! Button")
    public void userClickOnWelcomeToLearnFeedGotItButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnGotIt();

    }

    @Then("user should be able to click on \"go to learn\" page for hard skill and it should redirected to \"Learn page \"")
    public void userShouldBeAbleToClickOnPageForHardSkillAndItShouldRedirectedTo() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.LearnPage();
    }






    @And("user click on {string} button , add resources page will open")
    public void clickOnAddResourcesButton(String resource)throws InterruptedException,MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnAddResources(resource);
        Thread.sleep(2000);
    }

    @And("user click on \"article\" option")
    public void clickOnArcticleOption()throws InterruptedException,MalformedURLException
    {
        Thread.sleep(2000);
        manHome.ToClickOnArticleTab();

    }
    @And("user paste any link releted to article in \"which article did you read?\" text box")
    public void pasteArticleLink()throws InterruptedException,MalformedURLException
    {
        Thread.sleep(2000);
        manHome.sendArticleLink();

    }

    @And("user click on \"Add notes\" text box to write anything releted to article")
    public void clickOnAddNotesButton()throws InterruptedException,MalformedURLException
    {
        Thread.sleep(2000);
        manHome.addNotesTab();
    }
    @Then("user should be able to click on \"save and share resource\" button")
    public void clickOnSaveAndShare()throws InterruptedException,MalformedURLException
    {
        Thread.sleep(2000);
        manHome.clickOnSaveAndShareButton();
    }
    @And("user should be able to  come on view goal page and able to see this article in timeline field")
    public void ViewGoalPageAndArticle()throws InterruptedException,MalformedURLException
    {
        Thread.sleep(2000);
        manHome.seeTheCountOfResources();
        System.out.println("User able to See count");
    }


    @Given("user is logged in as another manager")
    public void userIsLoggedInAsAnotherManager() throws InterruptedException, MalformedURLException {
        getAndroidDriver().resetApp();
        Thread.sleep(2000);
        registrations.clickOnAllowBtn();
        Thread.sleep(2000);
        registrations.clickOnGetStartedBtn();
        System.out.println("User Clicked Get Started");
        Thread.sleep(2000);
        System.out.println("Swipe the Intro Pages");
        registrations.swipe(0.2, 0.2, 0.5, 0.2);
        registrations.swipe(0.2, 0.2, 0.5, 0.2);
        registrations.swipe(0.2, 0.2, 0.5, 0.2);
        registrations.swipe(0.2, 0.2, 0.5, 0.2);
        Thread.sleep(1000);
        System.out.println("Swiped Successfully");
        registrations.clickOnContinueBtn();
        System.out.println("Clicked on Continue Button");
        Thread.sleep(2000);
        registrations.clickOnSigninWithGoogle();
        System.out.println("User Clicked on Sign with Google");
        Thread.sleep(2000);
        login.clickOnAnotherManagerAccount();
        Thread.sleep(8000);
    }




    @And("User observe the profile picture icon for myself")
    public void observeProfilePic()throws InterruptedException,MalformedURLException
    {
        Thread.sleep(2000);
        manHome.ToSeeProfilePic();
        System.out.println("User observed the icon of profile pic");
    }


    @Then("User should be able to see the first letter of the user's name")
    public void toSeeFirstletterOfUserName()throws InterruptedException,MalformedURLException
    {
        Thread.sleep(3000);
        manHome.getfirstLetterOfProfile();
        System.out.println("User able to see the first letter of the name");
    }



}


