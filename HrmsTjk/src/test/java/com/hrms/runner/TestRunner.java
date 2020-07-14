package com.hrms.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/feature/AddEmployee.feature",
		glue="com/hrms/steps",
		dryRun=false,
		tags="female"
		
		
		)

public class TestRunner {
	
	
	

}
