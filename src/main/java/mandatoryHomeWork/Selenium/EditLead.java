package mandatoryHomeWork.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class EditLead {


	@Test
	public static void editLead() throws InterruptedException {
		String url = "http://leaftaps.com/opentaps/control/login";
		ChromeOptions chrOpt = new ChromeOptions();
		chrOpt.addArguments("--remote-allow-origins=*");
		chrOpt.addArguments("--start-maximized");
		chrOpt.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(chrOpt);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String company = "Gotjob Company";
		String phNo = "9988776655";

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JotheeshKumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muruganantham");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SDET");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("LearnDSA fully");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jotheesh@mail.com");
		WebElement generalSta = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")); 
		new Select(generalSta).selectByValue("NY"); 
		
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("updates@mail.com");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		Thread.sleep(5000);
		
	}

}
