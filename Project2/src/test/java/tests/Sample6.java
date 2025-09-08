package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {

	public static void main(String[] args) throws Exception {
		String pathdriver = "C:/Users/Lenovo/workspace_mine/Project2/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathdriver);
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		
		WebElement ele1= driver.findElement(By.id("str"));
		WebElement ele2= driver.findElement(By.name("str"));
		WebElement ele3= driver.findElement(By.className("str"));
		WebElement ele4= driver.findElement(By.linkText("str"));
		WebElement ele5= driver.findElement(By.partialLinkText("str"));
		WebElement ele6= driver.findElement(By.tagName("str"));
		WebElement ele7= driver.findElement(By.xpath("str"));
		WebElement ele8= driver.findElement(By.cssSelector("str"));
		
		
		
		driver.close();
		
	}

}
