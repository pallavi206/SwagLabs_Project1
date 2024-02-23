package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Case4_Sort_and_Print {
	
	WebDriver driver;
	
	public Case4_Sort_and_Print(WebDriver driver) {
		this.driver = driver;
	}
	
	By sort = By.xpath("//select[@data-test=\"product_sort_container\"]");
	
	public void Sort1() {
		Sorting_Methods sort = new Sorting_Methods(driver);
		sort.Sort1_LowtoHigh();
		}
	
	public void Sort2() {
		Sorting_Methods sort = new Sorting_Methods(driver);
		sort.Sort2_ZtoA();
	}
	
	public void Sort3() {
		Sorting_Methods sort = new Sorting_Methods(driver);
		sort.Sort3_AtoZ();
		
	}
	
	public void Sort4() {
		Sorting_Methods sort = new Sorting_Methods(driver);
		sort.Sort4_HightoLow();
   
	}

 }



