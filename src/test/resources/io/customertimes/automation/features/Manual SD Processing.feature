Feature: Manual SD Processing

  Background:
   Given Log in to SF

  Scenario: Enter Case information manually
    Given user clicks 'App launcher'
    When user clicks on "Home"
    When user clicks on any name of the 'Source Document'
    Then details and file preview are opened
    When user clicks on the button "Enter Case Information Manually"
    Then case details are opened
    Then user can edit case information manually

