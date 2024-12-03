package fitpeoAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fitpeo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.xpath("(//div[@class='satoshi MuiBox-root css-5ty6tm'])[5]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400);", "");
		Thread.sleep(3000l);
		
		WebElement sliderImage = driver.findElement(By.xpath("//input[@type='range']"));
		
		Actions actions = new Actions(driver);
//		actions.moveToElement(sliderImage).clickAndHold().moveByOffset(100, 0).release().build().perform();
//		Thread.sleep(3000l);
//		actions.moveToElement(sliderImage).clickAndHold().moveByOffset(-50, 0).release().build().perform();
		
// OR
		actions.dragAndDropBy(sliderImage, 94,0).build().perform();
		Thread.sleep(4000l);
		
WebElement sendbox = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']"));
			sendbox.click();
			sendbox.clear();
			sendbox.sendKeys("560");
		System.out.println(sendbox.getSize());
		
		
		Thread.sleep(4000l);
		
}
}
