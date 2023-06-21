package mandatoryHomeWork.selenium;

import java.awt.SystemTray;
import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		/* Webdriver initialisation before 3.XX version of selenium
		E:\\Anish_Office\\eclipse_2021_TL\\D_Selenium_Pratice\\src\\test\\resources\\driver\\chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		*/
		
		/* Webdriver initialisation using Webdriver Manager
		Driver downloads here
		ChromeOptions co= new ChromeOptions();
		co.addArguments("----remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		*/
		 
		
			ChromeOptions co= new ChromeOptions();
			co.addArguments("----remote-allow-origins=*");
		//using latest selenium were webdrivermanager is innbuilt in it
			ChromeDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();

		  //Login to Jira
		  driver.get("https:anishnesaiyan.atlassian.net/jira/software/projects/SAM/boards/1");
		  driver.findElement(By.id("username")).sendKeys("11nanish@gmail.com"); 
		  driver.findElement(By.xpath("//span[text()='Continue']")).click(); 
		  Thread.sleep(1000);
		  driver.findElement(By.id("password")).sendKeys("An3sh4e@123"); 
		  driver.findElement(By.xpath("//span[text()='Log in']")).click(); 
		  Thread.sleep(10000); 
		  
		  //To create an issue
		  driver.findElement(By.id("createGlobalItem")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.name("summary")).sendKeys("Sample2");
		  WebElement el= driver.findElement(By.id("assignee-field-label"));
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", el); 
		  driver.findElement(By.xpath("//span[text()='Automatic']")).click();
		  Thread.sleep(2000);
		
		  //Get the number of values in drop down
		  List<WebElement> findElements = driver.findElements(By.xpath("//div [contains (@id, 'react-select-assignee-option')]"));
		  //Generate random index values
		  Random rm= new Random();
		  int randomindex = rm.nextInt(findElements.size()-1);
		  System.out.println(randomindex);
		  driver.findElement(By.id("react-select-assignee-option-"+randomindex)).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(2000);
		  
		  driver.quit();
		 
		 
		  


	}

}
