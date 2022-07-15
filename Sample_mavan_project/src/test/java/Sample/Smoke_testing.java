package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Smoke_testing {

	@Test(groups="smoketesting")
	public void smoketesting1()
	{
		System.out.println("Executing smoketesting1");
		
}
	@Test(groups="regresingtesting")
	public void regresiontesting()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?module=Products&action=index");
		driver.close();
		
		System.out.println("regresing testing");
		
	}
}
