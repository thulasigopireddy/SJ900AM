package tests;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {

	public static void main(String[] args) {
		String pathdriver = "C:/Users/Lenovo/workspace_mine/Project2/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathdriver);
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().maximize();
		//driver.get("https://learn.nareshit.com");
		driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
	//	System.out.println(driver.getPageSource());
		
		driver.close();
		
	}

}
