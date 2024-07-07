package com.dsportalapp.dsalgo.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Stack_POM;

public class Stack_SD {
	Stack_POM stackpage= new Stack_POM();
	
	@Given("User Should land on Data Structure Page")
	public void user_should_land_on_data_structure_page() throws InterruptedException {
	    stackpage.url();
	    Thread.sleep(2000);
	    
	}

	@When("User should Sign in with username {string}  and password {string}")
	public void user_should_sign_in_with_username_and_password(String string, String string2) throws InterruptedException {
		
	    
	    stackpage.login_link();
	    
	}

	@When("User should Click Get Started Link in Stack panel or select Stack option from DataStructure Dropdown")
	public void user_should_click_get_started_link_in_stack_panel_or_select_stack_option_from_data_structure_dropdown() {
	    stackpage.Stackgetstarted_link();
	    
	}

	@Then("User should land on Stack page")
	public void user_should_land_on_stack_page() {
	    stackpage.Stack_homepage();
	    
	}

	@Given("User should be on Stack Page")
	public void user_should_be_on_stack_page() {
	    stackpage.Stack_homepage();
	    
	}

	@When("User Should Click on Operations in Stack  link")
	public void user_should_click_on_Operations_in_stack_link() {
	    stackpage.userselection("Operations in Stack");
	    
	}

	@When("Click Try Here button of Operations in Stack")
	public void click_try_here_button_of_operations_in_stack() {
	    stackpage.clickTryherelink();
	    
	}

	@Then("The User should land on tryEditor page of Operations in Stack")
	public void the_user_should_land_on_try_editor_page_of_operations_in_stack() {
	    stackpage.StackTryeditorpage();
	    
	}

	@Given("User Should be on  TryEditor page of Operations in Stack")
	public void user_should_be_on_try_editor_page_of_operations_in_stack() {
		stackpage.StackTryeditorpage();
	    
	}

	@When("The user checks correct output for Various Valid Input and {string} of  Operations in Stack")
	public void the_user_checks_correct_output_for_various_valid_input_and_of_operations_in_stack(String string) {
	    stackpage.Inputeditor(string);
	    
	}

	@When("Clicks on Run button to validate the code of Operations in Stack page")
	public void clicks_on_run_button_to_validate_the_code_of_operations_in_stack_page() {
	    stackpage.clickRun();
	    
	}

	@Then("The output should be expected {string} Operations in Stack")
	public void the_output_should_be_expected_operations_in_stack(String string) {
	    stackpage.checkoutput(string);
	    
	}

	@When("The user checks correct output for Various Empty Input and {string} of  Operations in Stack")
	public void the_user_checks_correct_output_for_various_empty_input_and_of_operations_in_stack(String string) {
	    stackpage.Inputeditor(string);
	    
	}

	@When("The user checks correct output for Various Invalid Input and {string} of  Operations in Stack")
	public void the_user_checks_correct_output_for_various_invalid_input_and_of_operations_in_stack(String string) {
	    stackpage.Inputeditor(string);
	    
	}

	@Given("User should be on Operations in Stack page")
	public void user_should_be_on_operations_in_stack_page() {
	    stackpage.redirectedtohomepage();
	    
	}

	@When("User should click on Implementation page")
	public void user_should_click_on_implementation_page() {
	    stackpage.userselection("Implmentation Link");
	    
	}

	@When("Click Try Here button of Implementation")
	public void click_try_here_button_of_implementation() {
	    stackpage.clickTryherelink();
	    
	}

	@Then("The User should land on tryEditor page of Implementation")
	public void the_user_should_land_on_try_editor_page_of_implementation() {
	    stackpage.StackTryeditorpage();
	    
	}

	@Given("User Should be on TryEditor page of Implementation")
	public void user_should_be_on_try_editor_page_of_implementation() {
	      stackpage.StackTryeditorpage();
	    
	}

