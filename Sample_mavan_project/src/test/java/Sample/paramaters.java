package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.comcast.genericutility.Baseclass;

public class paramaters 
{
	WebDriver driver;

@Parameters("Browser")
@Test
public void Browsername(String Browser)
{
	
if(Browser.equals("Chrome"))
 {
	driver=new ChromeDriver();
	}
if(Browser.equals("firefox"))
	{
driver=new FirefoxDriver();
}
if(Browser.equals("ie"))
{
	driver=new InternetExplorerDriver();
			}

else {
	System.out.println("not value valide");
}
driver.get("http://localhost:8888/");
System.out.println("browser closed");

driver.close();

}
}
