Feature: Manual SD Processing

  Background:
    Given Log in to SF

  Scenario: Enter Case information manually
    Given user clicks 'App launcher'
    When user clicks on "Home" in App Launcher
    When user clicks resent opened case
    Then Case navigation is present
    Then Milestones is present
    Then Possible duplication is present
    Then Header bunner is present
    Then Source document is present
    #implement checking Case validation as i understand instead of Case candidate assessments

  Scenario: Check Home page mockups
    Given user clicks 'App launcher'
    When user clicks on "Home" in App Launcher
    Then Dashboard is present
    Then Case candidate is present
    Then Chatter is present
    Then Recent Records is present
