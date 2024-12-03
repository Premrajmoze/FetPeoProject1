package fitpeoAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fitpeo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.xpath("(//div[@class='satoshi MuiBox-root css-5ty6tm'])[5]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);", "");
		Thread.sleep(3000l);
		boolean bmwchecked = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		System.out.println("Before bmwchecked : " + bmwchecked);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(3000l);
		bmwchecked = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		System.out.println("After bmwchecked : " + bmwchecked);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(3000l);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(3000l);
		
		
	}
    }

