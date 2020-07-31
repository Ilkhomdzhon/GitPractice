@workflow
Feature: Syntax HRMS API End to End Workflow
  
  Description: This feature tests and varifies Syntax HRMS Web Services 
  The workflow consists of the following sequential calls

  Background: 
    Given a JWT is generated

  Scenario: Creating an employee
    Given a request is prepared to create an employee
    When a POST call is made to create an employee
    Then the status code for creating an employee is 201
    And employee is created
    And the employee ID is store as a global variable to be used for other calls
