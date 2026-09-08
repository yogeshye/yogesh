package Pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends Basepage {
	
	private By InternshipnavButton = By.xpath("//*[@id=\"internships_new_superscript\"]");
	private By workfromhomeInternship = By.xpath("//*[@id=\"internships-dropdown\"]/div/div[2]/div[1]/div/a[1]");
    private  By marketingInputLocator = By.xpath("//input[@tabindex='4' and contains(@class, 'chosen-search-input')]");
                                   
    public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    //filter and search for work from home  and java Internship
   public void serachinternship(String categoryName) {
	// TODO Auto-generated method stub  
   
	 WebDriverWait localWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement internshipmenu = localWait.until(ExpectedConditions.visibilityOfElementLocated(InternshipnavButton));
	 Actions howermouse = new Actions(driver);
    howermouse.moveToElement(internshipmenu).perform();
    
     WebElement computer =  localWait.until(ExpectedConditions.elementToBeClickable(workfromhomeInternship));
     computer.click();
     localWait.until(ExpectedConditions.urlContains("/internships"));
     Actions action = new Actions(driver);
      WebElement Activeinputfield = localWait.until(ExpectedConditions.presenceOfElementLocated(marketingInputLocator));
     action.moveToElement(Activeinputfield).click()
                                            .sendKeys(categoryName)
                                            .pause(Duration.ofSeconds(5))
                                            .sendKeys(Keys.ENTER)
                                            .build().perform();
  
     try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
 
}



