package driverFactory;


	
	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;

	import utilities.ConfigReader;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ConfigDriver {

	    private static WebDriver driver = null;

	    public static WebDriver getBrowser() {
	        try {
	            ConfigReader cfgreader = new ConfigReader();
	            String browserName = cfgreader.getbrowsername();

	            if (browserName == null || browserName.isEmpty()) {
	                throw new IllegalArgumentException("Browser name must be specified in the configuration file.");
	            }

	            switch (browserName.toLowerCase()) {
	                case "chrome":
	                    WebDriverManager.chromedriver().setup();
	                    if (driver == null) {
	                        driver = new ChromeDriver();
	                    }
	                    break;
	                case "firefox":
	                    WebDriverManager.firefoxdriver().setup();
	                    if (driver == null) {
	                        driver = new FirefoxDriver();
	                    }
	                    break;
	                case "edge":
	                    WebDriverManager.edgedriver().setup();
	                    if (driver == null) {
	                        driver = new EdgeDriver();
	                    }
	                    break;
	                case "safari":
	                    WebDriverManager.safaridriver().setup();
	                    if (driver == null) {
	                        driver = new SafariDriver();
	                    }
	                    break;
	                default:
	                    throw new IllegalArgumentException("Unsupported browser: " + browserName);
	            }
	            return driver;
	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException("Failed to initialize the browser.");
	        }
	    }

	    public static void closeAllDrivers() {
	        if (driver != null) {
	            driver.quit();  // Use quit instead of close to ensure all browser windows are closed
	            driver = null;  // Ensure driver is null after closing
	        }
	    }
	}