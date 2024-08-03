package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Assignment -2(Locators working with WebElements) 
		 * ➤ URL(https://demo.guru99.com/test/radio.html 
		 * ➤ Find Option 1 and select 
		 * ➤ FindCheckbox2 and Checkbox3 and select 
		 * ➤ Suggested site(https://demo.guru99.com/test/newtours/register.php)
		 * ➤ FindCountryDropdown 
		 * ➤ Select “KUWAIT”
		 */

		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://demo.guru99.com/test/radio.html");

		// Find Option 1 radio button and select
		WebElement option1RadioButton = chromeDriver.findElement(By.id("vfb-7-1"));
		option1RadioButton.click();

		// Find Checkbox2 and Checkbox3 checkboxes and select
		WebElement checkbox2 = chromeDriver.findElement(By.id("vfb-6-0"));
		checkbox2.click();
		WebElement checkbox3 = chromeDriver.findElement(By.id("vfb-6-1"));
		checkbox3.click();

		// Move to another page
		chromeDriver.get("https://demo.guru99.com/test/newtours/register.php");

		// Find Country Dropdown and select "KUWAIT"
		WebElement countryDropdown = chromeDriver.findElement(By.name("country"));
		Select selectCountry = new Select(countryDropdown);
		selectCountry.selectByVisibleText("KUWAIT");
	}
}
