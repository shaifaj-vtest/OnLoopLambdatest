package com.gk.test.page_objects.mobile;

import com.gk.test.framework.AndroidObject;

import com.gk.test.framework.helpers.utils.DefinedConstant;
import com.gk.test.framework.helpers.utils.JsonUtils;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.util.List;

import static com.gk.test.framework.helpers.AndroidHelper.getAndroidWebDriver;


public class Manager_HomePage extends AndroidObject {

    SoftAssert Assert = new SoftAssert();
    boolean status;
    String value, content;

    public Manager_HomePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAndroidDriver()), this);
    }


    static private final By totalCaptures = By.xpath("//*[contains(@content-desc,'Total')]");
    static private final By captureCount = By.xpath("//*[@content-desc='Private by default']");
    //(//*[@content-desc='Private by default']//following::android.view.View)[2]
    static private final By captureColleagues = By.xpath("(//*[contains(@content-desc,'Colleagues')])[1]");
    static private final By captureColleaguesCount = By.xpath("//*[@content-desc='Private by default']");
    //(//*[@content-desc='Private by default']//following::android.view.View)[3]
    static private final By addColleagueBtn = By.xpath("(//*[@class='android.widget.ImageView'])[6]");
    static private final By addColleagueScreen = By.xpath("//android.view.View[@content-desc=\"Add Colleague\"]");
    static private final By closeBtn = By.xpath("(//*[@class='android.widget.ImageView'])[1]");
    static private final By ColleagueInfo = By.xpath("(//*[@class=\"android.view.View\"])[8]");
    static private final By inviteNowBtn = By.xpath("//android.widget.Button[@content-desc=\"Invite now\"]");
    static private final By inviteToConnectScreen = By.xpath("//android.view.View[@content-desc=\"Invite to Connect\"]");
    static private final By backArrow = By.xpath("(//*[@class=\"android.widget.ImageView\"])[1]");
    static private final By enterColleagueName = By.xpath("(//*[@class=\"android.widget.EditText\"])[1]");
    static private final By enterInviteByMailId = By.xpath("(//*[@class=\"android.widget.EditText\"])[2]");
    static private final By sendInviteBtn = By.xpath("//android.widget.Button[@content-desc=\"Send invite\"]");
    public static final By inviteSentTxt = By.xpath("//android.widget.ImageView[contains(@content-desc,'Nice! Your invite has been sent')]");
    static private final By maybeLaterBtn = By.xpath("//android.widget.Button[@content-desc=\"Maybe later\"]");
    static private final By captureNowBtn = By.xpath("//android.widget.Button[@content-desc=\"Capture Now\"]");
    static private final By captureBtn = By.xpath("//android.view.View[@content-desc=\"Capture\"]");
    static private final By captureThoughtScreen = By.xpath("//android.view.View[@content-desc=\"Capture a thought\"]");
    static private final By celebrate = MobileBy.AccessibilityId("Celebrate");
    static private final By whoToCaptureTxt = By.xpath("//android.view.View[@content-desc=\"Who would you like to Capture on?\"]");
    static private final By searchColleague = By.xpath("(//*[@class='android.widget.ImageView'])[5]");
    static private final By searchColleagueTxtBx = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
    static private final By selectColleague = By.xpath("//android.view.View[contains(@content-desc,'Prashant Thombre')]");
    static private final By stoodOutTxt = By.xpath("//android.view.View[contains(@content-desc,'What stood out')]");
    static private final By stoodOutTxtBx = By.className("android.widget.EditText");
    static private final By tagCategoryTxt = By.xpath("//android.view.View[@content-desc=\"Select a tag category\"]");
    static private final By selectTagCategory = By.xpath("//android.widget.Button[@content-desc=\"Growth Mindset\"]");
    static private final By relevantTagTxt = By.xpath("//android.view.View[@content-desc=\"Select relevant tags\"]");
    static private final By selectRelevantTag = By.xpath("//android.widget.Button[@content-desc=\"Resilience To Adversity\"]");
    static private final By shareSettingsTxt = By.xpath("//android.view.View[@content-desc=\"Share settings\"]");
    static private final By savePrivatelyBtn = By.xpath("//android.widget.ImageView[contains(@content-desc,'Save privately')]");
    static private final By sharePrivatelyBtn = By.xpath("//android.widget.ImageView[contains(@content-desc,'Share privately')]");
    static private final By saveCapture = By.xpath("//android.widget.Button[contains(@content-desc,'Save')]");
    static private final By searchTxtBx = By.xpath("//*[contains(@text,'Search')]");
    static private final By selectSearch = By.xpath("(//android.widget.Button)[2]");
    static private final By profileDetails = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
    static private final By addWithoutInviteTxt = By.xpath("//android.view.View[@content-desc=\"Add without inviting\"]");
    static private final By addWithoutInviteContent = By.xpath("//android.view.View[contains(@content-desc,'Create a private colleague profile')]");
    static private final By createPvtColleagueBtn = By.xpath("//android.widget.Button[@content-desc=\"Create private colleague\"]");
    static private final By createColleagueScreen = By.xpath("//android.view.View[@content-desc=\"Create colleague\"]");
    static private final By createColleagueBtn = By.xpath("//android.widget.Button[@content-desc=\"Create private colleague\"]");
    static private final By profileCreateTxt = By.className("android.widget.ImageView");
    static private final By newPvtProfile = By.xpath("(//android.widget.ImageView)[2]");
    static private final By filterBtn = By.xpath("//android.widget.ImageView[contains(@content-desc,'Filters')]");
    static private final By filterResetBtn = By.xpath("//android.view.View[@content-desc=\"Reset\"]");
    static private final By allTime = By.xpath("//android.view.View[@content-desc=\"All Time\"]");
    static private final By thisWeek = By.xpath("//android.view.View[@content-desc=\"This Week\"]");
    static private final By thisMonth = By.xpath("//android.view.View[@content-desc=\"This Month\"]");
    static private final By filterCalender = By.xpath("//android.view.View[contains(@content-desc,'Start Date')]");
    static private final By dateRangeTxt = By.xpath("//android.view.View[@content-desc=\"Select date range\"]");
    static private final By startDate = By.xpath("(//android.view.View[contains(@content-desc,'1')])[1]");
    static private final By endDate = By.xpath("//android.view.View[contains(@content-desc,'11')]");
    static private final By viewSelect = By.xpath("//android.view.View[@content-desc=\"View\"]");
    static private final By capturesBy = By.xpath("//android.view.View[@content-desc=\"Captures by\"]");
    static private final By sortBy = By.xpath("//android.view.View[@content-desc=\"Sort by\"]");
    static private final By applyFilterBtn = By.className("android.widget.Button");
    static private final By inboxBtn = By.xpath("(//android.widget.ImageView)[3]");
    static private final By inboxScreen = By.xpath("//android.view.View[@content-desc=\"Inbox\"]");
    static private final By notificationTab = By.xpath("//*[contains(@content-desc,'Notification')]");
    static private final By requestTab = By.xpath("//android.view.View[@content-desc=\"Requests\"]");
    static private final By addAsManagerRequest = By.xpath("//android.widget.ImageView[contains(@content-desc,'add you as their manager!')]");
    static private final By addRequestTxt = By.xpath("(//android.view.View)[5]");
    static private final By rejectBtn = By.xpath("//android.widget.Button[@content-desc=\"Reject\"]");
    static private final By acceptBtn = By.xpath("//android.widget.Button[@content-desc=\"Accept\"]");
    static private final By captureCompleteNotification = By.xpath("(//android.widget.ImageView[contains(@content-desc,'Your request was completed')])[1]");
    static private final By captureRequestScreen = By.xpath("//android.view.View[@content-desc=\"Capture Request\"]");
    static private final By captureRequestTxt = By.xpath("(//android.view.View)[8]");
    static private final By requestStatus = By.xpath("//android.view.View[@content-desc=\"All\"]");
    static private final By sentOrReceivedBy = By.xpath("//android.view.View[@content-desc=\"Anyone\"]");
    static private final By iIcon = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
    static private final By colleagueDetailsScreen = By.xpath("//android.view.View[@content-desc=\"Colleague Details\"]");
    static private final By deleteIcon = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
    static private final By deleteColleagueContent = By.xpath("//android.view.View[contains(@content-desc,'Delete Colleague?')]");
    static private final By deleteBtn = By.xpath("//android.widget.Button[@content-desc=\"Delete\"]");
    static private final By cancelBtn = By.xpath("//android.widget.Button[@content-desc=\"Cancel\"]");
    static private final By totalCelebrates = new MobileBy.ByAndroidUIAutomator("new UiSelector().descriptionContains(\"Total\")");
    static private final By improveTab = By.xpath("//android.widget.ImageView[@content-desc=\"Tab 2 of 3\"]");
    static private final By improveTag = By.xpath("//*[@content-desc='Improve']");
    static private final By viewAllTags = By.xpath("//android.view.View[@content-desc=\"View All\"]");
    static private final By tapTagsScreen = By.xpath("//android.view.View[@content-desc=\"Top Tags\"]");
    static private final By celebrateTags = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View");
    static private final By questionMarkIcon = By.xpath("//*[@index='13']");
   // (//*[@class='android.view.View'])[23]
    static private final By contributingPopUp = By.xpath("//android.view.View[@content-desc=\"Contributing Captures\"]");
    static private final By contributingPopUpContent = By.xpath("//android.view.View[contains(@content-desc,'Only Captures made by you')]");
    static public final By noCaptureYetContent = By.xpath("//android.view.View[contains(@content-desc,'No Captures Yet')]");
    static public final By captureSharedOn = By.xpath("//android.widget.ImageView[contains(@content-desc,'Shared on')]");
    static private final By capturedBy = By.xpath("(//android.view.View[contains(@content-desc,'Captured by')])[1]");
    static private final By sharedBy = By.xpath("(//android.widget.ImageView[contains(@content-desc,\"Shared on\")])");
    static private final By viewCaptureScreen = By.xpath("//android.view.View[@content-desc=\"View Capture\"]");
    static private final By capturedOn = By.xpath("//android.view.View[contains(@content-desc,\"Captured on\")]");
    static private final By replies = By.xpath("//android.view.View[@content-desc=\"Replies\"]");
    static private final By rightReaction = By.xpath("//android.view.View[@content-desc=\"✅\"]");
    static private final By replyTxtBX = By.className("android.widget.EditText");
    static private final By sendArrow = By.xpath("//android.widget.EditText/following-sibling::android.widget.ImageView");
    static private final By capturedByName = By.xpath("(//android.view.View)[7]");
    static private final By commentDetails = By.xpath("(//android.view.View)[8]");
    static private final By captureConversions = By.xpath("//android.view.View[contains(@content-desc,'Conversations happen when')]");
    static private final By reactionSymbol = By.xpath("//android.view.View[@content-desc=\"✅\"]");
    static private final By AddText = By.xpath("//*[@text='✅, Reply']");
    static private final By SendBtn = By.xpath("(//*[@class='android.widget.ImageView'])[5]");
    static private final By countOfPrism = By.xpath("(//android.widget.Toast)[1])");
    static private final By GoalTab = By.xpath("//*[@content-desc='Tab 3 of 3']");
    //*[@content-desc='Goals']
    //   static private By OngoingGoals = By.xpath("(//*[@class='android.view.View'])[13]");
    static private final By GoalsFilters = By.xpath("//*[@content-desc='Filters']");
    static private final By AllTime = By.xpath("//*[@content-desc='All Time']");
    static private final By ThisMonth = By.xpath("//*[@content-desc='This Month']");
    static private final By DateRange = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
    static private final By selectStartDate = By.xpath("//*[@content-desc='11, Monday, July 11, 2022']");
    static private final By selectEndtDate = By.xpath("//*[@content-desc='19, Tuesday, July 19, 2022']");
    static private final By clickOnSaveBtn = By.xpath("//*[@content-desc='Save']");
    static private final By SelectGoalType = By.xpath("//*[@content-desc='Project']");
    //  static private final By SelectGoalType = By.xpath("//*[@content-desc='Goal type']");
    static private final By SelectGoalStatus = By.xpath("//*[@content-desc='Ongoing']");
    // static private final By SelectGoalStatus = By.xpath("//*[@content-desc='Goal status']");
    static private final By SelectPriority = By.xpath("//*[@content-desc='Low']");
    //  static private final By SelectPriority = By.xpath("//*[@content-desc='Priority']");
    static private final By SelectCreatedBy = By.xpath("//*[@content-desc='Colleagues']");
    //  static private final By SelectCreatedBy = By.xpath("//*[@content-desc='Created by']");
    static private final By SelectSortBy = By.xpath("//*[@content-desc='Least Recent']");
    //   static private final By SelectSortBy = By.xpath("//*[@content-desc='Sort by']");
    static private final By ClickOnApplyFilter = By.xpath("//*[@content-desc='Apply Filter']");
    static private final By LastQuarter = By.xpath("//*[@content-desc='Last Quarter']");
    static private final By afterapplyiingFilter = By.xpath("//*[contains(@content-desc,\"Filters\")]");
    static private final By clickOnResetButton = By.xpath("//*[@content-desc='Reset']");
    static private final By countofGoals = By.xpath("(//*[@class='android.view.View'])[10]");
    static private final By OngoingGoals = By.xpath("//*[contains(@content-desc,\"Achieve 123 abc by end of Q2, 2022\")]");
    static private final By EditIcon = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
    static private final By MarkasComplete = By.xpath("//*[@content-desc='Mark as complete']");
    static private final By Completebtn = By.xpath("//*[@content-desc='Complete']");
    static private final By saveGoal = By.xpath("//*[@content-desc='Save Goal']");
    static private final By Filter = By.xpath("//*[@content-desc='Filters']");
    static private final By CancelBtn = By.xpath("//*[@content-desc='Cancel']");
    static private final By conversationTab = By.xpath("//android.widget.Button[@content-desc=\"Conversation\"]");
    static private final By conversationDetails = By.xpath("(//*[@class='android.widget.ImageView'])[7]");
    //(//android.widget.Button[@content-desc="Conversation"]//following::android.widget.ImageView)[1]
    static private final By tipsNSupport = By.xpath("//android.view.View[@content-desc=\"Share tips & support\"]");
    static private final By tipsNSupportContent = By.xpath("//android.view.View[contains(@content-desc,'Help your direct succeed')]");
    static private final By insightsTab = By.xpath("//android.widget.Button[@content-desc=\"Insights\"]");
    static private final By overview = By.xpath("//android.view.View[@content-desc=\"Overview\"]");
    static private final By targetBaseline = By.xpath("//android.view.View[@content-desc=\"Baseline\"]");
    static private final By baselineValue = By.xpath("(//android.view.View[@content-desc=\"Current\"]//following::android.view.View)[1]");
    static private final By baseValue = By.xpath("(//android.view.View[@content-desc=\"Overview\"]");
    static private final By targetCurrent = By.xpath("//android.view.View[@content-desc=\"Current\"]");
    static private final By targetStatus = By.xpath("//android.view.View[@content-desc=\"Target\"]");
    static private final By targetValue = By.xpath("(//android.view.View[@content-desc=\"Baseline\"]//preceding::android.view.View)[7]");
    static private final By captureProgressBtn = By.xpath("//android.widget.Button[@content-desc=\"Capture progress\"]");
    static private final By milestonesHeading = By.xpath("//android.view.View[@content-desc=\"Milestones\"]");
    static private final By radioButton = By.xpath("(//android.view.View[@content-desc=\"Milestones\"]//following::android.widget.ImageView)[1]");
    static private final By milesoneContent = By.xpath("//android.widget.ImageView[contains(@content-desc,'Another milestone down.')]");
    static private final By goalStatus = By.xpath("(//android.view.View[@content-desc=\"Overview\"]//following::android.view.View)[1]");
    static private final By milestonesStatus = By.xpath("//android.view.View[contains(@content-desc,'Completed')]");
    static private final By CaptureAnotherGoal = By.xpath("//*[contains(@content-desc,\"Capture another Goal\")]");
    static private final By ConversationTab = By.xpath("//*[@content-desc='Conversation']");
    static private final By ReplyBox = By.xpath("//*[@text='Reply']");
    static private final By GoalReactionSymbol = By.xpath("//*[@content-desc='✅']");
    static private final By makeCapture = By.xpath("//android.widget.Button[@content-desc=\"Make a Capture\"]");
    static private final By editOrAddMilestonesBtn = By.xpath("//android.widget.ImageView[@content-desc=\"Edit or add milestones\"]");
    static private final By editGoalScreen = By.xpath("//android.view.View[@content-desc=\"Edit Goal\"]");
    static private final By addAnotherMilestoneBtn = By.xpath("//android.view.View[@content-desc=\"+ Add another milestone\"]");
    static private final By targetGoal = By.xpath("//android.view.View[contains(@content-desc,'Target')]");
    static private final By projectGoal = By.xpath("//android.view.View[contains(@content-desc,'Project')]");
    static private final By behavioralSkillGoal = By.xpath("//android.view.View[contains(@content-desc,'Behavioral skill')]");
    static private final By hardSkillGoal = By.xpath("//android.view.View[contains(@content-desc,'Hard skill')]");
    static private final By viewGoalScreen = By.xpath("//android.view.View[@content-desc=\"View Goal\"]");
    static private final By Edit = By.xpath("(//*[@index=2])[1]");
    static private final By AdditionalContext = By.xpath("//*[@content-desc='Additional context:']");
    static private final By TextBox = By.xpath("//*[@index=10]");
    static private final By page = By.xpath("//*[@index='7']");

    static private final By backbutton = By.xpath("(//*[@class='android.widget.ImageView'])[1]");
    static private final By capture = By.xpath("(//*[@class='android.widget.ImageView'])[1]");
    static private final By SaveandShare = By.xpath("//*[@content-desc='Save and share']");

    static private final By SavecapturePrivately = By.xpath("//*[@content-desc='Save Capture privately']");

    static private final By ShareBtn = By.xpath("(//*[@content-desc='Share'])[1]");
    static private final By SharePrivately = By.xpath("//*[@content-desc='Share privately']");

    static private final By CountOfCelebrate = By.xpath("//android.view.View[contains(@content-desc,'from your manager')]");

    static private final By CountOfusersCelebrate = By.xpath("//android.view.View[contains(@content-desc,'self-Celebrate')]");

    static private final By colleagueAccount = By.xpath("//android.view.View[contains(@content-desc,'prashant@outlookthombre')]");
    static private final By editButton = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
    static private final By saveButton = By.xpath("//android.widget.Button[@content-desc=\"Save Goal\"]");
    static private final By hardSkill = By.xpath("//android.view.View[contains(@content-desc='Hard skill')]");
    static private final By additionalContext = By.xpath("//android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    static private final By doneButton = By.xpath("//android.view.View[@content-desc=\"Done\"]");

    static private final By myself = By.xpath("//android.view.View[contains(@content-desc,'Myself')]");

    static private final By goToLearn = By.xpath("//*[@content-desc='Go to Learn']");
    static private final By gotIt = By.xpath("//*[@content-desc='Got it!']");
    static private final By LearnPage = By.xpath("(//*[@content-desc='Learn'])[1]");


    static private final By AddResourcesTab = By.xpath("//android.widget.Button[@content-desc=\"Add resources\"]");
    static private final By articleTab = By.xpath("//android.widget.ImageView[@content-desc=\"Article\"]");
    static private final By cancelButton = By.xpath("//android.view.View/android.view.View[1]/android.widget.ImageView");
    static private final By arcticletextBox = By.xpath("//*[@text='Tap here to paste link from clipboard']");
    static private final By addNotes = By.xpath("//*[@text='How was this helpful?']");
    static private final By SaveAndShareBtn = By.xpath("//android.widget.Button[@content-desc=\"Save and share resource\"]");

    static private final By profile = By.xpath("//android.view.View[@content-desc=\"P\"]");


    public void TapOnTotalCapture() throws MalformedURLException {
        applyWaitForElement(totalCaptures, 20);
        String captureText = getAndroidDriver().findElement(totalCaptures).getAttribute("content-desc");
        String Captures = getAndroidDriver().findElement(captureCount).getAttribute("content-desc");
        System.out.println(captureText + ":" + Captures);
    }

    public void TapOnCapturedColleagues() throws MalformedURLException {
        applyWaitForElement(captureColleagues, 20);
        content = getAndroidDriver().findElement(captureColleagues).getAttribute("content-desc");
        value = getAndroidDriver().findElement(captureColleaguesCount).getAttribute("content-desc");
        System.out.println(content + ":" + value);
    }

    public void clickAddColleague() throws MalformedURLException {
        applyWaitForElement(addColleagueBtn, 20);
        getAndroidDriver().findElement(addColleagueBtn).click();
        System.out.println("User Clicked on Add Colleague");
        applyWaitForElement(addColleagueScreen, 20);
        status = getAndroidDriver().findElement(addColleagueScreen).isDisplayed();
        if (status) {
            System.out.println("User on Add Colleague Page");
        } else {
            System.out.println("User Not on Add Colleague Page");
        }
        Assert.assertTrue(status);
        Assert.assertAll();
    }

    public void clickInviteNow() throws MalformedURLException {
        content = getAndroidDriver().findElement(ColleagueInfo).getAttribute("content-desc");
        System.out.println("Add and invite to connect:" + "\n" + content);
        applyWaitForElement(inviteNowBtn, 20);
        getAndroidDriver().findElement(inviteNowBtn).click();
    }

    public void ClickCloseButton() throws MalformedURLException {
        applyWaitForElement(closeBtn, 20);
        getAndroidDriver().findElement(closeBtn).click();
        System.out.println("User Clicked Close Arrow");
    }

    public void clickBackButton() {
        try {
            applyWaitForElement(backArrow, 20);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        getAndroidDriver().findElement(backArrow).click();
        System.out.println("User Clicked on Back Arrow");
    }

    @SneakyThrows
    public void enterColleagueName(String name) {
        applyWaitForElement(inviteToConnectScreen, 20);
        status = getAndroidDriver().findElement(inviteToConnectScreen).isDisplayed();
        if (status) {
            System.out.println("User on Invite to Connect Page");
        } else {
            System.out.println("User Not on Invite to Connect Page");
        }
        Assert.assertTrue(status);
        Assert.assertAll();
        applyWaitForElement(enterColleagueName, 20);
        getAndroidDriver().findElement(enterColleagueName).click();
        getAndroidDriver().findElement(enterColleagueName).sendKeys(name);
    }

    public void enterColleagueMailId(String mailid) throws MalformedURLException {
        applyWaitForElement(enterInviteByMailId, 20);
        getAndroidDriver().findElement(enterInviteByMailId).click();
        getAndroidDriver().findElement(enterInviteByMailId).sendKeys(mailid);
    }

    public void clickSendInviteButton() throws MalformedURLException {
        applyWaitForElement(sendInviteBtn, 20);
        getAndroidDriver().findElement(sendInviteBtn).click();
    }

    public void tapOnInviteSentText() throws MalformedURLException {
        applyWaitForElement(inviteSentTxt, 20);
        content = getAndroidDriver().findElement(inviteSentTxt).getAttribute("content-desc");
        System.out.println(content);
    }

    public void clickMayBeLater() throws MalformedURLException {
        applyWaitForElement(maybeLaterBtn, 20);
        getAndroidDriver().findElement(maybeLaterBtn).click();
        System.out.println("User Clicked on Maybe Later Button");
    }

    public void clickCaptureNow() throws MalformedURLException {
        applyWaitForElement(captureNowBtn, 20);
        getAndroidDriver().findElement(captureNowBtn).click();
    }

    public void clickCaptureBtn() throws MalformedURLException {
        applyWaitForElement(captureBtn, 20);
        getAndroidDriver().findElement(captureBtn).click();
    }

    public void tapOnCaptureThoughtScreen() throws MalformedURLException {
        applyWaitForElement(captureThoughtScreen, 20);
        if (getAndroidDriver().findElement(captureThoughtScreen).isDisplayed()) {
            System.out.println("User is on Capture Thought Page");
        } else {
            System.out.println("User is not on Capture Thought Page");
        }
    }

    public void clickOnCelebrate() throws MalformedURLException {
        if (getAndroidDriver().findElement(celebrate).isDisplayed()) {
            System.out.println("User is able to View Celebrate Tap");
            applyWaitForElement(celebrate, 20);
            getAndroidDriver().findElement(celebrate).click();
            System.out.println("User Clicked on Celebrate Tap");
        }
    }

    public void searchColleague() throws MalformedURLException {
        applyWaitForElement(whoToCaptureTxt, 20);
        content = getAndroidDriver().findElement(whoToCaptureTxt).getAttribute("content-desc");
        System.out.println(content);
        applyWaitForElement(searchColleague, 20);
        getAndroidDriver().findElement(searchColleague).click();
    }

    public void selectColleague() throws MalformedURLException {
        applyWaitForElement(searchColleagueTxtBx, 20);
        getAndroidDriver().findElement(searchColleagueTxtBx).sendKeys("Prashant");
        applyWaitForElement(selectColleague, 20);
        getAndroidDriver().findElement(selectColleague).click();
    }

    public void enterStoodOutComment() throws MalformedURLException {
        applyWaitForElement(stoodOutTxt, 20);
        content = getAndroidDriver().findElement(stoodOutTxt).getAttribute("content-desc");
        System.out.println(content);
        applyWaitForElement(stoodOutTxtBx, 20);
        getAndroidDriver().findElement(stoodOutTxtBx).click();
        getAndroidDriver().getKeyboard().sendKeys("Hardworking " + "\n" + "Sincere");
        getAndroidDriver().hideKeyboard();
    }

    public void selectTagCategory() throws MalformedURLException {
        applyWaitForElement(tagCategoryTxt, 20);
        content = getAndroidDriver().findElement(tagCategoryTxt).getAttribute("content-desc");
        System.out.println(content);
        applyWaitForElement(selectTagCategory, 20);
        getAndroidDriver().findElement(selectTagCategory).click();
    }

    public void selectRelevantTags() throws MalformedURLException {
        applyWaitForElement(relevantTagTxt, 20);
        content = getAndroidDriver().findElement(relevantTagTxt).getAttribute("content-desc\n");
        System.out.println(content);
        applyWaitForElement(selectRelevantTag, 20);
        getAndroidDriver().findElement(selectRelevantTag).click();
    }

    public void clickSavePrivatelyBtn() throws MalformedURLException {
        content = getAndroidDriver().findElement(shareSettingsTxt).getAttribute("content-desc");
        System.out.println(content);
        applyWaitForElement(savePrivatelyBtn, 20);
        getAndroidDriver().findElement(savePrivatelyBtn).click();
    }

    public void clickSharePrivatelyBtn() throws MalformedURLException {
//        content = getAndroidDriver().findElement(shareSettingsTxt).getAttribute("content-desc");
//        System.out.println(content);
        applyWaitForElement(sharePrivatelyBtn, 20);
        getAndroidDriver().findElement(sharePrivatelyBtn).click();
    }

    public void clickOnSaveButton() throws MalformedURLException {
        applyWaitForElement(saveCapture, 20);
        getAndroidDriver().findElement(saveCapture).click();
        System.out.println("User Clicked on Save Button");
    }

    public void clickOnSearchTxtBx() throws MalformedURLException {
        applyWaitForElement(searchTxtBx, 20);
        getAndroidDriver().findElement(searchTxtBx).click();
    }

    public void selectSearchedName(String colleague) throws MalformedURLException {
        applyWaitForElement(searchTxtBx, 20);
        getAndroidDriver().findElement(searchTxtBx).sendKeys(colleague);
        applyWaitForElement(selectSearch, 30);
        getAndroidDriver().findElement(selectSearch).click();
        System.out.println("User Searched and Selected Colleague Name is:" + colleague);

    }

    public void tapOnProfileDetails() throws MalformedURLException {
        applyWaitForElement(profileDetails, 30);
        String value = getAndroidDriver().findElement(profileDetails).getAttribute("content-desc");
        System.out.println("User is on Profile of:" + value);

    }

    public void clickCreatePrivateColleagueBtn() throws MalformedURLException {
        applyWaitForElement(addWithoutInviteTxt, 20);
        String value = getAndroidDriver().findElement(addWithoutInviteTxt).getAttribute("content-desc");
        applyWaitForElement(addWithoutInviteContent, 20);
        String content = getAndroidDriver().findElement(addWithoutInviteContent).getAttribute("content-desc");
        System.out.println(value + ":" + "\n" + content);
        applyWaitForElement(createPvtColleagueBtn, 20);
        getAndroidDriver().findElement(createPvtColleagueBtn).click();
        System.out.println("User Clicked on Create Private Colleague Button");

    }

    public void TapOnCreateColleagueScreen(String name) throws MalformedURLException {
        applyWaitForElement(createColleagueScreen, 20);
        status = getAndroidDriver().findElement(createColleagueScreen).isDisplayed();
        if (status) {
            System.out.println("User is on Create Colleague Screen");
        } else {
            System.out.println("User is Not on Create Colleague Screen");
        }
        Assert.assertTrue(status);
        Assert.assertAll();
        applyWaitForElement(enterColleagueName, 20);
        getAndroidDriver().findElement(enterColleagueName).click();
        getAndroidDriver().findElement(enterColleagueName).sendKeys(name);
        System.out.println("User Entered the Name");
    }

    public void clickOnCreatePvtColleague() throws MalformedURLException {
        applyWaitForElement(createColleagueBtn, 20);
        getAndroidDriver().findElement(createColleagueBtn).click();
        System.out.println("User Clicked on Create Private Colleague");
    }

    public void profileCreatedPopUp() throws MalformedURLException {
        applyWaitForElement(profileCreateTxt, 20);
        String value = getAndroidDriver().findElement(profileCreateTxt).getAttribute("content-desc");
        System.out.println(value);
    }

    public void tapOnNewProfile() throws MalformedURLException {
        applyWaitForElement(newPvtProfile, 20);
        String value = getAndroidDriver().findElement(newPvtProfile).getAttribute("content-desc");
        System.out.println("Profile Name:" + value);
    }

    public void clickOnFilters() throws MalformedURLException {
        applyWaitForElement(filterBtn, 20);
        getAndroidDriver().findElement(filterBtn).click();
        System.out.println("User Clicked on Filters & Its on Filters Page");
    }

    public void clickOnReset() throws MalformedURLException {
        applyWaitForElement(filterResetBtn, 20);
        getAndroidDriver().findElement(filterResetBtn).click();
        System.out.println("User Clicked on Reset");
    }

    public void clickOnCalender() throws MalformedURLException {
        applyWaitForElement(filterCalender, 20);
        getAndroidDriver().findElement(filterCalender).click();
        System.out.println("User Clicked on Calender");
    }

    public void viewCaptureFrom(String from) throws MalformedURLException {
        applyWaitForElement(allTime, 20);
        content = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + from + "']")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + from + "']")).click();
        System.out.println("View Captures From:" + content);
    }

    public void selectDateRange() throws MalformedURLException {
        applyWaitForElement(dateRangeTxt, 20);
        String value = getAndroidDriver().findElement(dateRangeTxt).getAttribute("content-desc");
        System.out.println(value + ":");
        applyWaitForElement(startDate, 20);
        getAndroidDriver().findElement(startDate).click();
        String start = getAndroidDriver().findElement(startDate).getAttribute("content-desc");
        applyWaitForElement(endDate, 20);
        getAndroidDriver().findElement(endDate).click();
        String end = getAndroidDriver().findElement(endDate).getAttribute("content-desc");
        System.out.println(start + " To " + end);
    }

    public void selectView(String value) throws MalformedURLException {
        applyWaitForElement(viewSelect, 20);
        content = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + value + "']")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + value + "']")).click();
        System.out.println("Selected View is:" + content);
    }

    public void selectCaptureBy(String value) throws MalformedURLException {
        applyWaitForElement(capturesBy, 20);
        content = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + value + "']")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + value + "']")).click();
        System.out.println("Captured By:" + content);
    }

    public void selectSortBy(String value) throws MalformedURLException {
        applyWaitForElement(sortBy, 20);
        getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + value + "']")).click();
        content = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + value + "']")).getAttribute("content-desc");
        System.out.println("Sorted By:" + content);
    }

    public void selectRequestStatus(String value) throws MalformedURLException {
        applyWaitForElement(requestStatus, 20);
        getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + value + "']")).click();
        content = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + value + "']")).getAttribute("content-desc");
        System.out.println("Requested Status:" + content);
    }

    public void selectSentOrReceivedBy(String value) throws MalformedURLException {
        applyWaitForElement(sentOrReceivedBy, 20);
        getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + value + "']")).click();
        content = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + value + "']")).getAttribute("content-desc");
        System.out.println("Sent or Received By:" + content);
    }

    public void clickApplyFilterBtn() throws MalformedURLException {
        applyWaitForElement(applyFilterBtn, 20);
        getAndroidDriver().findElement(applyFilterBtn).click();
        System.out.println("User Clicked on Apply Filer Button");
    }

    public void clickOnInbox() throws MalformedURLException {
        applyWaitForElement(inboxBtn, 10);
        getAndroidDriver().findElement(inboxBtn).click();
        System.out.println("User Clicked on Inbox Button");
        applyWaitForElement(inboxScreen, 20);
        status = getAndroidDriver().findElement(inboxScreen).isDisplayed();
        if (status) {
            System.out.println("User is on Inbox Page");
        } else {
            System.out.println("User is Not on Inbox Page");
        }
        Assert.assertTrue(status);
        Assert.assertAll();
    }

    public void clickOnNotificationTab() throws MalformedURLException {
        applyWaitForElement(notificationTab, 10);
        getAndroidDriver().findElement(notificationTab).click();
        System.out.println("User Clicked on Notification Tab");
    }

    public void clickOnRequestTab() throws MalformedURLException {
        applyWaitForElement(requestTab, 10);
        getAndroidDriver().findElement(requestTab).click();
        System.out.println("User Clicked on Request Tab");
    }

    @SuppressWarnings("CommentedOutCode")
    public void clickOnAddAsManagerRequest() throws MalformedURLException {

        if (getAndroidDriver().findElements(addAsManagerRequest).size() > 0) {
            applyWaitForElement(addAsManagerRequest, 20);
            getAndroidDriver().findElement(addAsManagerRequest).click();
            System.out.println("User Clicked on Add Request");
            applyWaitForElement(addRequestTxt, 20);
            content = getAndroidDriver().findElement(addRequestTxt).getAttribute("content-desc");
            System.out.println(content);
            applyWaitForElement(acceptBtn, 30);
            getAndroidDriver().findElement(acceptBtn).click();
            System.out.println("User Clicked on Accept Button");
//            applyWaitForElement(rejectBtn,10);
//            getAndroidDriver().findElement(rejectBtn).click();
        } else {
            System.out.println("Add As Manager Request Not Ye Received");
        }
    }

    public void clickOnAccept() throws MalformedURLException {
        applyWaitForElement(acceptBtn, 20);
        getAndroidDriver().findElement(acceptBtn).click();
        System.out.println("User Clicked Accept Button");
    }

    public void clickOnReject() throws MalformedURLException {
        applyWaitForElement(rejectBtn, 20);
        getAndroidDriver().findElement(rejectBtn).click();
        System.out.println("User Clicked Reject Button");
    }

    public void clickOnCaptureCompleteNotification() throws MalformedURLException {
        applyWaitForElement(captureCompleteNotification, 20);
        content = getAndroidDriver().findElement(captureCompleteNotification).getAttribute("content-desc");
        System.out.println(content);
        getAndroidDriver().findElement(captureCompleteNotification).click();
        System.out.println("User Clicked on Capture complete Notification Button");
    }

    public void TapOnCaptureRequest() throws MalformedURLException {
        applyWaitForElement(captureRequestScreen, 20);
        status = getAndroidDriver().findElement(captureRequestScreen).isDisplayed();
        if (status) {
            System.out.println("User is on Capture Request Page");
        }
        applyWaitForElement(captureRequestTxt, 10);
        content = getAndroidDriver().findElement(captureRequestTxt).getAttribute("content-desc");
        System.out.println(content);
    }

    public void displayFilter() throws MalformedURLException {
        applyWaitForElement(filterBtn, 20);
        content = getAndroidDriver().findElement(filterBtn).getAttribute("content-desc");
        System.out.println("Applied Filter on Request Tab is:" + content);
    }

    public void clickOnColleagueProfile(String name) throws MalformedURLException {
        applyWaitForElement(By.xpath("//*[contains(@content-desc,'" + name + "')]"), 20);
        content = getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + name + "')]")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + name + "')]")).click();
        System.out.println("User Clicked on Profile of:" + "\n" + content);
    }

    public void clickOnIIcon() throws MalformedURLException {
        applyWaitForElement(iIcon, 20);
        getAndroidDriver().findElement(iIcon).click();
        System.out.println("User Clicked on I Icon");
        applyWaitForElement(colleagueDetailsScreen, 30);
        status = getAndroidDriver().findElements(colleagueDetailsScreen).size() > 0;
        if (status) {
            applyWaitForElement(colleagueDetailsScreen, 20);
            System.out.println("User is on Colleague Details Screen");
        }
        Assert.assertTrue(status);
        Assert.assertAll();
    }

    public void clickOnDeleteIcon() throws MalformedURLException {
        applyWaitForElement(deleteIcon, 20);
        getAndroidDriver().findElement(deleteIcon).click();
        System.out.println("User Clicked on Delete Icon");
        applyWaitForElement(deleteColleagueContent, 40);
        content = getAndroidDriver().findElement(deleteColleagueContent).getAttribute("content-desc");
        System.out.println(content);
    }

    public void clickOnDeleteBtn() throws MalformedURLException {
        applyWaitForElement(deleteBtn, 20);
        getAndroidDriver().findElement(deleteBtn).click();
        System.out.println("User Deleting Colleague using Delete Button");
    }

    public void clickOnCancelBtn() throws MalformedURLException {
        applyWaitForElement(cancelBtn, 20);
        getAndroidDriver().findElement(cancelBtn).click();
        System.out.println("User Clicked Cancel Button");
    }

    public void tapOnTotalCelebrates() throws MalformedURLException {
        applyWaitForElement(totalCelebrates, 20);
        content = getAndroidDriver().findElement(totalCelebrates).getAttribute("content-desc");
        System.out.println(content);
    }

    public void clickOnImprove() throws MalformedURLException {
        if (getAndroidDriver().findElement(improveTab).isDisplayed()) {
            System.out.println("User is able to View Improve Tab");
            applyWaitForElement(improveTab, 20);
            getAndroidDriver().findElement(improveTab).click();
            System.out.println("User Clicked on Improve Tab to View");
        }
    }
    public void clickOnImproveTags() throws MalformedURLException {
        applyWaitForElement(improveTag, 20);
        getAndroidDriver().findElement(improveTag).click();
        System.out.println("User Clicked Improve Tag");
    }

    public void clickOnViewAllTags() throws MalformedURLException {
        applyWaitForElement(viewAllTags, 20);
        getAndroidDriver().findElement(viewAllTags).click();
        System.out.println("User Clicked View All Tags");
    }

    public void tapOnTopTags() throws MalformedURLException {
        if (getAndroidDriver().findElement(tapTagsScreen).isDisplayed()) {
            applyWaitForElement(tapTagsScreen, 20);
            System.out.println("User is on Top Tags page");
        }
    }

    public void tapOnCelebrateTags() throws MalformedURLException {
        applyWaitForElement(celebrateTags, 20);
        List<WebElement> d = (getAndroidWebDriver().findElements(celebrateTags));
        //iterate list
        System.out.println("Size is" + d.size());
        for (int i = 0; i < d.size(); i++) {
            //check expected data
            String s = d.get(i).getAttribute("content-desc");
            System.out.println("values are:" + s);
            if (s.equals("Demo1")) {
                d.get(i).click();
                System.out.println("Clicked on:" + i);
                break;
            }
        }
    }

    public void clickOnQuestionMark() throws MalformedURLException, InterruptedException {
      //  swipe(0.2, 0.2, 0.2, 0.4);
        applyWaitForElement(questionMarkIcon, 20);
        getAndroidDriver().findElement(questionMarkIcon).click();
        System.out.println("User Clicked on Question Icon");
    }

    public void tapOnContributingPopUp() throws MalformedURLException {
        if (getAndroidDriver().findElement(contributingPopUp).isDisplayed()) {
            applyWaitForElement(contributingPopUpContent, 20);
            System.out.println("User is on PopUp of instruction to write prism summary");
            content = getAndroidDriver().findElement(contributingPopUpContent).getAttribute("content-desc");
            System.out.println("Contributing Capture:" + "\n" + content);
        }
    }

    public void tapOnNoCapture() throws MalformedURLException, InterruptedException {
        swipe(0.2, 0.2, 0.2, 0.4);
        if (getAndroidDriver().findElements(noCaptureYetContent).size() > 0) {
            applyWaitForElement(noCaptureYetContent, 30);
            System.out.println("No Captures Yet");
        } else {
            System.out.println("User is able View Previous Captured");
        }

//        scrollTillElement("//android.widget.ImageView[contains(@content-desc,'"+date+"')]");

    }

    public void tapOnSharedOn() throws InterruptedException, MalformedURLException {
        if (getAndroidDriver().findElements(captureSharedOn).size() > 0) {
            applyWaitForElement(captureSharedOn, 20);
            swipe(0.2, 0.2, 0.2, 0.6);
            System.out.println("User Scrolled Down to View Capture History");
            swipe(0.2, 0.6, 0.2, 0.2);
            System.out.println("User Scrolled Up to View Captured History");
        } else {
            System.out.println("No Captures Yet");
        }
    }

    public void selectHistoryCapture() throws MalformedURLException, InterruptedException {
        swipe(0.2, 0.2, 0.2, 0.8);
        swipe(0.4, 0.2, 0.2, 0.6);
        swipe(0.2, 0.2, 0.2, 0.8);
        System.out.println("User Scrolled down to View Capture History");
        if (getAndroidDriver().findElements(capturedBy).size() > 0) {
            applyWaitForElement(capturedBy, 20);
            content = getAndroidDriver().findElement(capturedBy).getAttribute("content-desc");
            getAndroidDriver().findElement(sharedBy).click();
            System.out.println("User Clicked on:" + "\n" + content);
//           applyWaitForElement(By.xpath("//*[contains(@content-desc,'"+ name +"')]"),20);
////           content=getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'"+ name +"')]")).getAttribute("content-desc");
//           value=getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'"+ name +"')]//parent::android.view.View")).getAttribute("content-desc");
//           getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'"+ name +"')]")).click();
//           System.out.println("User Clicked on Captured:"+"\n"+value);
        } else {
            System.out.println("No Captured on This Profile");
        }

    }

    public void tapOnViewCapture() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        if (getAndroidDriver().findElements(viewCaptureScreen).size() > 0) {
            System.out.println("User is on View Capture Page");
            applyWaitForElement(capturedByName, 15);
            String name = getAndroidDriver().findElement(capturedByName).getAttribute("content-desc");
            applyWaitForElement(commentDetails, 15);
            String comment = getAndroidDriver().findElement(commentDetails).getAttribute("content-desc");
            content = getAndroidDriver().findElement(capturedOn).getAttribute("content-desc");
            System.out.println("Captured Details:" + "\n" + name + "\n" + comment + "\n" + content);
        } else {
            System.out.println("User is not on View Capture Page");
        }

    }

    public void clickOnReactionSymbols(String symbol) throws MalformedURLException {
        if (getAndroidDriver().findElements(replies).size() > 0) {
            applyWaitForElement(By.xpath("//android.view.View[@content-desc='" + symbol + "']"), 20);
            value = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + symbol + "']")).getAttribute("content-desc");
            getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + symbol + "']")).click();
            System.out.println("User is Clicked on " + value + " Symbol");
        } else {
            System.out.println(value = getAndroidDriver().findElement(captureConversions).getAttribute("content-desc"));
        }

    }

    public void enterReply(String value) throws MalformedURLException {
        if (getAndroidDriver().findElements(replies).size() > 0) {
            applyWaitForElement(replyTxtBX, 20);
            getAndroidDriver().getKeyboard().sendKeys(value);
            System.out.println("User Entered Reply Content");
        } else {
            System.out.println("User Not Able to Reply");
        }
    }

    public void clickOnsendArrow() throws MalformedURLException {
        if (getAndroidDriver().findElements(replies).size() > 0) {
            applyWaitForElement(sendArrow, 20);
            getAndroidDriver().findElement(sendArrow).click();
            System.out.println("User Clicked on Send Arrow to reply Back");
        } else {
            System.out.println("User Not Able to Clicked on Send Arrow");
        }
    }

    public void selectReactionSymbol() throws MalformedURLException {
        applyWaitForElement(reactionSymbol, 20);
        getAndroidDriver().findElement(reactionSymbol).click();

    }

