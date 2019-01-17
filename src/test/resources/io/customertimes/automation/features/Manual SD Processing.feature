Feature: Manual SD Processing

  Background:
    Given Log in to SF

  Scenario: Opening of the source document
    Given user clicks 'App launcher'
    When user clicks on "Home" in App Launcher
    When user clicks name "Testing" of the source document
    Then details and file preview are opened

    #implement checking Case validation as i understand instead of Case candidate assessments

  Scenario: Enter Case information manually
    Given user clicks 'App launcher'
    When user clicks on "Home" in App Launcher
    When user clicks on recent record with name "00001242"
    Then Case navigation is present
    Then Milestones is present
    Then Possible duplication is present
    Then Header bunner is present
    Then Source document is present