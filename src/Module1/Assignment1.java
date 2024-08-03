package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/* Assignment – 1 (Webdriver  architecture, All Types of Drivers)
➤ First Selenium Test: Verify amazon HomaPage
➤ verify the FaceBookHomePage
➤ Verify the Page Title. 
➤ Invoke : Firefox, Safari, IE
➤ Using Navigator commands to move home page to other page and comeback to homepage
 * */

public class Assignment1 {

	public static void main(String[] args) {

		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		// Verified amazon HomaPage
		chromeDriver.get("https://www.amazon.com/");

		// verify the FaceBook HomePage
		chromeDriver.get("https://www.facebook.com/");
		// Verify the Page Title should be Amazon.com
		String pageTitle = chromeDriver.getTitle();
		System.out.println("Page Title is:" + pageTitle);
		String expectedTitle = "Facebook – log in or sign up";
		if (pageTitle.equals(expectedTitle)) {
			System.out.println("Title matched and test case passed");
		} else {
			System.out.println("Title does not matched and test case failed");
		}

		WebDriver firefoxDriver = new FirefoxDriver();
		WebDriver edgeDriver = new EdgeDriver();
		// WebDriver safariDriver = new SafariDriver(); // will not work in Windows machine 

		firefoxDriver.get("https://www.facebook.com/");
		edgeDriver.get("https://www.facebook.com/");



		
		// Using Navigator commands to move home page to other page and comeback to homepage
		// In Chrome browser will check Back Navigation then Forward Navigation command. 
		// currently Facebook homepage is opened.
		
		
		String currentOpenedPage = chromeDriver.getTitle();
		
		System.out.println("Title of current opened page: " + chromeDriver.getTitle());
		
		chromeDriver.navigate().back();
		
		System.out.println("Title of the page after back button clicked: " + chromeDriver.getTitle());
		
		chromeDriver.navigate().refresh();
		
		System.out.println("Title of the page after refresh button clicked: " + chromeDriver.getTitle());
		
		chromeDriver.navigate().forward();
		
		System.out.println("Title of the page after forward button clicked: " + chromeDriver.getTitle());
		
		String expectedTitleNavigation = "Facebook – log in or sign up";
		
		if (currentOpenedPage.equals(expectedTitleNavigation)) {
			System.out.println("Current opened home page is equal to expected opened home page. Test case passed");
		} else {
			System.out.println("Current opened home page is not equal to expected opened home page. Test case Failed");
		}
		
		firefoxDriver.quit();
		edgeDriver.quit();
		chromeDriver.quit();

	}

}
