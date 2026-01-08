package wiz.web.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wiz.web.qa.base.TestBase;
import wiz.web.qa.pages.LoginPage;
import wiz.web.qa.pages.RegisterPage;

public class RegisterPageTest extends TestBase{
	
	LoginPage loginPage;
	RegisterPage registerPage;
	
	public RegisterPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
	    loginPage = new LoginPage();
	    registerPage = new RegisterPage();
	}
	
	@Test
	public void validationOfCredTest() {
		loginPage.validationOfLoginCta();
		loginPage.validationOfRegisterCTA();
		registerPage.validationOfCred(prop.getProperty("username"),prop.getProperty("phone"), prop.getProperty("emailId"));
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
