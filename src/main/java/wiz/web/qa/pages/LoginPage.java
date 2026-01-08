package wiz.web.qa.pages;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wiz.web.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory
	
	@FindBy(css =".css-xjbq7g")
	WebElement loginCTA;
	@FindBy(xpath = "//input[@type='email']")
	WebElement emailId;
	@FindBy(xpath = "//button[@class='css-1fyei43 e1l490jz0']")
	WebElement otpSend;
	@FindBy(css=".css-35ezg3")
	WebElement registerFromLogin;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	public void validationOfLoginCta() {
		//wait.until(ExpectedConditions.elementToBeClickable(loginCTA));
		loginCTA.click();
	}
	
	public void validationOfLogin(String email) {
		//wait.until(ExpectedConditions.elementToBeClickable(loginCTA));
		emailId.sendKeys(email);
		otpSend.click();
	}
	public RegisterPage validationOfRegisterCTA() {
		//wait.until(ExpectedConditions.elementToBeClickable(registerFromLogin));
		registerFromLogin.click();
		return new RegisterPage();
	}
	
	
}
