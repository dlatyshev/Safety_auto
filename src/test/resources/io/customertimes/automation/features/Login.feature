Feature: Log in to the application
  Log in to the application using valid credentials


  Scenario: Log in to the app
    When user logs in with credentials "roman.khudyakov@highpointsolutions.com.safety.dev1" and "Poqw09123"
    Then main page is opened

