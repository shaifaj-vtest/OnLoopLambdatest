@mobile
Feature: Manager_Home


  @Capture_Count
  Scenario: ENG-494 User should be able to see capture count on home page.

    Given user is logged in as manager
    When  user is on home page
    Then  user should be able to see Total capture count


  @CaptureList
  Scenario: ENG-496 Users should be able to see colleagues capture listed on homepage.
    Given user is logged in as manager
    When  user is on home page
    Then  captures should be listed down for all colleagues

  @AddColleagueWithInvite
  Scenario Outline: ENG-471 To validate that user is able to search the name of the team-mates and send 3 invites to different users.
    Given user is logged in as manager
    And user should be on home page
    And user click on add colleague icon
    When user click on invite now button
    And user add <name> into colleague name text box
    And user add <mailid> into invited by text box
    And click on send invite
    Then user should be able to send request to two more colleagues

    Examples:
      | name  | mailid                |
      | "Aza" | "azar.sayye@test.com" |


  @AddColleagueWithoutInvite
  Scenario Outline: ENG-977 To verify that user is able to send request to create private colleague

    Given user is logged in as manager
    And user should be on home page
    And user click on add colleague icon
    When user click on "Create private colleague"
    And user add colleague <name> in text box
    Then user should be added as private colleague and should be able to  click maybe later

    Examples:
      | name           |
      | "Akshay Kadam" |


  @CaptureClick
  Scenario: ENG-1125 To check whether Capture icon is redirect to capture page or not.
    Given user is logged in as manager
    And user should be on home page
    When user click on add icon(Plus Sign)
    Then user should be able to redirected to capture page

  @CaptureCelebrate
  Scenario: ENG-485 Users should be able to touch and open the capture menu icon
  and access the celebrate for a colleague's
    Given user is logged in as manager
    And user should be on home page
    And   user click on add icon(Plus Sign)
    And   user should be able to redirected to capture page
    When  user click on celebrate tab icon
    And   user need to select and write compulsory tabs
    Then  user should be able to capture celebrate for colleague

  @SearchAnyone
  Scenario Outline: ENG-495 User should be able to search organization members in search box
    Given user is logged in as manager
    And user should be on home page
    When user click on search box
    And user should be able to write any <name>
    Then searched name profile should be displayed with organization
    Examples:
      | name    |
      | "akbar" |

  @ApplyFilters
  Scenario Outline: ENG-498 While search any member user should be able to apply filter
    Given user is logged in as manager
    And user should be on home page
    When user tap on "filters"
    And user set criteria in filters <From><value><sort>
    Then user should see the changes on home page
    Examples:
      | From       | value     | sort          |
      | "All Time" | "Default" | "Most Recent" |

  @InboxTabs
  Scenario: ENG-497 Users should able to check the inbox for notification and request tab is visible
    Given user is logged in as manager
    And user should be on home page
    When user click on inbox icon
    Then Notification and request tab should be displayed

  @InboxNotificationToAddAsManager
  Scenario: ENG-474 Validate that manager should receive the notification and accept the request
    Given user is logged in as manager
    And team member should already send manager request to manager
    And user should be on home page
    When user click on inbox icon
    Then user should be able to get notification And accept the request

  @InboxNotificationForMembersReaction
  Scenario: ENG-468 Manager should receive the notification for team member reaction
    Given user is logged in as manager
    And Team member should react before on capture
    And user should be on home page
    And user click on inbox icon
    Then user should get the notification for capture react


  @FilterForInboxRequestTab
  Scenario Outline: ENG-1401 To check whether user is able to use filter for search capture request
    Given user is logged in as manager
    And user should be on home page
    When user click on inbox icon
    And click on request tab
    And user tap on "filters"
    And filter screen should be displayed<From> ,select date with given option
    And select sort by option<sort>
    And select request status option<status>
    And select sent or received by option<by>
    And click on apply
    Then user should be able to see filter capture request
    Examples:
      | From       | sort   | status      | by           |
      | "All Time" | "Sent" | "Completed" | "My Directs" |

  @ResetFilterForInboxRequestTab
  Scenario Outline: ENG-1402 To check whether user is able to reset filter for search capture request
    Given user is logged in as manager
    And user should be on home page
    When user click on inbox icon
    And click on request tab
    And user tap on "filters"
    And filter screen should be displayed<From> ,select date with given option
    And select sort by option<sort>
    And select request status option<status>
    And select sent or received by option<by>
    And click on apply
    And user click on filter again
    And user click on reset in filter popup page
    Then user should be able to see all captures
    Examples:
      | From       | sort       | status    | by           |
      | "All Time" | "Received" | "Pending" | "My Directs" |

  @ViewColleagueProfileFromHome
  Scenario Outline: ENG-1508-9 To check user is able to click on colleagues profile and view profile from home screen
    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    Then user should be able to click on Colleagues profile <Name> and View profile
    Examples:
      | Name            |
      | "Nikita Gorale" |

  @ViewColleaguesDetails
  Scenario Outline: ENG-1510-11 To check user is able to click on "i" icon and click on"Back" and come to colleagues profile page
    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user should be able to click "i" icon on profile
    Then user should be able to click on back "<--"
    Examples:
      | Name            |
      | "Nikita Gorale" |

  @DeleteColleaguesDetails
  Scenario Outline: ENG-1512-13&14 To check user is able to click on "Delete" button in popup window msg after clicking on "Delete icon"
    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user should be able to click "i" icon on profile
    And user should be able to click on "Delete" icon
    And user should be able to click on "Cancel" button
    Then user should be able to view delete popup and will click on "Delete" button
    Examples:
      | Name                |
      | "Siddharth Kumavat" |


  @ViewCelebrateTapInColleagueProfile
  Scenario Outline: ENG-1515 To check user is able to see colleagues celebrate tab
    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    Then user should be able to see celebrate tab on profile
    Examples:
      | Name            |
      | "Nikita Gorale" |

  @TotalCelebratesInColleagueProfile
  Scenario Outline: ENG-1517 To check user is able to see total, made by and received celebrates in celebrate tab
    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user should be able to see celebrate tab on profile
    Then user should be able to see capture count of celebrates
    Examples:
      | Name            |
      | "Nikita Gorale" |

  @TopCelebrateTagsInColleagueProfile
  Scenario Outline: ENG-1518 To check user is able to see top celebrate tags

    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user should be able to see celebrate tab on profile
    Then user should be able to see top tags for celebrate in "Top Celebrate tags" field
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @ViewImproveTabInColleagueProfile
  Scenario Outline: ENG-1516 To check user is able to see colleagues improve tab and click on it
    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    Then user should be see improve tab and able to click on Improve tab on profile
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @ApplyFiltersForCelebrate
  Scenario Outline: ENG-1519-20 To check user is able to apply filter and see count of filter
    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user click on filter
    And user select filter as user want<From><Capture><Sort>
    Then user should be able to click on apply filter and see count of filter
    Examples:
      | Name            | From        | Capture  | Sort          |
      | "Kanchan Tathe" | "This Week" | "Myself" | "Most Recent" |

  @ResetFiltersForCelebrate
  Scenario Outline: ENG-1521 To check user is able to reset the filter after apply filter

    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user click on filter
    And user select filter as user want<From><Capture><Sort>
    And user should be able to click on apply filter and see count of filter
    And user click on filter when he comes on colleague's profile
    Then user should be able to click on reset and filter should be reset
    Examples:
      | Name            | From        | Capture  | Sort          |
      | "Kanchan Tathe" | "This Week" | "Myself" | "Most Recent" |

  @InstructionPrismSummaryForCelebrate
  Scenario Outline: ENG-1522 To check the user is able to click on "?" and it should show a popup window of instruction for prism summary

    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user click "?" in profile near prism summary field
    Then popup window should be displayed for providing instruction to write prism summary
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @CelebrateCountOnPrismSummaryTap
  Scenario Outline: ENG-1523-24 To check user is able to see count of celebrate capture and click on "Make a Capture" button in prism summary
    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    Then user should be able to see count of celebrate capture and click on "Make a Capture" button in prism summary
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @ViewHistoryCaptureForCelebrate
  Scenario Outline: ENG-1525 To check user is able to see celebrate capture history

    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user scroll down screen
    Then user should be able to see the capture history
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @SelectAnyHistoryCaptureForCelebrate
  Scenario Outline: ENG-1571 user should be able to click on any capture from history

    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user scroll down screen
    Then user should be able to click on any capture from history
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @ViewAndRevertOnCaptureForCelebrate
  Scenario Outline: ENG-1572-73-74-75 To check user is able to click on "send" button for reaction symbol and text for Celebrate
  //Symbols ✅ 👏 👍 🔥 💯
    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user should be able to click on any capture from history
    And user select reaction symbol<Symbol>
    And user add text<Text>
    Then user should be able to click send button
    Examples:
      | Name            | Symbol | Text         |
      | "Kanchan Tathe" | "👏"   | "Appriciate" |

  @ViewCounOfImprove
  Scenario Outline: ENG-1576-77 To check user is able to see count of captures in improve tab

    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user click on improve tab
    Then user should be able to see count of improves in same tab
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @ViewTopTagOfImprove
  Scenario Outline: ENG-1578 To check user is able to see count of captures in improve tab

    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user click on improve tab
    Then user should be able to see top tags in same tab of improves
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @FilterApply&CountForImproveTab
  Scenario Outline: ENG-1579-80 To check user is able to apply filter and count of filter after applying for improve

    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user click on improve tab
    And user click on filter
    And user select filter as user want<From><Capture><Sort>
    Then user should be able to click on apply filter and see count of filter
    Examples:
      | Name            | From        | Capture  | Sort          |
      | "Kanchan Tathe" | "This Week" | "Myself" | "Most Recent" |

  @ResetFilterForImproveTab
  Scenario Outline: ENG-1581 To check user is able to reset the filter after apply filter on Improve Tab

    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user click on improve tab
    And user click on filter
    And user select filter as user want<From><Capture><Sort>
    And user should be able to click on apply filter and see count of filter
    And user click on filter when he comes on colleague's profile
    Then user should be able to click on reset and filter should be reset
    Examples:
      | Name            | From        | Capture  | Sort          |
      | "Kanchan Tathe" | "This Week" | "Myself" | "Most Recent" |

  @InstructionForPrismSummaryInImprove
  Scenario Outline: ENG-1582 To check the user is able to click on "?" and it should show a popup window of instruction for prism summary

    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user clicked on improve tab
    And user click "?" in profile near prism summary field
    Then popup window should be displayed for providing instruction to write prism summary
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @CountOfImproveInPrismSummary
  Scenario Outline: ENG-1583 To check user is able to see count of capture and click on "Make a Capture" button in prism summary of improve
    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user clicked on improve tab
    Then user should be able to see count of capture and click on "Make a Capture" button in prism summary of improve
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @ViewHistoryCaptureForImprove
  Scenario Outline: ENG-1584-85 To check user is able to click any capture history from improve
    Given user is logged in as manager
    And user should be on home page
    When user scroll down<Name>
    And user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user clicked on improve tab
    And user scroll down screen
    And user should be able to click on any capture from history
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @ViewAndRevertOnCaptureForImprove
  Scenario Outline: ENG-1586-87-88 To check user is able to click on "send" button for reaction symbol and text for improve
  //Symbols ✅ 👏 👍 🔥 💯
    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user should be able to click on Colleagues profile <Name> and View profile
    And user click on Got it! button
    And user clicked on improve tab
    And user should be able to click on any capture from history
    And user select reaction symbol<Symbol>
    And user add text<Text>
    Then user should be able to click send button
    Examples:
      | Name            | Symbol | Text         |
      | "Kanchan Tathe" | "👏"   | "Appriciate" |

  @SelectGoalTab
  Scenario Outline: ENG-1623 Home | Colleagues | To check user is able to select goals tab
    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    Then user should be able to select goal tab
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @GoalProfile
  Scenario Outline: ENG-1624 Home | Colleagues | To check user is able to see goals profile of colleague
    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    Then user should be able to see goals profile
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @clickOnGoalFilter
  Scenario Outline: ENG-1625 Home | Colleagues | To check user is able to click on filter for goals
    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user clik on filter tab
    Then user should be able to click on filter tab
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @applyGoalFilter
  Scenario Outline: ENG-1626 Home | Colleagues | To check user is able to apply filter with all fields of filter

    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user clik on filter tab
    And user make changes as required<From><GoalType><Goalstatus>
    And user make changes as required next<Priority><CreatedBy><SortBy>
    Then user should see filter is applied
    Examples:
      | Name            | From        | GoalType  | Goalstatus | Priority | CreatedBy | SortBy         |
      | "Kanchan Tathe" | "This Week" | "Project" | "Ongoing"  | "Medium" | "Myself"  | "Least Recent" |


  @ClickOnApplyFilterForGoalTab
  Scenario Outline: ENG-1627 Home | Colleagues | To check user is able to click on "Apply filter" button after adding filter
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user clik on filter tab
    And user make changes as required<From><GoalType><Goalstatus>
    And user make changes as required next<Priority><CreatedBy><SortBy>
    Then user Click On ApplyFilter
    Examples:
      | Name            | From        | GoalType  | Goalstatus | Priority | CreatedBy | SortBy         |
      | "Kanchan Tathe" | "This Week" | "Project" | "Ongoing"  | "Medium" | "Myself"  | "Least Recent" |

  @CountOfFilterForGoalTab
  Scenario Outline: ENG-1628 Home | Colleagues | To check user is able to see count of filter after applying for goal
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user clik on filter tab
    And user make changes as required<From><GoalType><Goalstatus>
    And user make changes as required next<Priority><CreatedBy><SortBy>
    And user Click On ApplyFilter
    Then user should be able to see count of filter after applying for goal
    Examples:
      | Name            | From        | GoalType  | Goalstatus | Priority | CreatedBy | SortBy         |
      | "Kanchan Tathe" | "This Week" | "Project" | "Ongoing"  | "Medium" | "Myself"  | "Least Recent" |

  @ResetGoalFilter
  Scenario Outline: ENG-1629 Home | Colleagues | To check user is able to reset filter for goal and click on "Apply filter " button
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user clik on filter tab
    And user make changes as required<From><GoalType><Goalstatus>
    And user make changes as required next<Priority><CreatedBy><SortBy>
    And user Click On ApplyFilter
    And user click on filter again
    And user click on reset
    Then user should be able to click on Apply filter to reset filter
    Examples:
      | Name            | From        | GoalType  | Goalstatus | Priority | CreatedBy | SortBy         |
      | "Kanchan Tathe" | "This Week" | "Project" | "Ongoing"  | "Medium" | "Myself"  | "Least Recent" |

  @CountOfResetFilterForGoalTab
  Scenario Outline: ENG-1630 Home | Colleagues | To check user is able to see filter count should be none on goals tab profile after reset filter
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user clik on filter tab
    And user make changes as required<From><GoalType><Goalstatus>
    And user make changes as required next<Priority><CreatedBy><SortBy>
    And user Click On ApplyFilter
    And user click on filter again
    And user click on reset
    Then user should be able to click on Apply filter to reset filter
    Then user should be able to see count none on filter
    Examples:
      | Name            | From        | GoalType  | Goalstatus | Priority | CreatedBy | SortBy         |
      | "Kanchan Tathe" | "This Week" | "Project" | "Ongoing"  | "Medium" | "Myself"  | "Least Recent" |

  @CountOfGoals
  Scenario Outline: ENG-1631 Home | Colleagues | To check user is able see count of goals
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    Then user should be able to see count of goals
    Examples:
      | Name            |
      | "Kanchan Tathe" |

  @ClickOnOngoingGoals
  Scenario Outline: ENG-1632 Home | Colleagues | To check user is able to click on ongoing goals
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    Then user should be able to click on any ongoing goal<OngoingGoals>
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Decrease test to 180% by August 31" |

  @ClickOnOngoingGoalsBackArrow
  Scenario Outline: ENG-1639 Home | Colleagues | To check user is able click on back button from view goal page
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    Then user should be able to press back arrow button icon from view goal page
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Decrease test to 180% by August 31" |

  @ClickOnOngoingGoalsEditIcon
  Scenario Outline: ENG-1640 Home | Colleagues | To check user is able click on "Edit"icon button from view goal page
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    Then user should be able to click on "edit" icon button
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Decrease test to 180% by August 31" |


  @ClickOnOngoingGoalsMarkAsComplete
  Scenario Outline: ENG-1641 Home | Colleagues | To check user is able click on "Mark as complete " from view goal page
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    And user should be able to click on "Mark as complete button"
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Decrease test to 180% by August 31" |

  @ClickOnOngoingGoalsComplete
  Scenario Outline: ENG-1642 Home | Colleagues | To check user is able click "Complete" after clicking on "Mark as complete " from view goal page
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    And user should be able to click on "Mark as complete button"
    Then user should be able to click on "complete" button
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Increase test to 120% by August 31" |

  @ClickOnOngoingGoalsCancelButton
  Scenario Outline: ENG-1643 Home | Colleagues | To check user is able click "Cancel" after clicking on "Mark as complete " from view goal page
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    And user should be able to click on "Mark as complete button"
    Then user should be click on "Cancel" button
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Decrease test to 180% by August 31" |

  @ClickOnGoalsConversationTab
  Scenario Outline: ENG-1644 Home | Colleagues | To check user is able click on Conversation tab from view goal page
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    Then user should be able to click on conversation tab
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Decrease test to 180% by August 31" |

  @ClickOnGoalsConversationReactionSymbols
  Scenario Outline: ENG-1645 Home | Colleagues | To check user is able react on Goal with suggestion icon list from view goal page
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    And user should be able to click on conversation tab
    Then user should be able to select reaction symbol from suggestion icon list
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Increase test to 150% by August 31" |

  @AddTextInGoalsConversation
  Scenario Outline: ENG-1646 Home | Colleagues | To check user is able add text in conversation in view goal page
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    And user should be able to click on conversation tab
    Then user should be able to add text in textbox
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Increase test to 150% by August 31" |

  @InOngoingGoalsViewConversation
  Scenario Outline: ENG-1647 Home | Colleagues | To check user is able see  date and time of conversation in chat box for each message
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    And user should be able to click on conversation tab
    Then user should be able to see conversation with date and time
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Increase test to 150% by August 31" |


  @InOngoingGoalsViewInsighsTab
  Scenario Outline: ENG-1648 Home | Colleagues | To check user is able to click on "insight" tab  in view goal page
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    Then user should be able to click on insight tab
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Decrease test to 180% by August 31" |

  @ClickOnGoalsConversationSendButton
  Scenario Outline: ENG-1733 Home | Colleagues | To check user is able to click on "send" button for reaction symbol and text for goals
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    And user should be able to click on conversation tab
    And user should be able to select reaction symbol from suggestion icon list
    And user add text
    Then user should be able to click send button
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Increase test to 150% by August 31" |

  @InsightTabGoalTypes
  Scenario Outline: ENG-1734 To check user is able to see goal subtype(Target , Project , Behavioral skill and hard skill) on the top page near priority
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    And user should be able to click on insight tab
    Then user should be able to see Goal subtype for capture
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Increase test to 150% by August 31" |

  @InsightTabCaptureProgressButton
  Scenario Outline: ENG-1735 To check user is able to click on "Capture progress" button for goal with subtype project
    Given user is logged in as manager
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    And user should be able to click on insight tab
    Then user should be able to click on "Capture progress" button
    Examples:
      | Name            | OngoingGoals                         |
      | "Kanchan Tathe" | "Increase test to 150% by August 31" |

  @InsightTabMilestonesRadioButton&MakeACapture
  Scenario Outline: ENG-1736-43,44 Home | Colleagues | To check the user is able to click on the milestone circle & View count of Milestones option for goal
  with subtype project and also click on Make a capture.

    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    And user should be able to click on insight tab
    Then user click on Circle to add count on top for milestone of goal with subtype project and also click on Make a capture
    Examples:
      | Name            | OngoingGoals |
      | "Kanchan Tathe" | "Project"    |

  @InsightTabEditAdd&SaveMilestones
  Scenario Outline: ENG-1745 Home | Colleagues | To check user is able to edit milestone or add more milestone for project goal
    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till ongoing goals field come<OngoingGoals>
    And user should be able to click on any ongoing goal<OngoingGoals>
    And user should be able to click on insight tab
    And user click on "Edit or add milestones" button
    And user redirected to "Edit my goal" page
    And user click on "add another milestone"
    And user write milestone name
    Then user click on "Save goal" with all milestones whicha are added recently
    Examples:
      | Name            | OngoingGoals |
      | "Kanchan Tathe" | "Project"    |

  @AddNotesOnAdditionalContext
  Scenario Outline: ENG-1748 Home | Colleagues | To check user is able to add notes from Additional
  context field with button
    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till Any ongoing project goals<OngoingProjectGoals>
    And user click on Any ongoing project goals<OngoingProjectGoals>
    And user should be able to click on insight tab
    And user click on "+Add notes" button or Edit button at right top
    And user scroll down to till<Additional context>
    And user add text into it
    And user click on "Save Goal" button
    And user come to myself page
    And click on same project ongoing goal<OngoingProjectGoals>
    And user scroll down to till
    Then user should be able to see with additional button user can fill "Additional Context is filled by user "
    Examples:
      | Name            | OngoingProjectGoals | Additional context |
      | "Kanchan Tathe" | "Project"           | "hi"               |

  @ViewHardSkill
  Scenario Outline: ENG-1749 Home | Colleagues | To check user is able to click and go in hard skill "view goals"
  page
    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till Any hard skill capture<OngoingHardSkillGoal>
    And user click on Any hard skill capture in ongoing goal<OngoingHardSkillGoal>
    Then User should be able to click and go in hard skill "view goals" page
    Examples:
      | Name            | OngoingHardSkillGoal       |
      | "Nikita Gorale" | "Get started by end of Q3" |

  @HardSkillBackButton
  Scenario Outline: ENG-1750 Home | Colleagues | To check user is able to click and go in hard skill
  and able to click on "back" button icon
    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till Any hard skill capture<OngoingHardSkillGoal>
    And user click on Any hard skill capture in ongoing goal<OngoingHardSkillGoal>
    And User should be able to click and go in hard skill "view goals" page
    Then user should be able to click on "back" button icon
    Examples:
      | Name            | OngoingHardSkillGoal       |
      | "Nikita Gorale" | "Get started by end of Q3" |

  @HardSkillCaptureProgressManegersCount
  Scenario Outline: ENG-1751 Home | Colleagues | To check manager is able to click and go in hard skill and able
  to add capture for his team member from "Capture Progress" button , Also see its count in "Celebrates captures from your manager"
    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till Any hard skill capture<OngoingHardSkillGoal>
    And user click on Any hard skill capture in ongoing goal<OngoingHardSkillGoal>
    And user click on "Capture progress" button
    And user comes on "capture a thought" page
    And user makes a celebrate capture
    And click on "save and share "
    And user scroll down and go to timeline filed
    And user click On "Share" button
    And user click on "Share privetly with [Name]" option
    And user click on "share Privetly"
    And user should be able to see count of 1 celebrate is increasing in managers side count
    Then user should be able to see count of celebrate in overview
    Examples:
      | Name            | OngoingHardSkillGoal       |
      | "Nikita Gorale" | "Get started by end of Q1" |


  @HardSkillCaptureUserCount
  Scenario Outline: ENG-1754  Home | Colleagues | To check user is able to click and go in hard skill and able to add
  capture from "Capture Progress" button , Also see its count
    Given users should be login
    And user should be on home page
    When user click on myself account from colleague field
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till Any hard skill capture<OngoingHardSkillGoal>
    And user click on Any hard skill capture in ongoing goal<OngoingHardSkillGoal>
    And user click on "Capture progress" button
    And user comes on "capture a thought" page
    And user makes a celebrate capture
    And click on Save Capture Privately
    And user scroll down and go to timeline filed
    And user click On "Share" button
    And user click on "Share privetly with [Name]" option
    And user click on "share Privetly"
    And user scroll up and go to Overview filed
    And user should be able to see count of 1 celebrate is increasing in self-celebrate captures
    Then user should be able to see count of celebrate in overview
    Examples:
      | OngoingHardSkillGoal       |
      | "Get started by end of Q1" |

  @GoToLearn
  Scenario Outline: ENG-1755 Home | Colleagues | To check user is able to click on "go to learn" page for
  hard skill and it should redirected to "Learn page "
    Given users should be login
    When user click on myself account from colleague field
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till Any hard skill capture<OngoingHardSkillGoal>
    And user click on Any hard skill capture in ongoing goal<OngoingHardSkillGoal>
    And user should be able to click on insight tab
    And user scroll down till Go to learn
    And user click on "Go to Learn" button from Insights tab
    And user click on "Welcome to Learn feed" Got It! Button
    Then user should be able to click on "go to learn" page for hard skill and it should redirected to "Learn page "
    Examples:
      | OngoingHardSkillGoal       |
      | "Get started by end of Q1" |


  @checkUserAbleToAddResourcesWithArticle
  Scenario Outline:ENG-1756 Home | Colleagues | To check the user is able to "Add resources" with the
  Article option from goals hard skill and it should be shown in the timeline
    Given users should be login
    When user click on myself account from colleague field
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till Any hard skill capture<OngoingHardSkillGoal>
    And user click on Any hard skill capture in ongoing goal<OngoingHardSkillGoal>
    And user should be able to click on insight tab
    And user scroll down till Go to learn
    And user click on <resource> button , add resources page will open
    And user click on "article" option
    And user paste any link releted to article in "which article did you read?" text box
    And user click on "Add notes" text box to write anything releted to article
    Then user should be able to click on "save and share resource" button
    And user should be able to  come on view goal page and able to see this article in timeline field
    Examples:
      | resource        | OngoingHardSkillGoal       |
      | "Add resources" | "Get started by end of Q1" |


  @AddNotesOnAdditionalContextforHardSkill
  Scenario Outline: ENG-1757 Home | Colleagues | To check user is able to add notes from Additional context
  field with button for hard skill
    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on goal tab
    And user scroll down till Any hard skill capture<OngoingHardSkillGoal>
    And user click on Any hard skill capture in ongoing goal<OngoingHardSkillGoal>
    And user should be able to click on insight tab
    And user click on "+Add notes" button or Edit button at right top
    And user scroll down to till<Additional context>
    And user add text into it
    And user click on "Save Goal" button
    And user come to myself page
    And click on same hard skill capture<OngoingHardSkillGoal>
    And user scroll down to till
    Then user should be able to see with additional button user can fill "Additional Context is filled by user "
    Examples:
      | Name            | OngoingHardSkillGoal       | Additional context |
      | "Nikita Gorale" | "Get started by end of Q1" | "hi"               |

  @addNotesToHardSkillProjectFromOngoingGoals
  Scenario Outline:ENG-1765 Home | Colleagues | To check user is able to add notes to hardskill project from ongoing goals
    Given user is logged in as manager
    And user should be on home page
    And user scroll down<Name>
    When user click on Colleague account<Name>
    And user click on Got it! button
    And user click on goal tab
    And user scroll down till Any hard skill capture<OngoingHardSkillGoal>
    And user click on Any hard skill capture in ongoing goal<OngoingHardSkillGoal>
    And user should be able to click on insight tab
    And user click on edit button , User will rediredted to edit my goal page
    And user scroll down<name>
    And user click on Additional context :
    And user enter data as required
    And user click on Save goal button
    Then user should be  add notes to hardskill project from ongoing goals
    Examples:
      | Name            | name                 | OngoingHardSkillGoal       |
      | "Nikita Gorale" | "Additional context" | "Get started by end of Q1" |

  @addMissingFieldFromOnGoingGoal
  Scenario Outline:ENG-1766 Home | Colleagues | To check user is able to Add missing field from ongoing goal
  for target

    Given user is logged in as manager
    When user click on Colleague account
    And user click on goal tab
    And user click on Any ongoing Target goals<goal>
    And user click on edit button , User will rediredted to edit my goal page
    And user scroll down<goalType>
    And user make changes in capture as required<goalType>
    And user click on Save goal button
    Then user should be able to Add missing field from ongoing goals for target
    Examples:
      | goalType | goal     |
      | "medium" | "Target" |


  @ToSeeFirstLetterOfUserName
  Scenario: ENG-1794 Home | Colleague | To check the profile picture in Onloop application when user is
  going through onboarding without profile picture on gmail

    Given user is logged in as another manager
    When user click on myself account from colleague field
    And user click on Got it! button
    And User observe the profile picture icon for myself
    Then User should be able to see the first letter of the user's name



