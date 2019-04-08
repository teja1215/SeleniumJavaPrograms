package SitesAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus 
{
  public static void main(String[] args) throws InterruptedException 
  {
	   WebDriver  wb=new ChromeDriver();
	   wb.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	   wb.get("http://redbus.in");
	   WebElement wb1= wb.findElement(By.id("src"));
	    wb1.sendKeys("Chennai");
	    wb1.sendKeys(Keys.ENTER);
        WebElement wb2=wb.findElement(By.id("dest"));
        wb2.sendKeys("Mumbai");
        wb2.sendKeys(Keys.ENTER);
	   WebElement   calendar=wb.findElement(By.xpath("//*[@id='search']/div/div[3]"));
		calendar.click();
		Thread.sleep(1000);
		List<WebElement> calendarElements=wb.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
		System.out.println(calendarElements.size());
		for(int i=0;i<calendarElements.size();i++)
		{
			Thread.sleep(2000);
			if(calendarElements.get(i).getText().toString().equals("Apr 2018")){

				for(int j=0;j<calendarElements.size();j++){
					if(calendarElements.get(j).getText().equals("17")){
						calendarElements.get(j).click();
					break;
					}	
				}
				break;
			}
			else if(calendarElements.get(i).getText().toString().equals(">")){
				calendarElements.get(i).click();
				Thread.sleep(1000);
			}
		}
		wb.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		
	}

  }

