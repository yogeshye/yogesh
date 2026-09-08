package Pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Basepage{
     
	 private By loginButton = By.xpath("//*[@id=\"header\"]/div/nav/div[3]/button");
	 private By emailField = By.xpath("//*[@id=\"modal_email\"]");
	 private By passwordField = By.xpath("//*[@id=\"modal_password\"]");
	 private By submitLoginBtn = By.xpath("//*[@id=\"modal_login_submit\"]");
	 private By captchaerror =   By.xpath("//*[@id=\"error_modal\"]/div/div/div/div[2]/div[3]/a");
	

	 public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	  
	    public void Studentlogin(String email, String password) {
	    	  wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	    	  wait.until(ExpectedConditions.elementToBeClickable(emailField)).clear();
	    	 wait.until(ExpectedConditions.elementToBeClickable(emailField)).sendKeys(email);
	    	 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 wait.until(ExpectedConditions.elementToBeClickable(passwordField)).clear();
	         wait.until(ExpectedConditions.elementToBeClickable(passwordField)).sendKeys(password);
	         new WebDriverWait(driver, Duration.ofSeconds(600));
	         try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
 	         WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(submitLoginBtn));
 	         try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 	         
	        //  submit.click();
	      
	         
	    }
	 
	 
	 
	 
	 
}
