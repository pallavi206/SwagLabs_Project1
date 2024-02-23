package saucedemo;

import org.openqa.selenium.WebDriver;


public class Case7_Checkout1 {
	
	WebDriver driver;

	public Case7_Checkout1(WebDriver driver) {
		this.driver = driver;
	}

	public void CheckOutOrder1() {
		ItemList_CheckOutProcess items=new ItemList_CheckOutProcess (driver);
		items.ProdCart();
		items.ProdCheckOut();
		items.First_Name("Pallavi");
		items.Last_Name("Sable");
		items.Pin_Code("413736");
		items.Order_Continue();
		String Total=items.Prod_Total();
		System.out.println(Total);
		items.Finish_Order();
		items.BacktoHomePage();
	
	}
}
