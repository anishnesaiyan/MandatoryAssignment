package assessment_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class GoIbibo_scenario {
	/*
  * 1. Go to https://www.goibibo.com/
	2. Click on the Holidays from the top menu
	3. Choose From and To City
	4. Select Date
	5. Select Default room
	6. On the Filter choose with Flight options
	7. Click Search
	8. On the Budget choose between 20K to Max limit
	9. On the search result choose package for 4N with lowest prices of the
	given filter
	10.Validate the trip is planned for 4 days and Price is displayed as same in
	the before page
	11.On the Coupon section select the lowest
	12.Validate the price is discounted from the actual price
	 * */

	public static void main(String[] args) {
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("----remote-allow-origins=*");
		co.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//1. Go to https://www.goibibo.com
		driver.get("https://www.goibibo.com");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		//2. Click on the Holidays from the top menu
		driver.findElement(By.xpath("//a[normalize-space()='Holidays']")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		//3. Choose From and To City
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Mumbai']")).click();
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		driver.findElement(By.xpath("(//div[contains(text(),'STATE')])[1]")).click();
		//4. Select Date
		
		driver.findElement(By.xpath("//div[@aria-label='Sat Jul 01 2023']")).click();
		//5. Select Default room
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		
		//6. On the Filter choose with Flight options
		driver.findElement(By.xpath("//label[normalize-space()='With Flights']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='APPLY']")).click();
		//7. Click Search
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		//8. On the Budget choose between 20K to Max limit
		WebElement wb= driver.findElement(By.xpath("//div[@class='rightBorder topContainer']//div[3]"));
		Actions a= new Actions(driver);
		a.clickAndHold(wb) .moveByOffset(40, 0).release().build().perform();
		//9. On the search result choose package for 4N with lowest prices of the given filter
		//10.Validate the trip is planned for 4 days and Price is displayed as same in the before page
		//11.On the Coupon section select the lowest
		//12.Validate the price is discounted from the actual price

	}

}
