package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Case16 {
	
	WebDriver driver;
	
	public Case16(WebDriver driver) {
		this.driver = driver;
	}
	
	By btnAbout = By.id("react-burger-menu-btn");
	By logout = By.id("logout_sidebar_link");
	
	public void Logout() {
		driver.findElement(btnAbout).click();
		driver.findElement(logout).click();
	}

}
