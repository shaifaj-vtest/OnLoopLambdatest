package com.gk.test.page_objects.mobile;

import com.gk.test.framework.AndroidObject;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;

public class WellnessPage extends AndroidObject {

    SoftAssert Assert = new SoftAssert();
    boolean status;
    String value, content;

    public WellnessPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAndroidDriver()), this);
    }

    static private final By wellnessPage = By.xpath("//android.view.View[@content-desc=\"Wellness\"]");
    static private final By completeMycheckInBtn = By.xpath("//android.widget.Button[@content-desc=\"Complete my check-in\"]");

    static private final By clickOnCancel = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
    static private final By wellness = By.xpath("//android.view.View[@content-desc=\"How are you feeling right now?\"]");


    static private final By AmazingInFlowBtn = By.xpath("//android.widget.ImageView[contains(@content-desc,'Amazing, in flow')]");
    static private final By feelingAmazingPopup = By.xpath("//android.view.View[contains(@content-desc='You said you were feeling amazing')]");

    static private final By AlrightBtn = By.xpath("//android.widget.ImageView[contains(@content-desc, 'Alright, difficulty focusing')]");
    static private final By AlrightPopup = By.xpath("//android.view.View[@content-desc=\"It's okay to feel alright!\"]");

    static private final By LowtBtn = By.xpath("//android.widget.ImageView[contains(@content-desc, 'Low, unable to focus')]");
    static private final By LowPopup = By.xpath("//android.view.View[@content-desc=\"Sorry to hear that you're feeling low...\"]");

    static private final By exhaustedBtn = By.xpath("//android.widget.ImageView[contains(@content-desc, 'Exhausted, close to burn out')]");
    static private final By exhaustedPopup = By.xpath("//android.view.View[contains(@content-desc,'Sorry to hear that you are feeling Exhausted");

    static private final By checkInLaterBtn  = By.xpath("//android.widget.ImageView[@content-desc=\"Check-in Later\"]");
    static private final By checkInPopup = By.xpath("//android.view.View[contains(@content-desc,'Introducing Wellness check-ins')]");

    static private final By GreatHighEnergyBtn = By.xpath("//android.widget.ImageView[contains(@content-desc,'Great, high energy')]");
    static private final By feelingGreatPopup = By.xpath("//android.view.View[@content-desc=\"You said you feel great!\"]");

    static private final By GoodSomeStressBtn = By.xpath("//android.widget.ImageView[contains(@content-desc, 'Good, some stress')]");
    static private final By feelingGoodPopup = By.xpath("//android.view.View[contains(@content-desc,'It's good you only feel some stress')]");
    static private final By onloopTitle = By.xpath("(//*[@class='android.widget.ImageView'])[2]");
    static private final By dismiss = By.xpath("//android.view.View[@content-desc=\"Dismiss\"]");
    public void displayOnWellnessPopup() throws MalformedURLException {

        Assert.assertEquals(true,androidDriver.findElement(wellnessPage).isDisplayed());
        System.out.println("Wellness page is displayed");
        Assert.assertAll();

    }


    public void wellnessPage() throws MalformedURLException {
        applyWaitForElement(wellnessPage, 10);
        if (getAndroidDriver().findElement(wellnessPage).isDisplayed()) {

            System.out.println("User able to see wellness page");
        } else {
            System.out.println("User not able to see wellness page");
        }
    }
    public void clickOncompleteMycheckInBtn() throws MalformedURLException {
        applyWaitForElement(completeMycheckInBtn, 10);
        getAndroidDriver().findElement(completeMycheckInBtn).click();
        System.out.println("User able to click on 'complete My check-In' button");
        Assert.assertTrue(true);
    }

    public void clickOnWellnessPopup() throws MalformedURLException {
//        applyWaitForElement(wellnessPage, 20);
//
//        getAndroidDriver().findElement(wellnessPage).isDisplayed();

        applyWaitForElement(clickOnCancel, 5);
        getAndroidDriver().findElement(clickOnCancel).click();
//        applyWaitForElement(wellness, 10);
//        Assert.assertEquals(true, getAndroidDriver().findElement(wellness).isDisplayed());
//        System.out.println("Wellness page is displayed");


    }

    public void ToClickOnAmazingInFlowBtn() throws MalformedURLException
    {
        applyWaitForElement(wellness,10);
        getAndroidDriver().findElement(wellness).isDisplayed();
        System.out.println("Wellness screen is displayed");
        applyWaitForElement(AmazingInFlowBtn, 10);
        getAndroidDriver().findElement(AmazingInFlowBtn).click();
        System.out.println("User able to click on Amazing in Flow button");
    }

    public void clickOnDismiss() throws MalformedURLException {
        applyWaitForElement(dismiss, 10);
        if (getAndroidDriver().findElement(dismiss).isDisplayed()) {
            getAndroidDriver().findElement(dismiss).click();
            System.out.println("User able to see selected feeling on the homepage");
        } else {
            System.out.println("User not able to see selected fillings");

        }

    }
    public void feelingAmazingPopupdisplay()throws MalformedURLException
    {
        applyWaitForElement(feelingAmazingPopup,10);
        Assert.assertEquals(true, getAndroidDriver().findElement(feelingAmazingPopup).isDisplayed());
        Assert.assertAll();
    }

    public void ToClickOnGreatHighEnergyBtn() throws MalformedURLException
    {
        applyWaitForElement(wellness,10);
        getAndroidDriver().findElement(wellness).isDisplayed();
        System.out.println("Wellness screen is displayed");
        applyWaitForElement(GreatHighEnergyBtn, 10);
        getAndroidDriver().findElement(GreatHighEnergyBtn).click();
        System.out.println("User able to click on Great, High energy button");
    }

    public void feelingGreatPopupdisplay()throws MalformedURLException
    {
        applyWaitForElement(feelingGreatPopup,10);
        Assert.assertEquals(true, getAndroidDriver().findElement(feelingGreatPopup).isDisplayed());
        Assert.assertAll();
    }

    public void ToClickOnGoodSomeStressBtn() throws MalformedURLException
    {
        applyWaitForElement(wellness,10);
        getAndroidDriver().findElement(wellness).isDisplayed();
        System.out.println("Wellness screen is displayed");
        applyWaitForElement(GoodSomeStressBtn, 10);
        getAndroidDriver().findElement(GoodSomeStressBtn).click();
        System.out.println("User able to click on Good Some Stress button");
    }

    public void feelingGoodSomeStressPopupdisplay()throws MalformedURLException
    {
        applyWaitForElement(feelingGoodPopup,20);
        Assert.assertEquals(true, getAndroidDriver().findElement(feelingGoodPopup).isDisplayed());
        Assert.assertAll();
    }




    public void ToClickOnAlrightBtn() throws MalformedURLException
    {
        applyWaitForElement(wellness,10);
        getAndroidDriver().findElement(wellness).isDisplayed();
        System.out.println("Wellness screen is displayed");
        applyWaitForElement(AlrightBtn, 10);
        getAndroidDriver().findElement(AlrightBtn).click();
        System.out.println("User able to click on Alright difficulty focusing button button");
    }
    public void AlrightDifficultyFocusingPopupdisplay()throws MalformedURLException
    {
        applyWaitForElement(AlrightPopup,20);
        Assert.assertEquals(true, getAndroidDriver().findElement(AlrightPopup).isDisplayed());
        Assert.assertAll();
    }

    public void ToClickOnLowtBtn() throws MalformedURLException
    {
        applyWaitForElement(wellness,10);
        getAndroidDriver().findElement(wellness).isDisplayed();
        System.out.println("Wellness screen is displayed");
        applyWaitForElement(LowtBtn, 10);
        getAndroidDriver().findElement(LowtBtn).click();
        System.out.println("User able to click on Alright difficulty focusing button button");
    }

    public void LowUnableoFocusPopupdisplay()throws MalformedURLException
    {
        applyWaitForElement(LowPopup,20);
        Assert.assertEquals(true, getAndroidDriver().findElement(LowPopup).isDisplayed());
        Assert.assertAll();
    }

    public void ToClickOnExhaustedBtn() throws MalformedURLException
    {
        applyWaitForElement(wellness,10);
        getAndroidDriver().findElement(wellness).isDisplayed();
        System.out.println("Wellness screen is displayed");
        applyWaitForElement(exhaustedBtn, 10);
        getAndroidDriver().findElement(exhaustedBtn).click();
        System.out.println("User able to click on Exhausted button");
    }
    public void ExhaustedPopupdisplay()throws MalformedURLException
    {
        applyWaitForElement(exhaustedPopup,20);
        Assert.assertEquals(true, getAndroidDriver().findElement(exhaustedPopup).isDisplayed());
        Assert.assertAll();
    }

    public void ToClickOnCheckinLaterBtn() throws MalformedURLException
    {
        applyWaitForElement(wellness,10);
        getAndroidDriver().findElement(wellness).isDisplayed();
        System.out.println("Wellness screen is displayed");
        applyWaitForElement(checkInLaterBtn, 10);
        getAndroidDriver().findElement(checkInLaterBtn).click();
        System.out.println("User able to click on Check-In Later button");
    }
    public void CheckInLaterPopupdisplay()throws MalformedURLException
    {
        applyWaitForElement(checkInPopup,20);
        Assert.assertEquals(true, getAndroidDriver().findElement(checkInPopup).isDisplayed());
        Assert.assertAll();
    }
    public void homepagedisplay()throws MalformedURLException
    {
        applyWaitForElement(onloopTitle,20);
        Assert.assertEquals(true, getAndroidDriver().findElement(onloopTitle).isDisplayed());
        Assert.assertAll();
    }





}
