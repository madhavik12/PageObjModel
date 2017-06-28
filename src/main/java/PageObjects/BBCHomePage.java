package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BBCHomePage extends BaseMain {
	
@FindBy(how=How.LINK_TEXT,using="Weather")
private WebElement weatherlink;

public BBCHomePage()
{
	PageFactory.initElements(driver, this);
}
public BBCWeatherPage clickWeatherLink()
{
	weatherlink.click();
	return new BBCWeatherPage();
}
}
