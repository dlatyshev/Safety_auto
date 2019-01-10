Feature: Auto SD Review Status

  Background:
    Given Log in to SF

  Scenario: Opening of the home page
    Given user clicks 'App launcher'
    When user clicks on "Home" in App Launcher
    Then Dashboard is present
    Then Case candidates list is present
    Then Chatter is present
    Then Recent Records is present