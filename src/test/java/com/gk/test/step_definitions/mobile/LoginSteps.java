package com.gk.test.step_definitions.mobile;

import com.gk.test.framework.AndroidObject;
import com.gk.test.page_objects.mobile.RegistrationsPage;
import com.gk.test.page_objects.mobile.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.net.MalformedURLException;

public class LoginSteps extends AndroidObject {

	private final LoginPage login;
	private final RegistrationsPage registration;

	public LoginSteps(LoginPage loginpage,RegistrationsPage registrationsPage) {

		this.login = loginpage;
		this.registration = registrationsPage;
	}
	@Given("^user should installed latest app$")
	public void User_Should_Installed_Latest_App(){
		System.out.println("OnLoop Successfully Installed");
	}

	@When("^user click on Onloop app$")
	public void User_Click_on_Onloop_App() throws MalformedURLException, InterruptedException {
		System.out.println("User Clicked on OnLoop");
		login.clickOnAllowBtn();
		

	}

	@And("^swipe the pages$")
	public void swipe_the_pages() throws InterruptedException, MalformedURLException {
		login.clickOnGetStartedBtn();
		System.out.println("Clicked on Get started ");
		Thread.sleep(1000);
		System.out.println("Swipe the Intro Pages");
		login.swipe(0.2,0.2,0.5,0.2);
		login.swipe(0.2,0.2,0.5,0.2);
		login.swipe(0.2,0.2,0.5,0.2);
		login.swipe(0.2,0.2,0.5,0.2);
		System.out.println("Swiped successfully");
		Thread.sleep(1000);
	}

	@And("^user click on sign in with google$")
	public void click_on_Sign_in_With_Google() throws InterruptedException, MalformedURLException {
		Thread.sleep(1000);
		login.clickOnContinueBtn();
		System.out.println("Clicked on Continue button");
		login.clickOnSignInWithGoogle();
		System.out.println("Choose option Sign in with Google");

	}

	@And("^user select account$")
	public void user_select_account() throws MalformedURLException {
		System.out.println("Choose an User Account");
		login.clickOnManagerAccount();

	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws MalformedURLException, InterruptedException {
		Thread.sleep(8000);
		login.homepageDisplayd();
	}

	@And("user click on microsoft")
	public void userClickOnMicrosoft() throws MalformedURLException, InterruptedException {
		login.clickOnSignInWithMicrosoft();
		System.out.println("Choose option Sign in with Microsoft");
		Thread.sleep(3000);

	}

	@Then("user should be able to logout")
	public void userShouldBeAbleToLogout() throws MalformedURLException, InterruptedException {

		login.ClickOnHumburgerMenu();
		System.out.println("Clicked on Humburger Menu");
		Thread.sleep(3000);
		login.swipe( 0.2, 0.2, 0.2, 0.6);
		System.out.println("Scrolled Down");
		Thread.sleep(3000);
		login.ClickOnLogOut();
		System.out.println("Clicked on Logout Button");
	}

	@And("fill username")
	public void fillUsername() {
	}

}
