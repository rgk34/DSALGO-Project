package runner;



	//import org.junit.runner.RunWith;
	import org.testng.annotations.DataProvider;
   // import io.cucumber.junit.Cucumber;
    import io.cucumber.testng.AbstractTestNGCucumberTests;            
	//import utilities.LoggerLoad;
	//import io.cucumber.junit.Cucumber;
	//import io.cucumber.junit.CucumberOptions;
	import io.cucumber.testng.CucumberOptions;
	//import io.cucumber.java.Before;
	//import io.cucumber.java.BeforeAll;
	//import io.cucumber.junit.Cucumber;
		
	//@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
				plugin = {"pretty", "html:target/Rashmi.html",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"} ,//reporting purpose
				monochrome=false,  //console output colour
				//tags = "@vijayaTest or @tag1 or @rashmitest", //tags from feature file
				// features = {"/src/test/resources/Features/Signin.feature"}, //location of feature files
						features = {"src/test/resources/Features"},
				glue= {"com.dsportalapp.dsalgo.stepDefinition","hooks" }) //location of step definition files
				
				
				
				
				
				
				
			//dryRun=false)  //location of step definition files
		        //glue= "stepDefinition", dryRun=false)  //location of step definition files
         
		

		public class TestRunner extends AbstractTestNGCucumberTests{
			@Override
		    @DataProvider(parallel = true)
		   public Object[][] scenarios() {
						
				return super.scenarios();	
			}
		}

