@mobile
Feature: Wellness_Manager_Home


  @wellnessPageAppearOnMondayOnHomePage
  Scenario: ENG-1773 Home | Wellness | To check user is able to see wellness page appear on monday on home page when he log in for the day

    Given user is logged in as another manager
    And wellness fetaure should be enabled
    Then user should be able to see wellness page appear on monday on home page when he log in for the day



  @ClickOnCompleteMyCheckInBtn
  Scenario: ENG-1774 Home | Wellness | To check user is able to click on "Complete my check -in" button
    Given user is logged in as manager
    And user should be on wellness introduction screen
    When user click on "Complete my check -in" button
    Then user should be able to click on "Complete my check -in" button

  @wellnessPopupWindow
  Scenario: ENG-1776 Home | Wellness | To check user is able to see popup window for wellness chek in after login
    Given user is logged in as manager
    When user see wellness introduction screen , User click on "X" button
    Then User should be able to see popup window for wellness check in


  @AmazingInFlowOptionOfWellness
  Scenario: ENG- 1777 Home | Wellness | To check the user is able to click on "Amazing,In flow " and
  it should reflect on the home page at the notification field
    Given user is logged in as another manager
    And user should be on wellness introduction screen
    When user click on "Complete my check -in" button
    And user click on "Amazing ,in flow"  button
    Then user should be able to click on "Amazing ,in flow"  button and it should reflect on home page at notification field

  @GreatHighEnergyOptionOfWellness
  Scenario:ENG- 1778 Home | Wellness | To check the user is able to click on "Great , High Energy" and it should reflect on the home page at the notification field
    Given user is logged in as manager
    And user should be on wellness introduction screen
    When user click on "Complete my check -in" button
    And user click on "Great ,High Energy" button
    Then user should be able to click on "Great , High Energy" button and it should reflect on home page at notification field

  @GoodSomeStressOptionOfWellness
  Scenario:ENG- 1779 Home | Wellness | To check the user is able to click on "Good , Some stress" and it should reflect on the home page at the notification field
    Given user is logged in as manager
    And user should be on wellness introduction screen
    When user click on "Complete my check -in" button
    And user click on "Good ,Some stress" button
    Then user should be able to click on "Good ,Some stress" button and it should reflect on home page at notification field


  @alrigthDifficultyFocusingOptionOfWellness
  Scenario: ENG- 1780 Home | Wellness | To check the user is able to click on "Alright , difficulty focusing" and it should reflect on the home page at the notification field
    Given user is logged in as manager
    And user should be on wellness introduction screen
    When user click on "Complete my check -in" button
    And user click on "Alright , difficulty focusing" button
    Then user should be able to click on "Alright , difficulty focusing"  button and it should reflect on home page at notification field

  @LowUnabletoFocusOptionOfWellness
  Scenario: ENG- 1781 Home | Wellness | To check the user is able to click on "Low , Unable to focus" and
  it should reflect on the home page at the notification field
    Given user is logged in as another manager
    And user should be on wellness introduction screen
    When user click on "Complete my check -in" button
    And user click on "Low,Unable to focus" button
    Then user should be able to click on "Low , Unable to focus"  button and it should reflect on home page at notification field


  @ExhaustesOptionOfWellness
  Scenario:ENG- 1782 Home | Wellness | To check the user is able to click on "Exhausted, Close to burn out" and it should reflect on the home page at the notification field
    Given user is logged in as manager
    And user should be on wellness introduction screen
    When user click on "Complete my check -in" button
    And user click on "Exhausted, Close to burn out" button
    Then user should be able to click on "Exhausted, Close to burn out" button and it should reflect on home page at notification field

  @CheckInLaterButtonOnWellness
  Scenario: ENG-1783 Home | Wellness | To check the user is able to click on "Check-in later " and it
  should reflect on the home page at the notification field for check in for week
    Given user is logged in as manager
    And user should be on wellness introduction screen
    When user click on "Complete my check -in" button
    And user click on "Check-in later" button
    Then user should be able to click on "Check-in later" and it should reflect on the home page at the notification field for check in for week

  @clickOnXbutton
  Scenario: ENG-1775 Home | Wellness | To check user is able to click on "X" button on introduce
  wellness page and it will redirected to home page
    Given user is logged in as another manager
    When user see wellness introduction screen , User click on "X" button
    Then user should be able to click on "X" button and it should come on home page wellness check in page




















  @UserAbleToSaveChangedTeamName
  Scenario Outline: ENG 780 Team | To check user is able to save changed team name
    Given user is logged in as manager
    And user should be on team page
    And user should be on add team page
    When user click on enter a team name<Team> text box
    Then user should be  able to add <Team> name
    And User should be on team name as <Team>
    When User click on setting icon
    When user click on text box to modify team name
    And User click on back button icon
    And User click on Save option on confirmation screen
    Then user should be able to save team name
    Examples:
      | Team           |
      | "onloop-three" |


  @EditTeamMember
  Scenario Outline: ENG 781 Team | To check user is able to edit team members
    Given user is logged in as another manager
    And user should be on team page
    And User should be on team name as <Team>
    And User click on setting icon
    When user click on edit button in team members field
    Then user should be able to edit team members
    Examples:
      | Team            |
      | "Learn Testing" |


  @IndividualProfileImproveTab
  Scenario Outline: ENG-787 Team | To check whether user is able to see details of "improve" of individual profile

    Given user is logged in as manager
    And user should be fill all details in Team >> my team >>
    And user should be on team page
    And User scroll down<Team>
    And user click on created team<Team>
    And user click on team member name<memberName>
    And user click on improve tab in team members profile
    Then user should be able to see details of "improves" on individual profile

    Examples:
      | Team       | memberName      |
      | "TeamTest" | "Nikita Gorale" |

  @ToMakeCaptureForIndividuals
  Scenario Outline: ENG 790 Team | To check whether user is able to make capture for individuals
    Given user is logged in as another manager
    And user should be fill all details in Team >> my team >>
    And user should be on team page
    And User scroll down<Team>
    And user click on created team<Team>
    And user click on team member name<memberName>
    And user click on make a capture
    Then user should be able to redirected to capture page
    When user click on celebrate icon
    And user need to select and write compulsory tabs
    Then user should be able to capture celebrate for colleague
    Examples:
      | Team            | memberName      |
      | "Learn Testing" | "Nikita Gorale" |

  @IndividualProfileCelebrateTab
  Scenario Outline:ENG-786 Team | To check whether user is able to see details of "celebrate" on individual profile
    Given user is logged in as manager
    And user should be fill all details in Team >> my team >>
    And user should be on team page
    And User scroll down<Team>
    And user click on created team<Team>
    And user click on team member name<memberName>
    Then user should be able to see details of "celebrate" on individual profile
    Examples:
      | Team       | memberName      |
      | "TeamTest" | "Nikita Gorale" |

  @IndividualProfileGoalsTab
  Scenario Outline: ENG-789 Team | To check whether user is able to see details "Goals" of individuals profile
    Given user is logged in as manager
    And user should be fill all details in Team >> my team >>
    And user should be on team page
    And User scroll down<Team>
    And user click on created team<Team>
    And user click on team member name<memberName>
    And user click on goals tab in team members profile
    Then user should be able to see details of "Goals" on individual profile
    Examples:
      | Team         | memberName      |
      | "TeamTest" | "Nikita Gorale" |

  @teamPendingInvitation
  Scenario Outline: ENG 782 Team | To check whether user is able to see pending invitations
    Given user is logged in as another manager
    And user should be fill all details in Team >> my team >>
    And user should be on team page
    And User scroll down<Team>
    And user click on created team<Team>
    And User click on setting icon
    When user click on edit button in team members field
    Then user should be able to see pending team members to accept team invites
    Examples:
      | Team            |
      | "Learn Testing" |

  @UserAbleToClickOnSettingIcon
  Scenario Outline: ENG 777 Team | To check whether user is able to click on settings
    Given user is logged in as manager
    And user should be on team page
    And team member should accept the request for team invite
    And User scroll down<Team>
    And user click on created team<Team>
    And User click on setting icon
    Then user should be able to click on setting icon
    Examples:
      | Team    |
      | "India" |

  @ModifyTheTeamName
  Scenario Outline: ENG 778 Team | To check user is able to rename(edit) the team name
    Given user is logged in as manager
    And user should be on team page
    And team member should accept the request for team invite
    And User scroll down<Team>
    And user click on created team<Team>
    And User click on setting icon
    And User click on team name text box
    And user modify team name
    Then user should be able to rename the team name
    Examples:
      | Team    |
      | "India" |


  @checkInvitationAccepted
  Scenario Outline:ENG-773 Team | To check once member will accept invitation it will show part of team
    Given user is logged in as manager
    And user should be fill all details in Team >> my team >>
    And team member should accept the request for team invite
    And user should be on team page
    And User scroll down<Team>
    When user click on created team<Team>
    And User click on setting icon
    Then user should be able to see all members who accept the team invite and joined team
    Examples:
      | Team    |
      | "India" |

  @verifyTeamProfile
  Scenario Outline:ENG-774 Team | To check whether user is able to see team profile
    Given user is logged in as manager
    And user should be fill all details in Team >> my team >>
    And team member should accept the request for team invite
    And user should be on team page
    And User scroll down<Team>
    When user click on created team<Team>
    Then user should be able to see team<Team> profile
    Examples:
      | Team    |
      | "India" |

  @addColleagueIntoExistingTeam
  Scenario Outline:ENG-775 Team | To check whether user is able to add team members to already formed team
    Given user is logged in as manager
    And user should be fill all details in Team >> my team >>
    And user should be on team page
    And User scroll down<Team>
    When user click on created team<Team>
    When user click on add icon
    And user click on search or invite colleague<memberName>
    And user click on invite now button of Invite to Team
    And user enter collegue email address<Email>
    Then user should be able to add colleagues from link or name within app
    Examples:
      | Team    | memberName | Email                         |
      | "India" | "Nilesh"   | "nileshkharche@vtestcorp.com" |


  @InviteCollegue
  Scenario Outline:ENG-459 To validate that user is able to search the name of the team mate and send invites to them
    Given user is logged in as manager
    When user enter collegue name<name> in drop down search box
    And user enter collegue email address<email>
    Then user should be able to send add collegue request
    Examples:
      | name     | email                       |
      | "pravin" | "pravinkumar@vtestcorp.com" |


  @memberCountWithTeamName
  Scenario Outline:ENG-501 To check after adding team and team members , It should be reflect on team page
    Given user is logged in as manager
    And user should be fill all details in Team >> my team >>
    And user should be on team page
    When User scroll down<Team>
    Then Team name<Team> and team members count should be displayed
    Examples:
      | Team    |
      | "India" |