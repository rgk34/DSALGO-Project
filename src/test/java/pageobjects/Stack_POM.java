package pageobjects;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.ConfigDriver;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class Stack_POM {
	public static WebDriver driver =null;
	//String url = "https://dsportalapp.herokuapp.com";
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String url = "https://dsportalapp.herokuapp.com";
	String tryEditorUrl = "https://dsportalapp.herokuapp.com/tryEditor";
	
     //homepage getstarted
	@FindBy(xpath ="//button[@class='btn']")  WebElement Homepagegetstartedbtn;
	@FindBy(xpath="//a[text()='Sign in']") WebElement Signinhomepage;
	@FindBy (id ="id_username") WebElement username ;
	@FindBy (id ="id_password") WebElement password ;
	@FindBy (xpath="//input[@value='Login']") WebElement login ;
	@FindBy(xpath="//a[@href='stack']") WebElement StackGetStartedLink;
	@FindBy(xpath="//h4[text()='Stack']") WebElement Stack_Homepage;	
	@FindBy(xpath="//a[normalize-space()='Operations in Stack']") WebElement Operations_Link;
	@FindBy(xpath="//a[normalize-space()='Implementation']") WebElement Implmentation_Link;
	@FindBy(xpath="//a[normalize-space()='Applications']") WebElement Applications_Link;
	@FindBy(xpath="//a[normalize-space()='Practice Questions']") WebElement PracticeQuestions_Link;
	@FindBy(xpath="//a[text()='Try here>>>']") WebElement Stack_TryHerelink;
	@FindBy(xpath="//button[@type='button']") WebElement Stack_Runbtn;
	@FindBy(xpath="//a[text()='NumpyNinja']") WebElement NumpyNinjahomepage;
	@FindBy(id = "output") WebElement output;
	@FindBy(css = ".CodeMirror") WebElement text_editor;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
ConfigReader config;

	

	public Stack_POM() {

	

        driver=ConfigDriver.getBrowser();

		PageFactory.initElements(driver, this);

		config=new ConfigReader();

		

	}
	//public Stack_POM()
	//{
		//if(driver==null)
			//driver=new ChromeDriver();
		//PageFactory.initElements(driver, this);
	//}
	
	public void url() {

		try {

		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(50));

		String url=config.getHomePage();

		System.out.println(url);

		driver.get(url);

		}

		catch (Exception ex) {

			LoggerLoad.error("Exception occurred in QueuePage: gotopage function: " + ex.getMessage());



		}

	}
	
	//public void url() throws InterruptedException
	//{
		//driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(50));
		//driver.get(url);
		//Thread.sleep(2000);
	//}
	
	/*public void homepage_getstartedbtn()
	{
		
		Homepagegetstartedbtn.click();
		
	}
	public void Signin_homepage()
	{
		Signinhomepage.click();
	}
	public void username()
	{
		username.sendKeys("AkshitaA");
	}
	public void password()
	{
		password.sendKeys("Test@123");
	}*/
	
	public void login_link()
	{
		 

		       try {

				LoggerLoad.info("Navigating to Login Page");

				Homepagegetstartedbtn.click();

				Signinhomepage.click();

				username.sendKeys(config.getProperty("username"));

		        password.sendKeys(config.getProperty("password"));

				login.click(); 

		       }

		   	catch (Exception ex) {

		   		

				LoggerLoad.error("Exception occurred in StackPage: Loginpage function: " + ex.getMessage());

			}

			              

			    }
		//LoggerLoad.info("Navigating to Login page");
		//driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(50));
		//Homepagegetstartedbtn.click();
		//Signinhomepage.click();
		//username.sendKeys("AkshitaA");
		//password.sendKeys("Test@123");
		//login.click();
	
	
	public void Stackgetstarted_link()
	{
		LoggerLoad.info("Navigating to Stack Page");
		StackGetStartedLink.click();
	}
	
	/*public String DataStructurespageTitle()
	{
	String title=driver.getTitle();	
    LoggerLoad.info("-----User is on "+ title + "Page----");
    assertEquals(title, "NumpyNinja");
    return title;*/
    
	//}
	public void Stack_homepage()
	{
		LoggerLoad.info("Navigating to Stack home page");
		String expectedText = "Stack";
		String actualText = Stack_Homepage.getText();
		System.out.println(actualText);
		System.out.println("user navigated to Stack page");
		assert actualText.equals(expectedText) : "Stack homepage text does not match expexted text";
	}
	
	public void userselection(String strInput)
	{
		LoggerLoad.info("user checking each elements");
		WebElement element=null;
		if(strInput=="Operations in Stack")
		  element=Operations_Link;
		else if (strInput=="Implmentation Link")
			element=Implmentation_Link;
		else if (strInput=="Applications Link")
			element=Applications_Link;
		else if (strInput=="PracticeQuestions Link")
			element=PracticeQuestions_Link;
	System.out.println("Scenario : " + element.toString().split("'")[1]);	
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	LoggerLoad.info("Verifying scenario:" + element.getText());
	element.click();
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	}
	
	public void clickTryherelink()
	{
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
		LoggerLoad.info("user clicks the try here link in stack homepage)");
		Stack_TryHerelink.click();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));	
	}
	
	public void StackTryeditorpage()
	{
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
		LoggerLoad.info("user navigates to phython code editor page");
		System.out.println(Stack_Runbtn.getText());
		System.out.println("user in editor page");
}
	public void Inputeditor(String input)
	{
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));

    	LoggerLoad.info("User validates the various code in Input editor page");
	    System.out.println(input); 
	   js.executeScript("arguments[0].CodeMirror.setValue('"+input+"');", text_editor);

}
	public void clickRun()
	{
		LoggerLoad.info("User clicks the Run button to validate various code");
		Stack_Runbtn.click();
	}
	public void checkoutput(String expectedOutput) {
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));

		System.out.println(expectedOutput);
		
		if(expectedOutput.contains("SyntaxError"))
		{
			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
			Alert alert = driver.switchTo().alert();
			String alertMessage=driver.switchTo().alert().getText();
			System.out.println(alertMessage);
			alert.accept();
			LoggerLoad.info("invalid input : error occurs");
			assert alertMessage.contains("SyntaxError: bad input on line 1") : "Scenario-Invalid Input:Fail";
			System.out.println("Error Input: passed");
			
		}
		else {
			LoggerLoad.info("valid input verified");
			System.out.println("valid Input" + output.getText());
driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
			
	    	LoggerLoad.info("Empty Input");

			assert output.getText().equalsIgnoreCase(expectedOutput) : "Scenario-Valid Input:Fail";
			
		}
	}
	public void Practice_Qns() {
		
	    LoggerLoad.info("Clicking on Practice Question page");
	    PracticeQuestions_Link.click();
	    String expectedText = "NumpyNinja"; 
	    String actualText = NumpyNinjahomepage.getText();
	    System.out.println(actualText);
	    System.out.println("Blank page appears capturing Numpy Ninja header image");
	    Assert.assertEquals("Numpy Ninja homepage text does not match expected text", expectedText, actualText);
	}
	public void redirectedtohomepage()
	{
		LoggerLoad.info("Redirected to home page of specified element link");
        driver.navigate().back();
       // driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));

	}
	public void HomePage()
	{
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
		LoggerLoad.info("Redirected to Numpy Ninja home page");
		NumpyNinjahomepage.click();
		
	}
}