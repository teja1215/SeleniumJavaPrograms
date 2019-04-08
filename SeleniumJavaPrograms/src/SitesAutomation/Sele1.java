package SitesAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Sele1 
{
public static void main(String[] args)
{
ChromeDriver cd=new ChromeDriver();	
//cd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
cd.get("https://www.google.com");
cd.manage().window().maximize();
WebElement wb=cd.findElement(By.name("q"));
wb.sendKeys("Raviteja");
wb.sendKeys(Keys.ENTER);
WebElement wb1=cd.findElement(By.className("LC20lb"));
Actions ac=new Actions(cd);
ac.moveToElement(wb1).contextClick().build().perform();
}
}
