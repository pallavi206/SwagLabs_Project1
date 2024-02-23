package execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
public class trial {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\New Selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pallavi");
		driver.findElement(By.id("pass")).sendKeys("sable123344");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sablepallavi");
		
	}

}