//    public void addText() throws MalformedURLException {
//        applyWaitForElement(AddText, 20);
//           getAndroidDriver().findElement(AddText).sendKeys(JsonUtils.getData(DefinedConstant.sendcapture,"AddText"));
//        getAndroidDriver().getKeyboard().sendKeys("Good");
//
//    }


    public void ClickOnSendButton() throws MalformedURLException {
        applyWaitForElement(SendBtn, 20);
        getAndroidDriver().findElement(SendBtn).click();
    }

    public void getPrismSummary() throws MalformedURLException {
        applyWaitForElement(countOfPrism, 20);
        value = getAndroidDriver().findElement(countOfPrism).getAttribute("Value");
        System.out.println("Count Of Prism Summary:" + value);

    }

    public void clickOnGoalTab() throws MalformedURLException {
        applyWaitForElement(GoalTab, 20);
        getAndroidDriver().findElement(GoalTab).click();

    }

    public void GoalTabSelected() throws MalformedURLException {
        applyWaitForElement(GoalTab, 20);
        Assert.assertEquals(true, getAndroidDriver().findElement(GoalTab).isSelected());
        Assert.assertAll();

    }

    public void clickOnOngoingGoals() throws MalformedURLException {
        applyWaitForElement(OngoingGoals, 20);
        getAndroidDriver().findElement(OngoingGoals).click();

    }

    public void clickOnGoalsFilters() throws MalformedURLException {
        applyWaitForElement(GoalsFilters, 20);
        getAndroidDriver().findElement(GoalsFilters).click();

    }

    public void FiltersOptionsDisplayed() throws MalformedURLException {
        applyWaitForElement(Filter, 20);
        String expectedText = "Filters";
        Assert.assertEquals(expectedText, getAndroidDriver().findElement(Filter).getAttribute("content-desc"));
        Assert.assertAll();

    }

    public void SelectViewGoalfrom(String from) throws Exception {
        applyWaitForElement(AllTime, 20);
        content = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + from + "']")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + from + "']")).click();
        System.out.println("View Captures From:" + content);
        //  getAndroidDriver().findElement(AllTime).click();
