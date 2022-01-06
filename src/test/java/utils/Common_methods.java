package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Common_methods {
	public static WebDriver driver;
	public String browser;
	public String url;
	
public void launchbrowser() throws IOException {
	
	
	
	File f = new File("D:\\Eclipse_Workspace\\shop.amazon\\src\\test\\java\\utils\\config.properties");
	FileInputStream fis = new FileInputStream(f);
	Properties prop = new Properties();
	prop.load(fis);
	browser = prop.getProperty("browser");
	url = prop.getProperty("URL");
	

		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Workspace\\Sel\\exe\\chromedriver.exe");	
			driver= new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.get(url);
		                                        }

		else if(browser.equalsIgnoreCase("firefox")) {
			    System.setProperty("webdriver.gecko.driver", "D:\\Eclipse_Workspace\\Sel\\exe\\geckodriver.exe");
		        driver = new FirefoxDriver();
		        driver.manage().window().maximize();
		        driver.get(url);
		                                             }
		
		
		                    }
public void clickElement(By locator) {
	driver.findElement(locator).click();
}

public void clearElement(By locator) {
	driver.findElement(locator).clear();}
	
public void sendInput(By locator, String Value) {
		driver.findElement(locator).sendKeys(Value);
		
	}

public void sendtextinput(By locator, String keysToSend){
	driver.findElement(locator).click();
	driver.findElement(locator).clear();
	driver.findElement(locator).sendKeys(keysToSend);
	
}
       


}
