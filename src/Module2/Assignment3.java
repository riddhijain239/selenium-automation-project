package Module2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		/*
		 * ➤url : https://jqueryui.com/ ➤ Click on Draggable ➤ Drag the “Drag me around”
		 * box another place ➤ Take the Screeshot of that dragged ➤ Suggested method
		 * javascript Executor
		 */
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();

		chromeDriver.get("https://jqueryui.com/draggable/");
		Thread.sleep(3000);
		chromeDriver.switchTo().frame(0);
		WebElement drag = chromeDriver.findElement(By.xpath("//div[@id='draggable']"));

		Actions act = new Actions(chromeDriver);
		act.clickAndHold(drag).moveByOffset(150, 50).release().build().perform();

		TakesScreenshot ts = (TakesScreenshot) chromeDriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\my\\Pictures\\Saved Pictures\\jquery.jpeg");
		FileHandler.copy(src, dest);

	}

}
