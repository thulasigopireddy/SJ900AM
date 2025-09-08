package testsets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds{

	public static void main(String[] args) throws Exception {
		String pathdriver = "C:/Users/Lenovo/workspace_mine/Project2/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathdriver);
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[normalize-space()='Customer Login']")).isDisplayed();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("case1");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("case1");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[normalize-space()='Account Services']")).isDisplayed();
	
		driver.findElement(By.xpath("//a[normalize-space()='Transfer Funds']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("222");
		 
		 new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']"))).selectByVisibleText("16563");
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(("//input[@value='Transfer']"))).click();
		 
		 String res=driver.findElement(By.xpath("//h1[normalize-space()='Transfer Complete!']")).getText();
			System.out.println(res);
		
		driver.close();
		
	}

}
