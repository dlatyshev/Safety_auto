Feature: Duplicate search and merge

  Background:
    Given Log in to SF

  Scenario: opening of the duplicate search screen
    Given user clicks 'App launcher'
    Then 'App launcher' is opened
    When user clicks on "Cases" in App Launcher
    When user clicks on case number "00001242"
    When user clicks the button 'Manual Search'
    When user clicks the button 'Find Duplicates'
    Then duplicate search results are opened