package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {

	public WebDriver driver;
	@BeforeTest
	public void setup() {
		if(System.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
		}
		else if(System.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			//EdgeOptions options = new EdgeOptions();
			//options.addArguments("--headless");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(System.getProperty("url"));
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
