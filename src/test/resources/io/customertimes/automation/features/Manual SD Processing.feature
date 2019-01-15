Feature: Manual SD Processing

  Background:
    Given Log in to SF

  Scenario: Opening of the source document
    Given user clicks 'App launcher'
    When user clicks on "Home" in App Launcher
    When user clicks name "Testing" of the source document
    Then details and file preview are opened

    #implement checking Case validation as i understand instead of Case candidate assessments

