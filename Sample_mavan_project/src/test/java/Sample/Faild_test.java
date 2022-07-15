package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Sample.ListnerImplementation.class)
public class Faild_test {
@Test
private void faildtest()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://e");
			
	System.out.println("fail_test");

}
}
