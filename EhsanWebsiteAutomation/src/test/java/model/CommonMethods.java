package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;

public class CommonMethods extends Base {

	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static void hover(By option) {
		
		WebElement menuOption = driver.findElement(option);
		//Instantiate Action Class        
	    Actions action= new Actions(driver);
	    action.moveToElement(menuOption).perform();
	}
	 
	public static void clickOnButton(By btn) {
		driver.findElement(btn).click();
	}
	
	public static void clickAndHover(By option) {
		
		WebElement menuOption = driver.findElement(option);
		//Instantiate Action Class        
	    Actions action= new Actions(driver);
	    action.clickAndHold(menuOption).build().perform();
	}
	
	public static String getText(By element) {
		return driver.findElement(element).getText();
	}
	
	public static void sendText(By element, String value) {
		driver.findElement(element).sendKeys(value);
	}
	
	public static void timeout() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

