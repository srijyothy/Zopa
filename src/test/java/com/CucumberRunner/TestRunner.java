package com.CucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="./features"
		,glue= {"com.StepDef"}
		)

public class TestRunner {

}
