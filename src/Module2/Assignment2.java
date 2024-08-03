package Module2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Assignment -2(Handling Alerts, Frames, Windows):
➤https://demo.guru99.com/test/delete_customer.php
➤ Enter customer Id
➤ Click on Submit
➤ One prompt will open click on ok
➤ Again open one prompt click on ok
Reference site :https://www.guru99.com/alert-popup-handling-selenium.html*/

//HandlingAlertsFramesWindows
public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver chromedriver = new ChromeDriver();
		chromedriver.manage().window().maximize();
		chromedriver.get("https://demo.guru99.com/test/delete_customer.php");

		// Switch to prompt alert and clicked ok
		chromedriver.findElement(By.name("cusid")).sendKeys("12345");
		chromedriver.findElement(By.name("submit")).click();

		Alert alert1 = chromedriver.switchTo().alert();
		alert1.accept();
		Thread.sleep(5000);
		// Switch to second prompt alert and clicked ok
		Alert alert2 = chromedriver.switchTo().alert();
		alert2.accept();
		Thread.sleep(5000);
		 chromedriver.close();
	}
}