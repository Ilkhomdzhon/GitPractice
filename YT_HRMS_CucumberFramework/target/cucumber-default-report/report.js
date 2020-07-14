$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/PersonalDetails.feature");
formatter.feature({
  "name": "Change Employee contacts",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint1"
    }
  ]
});
formatter.scenario({
  "name": "As an admin I should be able to change employee contact details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "with a valid credentials I should be able to log in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.PersonalDetailsSteps.with_a_valid_credentials_I_should_be_able_to_log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to click on PIM button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.PersonalDetailsSteps.i_should_be_able_to_click_on_PIM_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see add employee button and click",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.PersonalDetailsSteps.i_should_be_able_to_see_add_employee_button_and_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter first and last name and click on save button",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.PersonalDetailsSteps.enter_first_and_last()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "as admin I should be able to click contact details and edit button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.PersonalDetailsSteps.as_admin_I_should_be_()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to edit contact details informations",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.PersonalDetailsSteps.i_should_be_able_to_edit_contact_details_informations()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "As an admin I should be able to change employee contact details");
formatter.after({
  "status": "passed"
});
});