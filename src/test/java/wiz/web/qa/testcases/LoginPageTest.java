package wiz.web.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wiz.web.qa.base.TestBase;
import wiz.web.qa.pages.LoginPage;
import wiz.web.qa.pages.RegisterPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	RegisterPage registerPage;
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
	    loginPage = new LoginPage();
	}
	
	@Test
	public void validationOfLoginCtaTest() {
		loginPage.validationOfLoginCta();
	}
	
	@Test
	public void validationOfLoginTest() {
		loginPage.validationOfLoginCta();
		loginPage.validationOfLogin(prop.getProperty("emailId"));
	}
	
	@Test(priority=1)
	public void validationOfRegisterCTATest() {
		loginPage.validationOfLoginCta();
		registerPage =loginPage.validationOfRegisterCTA();
	}
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
