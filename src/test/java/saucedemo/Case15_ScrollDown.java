package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Case15_ScrollDown {
	
	WebDriver driver;
	
	public Case15_ScrollDown(WebDriver driver) {
		this.driver = driver;
	}

	By twitter = By.xpath("//a[@href=\"https://twitter.com/saucelabs\"]");
	
	public void Tweet() {
		driver.findElement(twitter).click();
	}
}
