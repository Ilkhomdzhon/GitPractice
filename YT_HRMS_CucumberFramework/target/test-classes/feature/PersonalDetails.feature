@sprint1
Feature: Change Employee contacts

  @smoke
  Scenario: As an admin I should be able to change employee contact details
    #Given As a user I should be able to open browser
    Given with a valid credentials I should be able to log in
    And I should be able to click on PIM button
    And I should be able to see add employee button and click
    When enter first and last name and click on save button
    And as admin I should be able to click contact details and edit button
    And I should be able to edit contact details informations
