package com.gk.test.step_definitions.mobile;

import com.gk.test.framework.AndroidObject;
import com.gk.test.page_objects.mobile.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.net.MalformedURLException;

public class WellnessSteps extends AndroidObject {


    private final RegistrationsPage registrations;
    private final LoginPage login;
    private final Manager_HomePage manHome;
    public final HamburgerMenuPage hamburger;

    public final WellnessPage wellness;

    public WellnessSteps(RegistrationsPage regis, LoginPage log, Manager_HomePage ManHome, HamburgerMenuPage ham, WellnessPage wellness) {
        this.registrations = regis;
        this.login = log;
        this.manHome = ManHome;
        this.hamburger = ham;

        this.wellness = wellness;
    }

    @And("wellness fetaure should be enabled")
    public void wellnessFeatureIsEnabled() {
        System.out.println("Wellness app is enabled on Friday and Monday");
    }

    @Then("user should be able to see wellness page appear on monday on home page when he log in for the day")
    public void wellnessPageAppearOnHomePage() throws InterruptedException, MalformedURLException {
        Thread.sleep(10000);
        wellness.displayOnWellnessPopup();
        System.out.println("User able to see wellness page on the home page");
    }


    @And("user should be on wellness introduction screen")
    public void userIsOnWellnessScreen() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        wellness.wellnessPage();
        System.out.println("User is on wellness introduction screen");
    }


    @When("user click on \"Complete my check -in\" button")
    public void userClickOnButton() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        wellness.clickOncompleteMycheckInBtn();
        System.out.println("user clicked on Complete my check -in button");
        Thread.sleep(4000);
    }


    @Then("user should be able to click on \"Complete my check -in\" button")
    public void userShouldBeAbleToClickOnButton() {
        System.out.println("user able to click on Complete my check -in button");
    }


   @When("user see wellness introduction screen , User click on \"X\" button")
    public void userSeeWellnessIntroductionScreenUserClickOnXButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        wellness.clickOnWellnessPopup();
        System.out.println("User clicked on X button");
    }

    @Then("User should be able to see popup window for wellness check in")
    public void userAbleToSeeWellnessPopup() {
        System.out.println("User able to see popup window for wellness check in");
    }

    @And("user click on \"Amazing ,in flow\"  button")
    public void userClickOnAmazingInFlowButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        wellness.ToClickOnAmazingInFlowBtn();
        System.out.println("User able to click on Amazing in FLow button");
        Thread.sleep(4000);
    }

    @Then("user should be able to click on \"Amazing ,in flow\"  button and it should reflect on home page at notification field")
    public void userShouldBeAbleToClickOnButtonAndItShouldReflectOnHomePageAtNotificationField() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        wellness.feelingAmazingPopupdisplay();
        wellness.clickOnDismiss();
        System.out.println("user able to see 'feeling Amazing'notification on home page");
    }

    @And("user click on \"Great ,High Energy\" button")
    public void userClickOnGreatHighEnergyButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        wellness.ToClickOnGreatHighEnergyBtn();
        System.out.println("user able to click on Great ,High Energy button");

    }
    @Then("user should be able to click on \"Great , High Energy\" button and it should reflect on home page at notification field")
    public void userAbleToSeenotificationOfHighEnergyBtnOnHomePage() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        wellness.feelingGreatPopupdisplay();
        wellness.clickOnDismiss();
        System.out.println("user able to see 'feeling Great'notification on home page");
    }

    @And("user click on \"Good ,Some stress\" button")
    public void userClickOnGoodSomeStreeButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        wellness.ToClickOnGoodSomeStressBtn();
        System.out.println("user able to click on Good, Some Stress button");
    }
    @Then("user should be able to click on \"Good ,Some stress\" button and it should reflect on home page at notification field")
    public void userAbleToSeenotificationOfGoodSomeStressBtnOnHomePage() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        wellness.feelingGoodSomeStressPopupdisplay();
        wellness.clickOnDismiss();
        System.out.println("user able to see 'feeling good' notification on home page");
    }

    @And("user click on \"Alright , difficulty focusing\" button")
    public void userClickOnAlrightDifficultyFocusingButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        wellness.ToClickOnAlrightBtn();
        System.out.println("User able to click on Alright , difficulty focusing button");
    }

    @Then("user should be able to click on \"Alright , difficulty focusing\"  button and it should reflect on home page at notification field")
    public void userShouldBeAbleToAlrightClickOnButtonAndItShouldReflectOnHomePageAtNotificationField() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        wellness.AlrightDifficultyFocusingPopupdisplay();
        wellness.clickOnDismiss();
        System.out.println("user able to see 'Alright , difficulty focusing' notification on the home page");
    }


    @And("user click on \"Low,Unable to focus\" button")
    public void userClickOnLowUnableToFocusButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        wellness.ToClickOnLowtBtn();
        System.out.println("user is able to click on 'Low,Unable to focus' button");
    }
     @Then("user should be able to click on \"Low , Unable to focus\"  button and it should reflect on home page at notification field")
    public void userShouldBeAbleToClickOnLowUnableToFocusButtonAndItShouldReflectOnHomePageAtNotificationField() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        wellness.LowUnableoFocusPopupdisplay();
         wellness.clickOnDismiss();
        System.out.println("user able to see 'Low,Unable to focus' notification on the home page");
    }

    @And("user click on \"Exhausted, Close to burn out\" button")
    public void userClickOnExhaustedButton() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        wellness.ToClickOnExhaustedBtn();
        System.out.println("User clicked on 'Exhausted, close to burn out' button");
    }
    @Then("user should be able to click on \"Exhausted, Close to burn out\" button and it should reflect on home page at notification field")
    public void userAbleToSeeNotificationOfExhausted() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        wellness.ExhaustedPopupdisplay();
        wellness.clickOnDismiss();
        System.out.println("user able to click on Exhausted, Close to burn out button and it should reflect on home page at notification field");
    }

    @And("user click on \"Check-in later\" button")
    public void userClickOnCheckInLater() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        wellness.ToClickOnCheckinLaterBtn();
        System.out.println("User clicked on 'Check-in later' button");
    }

    @Then("user should be able to click on \"Check-in later\" and it should reflect on the home page at the notification field for check in for week")
    public void userAbleToSeeNotificationOfCheckInLater() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        wellness.CheckInLaterPopupdisplay();
        System.out.println("user able to click on 'Check-in later' and it should reflect on the home page at the notification field for check in for week");
    }


    @Then("user should be able to click on \"X\" button and it should come on home page wellness check in page")
    public void userShouldBeAbleToClickOnButtonAndItShouldComeOnHomePageWellnessCheckInPage() throws MalformedURLException, InterruptedException {
        Thread.sleep(2000);
        wellness.homepagedisplay();
        System.out.println("User is on Home Page after clicking 'X' button");
    }
}
