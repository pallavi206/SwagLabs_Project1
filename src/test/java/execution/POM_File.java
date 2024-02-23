package execution;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import saucedemo.Case2_About;
import saucedemo.Login;
import saucedemo.Case3_Request_Demo;
import saucedemo.Case4_Sort_and_Print;
import saucedemo.Case5_SortItems_LowtoHigh;
import saucedemo.Case6_Sort_Z2A_AddItems;
import saucedemo.Case7_Checkout1;
import saucedemo.Case8_Sort_Price_H2L_AddItems;
import saucedemo.Case9_Checkout2;
import saucedemo.Case10_AddandRemoveItems_AtoZ;
import saucedemo.Case11_Reset_app_status;
import saucedemo.Case12_AddBtn;
import saucedemo.Case13_ShoppingfromCart;
import saucedemo.Case14;
import saucedemo.Case15_ScrollDown;
import saucedemo.Case16;

public class POM_File {
	
	WebDriver driver;
	
	@BeforeTest
		public void Launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\New Selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
		
	@Test 
	public void a_Login_test1() {
		Login log = new Login(driver);
		log.uName("standard_user");
		log.passwd("secret_sauce");
		log.LogIn();
		System.out.println("Logged In successfully");
		System.out.println("");
	}
	
	@Test 
	public void b_About() {
		Case2_About about = new Case2_About(driver);
		about.buttonAbout();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		about.About();
	}
	
	@Test
	public void c_Demo() {
		Case3_Request_Demo demoreq = new Case3_Request_Demo(driver);
		demoreq.demonstration();
		demoreq.Emailid("test@.com");
		demoreq.FName("Pallavi");
		demoreq.LName("Sable");
		demoreq.Company_d("abc");
		demoreq.Company_Num("1234567891");
		Select dropDown = new Select(driver.findElement(By.id("Country")));
		dropDown.selectByVisibleText("India");
		Select dropDown1 = new Select(driver.findElement(By.id("Solution_Interest__c")));
		dropDown1.selectByVisibleText("Sauce API Quality");
		demoreq.Comments("Successfully filled all the data by automation");
		demoreq.CheckBox();
		demoreq.Submit();
		System.out.println("Demo Invite Sent Succcessfully");
		System.out.println("");
		driver.switchTo().frame("chilipiper-frame");
		demoreq.cross();
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test
	public void d_Sorting() {
		Case4_Sort_and_Print sortPrint = new Case4_Sort_and_Print(driver);
		System.out.println("Products are getting sorted by following methods: ");
		sortPrint.Sort1();
		sortPrint.Sort2();
		sortPrint.Sort3();
		sortPrint.Sort4();
	}

	@Test
	public void e_LowtoHigh() {
		Case5_SortItems_LowtoHigh items = new Case5_SortItems_LowtoHigh(driver);
		System.out.println("");
		System.out.println("Product which is present at number 2 Before Sort: ");
		items.fstItem();
		items.Sort1();
		System.out.println("Product which is present at number 2 After Sort: ");
		items.fstItem();
	}
	
	@Test
	public void f_AddItem_L2H() {
		Case6_Sort_Z2A_AddItems case6 = new Case6_Sort_Z2A_AddItems(driver);
		System.out.println("");
		case6.Sort1();
		case6.AddItem1();
		case6.Sort1();
		case6.AddItem2();
		case6.Sort1();
		case6.AddItem3();
	}
	
	@Test
	public void g_CheckOut_fstOrder() {
		Case7_Checkout1 order = new Case7_Checkout1(driver);
		System.out.println("");
		order.CheckOutOrder1();
		System.out.println("Order is successfully placed");
	}
	

	@Test
	public void h_Price_H2L() {
		Case8_Sort_Price_H2L_AddItems case8 = new Case8_Sort_Price_H2L_AddItems(driver);
		System.out.println("");
		case8.Sort1();
		case8.AddItem4();
		case8.Sort1();
		case8.AddItem5();
		case8.Sort1();
		case8.AddItem6();
	}
	
	@Test
	public void i_Checkout_Order() {
		Case9_Checkout2 case9 = new Case9_Checkout2(driver);
		System.out.println("");
		case9.CheckOutOrder1();
	}
	
	@Test
	public void j_CheckOut_order() {
		Case10_AddandRemoveItems_AtoZ case10 = new Case10_AddandRemoveItems_AtoZ(driver);
		System.out.println("");
		case10.Sort1();
		case10.AddItem1();
		case10.Sort1();
		case10.AddItem2();
		case10.Sort1();
		case10.AddItem3();
		case10.Sort1();
		case10.AddItem4();
		case10.Remove_Prod();
		System.out.println("Products removed successfully");
		case10.ContinueShopping();
	}
	
	@Test
	public void k_Reset_AppStatus() {
		Case11_Reset_app_status case11 = new Case11_Reset_app_status(driver);
		System.out.println("");
		case11.Reset_App();
		driver.navigate().refresh();
		System.out.println("App state is reset");
	}
	
	@Test
	public void l_AddButton() {
		Case12_AddBtn case12 = new Case12_AddBtn(driver);
		System.out.println("");
		case12.addItemfromProductPage();
	}
	
	@Test
	public void m_case13() {
		Case13_ShoppingfromCart case13 = new Case13_ShoppingfromCart(driver);
		System.out.println("");
		case13.ShoppingFromCart();
	}
	
	@Test
	public void n_case14() {
		Case14 case14 = new Case14(driver);
		System.out.println("");
		case14.AddItems();
	}
		
	@Test
	public void o_case15 () {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Case15_ScrollDown tweetx = new Case15_ScrollDown(driver);
		tweetx.Tweet();
		String windowHandle = driver.getWindowHandle(); 
		ArrayList tabs = new ArrayList (driver.getWindowHandles()); //Get the list of window handles
		System.out.println(tabs.size());
		driver.switchTo().window(windowHandle);  //Switch back to original window	
	}
	
	@Test
	public void p_case16_logout() {
		Case16 logout = new Case16(driver);
		logout.Logout();
	}
	
	@Test(dataProvider="testdata") 
	public void p_case17_Data_Provide(String name, String pass) {
		Login login = new Login(driver);
		
		login.uName(name);
		login.passwd(pass);
		login.LogIn();
	//	login.Clear();
	}
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
	Login log = new Login(driver);
	Object [][] logindata=new Object[2][2];
	// Enter data to row 1 column 0
	logindata[1][0]="standard_user";
	// Enter data to row 1 column 0
	logindata[1][1]="secret_sauce"; 	
	// return arrayobject to testscript
	return logindata;		
	}
}
