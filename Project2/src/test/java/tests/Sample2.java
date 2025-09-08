package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) {
		String pathdriver = "C:/Users/Lenovo/workspace_mine/Project2/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathdriver);
		WebDriver driver = new ChromeDriver(); 
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
	
		  // OR
		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();
		
	
		
	}

}