//        getAndroidDriver().findElement(ThisMonth).click();
    }

    public void ClickOnDateRange() throws MalformedURLException {
        applyWaitForElement(DateRange, 20);
        getAndroidDriver().findElement(DateRange).click();
    }

    public void SelectDateRange() throws MalformedURLException {
        applyWaitForElement(selectStartDate, 20);
        getAndroidDriver().findElement(selectStartDate).click();
        applyWaitForElement(selectEndtDate, 20);
        getAndroidDriver().findElement(selectEndtDate).click();
        applyWaitForElement(clickOnSaveBtn, 20);
        getAndroidDriver().findElement(clickOnSaveBtn).click();

    }

    public void ClickOnGoalType(String goaltype) throws MalformedURLException {
        applyWaitForElement(SelectGoalType, 20);
        content = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + goaltype + "']")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + goaltype + "']")).click();
        System.out.println("Captured By:" + content);
        //  getAndroidDriver().findElement(SelectGoalType).click();
    }

    public void ClickOnGoalStatus(String goalStatus) throws MalformedURLException {
        applyWaitForElement(SelectGoalStatus, 20);
        content = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + goalStatus + "']")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + goalStatus + "']")).click();
        System.out.println("Captured By:" + content);

        //   getAndroidDriver().findElement(SelectGoalStatus).click();
    }

    public void ClickOnGoalPriority(String Priority) throws MalformedURLException {
        applyWaitForElement(SelectPriority, 20);
        content = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + Priority + "']")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + Priority + "']")).click();
        System.out.println("Captured By:" + content);

        //  getAndroidDriver().findElement(SelectPriority).click();
    }

    public void ClickOnGoalCreatedBy(String createdBy) throws MalformedURLException {
        applyWaitForElement(SelectCreatedBy, 20);
        content = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + createdBy + "']")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + createdBy + "']")).click();
        System.out.println("Captured By:" + content);

        //   getAndroidDriver().findElement(SelectCreatedBy).click();
    }

    public void ClickOnGoalSortBy(String sortBy) throws MalformedURLException {
        applyWaitForElement(SelectSortBy, 20);
        content = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + sortBy + "']")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc='" + sortBy + "']")).click();
        System.out.println("Captured By:" + content);

        //   getAndroidDriver().findElement(SelectSortBy).click();
    }

    public void FilterButtonEnabled() throws MalformedURLException {
        applyWaitForElement(ClickOnApplyFilter, 20);
        status = getAndroidDriver().findElement(ClickOnApplyFilter).isDisplayed();

        if (status) {
            System.out.println("Filter button is Enabled");
        } else {
            System.out.println("Filter button is not Enabled");
        }
        Assert.assertTrue(status);
        Assert.assertAll();

    }

    public void ClickOnApplyFilter() throws MalformedURLException {
        applyWaitForElement(ClickOnApplyFilter, 20);
        getAndroidDriver().findElement(ClickOnApplyFilter).click();
    }

    public void CountOfFilter() throws MalformedURLException {
        applyWaitForElement(afterapplyiingFilter, 20);
        content = getAndroidDriver().findElement(afterapplyiingFilter).getAttribute("content-desc");
        System.out.println("User is able to see count of filter:  " + content);
    }

    public void AgainClickOnFilter() throws MalformedURLException {
        applyWaitForElement(afterapplyiingFilter, 20);
        getAndroidDriver().findElement(afterapplyiingFilter).click();
    }

    public void ClickOnReset() throws MalformedURLException {
        applyWaitForElement(clickOnResetButton, 20);
        getAndroidDriver().findElement(clickOnResetButton).click();
    }

    public void CountOfGoals() throws MalformedURLException {
        applyWaitForElement(countofGoals, 20);
        content = getAndroidDriver().findElement(countofGoals).getAttribute("content-desc");
        System.out.println("User is able to see count of filter:  " + content);
    }

    public void ClickOnOngoingGoalsField(String ongoingGoals) throws MalformedURLException, InterruptedException {
        applyWaitForElement(By.xpath("//*[contains(@content-desc,'" + ongoingGoals + "')]"), 20);
        content = getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + ongoingGoals + "')]")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + ongoingGoals + "')]")).click();
        System.out.println("User Clicked on Ongoing Goals:" + "\n" + content);
        applyWaitForElement(MarkasComplete, 20);
        Assert.assertEquals(true, getAndroidDriver().findElement(MarkasComplete).isDisplayed());
        Assert.assertAll();
