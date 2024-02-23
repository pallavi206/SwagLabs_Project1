package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Case9_Checkout2 {
	
	WebDriver driver;
	
	public Case9_Checkout2(WebDriver driver) { 
		this.driver = driver;
	}
	
	By removeProduct = By.xpath("//div[@class=\"cart_item\"][3]/div/div/button");
	By removedItem = By.xpath("//div[@class=\"cart_item\"][3]/div/a/div");
	
	public void CheckOutOrder1() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		items.ProdCart();
		String RemovedItem = driver.findElement(removedItem).getText();
		System.out.println("Removed Item from the list is: " + RemovedItem);
		driver.findElement(removeProduct).click();
		items.ProdCheckOut();
		items.First_Name("Pallavi");
		items.Last_Name("Sable");
		items.Pin_Code("413736");
		items.Order_Continue();
		String Total = items.Prod_Total();
		System.out.println(Total);
		items.Finish_Order();
		items.BacktoHomePage();
		
	}
}
