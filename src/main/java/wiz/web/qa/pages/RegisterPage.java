package wiz.web.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wiz.web.qa.base.TestBase;


public class RegisterPage extends TestBase{
	
	//page Factory
	String un = "harshit gupat";
	String ph = "8290038983";
	String em = "workisworship03@gmail.com";
	@FindBy(xpath="//input[@name='fullName']")
	WebElement name;
	@FindBy(xpath="//input[@name='phoneNumber']")
	WebElement phone;
	@FindBy(xpath="//input[@name='emailAddress']")
	WebElement email;
	@FindBy(xpath="//button[@class='css-kegkbf e1l490jz0']")
	WebElement getOtp;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validationOfCred(String un, String ph, String em) {
		name.sendKeys(un);
		phone.sendKeys(ph);
		email.sendKeys(em);
		getOtp.click();
		
	}

}
