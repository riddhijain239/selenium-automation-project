package Module2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentWindows {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Assignment -2.2(Windows): 
			➤url :http://demo.guru99.com/popup.php
			➤ Click on Click here
			➤ It will go to next window. Then enter Email Id
			➤ Click on Submit

		 */
		
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://demo.guru99.com/popup.php");
		
		WebElement linkText = chromeDriver.findElement(By.linkText("Click Here"));
		linkText.click();
		
		Set<String> wins = chromeDriver.getWindowHandles();
	    Iterator<String> itr = wins.iterator();
	    
	    while(itr.hasNext()) {
	    	chromeDriver.switchTo().window(itr.next());
	    	chromeDriver.switchTo().window(itr.next());
	    	chromeDriver.findElement(By.name("emailid")).sendKeys("riddijain239@gmail.com");
			chromeDriver.findElement(By.name("btnLogin")).click();
	    }
	    
		
	chromeDriver.close();
	
	}
}