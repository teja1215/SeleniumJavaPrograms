package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableHandle 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/web-table-element.php");
List  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
System.out.println("No of cols are : " +col.size()); 
//No.of rows 
List  rows=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
System.out.println("No of rows are : " + rows.size());

//findind particular cell value 

WebElement tableRow = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
String rowtext = tableRow.getText();
System.out.println("Third row of table : "+rowtext);
   
   //to get 3rd row's 2nd column data
   WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
   String valueIneed = cellIneed.getText();
   System.out.println("Cell value is : " + valueIneed); 
   driver.close();	

}
}
