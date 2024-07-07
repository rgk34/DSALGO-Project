package com.dsportalapp.dsalgo.stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

//import hooks.Hooks;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage_POM;
import utilities.ConfigReader;
import utilities.LoggerLoad;


public class HomePage_SD {
	HomePage_POM homepage = new HomePage_POM();	
	//private WebDriver driver = Hooks.getDriver();
	
	
	@Given("User should open the Ds algo potal link")
	public void user_should_open_the_ds_algo_potal_link() throws InterruptedException {
	LoggerLoad.info("-----DSAlgo Portal----");	
	homepage.dsalgoportal();	
	Thread.sleep(2000);
	    
	    
	}

@When("User should click on Get Started Page")
public void user_should_click_on_Get_started_page() throws InterruptedException {
	LoggerLoad.info("-----click on Get started button----");		
    homepage.GetStartedbtn();  
    Thread.sleep(2000);
    
}
	/*@When("User should click on Get Started page")
	public void user_should_click_on_Get_Started_Page() throws InterruptedException {
	LoggerLoad.info("-----click on get started button----");		
    homepage.GetStartedbtn();  
    Thread.sleep(2000);
	    
	}*/
	@Then("User should land on home page")
	public void user_should_land_on_home_page() {			
        String title = homepage.getTitleofPage();
	    LoggerLoad.info("-----User is on "+ title + "Page----");
	    assertEquals(title, "NumpyNinja");
	    
	}   
	    @Given("User is on home page")
	    public void user_is_on_home_page() {
	   	 LoggerLoad.info("-----User is on homepage-----");	
	    // homepage.homepage();  
	        
	    }
	    @When("User clicks on Data Structure dropdown without sign in")
	    public void user_clicks_on_data_structure_dropdown_without_sign_in() {
	    	 LoggerLoad.info("-----User clicks on Data Structure dropdown-----");	 ;
	        
	    }
	    @Then("The user selects any of the options from dropdown menu {string}")
	    public void the_user_selects_any_of_the_options_from_dropdown_menu(String string) {
	    	 homepage.dropdown(string);
		         
	        
	    }
	    @Then("User sould see the message {string}")//Alert msg
	    public void user_sould_see_the_message(String string) {
	    	String alert =  homepage.getalertmessage();
	    	LoggerLoad.info("-----User should be alerted with" +alert + "message...");	 
	        assertEquals(alert, string);
	    	
	    	
	        
	        
	        
	    }
	   // @Given("User is on home page")
	   // public void user_is_on_home_page() {
	        
	        
	  //  }
	    @When("User clicks on any of the Get Started link before Signin {string} in homepage")
	    public void user_clicks_on_any_of_the_Get_Started_link_before_Signin_in_homepage_(String string)  {
	    	System.out.println("user clicks on any of the Get Started link before signin {string} in homepage = "+ string );
	       homepage.getstartedhome(string); 
	       LoggerLoad.info("-----User clicks on Get Started link before signin in homepage------");	 
	       
	        
	    }
	    @Then("User should see the message {string}")
	    public void user_should_see_the_message(String string) {
	    	//System.out.println("user_should_see_the_message() = "+ string );

	    	String alert =  homepage.getalertmessage();
	    	LoggerLoad.info("-----User should be alerted with" +alert + "message...");	 
	        assertEquals(alert, string);
	    	  
	        
	    }
	   // @Given("User is on home page")
	    //public void user_is_on_home_page() {
	        
	        
	   // }
	    @When("User clicks on  the Sign in link")
	    public void user_clicks_on_the_Sign_in_link() {
	        LoggerLoad.info("----User Clicks on Signin link----");
	    	 homepage.Signinlink();
	        
	    }
	    @Then("User should land on login page")
	    public void user_should_land_on_login_page() {
	      
	        LoggerLoad.info("----User should land on login page-----");
	    	String title = homepage.Signinpagetitle();
	        LoggerLoad.info("----User is on "+ title + "Page-----");
	        assertEquals(title,  "Login");
	    	 
	        
	    }
	   // @Given("User is on home page")
	   // public void user_is_on_home_page() {
	        
	        
	   // }
	    @When("User clicks on  the Register link")
	    public void user_clicks_on_the_Register_link() {
	    	LoggerLoad.info("----User Clicks on Registration link----");  
	    	homepage.Registerlink();
	        
	    }
	    @Then("User should land on register page")
	    public void user_should_land_on_register_page() {
	    	    LoggerLoad.info("----User should land on Register page-----");
		    	String title = homepage.Registerpagetitle();
		        LoggerLoad.info("----User is on "+ title + "Page-----");
		        assertEquals(title,  "Registration");
		    	 
	        
	        
	    }
	    	
	}
	
