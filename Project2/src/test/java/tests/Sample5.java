package tests;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {

	public static void main(String[] args) throws Exception {
		String pathdriver = "C:/Users/Lenovo/workspace_mine/Project2/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathdriver);
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		driver.get("https://learn.nareshit.com");
		Thread.sleep(1000);
		driver.navigate().to("https://google.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
	}

}
