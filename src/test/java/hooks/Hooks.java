package hooks;


import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import org.openqa.selenium.WebDriver;

import driverFactory.ConfigDriver;

public class Hooks {

 private static WebDriver driver;

    @BeforeAll
    public static void  setUp() {
     System.out.println("launch the browser");
       
  driver= ConfigDriver.getBrowser();
    }

    @AfterAll
 public static void tearDown() {
        ConfigDriver.closeAllDrivers();
     System.out.println("close the browser");

    }


}