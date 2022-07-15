package Sample;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.comcast.genericutility.Baseclass;
import com.crm.comcast.genericutility.Excel_utility;
import com.crm.comcast.pomrepositylib.Homepage;
import com.crm.comcast.pomrepositylib.Organization_page;
@Listeners()
public class Creat_organization_testNG_test extends Baseclass {
	@Test
	public void Creatorganization() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		Excel_utility elib=new Excel_utility();
		Homepage hlib=new Homepage(driver);
		String expected=elib.getDataFromExcel("Sheet1", 0, 0);
		System.out.println(expected);
hlib.Click_on_Organizations(driver);
Organization_page olib=new Organization_page(driver);
olib.create_Organization(driver);
olib.Organization_Name("expected4");
olib.save_button(driver);
String text=olib.getOrganization_info().getText();
System.out.println(olib.getOrganization_info());
						if(text.contains("expected4"))
				{
					System.out.println("Organization creation sucssefully");
				}
				else
				{
					System.out.println("Organization creation not-sucssefully");
				}
				}

}
