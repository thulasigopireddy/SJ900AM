package testsets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws Exception {
		String pathdriver = "C:/Users/Lenovo/workspace_mine/Project2/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathdriver);
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[normalize-space()='Customer Login']")).isDisplayed();
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.xpath("//h1[normalize-space()='Signing up is easy!']")).isDisplayed();
		Thread.sleep(2000);
	
		driver.close();
		
	}

}
