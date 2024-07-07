package pageobjects;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driverFactory.ConfigDriver;
import utilities.ConfigReader;
//import base_class.BaseClass;
//import utilities.ConfigReader;
import utilities.LoggerLoad;

public class HomePage_POM {
	
	//public static WebDriver driver = BaseClass.getDriver();
    //String url = ConfigReader.applicationUrl();
    //String homepageurl=ConfigReader.homePage();
	public static WebDriver driver = null;
	
	//String url = "https://dsportalapp.herokuapp.com/";
    
    //Get Started Button
   @FindBy(xpath ="//button[text()='Get Started']") WebElement GetStartedbtn;
   
   //alert message
   @FindBy(xpath ="//div[@class='alert alert-primary']") WebElement alertMessage;
   
     
    //Data Structure dropdown
   @FindBy(xpath ="//a[@class='nav-link dropdown-toggle']") WebElement DataStructuredropdown;
   @FindBy(xpath ="//a[text()='Arrays']") WebElement DataStructureArray;
   @FindBy(xpath ="//a[text()='Linked List']") WebElement DataStructureLinkedlist;
   @FindBy(xpath ="//a[text()='Stack']") WebElement DataStructureStack;
   @FindBy(xpath ="//a[text()='Queue']") WebElement DataStructureQueue;
   @FindBy(xpath ="//a[text()='Tree']") WebElement DataStructureTree;
   @FindBy(xpath ="//a[text()='Graph']") WebElement DataStructureGraph;
   
   //HomePage
   @FindBy(xpath ="//a[@href='data-structures-introduction']") WebElement DSgetstartedlink;
   @FindBy(xpath ="//a[@href='array']") WebElement Arraygetstartedlink;
   @FindBy(xpath ="//a[@href='linked-list']") WebElement linkedlistgetstartedlink;
   @FindBy(xpath ="//a[@href='stack']") WebElement stackgetstartedlink;
   @FindBy(xpath ="//a[@href='queue']") WebElement queuegetstartedlink;
   @FindBy(xpath ="//a[@href='tree']") WebElement treegetstartedlink;
   @FindBy(xpath ="//a[@href='graph']") WebElement graphgetstartedlink;
   
   //Signin
   @FindBy(xpath ="//a[text()='Sign in']") WebElement Signinlink;
   
   //Register
   @FindBy(xpath ="//a[text()=' Register ']") WebElement Registerlink;
   
   ConfigReader config;
   
   public HomePage_POM()
   {
	   
	   driver=ConfigDriver.getBrowser();

		PageFactory.initElements(driver, this);

		config=new ConfigReader();

		

	}



	
	   //if(driver==null)
	// driver=new ChromeDriver();  
     //PageFactory.initElements(driver, this);
   
	
   //Ds-Algo url
   public void dsalgoportal()
   {
	   try {

			driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(50));

			String url=config.getHomePage();

			System.out.println(url);

			driver.get(url);

			}

			catch (Exception ex) {

				LoggerLoad.error("Exception occurred in DSalgoHomePage: gotopage function: " + ex.getMessage());
			}
   }
// Homepage URL
  // public  void homepage()
  // {
 	  //driver.get(homepageurl);
   
 //  }
// Homepage URL
  // public  void homepage()
  // {
 	 // driver.get("https://dsportalapp.herokuapp.com/home");
   
   //}

   public void GetStartedbtn()
   {
	  GetStartedbtn.click(); 
   }
   
   public String getTitleofPage()
   
   {
	String title   =driver.getTitle();
	return title;
   }
   
  public String getalertmessage()
  {
	  String alertmsg = alertMessage.getText();
	  return alertmsg;
  }
  
 
   //Dropdown validations
   public void dropdown(String string)
       
   {
	   DataStructuredropdown.click(); 
	   switch(string)
	   {
	   case "Array": 
		  LoggerLoad.info("User click on" +string); 
		  DataStructureArray.click();
		  break;
		  
	   case "Linked List":
		   LoggerLoad.info("User click on" +string); 
		   DataStructureLinkedlist.click();
		   break;
		   
	   case "Stack":
		   LoggerLoad.info("User click on" +string); 
		   DataStructureStack.click();
		   break;
		   
	   case "Queue":
		   LoggerLoad.info("User click on" +string); 
		   DataStructureQueue.click();
		   break;
		   
	   case "Tree":
		   LoggerLoad.info("User click on" +string); 
		   DataStructureTree.click();
		   break;
		   
	   case "Graph":
		   LoggerLoad.info("User click on" +string); 
		   DataStructureTree.click();
		   break;
	   }
   }
		//Homepage validation
		   public void getstartedhome(String string) 
		   {
			  // System.out.println("Homepage validation...String before Switch cases = "+ string );
			   switch(string)
			   {
			   case "Data Structures-Introduction": 
				    LoggerLoad.info("click" +DSgetstartedlink.getText()+"link on Data Structures-Introduction"); 
				    //System.out.println("1..click" +DSgetstartedlink.getText()+"link on Data Structures-Introduction");
				    DSgetstartedlink.click();
				     break;
				  
			   case "Array": 
					  LoggerLoad.info("click" +Arraygetstartedlink.getText()+"link on Array"); 
					  //System.out.println("2..click" +Arraygetstartedlink.getText()+"link on Array");
					  Arraygetstartedlink.click();
					  break;
			   
			   case "Linked List": 
					  LoggerLoad.info("click" +linkedlistgetstartedlink.getText()+"link on LinkedList"); 
				  // System.out.println("3..click" +linkedlistgetstartedlink.getText()+"link on LinkedList");
					  linkedlistgetstartedlink.click();
					  break;
					  
			   case "Stack": 
					  LoggerLoad.info("click" +stackgetstartedlink.getText()+"link on Stack"); 
				     // System.out.println("4..click " +linkedlistgetstartedlink.getText()+"link on Stack");
					  stackgetstartedlink.click();
					  break;
					  
			   case "Queue": 
					 LoggerLoad.info("click" +queuegetstartedlink.getText()+"link on Queue"); 
				     // System.out.println("5..click" +queuegetstartedlink.getText()+ "link on queue ");
					  queuegetstartedlink.click();
					  break;
					  
			   case "Tree": 
					 // LoggerLoad.info("click" +treegetstartedlink.getText()+"link on tree");
				      System.out.println("6..click" +treegetstartedlink.getText()+"link on tree");
					  treegetstartedlink.click();
					  break;
					  
			   case "Graph": 
					  LoggerLoad.info("click" +graphgetstartedlink.getText()+"link on graph"); 
				     // System.out.println("7..click" +graphgetstartedlink.getText()+"link on graph");
					  graphgetstartedlink.click();
					  break;
			   }
		   }
					  
			public void Signinlink()
			{
		      Signinlink.click();
		   
			}
			public String Signinpagetitle()
			{
		  String title =driver.getTitle()    ;
		        return title;
			}
			
		   
			public void Registerlink()
			{
		      Registerlink.click();
		   
			} 
		   
			public String Registerpagetitle()
			{
		   String title = driver.getTitle()   ;
		    return title;
			} 
		   
		  
		  
		   
   
}

