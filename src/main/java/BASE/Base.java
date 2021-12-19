package BASE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	protected WebDriver driver;
	
	public void LaunchingBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\AT Notes\\Selenium file folder\\Chrome_Driver\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
	    driver= new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		}

}