//        Thread.sleep(4000);
//        String expectedTitle = "View Goal";
//        Assert.assertEquals(expectedTitle, getAndroidDriver().getTitle());
//        Assert.assertAll();
    }

    public void ClickOnBackArrow() throws MalformedURLException {
        applyWaitForElement(backArrow, 20);
        getAndroidDriver().findElement(backArrow).click();
        applyWaitForElement(GoalTab, 20);
        Assert.assertEquals(true, getAndroidDriver().findElement(GoalTab).isDisplayed());
        Assert.assertAll();
    }

    public void ClickOnEditIcon() throws MalformedURLException {
        applyWaitForElement(EditIcon, 20);
        getAndroidDriver().findElement(EditIcon).click();
        applyWaitForElement(saveGoal, 20);
        Assert.assertEquals(true, getAndroidDriver().findElement(saveGoal).isEnabled());
        Assert.assertAll();
    }

    public void ClickOnMarkasComplete() throws MalformedURLException {
        applyWaitForElement(MarkasComplete, 20);
        getAndroidDriver().findElement(MarkasComplete).click();
        applyWaitForElement(Completebtn, 20);
        Assert.assertEquals(true, getAndroidDriver().findElement(Completebtn).isDisplayed());
        Assert.assertAll();
    }

    public void ClickOnComplete() throws MalformedURLException {
        applyWaitForElement(Completebtn, 20);
        getAndroidDriver().findElement(Completebtn).click();
    }

    public void ClickOnCancelButton() throws MalformedURLException {
        applyWaitForElement(CancelBtn, 20);
        getAndroidDriver().findElement(CancelBtn).click();
    }

    public void clickOnConverstionTab() throws MalformedURLException {
        if (getAndroidDriver().findElement(conversationTab).isDisplayed()) {
            System.out.println("User is able to View Conversation Tab");
            applyWaitForElement(conversationTab, 20);
            getAndroidDriver().findElement(conversationTab).click();
            System.out.println("User Clicked on Conversation Tab");
        }

    }

    public void tapOnConversationDetails() throws MalformedURLException, InterruptedException {
        Thread.sleep(4000);
        if (getAndroidDriver().findElements(tipsNSupport).size() > 0) {
            applyWaitForElement(tipsNSupport, 20);
            value = getAndroidDriver().findElement(tipsNSupport).getAttribute("content-desc");
            content = getAndroidDriver().findElement(tipsNSupportContent).getAttribute("content-desc");
            System.out.println("No Any Conversation on This Goal:" + "\n" + value + "\n" + content);
        } else {
            applyWaitForElement(conversationDetails, 20);
            content = getAndroidDriver().findElement(conversationDetails).getAttribute("content-desc");
            System.out.println("Conversation Deatils:" + "\n" + content);
        }
    }

    public void clickOnInsightsTab() throws MalformedURLException {
        if (getAndroidDriver().findElement(insightsTab).isDisplayed()) {
            System.out.println("User is able to View Insights Tab");
            applyWaitForElement(insightsTab, 20);
            getAndroidDriver().findElement(insightsTab).click();
            System.out.println("User Clicked on Insights Tab to View");
        } else {
            System.out.println("User is Not able to View Insights Tab");
        }
    }

    public void clickOnCaptureProgressBtn() throws MalformedURLException {
        applyWaitForElement(captureProgressBtn, 20);
        getAndroidDriver().findElement(captureProgressBtn).click();
        System.out.println("User Clicked on Capture Progress Button");
    }

    public void TapOnProjectStatus() throws MalformedURLException {
        if (getAndroidDriver().findElement(overview).isDisplayed()) {
            applyWaitForElement(goalStatus, 20);
            content = getAndroidDriver().findElement(goalStatus).getAttribute("content-desc");
            System.out.println("Before clicking Milestones status is:" + content);
        } else {
            System.out.println("User Not Able o view Overview Heading");
        }

    }

    public void TapOnMilestonesRadioButton() throws MalformedURLException {
        if (getAndroidDriver().findElements(milestonesStatus).size() > 0) {
            System.out.println("Milestone's Already Completed");
        } else {
            applyWaitForElement(radioButton, 20);
            getAndroidDriver().findElement(radioButton).click();
            System.out.println("User Clikced on Milestone's Radio Button");

            applyWaitForElement(milesoneContent, 30);
            content = getAndroidDriver().findElement(milesoneContent).getAttribute("content-desc");
            System.out.println("PopUp Content:" + "\n" + content);
            applyWaitForElement(makeCapture, 10);
            getAndroidDriver().findElement(makeCapture).click();
            System.out.println("User Clicked On Make a Capture Button");
            applyWaitForElement(captureThoughtScreen, 10);
            tapOnCaptureThoughtScreen();
            applyWaitForElement(closeBtn, 10);
            ClickCloseButton();

            applyWaitForElement(goalStatus, 20);
            content = getAndroidDriver().findElement(goalStatus).getAttribute("content-desc");
            System.out.println("Afer clicking Milestones status is:" + content);

        }

    }

    public void ClickOnCompleteBtn() throws MalformedURLException {
        applyWaitForElement(Completebtn, 20);
        getAndroidDriver().findElement(Completebtn).click();
        applyWaitForElement(CaptureAnotherGoal, 20);
        Assert.assertEquals(true, getAndroidDriver().findElement(CaptureAnotherGoal).isDisplayed());
        Assert.assertAll();
    }

    public void ClickOnConversationTab() throws MalformedURLException {
        applyWaitForElement(ConversationTab, 20);
        getAndroidDriver().findElement(ConversationTab).click();
        applyWaitForElement(ReplyBox, 20);
        Assert.assertEquals(true, getAndroidDriver().findElement(ReplyBox).isDisplayed());
        Assert.assertAll();
    }

    public void ClickOnReactionSymbol() throws MalformedURLException {
        applyWaitForElement(GoalReactionSymbol, 20);
        getAndroidDriver().findElement(GoalReactionSymbol).click();
        getAndroidDriver().hideKeyboard();
    }

    public void AddTextInGoalsConversation() throws MalformedURLException {
        applyWaitForElement(ReplyBox, 20);
        getAndroidDriver().findElement(ReplyBox).click();
        getAndroidDriver().getKeyboard().sendKeys("Grate");
    }

    public void clickOnEditOrAddMilestonesBtn() throws MalformedURLException {
        applyWaitForElement(editOrAddMilestonesBtn, 20);
        getAndroidDriver().findElement(editOrAddMilestonesBtn).click();
        System.out.println("User Clicked on Edit or Add Milesones Button");
    }

    public void TapOnEditGaolPage() throws MalformedURLException {
        Assert.assertEquals(true, getAndroidDriver().findElement(editGoalScreen).isDisplayed());
        Assert.assertAll();
        System.out.println("User Redirected to Edit Goal Screen");
    }

    public void clickOnAddAnotherMilestonesBtn() throws MalformedURLException {
        try {
            applyWaitForElement(addAnotherMilestoneBtn, 20);
            getAndroidDriver().findElement(addAnotherMilestoneBtn).click();
            getAndroidDriver().getKeyboard().sendKeys("Running the Script");
            getAndroidDriver().hideKeyboard();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void clickOnSaveGoal() throws MalformedURLException {
        applyWaitForElement(saveGoal, 20);
        getAndroidDriver().findElement(saveGoal).click();
        System.out.println("User Clicked on Save Goal Button");
    }

    public void TapOnGoalTypes() throws MalformedURLException {
        applyWaitForElement(viewGoalScreen, 30);
        Assert.assertEquals(true, getAndroidDriver().findElement(viewGoalScreen).isDisplayed());
        Assert.assertAll();
        if (getAndroidDriver().findElements(projectGoal).size() > 0) {
            System.out.println("Goal Type is: Project");
        } else if (getAndroidDriver().findElements(targetGoal).size() > 0) {
            System.out.println("Goal Type is: Target");
        } else if (getAndroidDriver().findElements(behavioralSkillGoal).size() > 0) {
            System.out.println("Goal Type is: Behavioral Skill");
        } else {
            System.out.println("Goal Type is: Hard Skill");
        }

    }

    public void ClickOnOngoingProjectGoalsField(String ongoingProjectGoals) throws MalformedURLException, InterruptedException {
        applyWaitForElement(By.xpath("//*[contains(@content-desc,'" + ongoingProjectGoals + "')]"), 20);
        content = getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + ongoingProjectGoals + "')]")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + ongoingProjectGoals + "')]")).click();
        System.out.println("User Clicked on Profile of:" + "\n" + content);
    }

    public void clickEditButton() throws MalformedURLException {
        applyWaitForElement(Edit, 20);
        getAndroidDriver().findElement(Edit).click();
        System.out.println("User Clicked on Edit Button");
    }

    public void scrollTillAdditioncontext() throws MalformedURLException {
        applyWaitForElement(AdditionalContext, 20);

        getAndroidDriver().findElement(Edit).click();
        System.out.println("User Clicked on Edit Button");
    }
    public void AddText() throws MalformedURLException {
        applyWaitForElement(TextBox, 20);
        getAndroidDriver().findElement(TextBox).click();
        System.out.println("User Clicked on Text Box");
        getAndroidDriver().getKeyboard().sendKeys("Good");
        System.out.println("User Add text in Text Box");
        getAndroidDriver().hideKeyboard();

    }

    public void AdditionalContextDisplyed() throws MalformedURLException {
        applyWaitForElement(page, 20);
        getAndroidDriver().findElement(page).isDisplayed();
        System.out.println("Addional context text Displayed");
    }

    public void ClickOnOngoingHardSkillGoalsField(String ongoingHardSkillGoal) throws MalformedURLException, InterruptedException {
        applyWaitForElement(By.xpath("//*[contains(@content-desc,'" + ongoingHardSkillGoal + "')]"), 20);
        content = getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + ongoingHardSkillGoal + "')]")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//*[contains(@content-desc,'" + ongoingHardSkillGoal + "')]")).click();
        System.out.println("User Clicked on Profile of:" + "\n" + content);
    }

    public void HardSkillViewGoalPage() throws MalformedURLException {
        applyWaitForElement(page, 20);
        getAndroidDriver().findElement(page).isDisplayed();
        System.out.println("Addional context text Displayed");
    }
    public void ClickOnBackButton() throws MalformedURLException {
        applyWaitForElement(backbutton, 20);
        getAndroidDriver().findElement(backbutton).click();
        System.out.println("User clicked On Back button and user is on profile page");
    }
    public void ClickOnCaptureProgressButton() throws MalformedURLException {
        applyWaitForElement(backbutton, 20);
        getAndroidDriver().findElement(backbutton).click();
        System.out.println("User clicked On Back button and user is on profile page");
    }

    public void ClickOnSaveandShareButton() throws MalformedURLException {
        applyWaitForElement(SaveandShare, 20);
        getAndroidDriver().findElement(SaveandShare).click();
        System.out.println("User clicked On Save and Share button");
    }

    public void ClickOnSaveCapturePrivately() throws MalformedURLException {
        applyWaitForElement(SavecapturePrivately, 20);
        getAndroidDriver().findElement(SavecapturePrivately).click();
        System.out.println("User clicked On Save Capture Privately");
    }
    public void ClickOnShareButton() throws MalformedURLException {
        applyWaitForElement(ShareBtn, 20);
        getAndroidDriver().findElement(ShareBtn).click();
        System.out.println("User clicked Share button");
    }
    public void ClickOnSharePrivately() throws MalformedURLException {
        applyWaitForElement(SharePrivately, 20);
        getAndroidDriver().findElement(SharePrivately).click();
        System.out.println("User clicked Share privately button");
    }

    public void CountOfManegersCelebrate() throws MalformedURLException {
        applyWaitForElement(CountOfCelebrate, 20);
        content = getAndroidDriver().findElement(CountOfCelebrate).getAttribute("content-desc");
        System.out.println("Count of celebrate capture:" + content);
    }
    public void CountOfUsersCelebrate() throws MalformedURLException {
        applyWaitForElement(CountOfusersCelebrate, 20);
        content = getAndroidDriver().findElement(CountOfusersCelebrate).getAttribute("content-desc");
        System.out.println("Count of celebrate capture:" + content);
    }
    public void CountOfCelebrateInOverview() throws MalformedURLException {
        applyWaitForElement(overview, 20);
        getAndroidDriver().findElement(overview).isDisplayed();
    }








    public void clickOnCollegueAccount() throws MalformedURLException {
        applyWaitForElement(colleagueAccount, 20);
        getAndroidDriver().findElement(colleagueAccount).click();
    }



    public void clickOnTragetGoal()throws MalformedURLException
    {
        applyWaitForElement(targetGoal, 20);
        getAndroidDriver().findElement(targetGoal).click();
        System.out.println("User Cliacked on target goal");
    }

    public void clickOnEditButton()throws MalformedURLException
    {
        applyWaitForElement(editButton,20);
        getAndroidDriver().findElement(editButton).click();
        System.out.println("User Clicked on edit  Button");

    }

    public void clickOnMediumButton(String goalType)throws MalformedURLException
    {
        applyWaitForElement(By.xpath("//android.widget.ImageView[@content-desc=\"medium\"]"), 20);
        content = getAndroidDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"medium\"]")).getAttribute("content-desc");
        getAndroidDriver().findElement(By.xpath("//android.widget.ImageView[@content-desc=\"medium\"]")).click();
        System.out.println("User Clicked on Profile of:" + "\n" + content);
    }

    public void clickOnSavebutton()throws MalformedURLException
    {
        applyWaitForElement(saveButton,20);
        getAndroidDriver().findElement(saveButton).click();
        System.out.println("User Clicked on save button");

    }


    public void clickOnHardSkillButton()throws MalformedURLException {
        applyWaitForElement(hardSkillGoal, 20);
        getAndroidDriver().findElement(hardSkillGoal).click();
        System.out.println("User Clicked on Hard Skill goal Button");

    }

    public void clickOnAdditionalContext(String name)throws MalformedURLException
    {
        applyWaitForElement(additionalContext,10);
        getAndroidDriver().findElement(additionalContext).click();
        // getAndroidDriver().findElement(By.xpath("//*[@class ='android.widget.EditText'])[10]")).click();
        System.out.println("User Click on Additional context");
    }
    public void enterDataOnAdditionalContext()throws MalformedURLException {
        applyWaitForElement(additionalContext, 10);
        getAndroidDriver().findElement(additionalContext).sendKeys("Test");
        System.out.println("User Click on Additional context");
    }
    public void clickOnDoneButton()throws MalformedURLException
    {
        applyWaitForElement(doneButton,10);
        getAndroidDriver().findElement(doneButton).click();
        System.out.println("Clicked on the done button");
        androidDriver.hideKeyboard();
    }



    public void clickColleagueMyself()throws MalformedURLException
    {
        applyWaitForElement(myself,10);
        getAndroidDriver().findElement(myself).click();
        System.out.println("Clicked on the Myself account");
    }

    public void clickOnGotIt()throws MalformedURLException
    {
        applyWaitForElement(gotIt,10);
        getAndroidDriver().findElement(gotIt).click();
        System.out.println("Clicked on the Got It! Button");
    }

    public void clickOnGoToLearn()throws MalformedURLException
    {
        applyWaitForElement(goToLearn,10);
        getAndroidDriver().findElement(goToLearn).click();
        System.out.println("Clicked on the Go To Learn Button");
    }

    public void LearnPage() throws MalformedURLException {
        Assert.assertEquals(true, getAndroidDriver().findElement(LearnPage).isDisplayed());
        Assert.assertAll();
        System.out.println("User Redirected to Learn Page");
    }





    public void clickOnAddResources(String resource)throws MalformedURLException
    {
        applyWaitForElement(AddResourcesTab,10);
        getAndroidDriver().findElement(AddResourcesTab).click();
    }
    public void ToClickOnArticleTab()throws MalformedURLException
    {
        applyWaitForElement(articleTab,10);
        getAndroidDriver().findElement(articleTab).click();

    }

    public void sendArticleLink()throws MalformedURLException {
        applyWaitForElement(arcticletextBox, 10);
        getAndroidDriver().findElement(arcticletextBox).click();
        getAndroidDriver().findElement(arcticletextBox).sendKeys("https://freakonomics.com/podcast/why-do-we-forget-so-much-of-what-weve-read-nsq-ep-24");
        androidDriver.hideKeyboard();

    }
    public void addNotesTab()throws MalformedURLException
    {

        applyWaitForElement(addNotes,10);
        getAndroidDriver().findElement(addNotes).click();
        getAndroidDriver().findElement(addNotes).sendKeys("Test");
        androidDriver.hideKeyboard();

    }

    public void clickOnSaveAndShareButton()throws MalformedURLException
    {
        applyWaitForElement(SaveAndShareBtn,10);
        getAndroidDriver().findElement(SaveAndShareBtn).click();

    }

    public void seeTheCountOfResources()throws MalformedURLException
    {
        applyWaitForElement(AddResourcesTab,20);

        Assert.assertEquals(true, getAndroidDriver().findElement(AddResourcesTab).isDisplayed());
        Assert.assertAll();
    }




    public void ToSeeProfilePic()throws MalformedURLException
    {

        applyWaitForElement(profile,10);
        boolean profileLetter =  androidDriver.findElement(profile).isDisplayed();
        System.out.println(profileLetter);

    }

    public void getfirstLetterOfProfile()throws InterruptedException
    {

        String firstLetter = getAndroidDriver().findElement(By.xpath("//android.view.View[@content-desc=\"P\"]")).getAttribute("content-desc");
        System.out.println("First letter is:"+firstLetter);
        Thread.sleep(2000);
        content =getAndroidWebDriver().findElement(By.xpath("//android.view.View[@content-desc=\"Prashant thombre\"]")).getAttribute("content-desc");
        System.out.println("User name= "+content);
        char getFirstLetter = content.charAt(0);
        System.out.println("First letter of the user name is:"+getFirstLetter);
        Assert.assertEquals(firstLetter,getFirstLetter);

    }


}
