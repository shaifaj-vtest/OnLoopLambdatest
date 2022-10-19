package com.gk.test.step_definitions.mobile;

import com.gk.test.framework.AndroidObject;
import com.gk.test.page_objects.mobile.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.net.MalformedURLException;

public class TeamSteps extends AndroidObject {

    private final RegistrationsPage registrations;
    private final LoginPage login;
    private final Manager_HomePage manHome;
    public final HamburgerMenuPage Hamburger;

    public final WellnessPage wellness;
    public final TeamPage team;

    public TeamSteps(RegistrationsPage regis, LoginPage log, Manager_HomePage ManHome, HamburgerMenuPage hamburgerMenu, WellnessPage wellness, TeamPage team) {
        this.registrations = regis;
        this.login = log;
        this.manHome = ManHome;
//        this.hamburger = ham;
        this.wellness = wellness;
        this.team = team;
        this.Hamburger = hamburgerMenu;
    }

    @And("user should be on team page")
    public void UserIsOnTeamPage() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.clickOnTeam();
    }

    @And("user should be on add team page")
    public void UserIsOnAddTeamPage() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.clickOnAddTeam();
        Thread.sleep(4000);
    }

    @When("user click on enter a team name text box")
    public void userClickOnEnterTeamNameTextBox() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.enterTeamName();
        System.out.println("User able to enter a team name in the text box");
        Thread.sleep(4000);
    }
    @When("user click on enter a team name{string} text box")
    public void userClickOnEnterTeamNameTextBox(String Team) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.enterTeamName(Team);
        System.out.println("User able to enter a team name in the text box");
        Thread.sleep(2000);
    }


    @Then("user should be  able to add {string} name")
    public void UserAbletoAddTeamName(String Team) throws InterruptedException, MalformedURLException {
        Thread.sleep(8000);
        team.addTeamName(Team);
        Thread.sleep(2000);
        System.out.println("User able to see Team Name");
        Thread.sleep(6000);
    }
    @And("User should be on team name as {string}")
    public void userIsOnTeamName(String Team) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.scrollTillElement(Team);
        team.UserOnTeamName(Team);
        Thread.sleep(2000);

    }

    @When("User tap on \"+\" Icon")
    public void TabOnPlusIcon() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.clickPlusIcon();
        System.out.println("User able to tap on '+' icon");
        Thread.sleep(4000);
    }

    @Then("Page should directed to Add colleague page")
    public void pageDirectedToAddColleaguePage() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.displayAddColleague();
        System.out.println("Page is redirected to the 'Add colleague' page");
    }


    @When("User click on setting icon")
    public void UserclickOnSettingIcon() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        team.clickOnSetting();
        System.out.println("User Clicked On Setting icon");
    }

    @And("User click on team name text box")
    public void userClickOnTeamNameTextBox() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.clickOnTeamName();
        System.out.println("User clicked on team name text box");
        Thread.sleep(2000);
    }

    @And("User write name as \"Learn\"")
    public void userEditName() throws InterruptedException {
        Thread.sleep(2000);
        team.editTeamName();
        System.out.println("User able to edit/write name");
        Thread.sleep(2000);
    }

    @And("User click on back button icon")
    public void userClickOnBackButton() throws MalformedURLException, InterruptedException {
        team.clickOnBackIcon();
        System.out.println("User clicked on back button icon");
        Thread.sleep(2000);
    }

    @And("User click on Save option on confirmation screen")
    public void UserClickOnSaveOption() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.ClickOnSaveBtn();
        System.out.println("User able to click on Save option on confirmation screen");

    }

    @Then("Team name should be updated")
    public void TeamNameUpdated() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.verifyUpdatedTeamName();
        System.out.println("Team name is updated from 'Onloop-two' to 'Learn'");
        Thread.sleep(4000);
    }

    @And("User scroll down{string}")
    public void userScrollDownTeam(String Team) throws InterruptedException {
        Thread.sleep(2000);
        team.scrollTillElement(Team);
        System.out.println("User scroll up to the created team");

    }

    @And("user click on created team{string}")
    public void userClickOnCreatedTeam(String Team) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.clickOnCreatedTeam(Team);
    }


    @And("User click on Delete my Team")
    public void userClickOnDeleteMyTeam() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.clickOnDeleteTeamBtn();
    }

    @And("User click on \"Yes,I'm sure\" button on popup window massage")
    public void clickOnYesIAmSure() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.clickOnSureBtn();

    }

    @And("Team should be deleted")
    public void verifyTeamDeleted() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        team.verifyTeamNameAfterDelete();
    }


    @When("user click on text box to modify team name")
    public void userClickOnTextToModifyTeamName() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.clickOnTeamName();
        System.out.println("User clicked on team name text box");
        Thread.sleep(2000);
        team.editTeamName();
        System.out.println("User able to modify team name");
    }

    @Then("user should be able to save team name")
    public void userAbleToSaveTeamName() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        team.verifyUpdatedTeamName();
        System.out.println("user is  able to save team name");
        Thread.sleep(4000);
    }

    @When("user click on edit button in team members field")
    public void userClickOnEditButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.clickOnEditBtn();
        System.out.println("user clicked on edit button in team members field");
        Thread.sleep(4000);
    }

    @Then("user should be able to edit team members")
    public void userAbleToEditTeamMember() throws InterruptedException {
        System.out.println("User is able to edit team members");
        Thread.sleep(4000);

    }

    @And("user should be fill all details in Team >> my team >>")
    public void userShouldBeFillAllDetailsInTeamMyTeam() {
        System.out.println("Team is already created and team member also added");
    }

    @And("user click on team member name{string}")
    public void userClickOnTeamMemberName(String memberName) throws MalformedURLException, InterruptedException {
        team.clickOnUserNameOrId(memberName);
        Thread.sleep(2000);
        team.clickOnGotItBtn();
    }

    @Then("user should be able to select individuals profile of team members{string}")
    public void userShouldBeAbleToSelectIndividualsProfileOfTeamMembersMemberName(String Name) throws MalformedURLException, InterruptedException {
        team.verifyTeammemberIndividualProfile(Name);
    }

    @And("user click on improve tab in team members profile")
    public void userClickOnImproveTabInTeamMembersProfile() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        team.clickOnImproveTab();
    }

    @Then("user should be able to see details of \"improves\" on individual profile")
    public void userShouldBeAbleToSeeDetailsOfOnIndividualProfile() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        team.ImprovesPage();
    }

    @And("user click on make a capture")
    public void userClickOnMakeACapture() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.clickOnMakeAcapture();
        System.out.println("user click on make a capture");
    }

    @When("user click on celebrate icon")
    public void clickOnCelebrateIcon() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        manHome.clickOnCelebrate();
    }

    @Then("user should be able to see details of \"celebrate\" on individual profile")
    public void userShouldBeAbleToSeeDetailsOfCelebrateOnIndividualProfile() throws MalformedURLException, InterruptedException {
        team.clickOnCelebrateIcon();
        Thread.sleep(3000);
        team.CelebratePage();
        Thread.sleep(2000);
    }

    @And("user click on goals tab in team members profile")
    public void userClickOnGoalsTabInTeamMembersProfile() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        manHome.clickOnGoalTab();
        System.out.println("User clicked On Goal tab");
    }

    @Then("user should be able to see details of \"Goals\" on individual profile")
    public void userShouldBeAbleToSeeDetailsOfOnIndividualGoalsProfile() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        team.GoalsPage();
    }

    @Then("user should be able to see pending team members to accept team invites")
    public void userShouldBeAbleToSeePendingTeamMembersToAcceptTeamInvites() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        team.pendingInvitations();
    }

    @And("team member should accept the request for team invite")
    public void userAcceptTherequestOfTeamInvitation() {
        System.out.println("After adding team member,team member accepted the request for team invite");
    }

    @Then("user should be able to click on setting icon")
    public void userAbleToClickOnSettingIcon() throws InterruptedException {
        System.out.println("User able to click on setting icon");
        Thread.sleep(4000);
    }

    @And("user modify team name")
    public void UserModifyTeamName() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.ToModifyTeamName();
        System.out.println("user modified team name");
    }

    @Then("user should be able to rename the team name")
    public void renameTeamName() {
        System.out.println("user able to rename the team name");
    }

    @Then("user should be able to see all members who accept the team invite and joined team")
    public void userShouldBeAbleToSeeAllMembersWhoAcceptTheTeamInviteAndJoinedTeam() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        team.toCheckInvitationAcceptedmember();
    }

    @Then("user should be able to see team{string} profile")
    public void userShouldBeAbleToSeeTeamProfile(String Team) throws MalformedURLException, InterruptedException {
        team.verifyTeamProfile(Team);

    }
    @When("user click on add icon")
    public void userClickOnAddIcon() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.ClickOnAddMembersBtn();
        team.clickOnAddColleagueToThisteam();
    }
    @When("user click on search or invite colleague{string}")
    public void UserClickOnSearchOrInviteColleague(String memberName) throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        team.enterSearchByName(memberName);
    }
    @And("user click on invite now button of Invite to Team")
    public void userClickOnInviteNowButtonOfInviteToTeam() throws MalformedURLException {
        team.clickonInviteNowAfterColleague();
    }
    @And("user enter colleague email address{string}")
    public void enterColleagueEmail(String Email) throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        team.enterWorkEmail(Email);
    }
    @Then("user should be able to add colleagues from link or name within app")
    public void userShouldBeAbleToAddColleaguesFromLinkOrNameWithinApp() throws MalformedURLException, InterruptedException {
        team.verifyAddColleagueExistingTeam();
        Thread.sleep(2000);
    }
    @When("user enter colleague name{string} in drop down search box")
    public void enterColleagueName(String name) throws MalformedURLException, InterruptedException {
        team.enterIntoSearchAnyone(name);
        Thread.sleep(2000);
        team.clickOnInviteNow();


    }
    @Then("user should be able to send add colleague request")
    public void sendRequesttoColleague() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        System.out.println("Request sent to the colleague");


    }

    @Then("Team name{string} and team members count should be displayed")
    public void teamNameAndTeamMembersCountShouldBeDisplayed(String Team) throws MalformedURLException, InterruptedException {
        team.toSeeAcceptedAndInvitedColleagueCountBelowTeamName(Team);
    }


//    @When("user click on add team page & TeamName{string} & Next button & Done button")
//    public void userClickOnAddTeamPageTeamNameTeamNextDone(String Team) throws InterruptedException, MalformedURLException {
//        Thread.sleep(1500);
//        team.clickOnAddTeam();
//        Thread.sleep(1500);
//        team.enterTeamName(Team);
//        Thread.sleep(3000);
//
//        team.clickOnNextbtn();
//        Thread.sleep(4000);
//        team.clickOnDoneBtn();
//        Thread.sleep(4000);
//
//
//    }
    }
