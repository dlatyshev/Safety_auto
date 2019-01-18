Feature: Extracted Case Information
  
  Background: 
    Given Log in to SF
  
  Scenario: Open the list of cases
    Given user clicks 'App launcher'
    Then 'App launcher' is opened
    When user clicks on "Cases" in App Launcher
    When user chooses tha appropriate list view "Sample Cases"
    Then the list view is opened