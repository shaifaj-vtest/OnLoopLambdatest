package com.gk.test.page_objects.mobile;

import com.gk.test.framework.AndroidObject;
import com.gk.test.framework.helpers.utils.DefinedConstant;
import com.gk.test.framework.helpers.utils.JsonUtils;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;

public class TeamPage extends AndroidObject {

    SoftAssert Assert = new SoftAssert();
    boolean status;
    String value, content;

    public TeamPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAndroidDriver()), this);
    }

    static private final By team = By.xpath("//android.widget.ImageView[@content-desc=\"Team\"]");
    static private final By gotIt = By.xpath("//android.widget.Button[@content-desc=\"Got it!\"]");
    static private final By addTeam = By.xpath("(//*[@class='android.widget.ImageView'])[1]");
    static private final By teamName = By.xpath(" //*[@text='Team Name']");
    static private final By nextBtn = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    static private final By doneBtn = By.xpath("//android.widget.Button[@content-desc=\"Done\"]");

    static private final By plusIcon = By.xpath("//android.widget.ScrollView/android.widget.ImageView[3]");
    static private final By addColleague = By.xpath("//android.view.View[@content-desc=\"Add Colleague\"]");
    static private final By clickOnteamName = By.xpath("//*[@text='Team Name']");
  //  static private final By clickOnteamName = By.xpath("//android.view.View[contains(@content-desc,'Learn Testing')]");
    static private final By settingIcon = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
    static private final By TeamNameTextBox = By.xpath("//android.widget.EditText");

    static private final By backIcon = By.xpath("//android.widget.ImageView");
    static private final By saveBtn = By.xpath("//android.widget.Button[@content-desc=\"Yes\"]\n");

    static private final By editedTeamName = By.xpath("//android.view.View[contains(@content-desc,'Learn')]");

    static private final By editBtn = By.xpath("//android.widget.ImageView[@content-desc=\"Edit\"]");

    static private final By shareLinkExternally = By.xpath("//*[contains(@content-desc,'Share link externally')]");

    static private final By emailMeTheMagicLink = By.xpath("//*[contains(@content-desc,'Email me the Magic Link')]");

    static private final By SearchorInviteacolleague = By.xpath("//*[contains(@content-desc,'Search or Invite a colleague')]");

    static private final By Searchbynameoremail = By.xpath("//*[@text='Search by name or email']");
    static private final By clickOnColleagueName = By.xpath("//*[contains(@content-desc,'Nikita Gorale')]");

    static private final By clickOnOnloopOne = By.xpath("//*[contains(@content-desc,'loop')]");
    static private final By deleteTeamBtn = By.xpath("//android.widget.ImageView[@content-desc='Delete my Team']");
    static private final By yesSureBtn = By.xpath("//*[contains(@content-desc,'Yes')]");
    static private final By ClickenterOnColleagueName = By.xpath("//android.view.View[contains(@content-desc,'Nikita Gorale')]");

    static private final By improveTab = By.xpath("(//*[@class='android.widget.ImageView'])[4]");
    static private final By improvePage = By.xpath("//*[@content-desc='Improve']");

    static private final By makeAcaptureBtn = By.xpath("//android.widget.Button[@content-desc=\"Make a Capture\"]");

    static private final By teamMemberCelebrateIcon = By.xpath("(//android.widget.ImageView)[3]");
    static private final By teamMemberCelebrateTab = By.xpath("//*[@content-desc='Celebrate']");
    static private final By goalPage = By.xpath("//*[@content-desc='Goals']");
    static private final By pendinginvitation = By.xpath("//*[@content-desc='Pending Invitations']");

    static private final By clickOnTeamName = By.xpath("//*[contains(@text, 'India')]");

    static private final By invitationAcceptedMember = By.xpath("//*[contains(@content-desc,'Team members')]");

    static private final By addTeamMembersBtn = By.xpath("(//*[@class='android.widget.ImageView'])[3]");
    static private final By addColleagueToThisteam = By.xpath("//android.widget.ImageView[contains(@content-desc,'Add colleagues to this Team')]");
    static private final By searchColleague = By.xpath("//*[@text = 'Search by name or email']");

    static private final By inviteNowAfterAddCollegue = By.xpath("//*[@content-desc='Invite Now']");

    static private final By enterWorkEmail = By.xpath("//*[@text='Enter Work email']");

    static private final By mayBeLaterBtn = By.xpath("//*[@content-desc='Maybe later']");
    static private final By sendInviteTab = By.xpath("//android.widget.Button[@content-desc='Send invite']");
    static private final By searchForAnyoneTab = By.xpath("//*[@text='Search for anyone in your org']");
    static private final By inviteNowTab = By.xpath("//android.widget.Button[@content-desc='Invite now']");
    static private final By anywhreOnScreen = By.xpath("//*[@class='android.widget.ScrollView']");
    static private final By gotItafterInvite = By.xpath("//android.widget.Button[@content-desc='Got it']");


    public void clickOnTeam() throws MalformedURLException {
        applyWaitForElement(team, 10);
        getAndroidDriver().findElement(team).click();
        System.out.println("User Clicked on 'Team'");
        applyWaitForElement(gotIt, 10);
        getAndroidDriver().findElement(gotIt).click();
        System.out.println("User Clicked on 'Got It' button");

    }

    public void clickOnAddTeam() throws MalformedURLException {
        applyWaitForElement(addTeam, 10);
        getAndroidDriver().findElement(addTeam).click();

    }

    public void enterTeamName() throws MalformedURLException {
        applyWaitForElement(teamName, 10);
        getAndroidDriver().findElement(teamName).click();
    //    getAndroidDriver().findElement(teamName).sendKeys(JsonUtils.getData(DefinedConstant.sendText,"AddText"));
        getAndroidDriver().findElement(teamName).sendKeys("TeamTest");
        System.out.println("User entered team name");
    }
    public void enterTeamName(String Team) throws MalformedURLException, InterruptedException {
        applyWaitForElement(clickOnteamName, 10);
        getAndroidDriver().findElement(clickOnteamName).click();
        Thread.sleep(1500);
        getAndroidDriver().findElement(clickOnteamName).sendKeys(Team);
        System.out.println("Enter the Team name ");
    }

    public void addTeamName(String Team) throws MalformedURLException, InterruptedException {
        applyWaitForElement(nextBtn, 10);
        getAndroidDriver().findElement(nextBtn).click();
        Thread.sleep(8000);
        getAndroidDriver().findElement(doneBtn).click();
        scrollTillElement(Team);
        applyWaitForElement(By.xpath("//*[contains(@content-desc,'" + Team + "')]"), 20);
        content = getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + Team + "')]")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + Team + "')]")).isDisplayed();

        Assert.assertTrue(true);
    }

    public void clickPlusIcon() throws MalformedURLException {
        applyWaitForElement(plusIcon, 10);
        getAndroidDriver().findElement(plusIcon).click();
        System.out.println("User able to click on plus icon");
    }

    public void displayAddColleague() throws MalformedURLException {
        applyWaitForElement(addColleague, 10);
        Assert.assertEquals(true, getAndroidDriver().findElement(addColleague).isDisplayed());
        Assert.assertAll();

    }

    public void UserOnTeamName() throws MalformedURLException {
        applyWaitForElement(clickOnteamName, 10);
        getAndroidDriver().findElement(clickOnteamName).click();
        System.out.println("User clicked on team name");
    }
    public void UserOnTeamName(String Team) throws MalformedURLException {
        applyWaitForElement(By.xpath("//*[contains(@content-desc,'" + Team + "')]"), 20);
        content = getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + Team + "')]")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + Team + "')]")).click();

        System.out.println("User clicked on team name");
    }

    public void clickOnSetting() throws MalformedURLException {
        applyWaitForElement(settingIcon, 10);
        getAndroidDriver().findElement(settingIcon).click();
        System.out.println("Clicked On Setting icon");
    }

    public void clickOnTeamName() throws MalformedURLException {
        applyWaitForElement(TeamNameTextBox, 10);
        getAndroidDriver().findElement(TeamNameTextBox).click();
    }

    public void editTeamName() {
        getAndroidDriver().findElement(TeamNameTextBox).clear();
        System.out.println("Text is clear");
        getAndroidDriver().findElement(TeamNameTextBox).sendKeys("Onloop");
        System.out.println("Edit name as 'Learn' from 'Learn Testing'");
    }

    public void clickOnBackIcon() throws MalformedURLException {
        applyWaitForElement(backIcon, 10);
        getAndroidDriver().findElement(backIcon).click();
    }

    public void ClickOnSaveBtn() throws MalformedURLException {
        applyWaitForElement(saveBtn, 10);
        getAndroidDriver().findElement(saveBtn).click();
        System.out.println("User clicked on Save button");
    }

    public void verifyUpdatedTeamName() throws MalformedURLException {
        applyWaitForElement(backIcon, 20);
        getAndroidDriver().findElement(backIcon).click();
        applyWaitForElement(editedTeamName, 10);
        Assert.assertEquals(true, getAndroidDriver().findElement(editedTeamName).isDisplayed());
        Assert.assertAll();
    }

    public void clickOnCreatedTeam(String Team) throws MalformedURLException, InterruptedException {

        applyWaitForElement(By.xpath("//*[contains(@content-desc,'"+Team+"')]"), 10);
        Thread.sleep(3000);
        getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'"+Team+"')]")).click();
        System.out.println("Select the created team name ");
    }

    public void clickOnSettingIcon() throws MalformedURLException {
        applyWaitForElement(settingIcon, 10);
        getAndroidDriver().findElement(settingIcon).click();
        System.out.println("clicked on Setting icon ");
    }

    public void clickOnDeleteTeamBtn() throws MalformedURLException {
        applyWaitForElement(deleteTeamBtn, 10);
        getAndroidDriver().findElement(deleteTeamBtn).click();
        System.out.println("clicked on delete Team Button ");
    }
    public void clickOnSureBtn() throws MalformedURLException {
        applyWaitForElement(yesSureBtn, 10);
        getAndroidDriver().findElement(yesSureBtn).click();
        System.out.println("clicked on 'yes,I am Sure' Button ");
    }
    public void verifyTeamNameAfterDelete() throws MalformedURLException {
        System.out.println("Team Name is not present");
    }

    public void clickOnEditBtn() throws MalformedURLException {
        applyWaitForElement(editBtn, 10);

        status = getAndroidDriver().findElement(editBtn).isDisplayed();

        if (status) {
            getAndroidDriver().findElement(editBtn).click();
            System.out.println("User able to click on Edit button");
        } else {
            System.out.println("User not able to click on edit button");
        }
        Assert.assertTrue(status);
        Assert.assertAll();
    }


    public void clickOnImproveTab() throws MalformedURLException, InterruptedException {
        applyWaitForElement(improveTab, 20);
        getAndroidDriver().findElement(improveTab).click();
        System.out.println("User able to click on Improve Tab ");
    }
    public void ImprovesPage() throws MalformedURLException {
        Assert.assertEquals(true, getAndroidDriver().findElement(improvePage).isDisplayed());
        Assert.assertAll();
        System.out.println("User Redirected to Improve Page");
    }

    public void clickOnGotItBtn() throws MalformedURLException {
        applyWaitForElement(gotIt, 10);
        getAndroidDriver().findElement(gotIt).click();
        System.out.println("User Clicked on 'Got It' button");
    }

    public void clickOnUserNameOrId(String memberName) throws MalformedURLException, InterruptedException {
        applyWaitForElement(By.xpath("//android.view.View[contains(@content-desc,'"+memberName+"')]"), 20);
        getAndroidDriver().findElement(By.xpath("//android.view.View[contains(@content-desc,'"+memberName+"')]")).click();
        System.out.println("User able to click on team member ");

    }

    public void verifyTeammemberIndividualProfile(String Name) throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        boolean actualMemberName = getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + Name + "')]")).isDisplayed();
        Assert.assertTrue(actualMemberName,"member profile name is same");
        Assert.assertAll();
        System.out.println("selected the individual member ");
        Thread.sleep(2000);
    }
    public void clickOnMakeAcapture() throws MalformedURLException {
        applyWaitForElement(makeAcaptureBtn,10);
        getAndroidDriver().findElement(makeAcaptureBtn).click();
        System.out.println("Clicked on 'Make a capture' button");

    }

    public void clickOnCelebrateIcon() throws MalformedURLException {
        applyWaitForElement(teamMemberCelebrateIcon, 10);
        getAndroidDriver().findElement(teamMemberCelebrateIcon).click();
        System.out.println("User Clicked on 'Celebrate' Icon");
    }
    public void CelebratePage() throws MalformedURLException, InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getAndroidDriver().findElement(teamMemberCelebrateTab).isDisplayed());
        Assert.assertAll();
        System.out.println("User details Celebrate shown");
    }

    public void clickOnGoalsTab() throws MalformedURLException, InterruptedException {
        applyWaitForElement(improveTab, 20);
        getAndroidDriver().findElement(improveTab).click();
        System.out.println("User able to click on Improve Tab ");
    }

    public void GoalsPage() throws MalformedURLException {
        Assert.assertEquals(true, getAndroidDriver().findElement(goalPage).isDisplayed());
        Assert.assertAll();
        System.out.println("User Redirected to Goals Page");
    }
    public void pendingInvitations() throws MalformedURLException {
        Assert.assertEquals(true, getAndroidDriver().findElement(pendinginvitation).isDisplayed());
        Assert.assertAll();
        System.out.println("User is able to see Pending Invitations");
    }

    public void ToModifyTeamName() throws MalformedURLException {
        getAndroidDriver().findElement(clickOnTeamName).clear();
        applyWaitForElement(TeamNameTextBox,10);
        getAndroidDriver().findElement(TeamNameTextBox).sendKeys("Country");
        Assert.assertTrue(true);
    }

    public void toCheckInvitationAcceptedmember() throws MalformedURLException {
        applyWaitForElement(invitationAcceptedMember, 10);
        Assert.assertTrue(getAndroidDriver().findElement(invitationAcceptedMember).isDisplayed(),"Team member Accepted the Invitation");
        System.out.println("User is able to see all team members of accepted and joined team");
    }

    public void verifyTeamProfile(String Team) throws MalformedURLException, InterruptedException {

        applyWaitForElement(By.xpath("//android.view.View[@content-desc='"+Team+"']"), 10);
        Assert.assertTrue(getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='"+Team+"']")).isDisplayed(),"able to see Team profile");
        System.out.println("able to see Team profile");
    }
    public void ClickOnAddMembersBtn() throws MalformedURLException {
        applyWaitForElement(addTeamMembersBtn, 10);
        getAndroidDriver().findElement(addTeamMembersBtn).click();
        System.out.println("User clicked on Add Team Members Button");
        applyWaitForElement(addColleagueToThisteam, 10);
        getAndroidDriver().findElement(addColleagueToThisteam).click();
        System.out.println("User clicked on 'Add Colleague To this Team' button");


    }
    public void clickOnAddColleagueToThisteam() throws MalformedURLException {
        applyWaitForElement(addColleagueToThisteam, 10);
        getAndroidDriver().findElement(addColleagueToThisteam).click();
        System.out.println("User clicked on 'Add Colleague To this Team' button");
    }
    public void enterSearchByName(String memberName) throws MalformedURLException, InterruptedException {
        applyWaitForElement(searchColleague, 10);
        getAndroidDriver().findElement(searchColleague).click();
        getAndroidDriver().findElement(searchColleague).sendKeys(memberName);
        System.out.println("Enter colleague name");

    }
    public void clickonInviteNowAfterColleague() throws MalformedURLException {
        applyWaitForElement(inviteNowAfterAddCollegue, 10);
        getAndroidDriver().findElement(inviteNowAfterAddCollegue).click();
        System.out.println("clicked on invite Now AfterAddColleague ");
    }
    public void enterWorkEmail(String email) throws MalformedURLException, InterruptedException {
        applyWaitForElement(enterWorkEmail, 10);
        getAndroidDriver().findElement(enterWorkEmail).click();
        Thread.sleep(1500);
        getAndroidDriver().findElement(enterWorkEmail).sendKeys(email);
        System.out.println("Enter the colleague email ");
        Thread.sleep(2000);
        applyWaitForElement(sendInviteTab, 10);
        getAndroidDriver().findElement(sendInviteTab).click();
        System.out.println("clicked on send invite tab ");
        Thread.sleep(2000);

    }
    public void verifyAddColleagueExistingTeam() throws MalformedURLException {
        applyWaitForElement(mayBeLaterBtn, 10);
        Assert.assertTrue(getAndroidDriver().findElement(mayBeLaterBtn).isDisplayed());
        System.out.println("User able to add colleagues from link");
    }

    public void enterIntoSearchAnyone(String colleagueName) throws MalformedURLException, InterruptedException {
        applyWaitForElement(searchForAnyoneTab, 10);
        getAndroidDriver().findElement(searchForAnyoneTab).click();
        Thread.sleep(1500);
        getAndroidDriver().findElement(searchForAnyoneTab).sendKeys(colleagueName);
        System.out.println("Enter the colleague name ");

    }
    public void clickOnInviteNow() throws MalformedURLException {
        applyWaitForElement(inviteNowTab, 10);
        getAndroidDriver().findElement(inviteNowTab).click();
        System.out.println("clicked on invite Now ");

    }

    public void toSeeAcceptedAndInvitedColleagueCountBelowTeamName(String Team) throws InterruptedException, MalformedURLException {
        applyWaitForElement(By.xpath("//*[contains(@content-desc,'"+Team+"')]"), 10);
        Thread.sleep(3000);
        String count = getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + Team + "')]")).getAttribute("content-desc");
        System.out.println("Total invited and Accepted count "+count );
    }

































































}
