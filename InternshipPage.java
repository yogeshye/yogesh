package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

 
public class InternshipPage extends Basepage {

	private By javainternships = By.xpath("//a[text()='Java Development']");	

 	private By submitButton = By.id("submit");
 
	private By easyApplyModal = By.id("easy_apply_modal");


	
	public InternshipPage(WebDriver driver) {
		super(driver);
		// TODO Auto-
	}
	
	
	   //Apply for first internship after filter
		public void ApplyfirstInternship() {
 
		  wait.until(ExpectedConditions.elementToBeClickable(javainternships)).click();
	     
	     wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	     WebElement succesmessage = wait.until(ExpectedConditions.visibilityOfElementLocated(easyApplyModal));
         
	     
		}
		
		  public boolean isSuccessPopupDisplayed() {
		        try {
		            WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(easyApplyModal));
		            return modal.isDisplayed();
		        } catch (Exception e) {
		            return false;
		        }
	
	
}
}