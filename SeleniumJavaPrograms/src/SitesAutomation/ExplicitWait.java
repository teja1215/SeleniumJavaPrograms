package SitesAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement fname=driver.findElement(By.name("firstname"));
WebElement lname=driver.findElement(By.name("lastname"));
sendkeys(driver,fname,10,"Raviteja");
sendkeys(driver,lname,10,"Reddy");

}
public static void sendkeys(WebDriver driver,WebElement ele,int time,String value)
{
	WebDriverWait wait=new WebDriverWait(driver,time);
	wait.until(ExpectedConditions.visibilityOf(ele));
	ele.sendKeys(value);
	
}
}