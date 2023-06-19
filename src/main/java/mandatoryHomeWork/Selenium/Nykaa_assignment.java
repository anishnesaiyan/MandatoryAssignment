package mandatoryHomeWork.Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Nykaa_assignment {

	@Test
	public void nykaaAddProduct() throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement brands = driver.findElement(By.xpath("//*[text() = 'brands']"));
		actions.moveToElement(brands).perform();
		WebElement searchBox = driver.findElement(By.id("brandSearchBox"));
		searchBox.clear();
		searchBox.sendKeys("L'Oreal Paris");
		driver.findElement(
				By.xpath("//div[@id= 'scroller-container']//div/following-sibling::div/a[text()=\"L'Oreal Paris\"]"))
				.click();
		String verifyTitle = driver.getTitle();
				
		System.out.println(verifyTitle);
		boolean titleContains = verifyTitle.contains("L'Oreal Paris");
		Assert.assertEquals(true, titleContains);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();

	
      driver.findElement(By.xpath("//span[text()='Category']/following::span")).click();
		driver.findElement(By.xpath("(//span[text()='Category']/following::span[text()='Hair Care']/following::div)[3]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Concern')]")).click();
		driver.findElement(By.xpath("//ul[@id='custom-scroll']//div//div//span[text() ='Color Protection']")).click();
		driver.findElement(By.xpath("//*[contains(text(),\"L'Oreal Paris Colour Protect Shampoo\")]")).click();

		String currentWindow = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		for (String winHandle : allHandles) {
			if (!currentWindow.equalsIgnoreCase(winHandle)) {
				driver.switchTo().window(winHandle);
			}
		}

		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		WebElement price = driver.findElement(By.xpath(
				"//h1[contains(text(),\"L'Oreal Paris Colour Protect Shampoo\")]/following-sibling::div/following-sibling::div/div/span[2]"));
		String priceOfProduct = price.getText();
		System.out.println("Product price: "+priceOfProduct);

		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();

		driver.findElement(By.className("cart-count")).click();
		
		String total = driver.findElement(By.xpath("//span[text()='Grand Total']/preceding::span[1]"))
				.getText();

		System.out.println("Total price"+total );

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div/div/div[2]/button/div/div/span[1]")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).isDisplayed();
		String grandTotal = driver.findElement(By.xpath("//p[text()='Price Details']/parent::div/parent::div/p"))
				.getText();
		System.out.println(grandTotal);
		Thread.sleep(4000);
		driver.quit();
	}

}
