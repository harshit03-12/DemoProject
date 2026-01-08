package wiz.web.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import wiz.web.qa.utils.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	
	public TestBase(){
		try {
			prop = new Properties();
			//File file = new File("config.properties"); // it will consist below file path
			File filePath = new File("/Users/harshitgupta/eclipse-workspace/PageAutomate1/"
					+ "src/main/java/wiz/web/qa/config/config.properties");
			FileInputStream ip = new FileInputStream(filePath);
		    prop.load(ip);
		}catch(FileNotFoundException e) {
		     e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		// windows actions	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.Page_load_timeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.Implicit_wait));
		driver.get(prop.getProperty("url"));
	}
	

}

