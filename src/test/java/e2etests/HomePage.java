package e2etests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.SignUpPage;
import pages.UserPersonalInformation;
import resources.Base;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class HomePage extends Base {

	@BeforeTest
	public void initialize() throws IOException, InterruptedException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String Email) throws IOException, InterruptedException {

		SignUpPage signup = new SignUpPage(driver);
		signup.clickOnSignInButton();
		signup.createAccount().sendKeys(Email);
		signup.cliclOnCreateAccountButton().click();

	}

	@Test 

	public void createAccount() throws InterruptedException {

		UserPersonalInformation userinfo = new UserPersonalInformation(driver);
		userinfo.personalInformation();
		userinfo.addressDetails();
		
		
	}

	
	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// coloumn stands for how many values per each test
		Object[][] data = new Object[1][1];

		data[0][0] = "moriwal@gmail.com";


		return data;
	}

//	@AfterTest
//	public void teardown() {
//
//		driver.close();
//	}
}