	@When("The user checks correct output for Various Valid Input and {string} of  Implementation")
	public void the_user_checks_correct_output_for_various_valid_input_and_of_implementation(String string) {
	    stackpage.Inputeditor(string);
	    
	}

	@When("Clicks on Run button to validate the code of Implementation")
	public void clicks_on_run_button_to_validate_the_code_of_implementation() {
	    stackpage.clickRun();
	    
	}

	@Then("The output should be expected {string} Implementation Page")
	public void the_output_should_be_expected_implementation_page(String string) {
	    stackpage.checkoutput(string);
	    
	}

	@When("The user checks correct output for Various Empty Input and {string} of  Implementation")
	public void the_user_checks_correct_output_for_various_empty_input_and_of_implementation(String string) {
	    stackpage.Inputeditor(string);
	    
	}

	@When("The user checks correct output for Various Invalid Input and {string} of  Implementation")
	public void the_user_checks_correct_output_for_various_invalid_input_and_of_implementation(String string) {
	    stackpage.Inputeditor(string);
	    
	}

	@Given("User Should be on Implementation in Stack page")
	public void user_should_be_on_implementation_in_stack_page() {
	    
	    stackpage.redirectedtohomepage();
	}

	@When("User Should Click on Applications Page")
	public void user_should_click_on_applications_page() {
	    stackpage.userselection("Applications Link");
	    
	}

	@When("Click Try Here button of Applications Page")
	public void click_try_here_button_of_applications_page() {
	    stackpage.clickTryherelink();
	    
	}

	@Then("The User should land on tryEditor page of Applications Page")
	public void the_user_should_land_on_try_editor_page_of_applications_page() {
	    stackpage.StackTryeditorpage();;
	    
	}

	@Given("User Should be on TryEditor page of Applications Page")
	public void user_should_be_on_try_editor_page_of_applications_page() {
		stackpage.StackTryeditorpage();;
	    
	    
	}

	@When("The user checks correct output for Various Valid Input and {string} of  Applications Page")
	public void the_user_checks_correct_output_for_various_valid_input_and_of_applications_page(String string) {
	    stackpage.Inputeditor(string);
	    
	}

	@When("Clicks on Run button to validate the code of Application")
	public void clicks_on_run_button_to_validate_the_code_of_application() {
	    
	    stackpage.clickRun();
	}

	@Then("The output should be expected {string} Applications Page")
	public void the_output_should_be_expected_applications_page(String string) {
	    stackpage.checkoutput(string);
	    
	}

	@When("The user checks correct output for Various Empty Input and {string} of  Applications Page")
	public void the_user_checks_correct_output_for_various_empty_input_and_of_applications_page(String string) {
	    stackpage.Inputeditor(string);
	    
	}

	@When("The user checks correct output for Various Invalid Input and {string} of  Applications Page")
	public void the_user_checks_correct_output_for_various_invalid_input_and_of_applications_page(String string) {
		stackpage.Inputeditor(string);
	    
	}

	@Given("User Should be on  Applications page")
	public void user_should_be_on_applications_page() {
	    stackpage.redirectedtohomepage();
	    
	}

	@When("User Should Click on Practice Questions")
	public void user_should_click_on_practice_questions() {
	    
	    stackpage.Practice_Qns();
	}

	//@When("Click Try Here button of Practice Questions Page")
	//public void click_try_here_button_of_practice_questions_page() {
	   // stackpage.clickTryherelink();
	    
	//}

	@Then("The User should land on blank Page")
	public void the_user_should_land_on_blank_page() {
	    
	    
	}

	@Given("The user redirected to Stack page from blank page")
	public void the_user_redirected_to_stack_page_from_blank_page() {
	    stackpage.redirectedtohomepage();
	    
	}

	@When("The user clicks back button")
	public void the_user_clicks_back_button() {
	    
	    
	}

	@Then("The user directed to home page of Numpy Ninja")
	public void the_user_directed_to_home_page_of_numpy_ninja() {
	    
	    stackpage.HomePage();
	}



	}