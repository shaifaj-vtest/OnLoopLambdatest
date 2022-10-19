@mobile
Feature: Manager's Login
  @Google
  Scenario:ENG-480 Login with Google
    Given user should installed latest app
    When user click on Onloop app
    And swipe the pages
    And user click on sign in with google
    And user select account
    And user should be able to login
    Then user should be able to logout

  @Microsoft
  Scenario:ENG-481 Login with Microsoft
    Given user should installed latest app
    When user click on Onloop app
    And swipe the pages
    And user click on microsoft
    And fill username
    And user should be able to login
    Then user should be able to logout

  @Okta
  Scenario: ENG-482 Login with Okta
    Given user should installed latest app
    When user click on Onloop app
    And user select account
    Then user should be able to login

