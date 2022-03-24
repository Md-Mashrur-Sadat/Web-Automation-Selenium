package model;

import org.openqa.selenium.By;

public class Locators {

	public static String homePageUrl = "https://www.ehsan.com.bd/";
	public static String pageTitle = "Ehsan | Home";

	public static By lekhokHover = By.xpath("//a[contains(text(),'লেখক')]");

	public static By arifAjad = By.xpath("//a[contains(text(),'আরিফ আজাদ')]");

	public static By paradoxicalSajid = By.xpath("//a[@href='/product-details/paradoxical-sazid']");
	
	public static By addToCart = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[3]/app-product-details[1]/section[1]/div[1]/div[3]/div[2]/button[1]");
	 
	public static By goToCart = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[3]/app-product-details[1]/section[1]/div[1]/div[3]/div[2]/button[1]");

	public static By proceedToCheckout =By.xpath("//a[contains(text(),'Proceed to checkout')]");
	 
	public static By enterPhoneNum =  By.xpath("//input[@placeholder='Please enter your phone number or email']");
	 
	public static By enterPassword =  By.xpath("//input[@placeholder='Minimum 6 characters with a number and latter']");
	 
	public static By loginButton = By.xpath("//button[contains(text(),'login')]");
	 
	public static By address = By.xpath("//span[contains(text(),'Address')]");
	 
	public static By addNewAddress = By.xpath("//body/app-root[1]/div[1]/app-pages[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[3]/app-dashboard[1]/div[1]/div[2]/app-address-book[1]/div[1]/div[1]/button[1]");
	 
	public static By fullName = By.xpath("//input[@data-placeholder='Full name']");
	public static By phone = By.xpath("//input[@data-placeholder='Phone No']");
	public static By email = By.xpath("//input[@data-placeholder='Email Address']");
	 
	public static By selectCity = By.xpath("//mat-select[@placeholder='Select City *']");
	public static By dhaka = By.xpath("//span[contains(text(),'ঢাকা')]");
	 
	public static By selectArea = By.xpath("//mat-select[@placeholder='Select Area *']");
	 
	public static By mirpur = By.xpath("//span[contains(text(),'মিরপুর-২')]");
	 
	public static By postcode = By.xpath("//input[@data-placeholder='Post Code']");
	 
	public static By shippingAddress = By.xpath("//input[@data-placeholder='Address']");
	 
	public static By save = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-add-new-address[1]/div[1]/form[1]/div[2]/button[1]");
	 
	 
}
