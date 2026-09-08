import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjects.DashboardPage;
import Pageobjects.InternshipPage;
import Pageobjects.LoginPage;
import Pageobjects.LogoutPage;

public class InternshipTest extends BaseTest {
    //valid user login
	@Test(priority =1)
	public void Teststudentlogin() {
		
		LoginPage login = new LoginPage(driver);
		login.Studentlogin("yyedhe12@gmail.com","Babaye@123");	
	
	}	
	
	//after login navigate to internship page
	@Test(enabled =false)
    public void Testsearchinternship() {
    	DashboardPage dashboard = new DashboardPage(driver);
    	dashboard.serachinternship("Java Development");
    	
    }
	
	//apply for first internship.
	@Test(enabled = false)
	public void Testapplyinternship() {
		InternshipPage internshippage = new InternshipPage(driver);
		internshippage.ApplyfirstInternship();
		boolean successpopdisplay = internshippage.isSuccessPopupDisplayed();
		Assert.assertTrue(successpopdisplay, "the success popup did not display");
			
	}
   //upon completion logout student
	@Test(priority =4)
	public void logoutstudent() {
		LogoutPage logoutstudentpage = new LogoutPage(driver);
		logoutstudentpage.logout();
	}
	
	
	
	}
		

