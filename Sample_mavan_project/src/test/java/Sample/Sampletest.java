package Sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.crm.comcast.genericutility.Baseclass;
import com.google.protobuf.Method;

public class Sampletest extends Baseclass {
@Test
public void verifypage(Method mtd) throws IOException
{
System.out.println(mtd.getName());	
System.out.println("start the execution");
EventFiringWebDriver scrshot=new EventFiringWebDriver(driver);
File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);

File DestFile=new File("./Data/takescr.png");
FileUtils.copyFile(SrcFile, DestFile);
	
System.out.println("the end");

}
}
