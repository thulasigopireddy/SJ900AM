package testsets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws Exception {
		String pathdriver = "C:/Users/Lenovo/workspace_mine/Project2/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathdriver);
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[normalize-space()='Customer Login']")).isDisplayed();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("case");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("case");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[normalize-space()='Account Services']")).isDisplayed();
		driver.findElement(By.xpath("//a[normalize-space()='Accounts Overview']")).click();
		Thread.sleep(2000);
		String res = driver.findElement(By.xpath("//b[normalize-space()='$515.50']")).getText();
		 System.out.println(res);
		
		//Thread.sleep(2000);
	
		
		driver.close();
		
	}

}
