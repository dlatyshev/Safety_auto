Feature: Case Merge

  Background:
    Given Log in to SF

  Scenario: Check case merge mandatory fields
    Given user clicks 'App launcher'
    Then 'App launcher' is opened
    When user clicks on "Cases" in App Launcher
    When user clicks on case number "00001212"
    When user clicks on the button 'Select For Merge'
    When user clicks on the button 'Merge'
    Then case merge page is opened
    Then all required buttons are displayed
    Then all required fields are displayed
    Then all required checkboxes are displayed

