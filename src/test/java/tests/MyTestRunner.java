package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import PageObjects.BBCHomePage;
import PageObjects.BBCWeatherPage;
import PageObjects.BaseMain;

public class MyTestRunner {
	//public static WebDriver driver;
	static BaseMain bmain=new BaseMain();
  @Test
  public void verifyBBCHomeTest() {
	  //BBCHomePage bhp=PageFactory.initElements(driver, BBCHomePage.class);
		BBCHomePage bhp=new BBCHomePage();

	  BBCWeatherPage wp=bhp.clickWeatherLink();
  wp.EnteredWeatherPage();
  
  }
  
 
  @BeforeClass
  public void setUp() {
	  bmain.openBrowser();
	  
  }

  @AfterClass
  public void tearDown() {
	  bmain.closeBrowser();
  }

}
