package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import base.baseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest extends baseTest{

	@Test
	public void testGoogle() throws Exception {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		
//		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Clicked on Login");
		WebElement menu = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		String menuText = menu.getText();
		Thread.sleep(2000);
		System.out.println(menuText);
		driver.quit();
	}	
}
