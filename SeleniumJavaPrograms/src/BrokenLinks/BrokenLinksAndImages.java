package BrokenLinks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksAndImages 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.redbus.in/");
//driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/a/span[2]")).click();
//driver.findElement(By.name("username")).sendKeys("naveenk");
//driver.findElement(By.name("password")).sendKeys("test123");
Thread.sleep(30);
//driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
List<WebElement> totallist=driver.findElements(By.tagName("a"));
totallist.add(driver.findElement(By.tagName("img")));
List<WebElement> activelinks=new ArrayList<WebElement>();
for(int i=0;i<activelinks.size();i++)
{
	if(totallist.get(i).getAttribute("href")!=null)
	{
	activelinks.add(totallist.get(i));
}
}
System.out.println("activelinks="+activelinks.size());
driver.quit();

}
}
