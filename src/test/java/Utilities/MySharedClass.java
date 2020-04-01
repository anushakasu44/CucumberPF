package Utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class MySharedClass {
protected static WebDriver driver;

 static Properties readprop;
public static void readProperties() throws Exception{
	try{
		readprop= new Properties();
	    FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//resourses//config.properties");
		readprop.load(fis);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}
 @Before
protected static WebDriver openBrowser() throws Exception {
		
		readProperties();
		
		if(driver==null) {
		if(readprop.getProperty("name").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resourses//chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(readprop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		}
		
		return driver;
	}
 
	
	
	@After
	protected WebDriver closedriver() {
		if(driver!=null) {
			driver.quit();
		}
		return driver=null;
		}
	}


