package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseFail 
{
 public static WebDriver driver;
      public static void initialization()
       {
         driver=new ChromeDriver();
         driver.get("https://www.google.com/");

        }
      public void failed() throws IOException
      {
    	  File f=new File("D://testcasefiled.jpg");
    	  File dest=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	  FileUtils.copyFileToDirectory(dest,f);
      }
}
