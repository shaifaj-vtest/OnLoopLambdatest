@mobile
Feature: Registrations

  @SignUpAsManagerWithReferralsWithoutHisManager&Reminders
  Scenario Outline: ENG-460,458,470 Validate that user is able to join with referral as Manager.

    Given user should already get the link
    And user installed app
    And swipe Left
    And click on add another account
    And enter <username> and <password>
    And user should be on referral code screen
    When user enter referral code
    And user enter <companyEmail>
    And user enter <emailCode> and <profileName>
    And user select "I do manage people" on manager selection screen
    And user click on don't have manager
    And user skipped building habit screen
    Then user should be able to SignUp onloop as manager and logout successfully.
    Examples:
      | username|password|companyEmail|emailCode|profileName|
      | "azar.vtest2@gmail.com" |"Vtest@54321" |"swapnali.payghan@vtestcorp.com"|"1286"|"AzarVtest2"|


  @SignUpAsManagerWithHisManager&Reminders
  Scenario Outline: Validate that user is able to join Onloop as Manager.

    Given user should already get the link
    And user installed app
    And swipe Left
    And click on add another account
    And enter <username> and <password>
    And user should be on referral code screen
    When user enter referral code
    And user enter <companyEmail>
    And user enter <emailCode> and <profileName>
    And user select "I do manage people" on manager selection screen
    And user search and select his <manager>
    And user has to select option am ready for building habit and custom reminders
    Then user should be able to SignUp onloop as manager and logout successfully.
    Examples:
      | username|password|companyEmail|emailCode|profileName|manager|
      | "prashant.vtest2@gmail.com" |"Vtest@54321" |"mohseen@vtestcorp.com"|"3521"|"Mohsin"|"mayur"|


  @SelectManager
  Scenario Outline: ENG-484 Ensure that after successful login user should be able to select their respective manager.

    Given user should be on select manager page
    When user search manager name <arg0> in search box
    Then user should be able to select mayur as manager
    Examples:
      | arg0    |
      | "Mayur" |


  @LoginAsManager
  Scenario Outline: ENG-458 To check whether user is register as Manager or not.
    Given app should be installed
    When user click on app
    And swipe Left
    And click on add another account
    And enter <username> and <password>
    And user select manager from myself screen
    Then user should login as manager
    Examples:
      | username|password|
      | "prashant.vtest2@gmail.com" |"Vtest@54321" |


  @SignUpWithoutReferrals
  Scenario Outline: Validate that user should be on waitlist without referral.
    Given app should be installed
    When user click on app
    And swipe Left
    And click on add another account
    And enter <username> and <password>
    And user clicked on don't have referral so redirected to waitlist
    Then User should be on waitlist.
    Examples:
      | username|password|
      | "prashant.vtest2@gmail.com" |"Vtest@54321"|



