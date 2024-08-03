package Module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Assignment -1(WebTable):
➤url : https://demo.guru99.com/test/web-table-element.php
➤ Retrieve the all company names from the table
➤ And display in console
➤url : https://demo.guru99.com/test/login.html
➤ Enter email
➤ Enter password
➤ Click on Login button*/

public class Assignment1 {

	public static void main(String[] args) {

		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://demo.guru99.com/test/web-table-element.php");

		// Get all the company names
		List<WebElement> companyElements = chromeDriver
				.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));

		// Print company names
		for (WebElement element : companyElements) {
			System.out.println(element.getText());
		}

		chromeDriver.close();

		// Login Guru99 demo site 
		WebDriver chromeDriver1 = new ChromeDriver();
		chromeDriver1.manage().window().maximize();
		chromeDriver1.get("https://demo.guru99.com/test/login.html");

		// Enter email
		chromeDriver1.findElement(By.id("email")).sendKeys("test@example.com");

		// Enter Password
		chromeDriver1.findElement(By.id("passwd")).sendKeys("Test@123");

// Click on login button
		chromeDriver1.findElement(By.id("SubmitLogin")).click();

	 chromeDriver1.close();

	}
}