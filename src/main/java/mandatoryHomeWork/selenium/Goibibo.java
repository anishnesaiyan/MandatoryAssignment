package mandatoryHomeWork.selenium;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				
				ChromeOptions opt = new ChromeOptions();
				opt.addArguments("--remote-allow-origins=*");
				ChromeDriver driver = new ChromeDriver(opt);
				driver.get("https://www.goibibo.com/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[@role='presentation']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@href='/giholidays/']")).click();
				String mainWindowHandle = driver.getWindowHandle();
				for (String handle : driver.getWindowHandles()) {
					if (!handle.equals(mainWindowHandle)) {
						driver.switchTo().window(handle);
						break;
					}
				}
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='hdsw_inner']//div")).click();

				driver.findElement(By.xpath("//li[text()='Coimbatore']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.xpath("(//div[@class='hdsw_inner']//div)[2]")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.xpath("//div[text()='Kerala']")).click();
				// driver.findElement(By.xpath("//span[@data-cy='departureDate']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.xpath("(//p[text()='21'])[2]")).click();
				driver.findElement(By.xpath("//button[text()='APPLY']")).click();
				driver.findElement(By.xpath("//button[text()='APPLY']")).click();

				driver.findElement(By.id("search_button")).click();
				driver.findElement(By.xpath("//button[text()='SKIP']")).click();

				WebElement slider = driver.findElement(By.xpath("//div[@role='slider']"));
				Actions move = new Actions(driver);
				move.dragAndDropBy(slider, 30, 0).build().perform();
				Actions actions = new Actions(driver);
				actions.clickAndHold(slider).moveByOffset(35, 0).release().build().perform();

	}

}
