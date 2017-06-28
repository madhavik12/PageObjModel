package PageObjects;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;

	import utils.AutomationConstants;
	public class BaseMain {

		static public WebDriver driver;
		
	   
	public void openBrowser()
	   {
		   if(AutomationConstants.BROWSER.equals("firefox"))
		   {
		   
			   driver=new FirefoxDriver();
		   }
		   
		   else if(AutomationConstants.BROWSER.equals("chrome"))
		   {
			   System.setProperty("webdriver.chrome.driver", "C:\\seleniumPractice\\chromedriver.exe");
			   driver=new ChromeDriver();
		   }
		   
		   else if(AutomationConstants.BROWSER.equals("ie"))
		   {
			   System.setProperty("webdriver.ie.driver", "path of the driver");
			   driver=new InternetExplorerDriver();
		   }
			   
			driver.get(AutomationConstants.URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   }		
	   public void closeBrowser()
	   {
		   driver.close();
		   //driver.quit();
		   //driver=null;
	   }
	}


