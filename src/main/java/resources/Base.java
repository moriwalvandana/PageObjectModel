package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

	public WebDriver driver;
    public Properties prop;
    
	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/vandanamoriwal/Desktop/E2EProject/src/main/java/resources/config.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		
		String url=prop.getProperty("url");		
		
		System.out.println("URL: "+url);
       


		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/vandanamoriwal/Desktop/E2EProject/drivers/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			

		}

		return driver;
	}
}
