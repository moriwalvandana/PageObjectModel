package e2etests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.WomenSectionPage;
import resources.Base;

public class WomenSection extends Base{

	@BeforeTest
	public void initialize() throws IOException, InterruptedException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
	}
	
	@Test
	public void womenApparel() {
		WomenSectionPage womensection=new WomenSectionPage();
		womensection.womenTab();
		
		
	}
}
