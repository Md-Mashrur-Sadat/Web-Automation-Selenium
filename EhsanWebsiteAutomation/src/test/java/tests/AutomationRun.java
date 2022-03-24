package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import base.Base;
import model.CommonMethods;
import model.Locators;
import pages.HomePage;

public class AutomationRun extends Base {

	@Test
	public static void loginTest() throws InterruptedException {

		driver.manage().window().maximize();
		
		HomePage.homePageUrl(Locators.homePageUrl);
		
		assertEquals(CommonMethods.getTitle(), Locators.pageTitle);
		System.out.println("Success");
		CommonMethods.timeout();

		CommonMethods.hover(Locators.lekhokHover);
		CommonMethods.timeout();
		
		CommonMethods.clickOnButton(Locators.arifAjad);
		CommonMethods.timeout();
		
		CommonMethods.clickOnButton(Locators.paradoxicalSajid);	
		CommonMethods.timeout();
		
		CommonMethods.clickOnButton(Locators.addToCart);
		CommonMethods.timeout(); 
		
		CommonMethods.clickOnButton(Locators.goToCart);
		CommonMethods.timeout();
		
	    CommonMethods.clickOnButton(Locators.proceedToCheckout);
		CommonMethods.timeout();
		
		CommonMethods.sendText(Locators.enterPhoneNum, "01842041867");
		CommonMethods.timeout();
		
		CommonMethods.sendText(Locators.enterPassword, "sadat1");
		CommonMethods.clickOnButton(Locators.loginButton);
		CommonMethods.timeout();
		
		CommonMethods.clickOnButton(Locators.address);
		CommonMethods.timeout();
		
		CommonMethods.clickOnButton(Locators.addNewAddress);
		CommonMethods.timeout();
		
		CommonMethods.sendText(Locators.fullName, "Mashrur Sadat");
		CommonMethods.timeout();
		
		CommonMethods.sendText(Locators.phone, "01842041867");
		CommonMethods.timeout();
		
		CommonMethods.sendText(Locators.email, "mashrur@gmail.com");
		CommonMethods.timeout();
		
		CommonMethods.clickOnButton(Locators.selectCity);
		CommonMethods.clickOnButton(Locators.dhaka);
		
		CommonMethods.clickOnButton(Locators.selectArea);
		CommonMethods.clickOnButton(Locators.mirpur);
		
		CommonMethods.sendText(Locators.postcode, "1216");
		
		CommonMethods.sendText(Locators.shippingAddress, "House-6/1, Road-2, Block-C");
		CommonMethods.timeout();
		CommonMethods.clickOnButton(Locators.save);
		CommonMethods.timeout();

		System.out.println("Test Passed");

	}

}
