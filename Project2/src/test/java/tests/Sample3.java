package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void main(String[] args) {
		String pathdriver = "C:/Users/Lenovo/workspace_mine/Project2/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathdriver);
		WebDriver driver = new ChromeDriver(); 

		driver.manage().window().setSize(new Dimension(700,350));
		driver.get("https://learn.nareshit.com");
		driver.get("https://google.com");
		driver.get("https://chatgpt.com");
		
	}

}
