package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogoutPage extends Basepage {
	
	private By profilebutton = By.xpath("//i[contains(@class, 'ic-24-filled-down-arrow')]");
    private By Moredropdown = By.cssSelector("a.dropdown-click");
    private By logoutbutton = By.linkText("Logout");
	public LogoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void logout() {
		Actions action = new Actions(driver);
 		 WebElement profile = wait.until(ExpectedConditions.visibilityOfElementLocated(profilebutton));
 		 action.moveToElement(profile).perform();
	     WebElement moreMenu = wait.until(ExpectedConditions.elementToBeClickable(Moredropdown));
	     action.moveToElement(moreMenu).click().perform();
	     WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(logoutbutton));   
	     action.moveToElement(logout).click().perform();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		      
		
	}
	
	
}
