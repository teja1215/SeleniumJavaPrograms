package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch 
{
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("testing");
	List<WebElement> li=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1"));
	System.out.println("the number of suggetions"+li.size());
	for(int i=0;i<li.size();i++)
	{
		String s=li.get(i).getText();
		if(s.contains("tsting tutorial"))
		{
			li.get(i).click();
			break;
		}
	}
	driver.close();
	}
}
