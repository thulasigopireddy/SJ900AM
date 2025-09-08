package testsets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterLogin {

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
	
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("test123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.findElement(By.xpath("//h2[normalize-space()='Account Services']")).isDisplayed();
			Thread.sleep(3000);
		
		driver.close();
		
	}

}
