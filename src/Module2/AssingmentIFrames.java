package Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentIFrames {

	public static void main(String[] args) {
		/*
		 * Assignment -2.1(Frames): ➤https://demo.guru99.com/test/delete_customer.php ➤
		 * Click on the frame shown in the image Reference site :
		 * https://www.guru99.com/handling-iframes-selenium.html
		 */
		
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://demo.guru99.com/test/guru99home/");
		chromedriver.manage().window().maximize();
		
		// checking number of total iframes on page.
		int size = chromedriver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		chromedriver.switchTo().frame("a077aa5e");
		
		chromedriver.findElement(By.xpath("html/body/a/img")).click();
		
		System.out.println("--------iFrame clicked-----------");
		chromedriver.close();

	}
}