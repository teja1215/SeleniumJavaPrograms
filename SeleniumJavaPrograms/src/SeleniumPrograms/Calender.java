package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Calender {
	@Test(enabled = false)
	public void verifyDate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\eclipse-jee-neon-3-win32-x86_64 (1)\\eclipse\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		// Open calender
		// Select May 25
		WebElement calendar = driver.findElement(By.xpath(".//*[@id='search']/div/div[3]"));
		calendar.click();
		driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[@class='next']/button"))
				.click();
		Thread.sleep(1000);
		List<WebElement> calendarElements = driver
				.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
		System.out.println(calendarElements.size());
		for (int i = 0; i < calendarElements.size(); i++) {
			Thread.sleep(2000);
			if (calendarElements.get(i).getText().toString().equals("May 2019")) {

				for (int j = 0; j < calendarElements.size(); j++) {
					if (calendarElements.get(j).getText().equals("25")) {
						calendarElements.get(j).click();
						break;
					}
				}
				break;
			} else if (calendarElements.get(i).getText().toString().equals(">")) {
				calendarElements.get(i).click();
				Thread.sleep(1000);
			}
		}

	}

	@Test
	public void verifywindowhandless() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(".//*[@id='page_main_header']/nav/ul/li[2]/a"));
		action.sendKeys(Keys.CONTROL).build().perform();
		element.click();
		String Parent_Window = driver.getWindowHandle();
		// Switching from parent window to child window
		for (String Child_Window : driver.getWindowHandles()) {
			driver.switchTo().window(Child_Window);
			// Performing actions on child window
			System.out.println(driver.getTitle().toString());
		}
		// Switching back to Parent Window
		driver.switchTo().window(Parent_Window);
		System.out.println(driver.getTitle().toString());
	}
}
