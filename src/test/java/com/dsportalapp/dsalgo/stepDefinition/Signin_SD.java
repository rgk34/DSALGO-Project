package com.dsportalapp.dsalgo.stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import pageobjects.SignIn_POM;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Signin_SD {
	
	SignIn_POM signIn = new SignIn_POM();
	String Excelpath= "/Users/sonu.harivanam/updated-eclipse-workspace/DSALGO-Project/src/test/resources/TestData/Dsalgo.xlsx";
	static String username;
	static String password;
	
	


	@Given("The user is on home page")
	public void the_user_is_on_home_page() {
	LoggerLoad.info("----User is on homepage----");
	    signIn.getLoginurl();
	   
	 }
	
	@When("The user should click on Register link")
	public void the_user_should_click_on_Register_link() {
	LoggerLoad.info("----User clicks on Register link----");
	signIn.register();
	   
	}
	@Then("The user is redirected to Register page")
	public void the_user_is_redirected_to_Register_page() throws InterruptedException {
	   String title =signIn.registerlink();
	   LoggerLoad.info("----User is  Redirected to Register page link----" +title);
	   assertEquals(title,"Registration");  
	   Thread.sleep(2000);
	}

	@Given("The user is on  Sign in page")
	public void The_user_is_on_Sign_in_page(){

	signIn.getLoginurl();

	}

	

	@Then("User clicks on login button with all empty fields")
	public void user_clicks_on_login_button_with_all_empty_fields() throws InterruptedException {
	LoggerLoad.info("----User is clicking login button with empty fields----");
		signIn.EnterUsername("");
		signIn.EnterPassword("");   
		signIn.Login();
	    Thread.sleep(2000);
	   
	   
	}
	
	@Then("User should verify the msg at username as {string}")
	public void user_should_verify_the_msg_at_username_as(String string) {
	    signIn.verifySignin(string);
	
	   
	   
	}
	
	@Given("The user is on DS Algo Sign in page")
	public void the_user_is_on_ds_algo_sign_in_page() {
		signIn.getLoginurl();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("User enters Username as {string}")
	public void user_enters_username_as(String string) {
		System.out.println("Username in enters_username_as() is ...."+ string);
		signIn.EnterUsername(string);
	}   

	
	@When("User clicks on login button with empty password")
	public void user_clicks_on_login_button_with_empty_password() {
		signIn.EnterPassword("");
		signIn.Login();
	}
	
	@Then("User can verify the  message  {string}")
	public void user_can_verify_the_message(String string) {
		System.out.println("Username in user_can_verify_the_message() is ...."+ string);
	    signIn.verifySignin(string);
	}
			
	
	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
		signIn.EnterPassword(string);
	}

	@When("User clicks on login button with empty Username")
	public void user_clicks_on_login_button_with_empty_Username() {
		signIn.EnterUsername("");
		signIn.Login();
	}
	
	
	@Then("User should verify the message at Password as {string}")
	public void user_should_verify_the_message_at_Password_as(String string) {
	  
	    signIn.verifySignin(string);

	   
	}
	

	@When("User Enters Email as {string}")
	public void user_enters_email_as(String string) {
		signIn.EnterUsername(string);
	}

	   


	@When("Password as {string}")
	public void password_as(String string) {
	signIn.EnterPassword(string);
	   
	   
	}
	@When("Clicks on Login link")
	public void clicks_on_login_link() {
	LoggerLoad.info("------User clicks on login link-----");
	signIn.Login();
	   
	   
	}
	@Then("User should verify the msg {string} in Ds Algo homepage")
	public void user_should_verify_the_msg_in_Ds_Algo_homepage(String string) {
	    String successmsg=signIn.SuccessMsg();
	   // System.out.println(successmsg);
	    LoggerLoad.info("The actual msg is "+successmsg);
	   
	   
	   
	   
	}
	
	/*@When("The user enters the {string} in text box and {string} in text box")
	public void the_user_enters_the_in_text_box_and_in_text_box(String string, String string2) {
	    signIn.EnterUsername(string);
	    signIn.EnterPassword(string2);*/
	   
//}
	
	@When("User enters sheetname {string} and rownumber {int}")
	public void user_enters_sheetname_and_rownumber(String Sheetname, Integer RowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException  {
		
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(Excelpath, Sheetname);
		

		System.out.println("testdata in user_enters_sheetname_and_rownumber() is ...."+ testdata.toString());
		
		
		username = testdata.get(RowNumber).get("Username");
		
		password = testdata.get(RowNumber).get("Password");
		
		
		// Debugging statement
        System.out.println("username fetched: " + username);

        System.out.println("Password fetched: " + password);

		

		LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");
		if (username != null && password != null) 
		{
			//throw new IllegalArgumentException("Username or Password should not be null or empty");
			signIn.EnterUsername(username);
		    signIn.EnterPassword(password);
	 } else 
	 {
         throw new IllegalArgumentException("Username or Password should not be null or empty");
     
	 }	
	}	
	
	@When("User clicks login button")
	public void user_clicks_login_button() throws InterruptedException {
	   
	   signIn.Login();
	   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}
	
	@Then("The user should see the error message {string}")
	public void the_user_should_see_the_error_message(String string) throws InterruptedException {
		
		String alertmsg=signIn.invalidalertMsg();
	    System.out.println(alertmsg);
	    LoggerLoad.info("The actual alert is "+alertmsg);
	    assertEquals(string, alertmsg);
	   
	}
				 
		   
	
	@When("User clicks on sign out link")
	public void user_clicks_on_sign_out_link() {
	    signIn.signout();
	   
	}
	
	@Then("User should look the  successfull logout message {string}")
	public void user_should_look_the_successfull_logout_message(String string) {
	    signIn.successfulllogout();
	}

	
	}





	