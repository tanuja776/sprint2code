package configure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
 public static WebDriver driver;
 @Before
 public void initialization() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Roshan\\eclipse-workspace\\capgemini Day1\\chromedriver.exe");
	 driver= new ChromeDriver();
 }
 @After
 public void closingBrowser()
 {
	driver.quit();
 }
}
