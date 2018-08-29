package Runner;

import java.io.File;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;


public class Test_Runner {

@Test
public void test() 
{
	System.out.println("hi");
	}
@BeforeTest
public void beforeTest()
{
	System.out.println("helllooo");
	
	//System.setProperty("webdriver.firefox.bin", pathBinary.getAbsolutePath());System.setProperty("webdriver.gecko.driver","/usr/bin/geckodriver");
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	
	//driver.get("http://13.251.143.66:8090/IPL-Fantasy-League/");

}
@AfterTest
public void afterTest(){
	System.out.println("Running1");
}
}
