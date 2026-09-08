import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	
	protected  WebDriver driver;
	 @BeforeClass
	 public void setup()
	 {
		 ChromeOptions options = new ChromeOptions();
		// Path to your computer's local Chrome folder
	//	options.addArguments("--user-data-dir=C:\\Users\\VC\\AppData\\Local\\Google\\Chrome\\User Data");
		// Forces it to reference your primary profile instead of a blank temporary profile
	//	options.addArguments("--profile-directory=Default");
		// ⚠️ FIX: Add these critical arguments to prevent the crash
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://internshala.com");
	 }

	 @AfterClass
	 public void teardown() {
		 if(driver!= null) {
			 driver.quit();			 
		 }
		 
	 }
	 
}
