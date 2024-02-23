package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Case14 {

	WebDriver driver;
	
	public Case14(WebDriver driver) {
		this.driver = driver;
	}
	
	By cancel = By.id("cancel");
	
	public void AddItems() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		Sorting_Methods sort = new Sorting_Methods(driver);
		items.First_Name("Pallavi");
		items.Last_Name("Sable");
		items.Pin_Code("413736");
		items.Order_Continue();
		driver.findElement(cancel).click();
		sort.Sort2_ZtoA();
		items.Button4();
		items.Button6();
		items.ProdCart();
		items.ProdCheckOut();
		items.First_Name("Pallavi");
		items.Last_Name("Sable");
		items.Pin_Code("413736");
		items.Order_Continue();
		items.Finish_Order();
		items.BacktoHomePage();
		}
}
