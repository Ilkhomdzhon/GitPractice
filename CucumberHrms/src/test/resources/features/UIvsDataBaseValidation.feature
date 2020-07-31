Feature: Sauce Demo Login 

Scenario: invalid login
    Given user is on employee list page 
    When user retrieve all data from the ui 
    And user retrieves all the data from database using below query
   
   
    And user compare both data and it should match 
    Then user logs out 