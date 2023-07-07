package mandatoryHomeWork.selenium;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		ChromeDriver dvr = new ChromeDriver(opt);

		dvr.manage().window().maximize();

		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


		dvr.get("https://www.snapdeal.com/");

		WebElement mensfashion = dvr.findElement(By.xpath("(//span[@class='catText'])[1]"));
		mensfashion.click();

		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		dvr.findElement(By.linkText("Sports Shoes")).click();

		// Get the count of the sports shoes
		String count = dvr.findElement(By.xpath("//span[@class= 'category-name category-count']")).getText();
		System.out.println("Count : "+ count);

		dvr.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		dvr.findElement(By.xpath("//span[text()='Sort by:']")).click();

		dvr.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();

		String check = dvr.findElement(By.xpath("//div[@class='sort-selected']")).getText();
		System.out.println(check);

		if (check.contains("Price Low To High")) {
			System.out.println("-----> low to high");
		} else {
			System.out.println("------> not low to high");
		}

		
		dvr.findElement(By.xpath("//input[@name='fromVal']")).clear();

		dvr.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");

		dvr.findElement(By.xpath("//input[@name='toVal']")).clear();

		dvr.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");

		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


		dvr.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();

		String colour = dvr.findElement(By.xpath("//a[text()=' Navy']")).getText();
		if (colour.contains("Navy")) {
			System.out.println("Selected -----> Navy");
		} else {
			System.out.println("Selected -----> not  Navy");
		}

		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement picture = dvr.findElement(By.tagName("picture"));
		Actions act = new Actions(dvr);
		act.moveToElement(picture).perform();

		dvr.findElement(By.xpath("//div[contains(text(),\"Quick View\")]")).click();


		String cost = dvr.findElement(By.xpath("//span[@class='payBlkBig']")).getText();

		String Discountprice = dvr.findElement(By.xpath("//span[@class='percent-desc ']")).getText();

		System.out.println("cost of the shoes : " + " " + cost);

		System.out.println("Discount price of the shoes : "+ Discountprice);

		TakesScreenshot screenShot = (TakesScreenshot) dvr;

		File source = screenShot.getScreenshotAs(OutputType.FILE);

		File outPut = new File("D://output.png");

		FileHandler.copy(source, outPut);

		dvr.findElement(By.xpath("//div[@class='close close1 marR10']")).click();

		dvr.close();

	}

}
