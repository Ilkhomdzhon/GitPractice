package com.hrms.steps;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

	

public class PersonalDetailsSteps extends CommonMethods {

	@Given("with a valid credentials I should be able to log in")
	public void with_a_valid_credentials_I_should_be_able_to_log_in() {
		login.loginAdmin();
	}

	@Given("I should be able to click on PIM button")
	public void i_should_be_able_to_click_on_PIM_button() {
		jsClick(dashboard.PIM);
		

	}

	@Given("I should be able to see add employee button and click")
	public void i_should_be_able_to_see_add_employee_button_and_click() {
		jsClick(dashboard.addEmpl);

	}

	@When("enter first and last name and click on save button")
	public void enter_first_and_last() {
		sendText(addEmp.firstName, "Ahmad");
		sendText(addEmp.lastName, "Kinder");
		sendText(addEmp.middleName, "Ishonkulov");
		sendText(addEmp.empID, "000100");

		jsClick(addEmp.saveBtn);

	}

	@When("as admin I should be able to click contact details and edit button")
	public void as_admin_I_should_be_() {
		jsClick(contacts.contactDetails);
		jsClick(contacts.editBtn);

	}

	@When("I should be able to edit contact details informations")
	public void i_should_be_able_to_edit_contact_details_informations() {
		sendText(contacts.addressStr, "15120 Wetherburn Court");
		sendText(contacts.contactCity, "Centreville");
		sendText(contacts.provinceState, "Virginia");
		sendText(contacts.zipCode, "20120");
		selectDdValue(contacts.country, "United States");
		sendText(contacts.homePhone, "34724018612");
		sendText(contacts.cellPhone, "34724018612");
		sendText(contacts.otherEmail, "347492383");
		sendText(contacts.workEmail, "Ahmad@list.com");
		sendText(contacts.otherEmail, "Ahmadjon@yahoo.com");
		jsClick(contacts.saveBtn);
		
	}

}
