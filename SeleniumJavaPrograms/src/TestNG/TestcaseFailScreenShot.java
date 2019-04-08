package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class TestcaseFailScreenShot extends TestCaseFail
{
	
	
@BeforeMethod
public void setup()
{
	initialization();
}
@AfterMethod
public void teardown()
{
	driver.quit();
}
@Test
public void testcasefail()
{
	Assert.assertEquals(true, false);
}
}
