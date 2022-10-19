@TeamPage
Feature: Manager_Team

  @UserAbleToEnterTeamName
  Scenario Outline: ENG 766 Team | add | To check weather user is able to enter team name in text
    Given user is logged in as manager
    And user should be on team page
    And user should be on add team page
    When user click on enter a team name<Team> text box
    Then user should be  able to add <Team> name
    Examples:
      | Team         |
      | "OnloopTeam" |


  @userDirectedToAddColleaguePage
  Scenario: ENG 499 To check user is able to create team using + icon on the right top corner
    Given user is logged in as manager
    And user should be on home page
    When User tap on "+" Icon
    Then Page should directed to Add colleague page

  @ToModifyTeamName
  Scenario Outline: ENG 504 To Check manager is able to modify the team name
    Given user is logged in as manager
    And user should be on team page
    And user should be on add team page
    When user click on enter a team name<Team> text box
    Then user should be  able to add <Team> name
    And User should be on team name as <Team>
    When User click on setting icon
    And User click on team name text box
    And User write name as "Learn"
    And User click on back button icon
    And User click on Save option on confirmation screen
    Then Team name should be updated
    Examples:
      | Team         |
      | "Onloop-two" |


  @deleteCreatedTeam
  Scenario Outline: ENG-503 To check manager is able to delete the team
    Given user is logged in as manager
    And user should be on team page
    And user should be on add team page
    When user click on enter a team name<Team> text box
    Then user should be  able to add <Team> name
    And User should be on team name as <Team>
    And User scroll down<Team>
    And user click on created team<Team>
    And User click on setting icon
    And User click on Delete my Team
    And User click on "Yes,I'm sure" button on popup window massage
    Then Team should be deleted
    Examples:
      | Team             |
      | "onloop-one-one" |


  @selectIndividualProfile
  Scenario Outline:ENG-785 Team | To check weather user is able to select individuals profile of team members
    Given user is logged in as manager
    And user should be fill all details in Team >> my team >>
    And user should be on team page
    And User scroll down<Team>
    And user click on created team<Team>
    And user click on team member name<memberName>
    Then user should be able to select individuals profile of team members<Name>
    Examples:
      | Team       | memberName      | Name            |
      | "TeamTest" | "Nikita Gorale" | "Nikita gorale" |


























































