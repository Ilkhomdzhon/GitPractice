Feature: Login
  #
  #TC01 : User should login with valid credentials 
  #
  #User opens a browser 
  #User navigate to https://www.humanresources.com
  #User enters valid username 
  #User enters valid password 
  #User clicks on Login button 
  #User should see Welcome+username text (Validation=Result)
  #
  #Scenario = TestCase

  Scenario: User should login with valid credentials
    Given user opens a browser and navigates to website
    When user enters valid username
    And user enters valid password
    And user clicks on login button
    Then user should see Welcome username text
    
    
    Scenario: User should login with invalid credentials
    Given user opens a browser and navigates to website
    When user enters invalid username
    And user enters invalid password
    And user clicks on login button
    Then user should see Welcome username text
    And user closes the browser
    
    
     #Scenario: User should login with invalid credentials
  #Given user opens a browser and navigates to website
  #When user enters invalid username
  #And user enters invalid password
  #And user clicks on login button
  #Then user should see "Invalid credentials" message
  #And user closes the browser
  #Scenario: User should login with valid credentials
    #Given user opens a browser and navigates to website
    #When user enters username "Admin" user enters password "Hum@nhrm123"
    #And user clicks on login button
    #Then user should see Welcome username text
    #And user closes the browser
