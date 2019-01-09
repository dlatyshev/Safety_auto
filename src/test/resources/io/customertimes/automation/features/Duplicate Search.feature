Feature: Duplicate Search

  Background:
    Given Log in to SF

  Scenario: Create a new duplicate rule
    Given user clicks 'App launcher'
    When user clicks on "Duplicate Rules" in App Launcher
    Then duplicate rules page is opened
    When user clicks on button 'New'
    Then new duplicate rule page is opened
    When user populate the fields of new rule
    When user clicks on the button 'Save'
    Then new duplicate rule details are opened

