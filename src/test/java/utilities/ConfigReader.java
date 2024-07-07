package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties properties;
	//private final static String propertyFilePath = "/DSALGO-Project/src/test/resources/TestData/config.properties";


	public  ConfigReader() {
		if(properties==null) {
			properties = new Properties();
			try {
				FileInputStream input = new FileInputStream("src/test/resources/TestData/config.properties");
				properties.load(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

	public  String getHomePage() {
		return properties.getProperty("appURL");
	}											
	

	public static  String getLoginPage() {
		//return properties.getProperty("username,password");
		return properties.getProperty("username") + "," + properties.getProperty("password");
	}
	public   String getbrowsername() {
		//return properties.getProperty("browser");
		 String browserName = properties.getProperty("browser");
	        if (browserName == null) {
	            throw new RuntimeException("Browser name is not specified in the configuration file.");
	        }
	        return browserName;
	    }
	
	}





