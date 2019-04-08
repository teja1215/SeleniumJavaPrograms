package SitesAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FramesPrint 
{
	public static void main(String[] args) 
	{
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.gmail.com");
		List<WebElement> l=cd.findElements(By.tagName("iframe"));
	for(WebElement ele:l)
	{
		String s1=ele.getAttribute("name");
		System.out.println(s1);
		//System.out.println("get id"+s1.getAttribute("name"));
	}
		
		
	}

}
