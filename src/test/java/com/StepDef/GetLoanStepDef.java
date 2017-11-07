package com.StepDef;

import com.CucumberRunner.AbstractMain;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GetLoanStepDef extends AbstractMain{
	@Given("^I am in home page$")
	public void i_am_in_home_page() throws Throwable {
	    
	}

	@When("^I click on the Get a Zopa loan option$")
	public void i_click_on_the_Get_a_Zopa_loan_option() throws Throwable {
	   
	}

	@And("^I can then select the '(\\d+)' and ''(\\d+) year' I want to borrow$")
	public void i_can_then_select_the_and_year_I_want_to_borrow(int arg1, int arg2) throws Throwable {
	    
	}

	@And("^I click on get my personalised rate button$")
	public void i_click_on_get_my_personalised_rate_button() throws Throwable {
	   
	}

	@Then("^I fill in my personnel details$")
	public void i_fill_in_my_personnel_details(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	

}
