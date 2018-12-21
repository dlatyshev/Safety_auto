Feature: Duplicate search

  Background:
    Given open login page
    When enter valid credentials and press 'Enter'
    Then main page is opened

  Scenario: Open the dashboard
    When user click 'App launcher' and select "Home"
    Then dashboard is opened

