Feature: Login to cygnvs application

  Scenario: User should be able to login to the application with valid credentials
    When the user opens up the application
    And enters a valid username
    And a valid password
    And clicks on the login button
    Then the system should redirect the user to the application home page