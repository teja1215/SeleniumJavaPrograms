package SitesAutomation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows 
{
	public static void main(String[] args) {
		
ChromeDriver cd=new ChromeDriver();
cd.get("https://www.naukri.com");
Set<String> windows= cd.getWindowHandles();
for(String handle:windows)
{
	String url="https://company.naukri.com/popups/reliance/index.html";
	String expected="https://company.naukri.com/popups/reliance/index.html";
	if(url.equals(expected))
	{
		WebDriver wb=cd.switchTo().window(handle);
		cd.manage().window().maximize();
		
	System.out.println(wb.getCurrentUrl());
	wb.close();
   }
}
}
}
