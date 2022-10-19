@mobile
Feature: Hamburger Menu Icon

  @InviteMembersThroughExternalSources
  Scenario Outline: ENG-486 Users should be able to invite the team members with "invite to my org" magic link
    Given user is logged in as manager
    And user is updating his <feelings>
    And user is on home page
    When user click on hamburger menu icon
    And user click on invite to my org magic link
    Then user should be able to invite team members through external sharing source in the organization
    Examples:
    |feelings|
    |"Low"|
    |"Check-in"|


  @DownloadAppThroughExternalSources
  Scenario: ENG-487 Users should be able to send application download  link through an external source

    Given user is logged in as manager
    And user is on home page
    When user click on hamburger menu icon
    And user tap on "Recommend OnLoop"
    Then user should be able to invite team members through external sharing source for application download

  @PrismSummary
  Scenario Outline: ENG-489 Users should be able to create prism summaries with the team members

    Given user is logged in as manager
    And user is on home page
    When user click on hamburger menu icon
    And user tap on "Prism summaries"
    Then user should be able redirected to create Prism Summary page<colleague>
    Examples:
      |colleague|
      |"prashant@outlookthombre"|

  @ManageReminder
  Scenario: ENG-490 Users should be added the reminders to their tasks

    Given user is logged in as manager
    And user is on home page
    When user click on hamburger menu icon
    And user tap on "Custom Reminder"
    And user set the reminder
    Then user should be able save the Custom Reminders

  @FeatureRequest
  Scenario Outline: ENG-1127 To check user is able to click on "Feature Request " from menu

    Given user is logged in as manager
    And user is on home page
    When user click on hamburger menu icon
    Then user should be able to click on "Feature Request"
    And user should be able to select <options>Report a bug or Suggest an improvement or Ask a question
    Examples:
      |options|
      |"Report a bug"|
      |"Suggest an improvement"|
      |"Ask a question"|


  @HowToUseOnloop
  Scenario: ENG-491 Users should be able to see and open the "how to use onloop?"

    Given user is logged in as manager
    And user is on home page
    When user click on hamburger menu icon
    And user tap on "How to use onloop?"
    Then user should be able redirected to "Feedback And reflection page"

  @ResourceCenter
  Scenario: ENG-1126 To check the user is able to click on "Resource Center " from the menu

    Given user is logged in as manager
    And user is on home page
    When user click on hamburger menu icon
    Then user should be able to click on "Resource Center" to redirect to view information about Onloop features

  @FollowUsOnTwitter
  Scenario: ENG-492 Users should be able to go to twitter magic link option from "Follow us on twitter option"

    Given user is logged in as manager
    And user is on home page
    When user click on hamburger menu icon
    And user tap on "Follow us on twitter"
    Then user should be able redirected to "Twitter" Site

  @SupportOurGrowth
  Scenario: ENG-493 Users should be able redirected to Android/iOS app store from "Support our growth"

    Given user is logged in as manager
    And user is on home page
    When user click on hamburger menu icon
    And user scrolls down the screen
    And user tap on "Support our growth"
    Then user should be able redirected to Android or IOS app store

  @SyncOnloopWithSlack
  Scenario: ENG-488 Users should be able to link a slack account with an onloop account
    Given user is logged in as manager
    And user is on home page
    When user click on hamburger menu icon
    And user tap on "Make captures in slack"
    Then user should be able to link onloop application profile with Slack


