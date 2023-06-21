package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Assignment_2_JIRA_TC {
	/*	Login to JIRA in incognito
		Click on Projects
		Click 'View All projects'
		Enter and invalid Project name and validate the text
		Enter valid project Name
		Click the project
		Collect the list of issues in the board
		Open a new tab and Create a new issues
		Refresh and validate does the board has newly created issue
		Create a bug with blocked by newly created issue
		Change the status as Done for the newly created bug and validate the status in the board
	 * 
	 * */
	
	
	
public static void main(String[] args) throws InterruptedException {
	ChromeOptions cp= new ChromeOptions();
	cp.addArguments("incognito"); 
	//(Opening new tab in incognito mode is open issue in chrome driver)
	cp.addArguments("----remote-allow-origins=*");
	ChromeDriver driver= new ChromeDriver(cp);
	
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	  //1. Login to Jira
	  driver.get("https:anishnesaiyan.atlassian.net/jira/software/projects/SAM/boards/1");
	  driver.findElement(By.id("username")).sendKeys("11nanish@gmail.com"); 
	  driver.findElement(By.xpath("//span[text()='Continue']")).click(); 
	  driver.findElement(By.id("password")).sendKeys("An3sh4e@123"); 
	  driver.findElement(By.xpath("//span[text()='Log in']")).click(); 
	  
	  //2. Click on Projects
	  //3. Click 'View All projects'
	  //4. Enter and invalid Project name and validate the text
		driver.findElement(By.xpath("//span[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='View all projects']")).click();		
		driver.findElement(By.name("search")).sendKeys("invalid");
		driver.findElement(By.xpath("//h4[text()='No projects were found that match your search']")).isDisplayed();
		
		//5.Enter valid project Name
		//6.Click the project
		driver.findElement(By.xpath("//*[@data-test-id=\"searchfield.ui.searchfield-icon.clear-button\"]")).click();
		driver.findElement(By.name("search")).sendKeys("Sample1");
		driver.findElement(By.xpath("//span[text()='Sample1']")).click();

		
		
		//7. Collect the list of issues in the board
		List<WebElement> issueList = driver.findElements(By.xpath("//div[contains (@id,'card-SAM')]"));
		int a=issueList.size();
		System.out.println("No of issues in the board is--->"+a);
		
		//8. Open a new tab and Create a new issues
		//String primaryWindow=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://anishnesaiyan.atlassian.net/jira/software/projects/SAM/boards/1");
		driver.findElement(By.id("createGlobalItem")).click();
		
		//driver.findElement(By.xpath("//*[@id='issue-create.ui.modal.create-form.type-picker.issue-type-select']/div/div[2]/div/span")).click();
		//driver.findElement(By.id("react-select-3-option-0")).click();
		String issueName="Sample3";
		driver.findElement(By.name("summary")).sendKeys(issueName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='"+issueName+"']")).isDisplayed();
		List<WebElement> issueList2 = driver.findElements(By.xpath("//div[contains (@id,'card-SAM')]"));
		
		Assert.assertEquals(issueList2.size(), a+1);
		
		//9. Create a bug with blocked by newly created issue
		
 
		driver.findElement(By.id("createGlobalItem")).click();
		 String bugName="Bug2";
		 driver.findElement(By.xpath("//*[@id='issue-create.ui.modal.create-form.type-picker.issue-type-select']/div/div[2]/div/span")).click();
		 driver.findElement(By.xpath("//div[text()='Bug']")).click();
		 driver.findElement(By.name("summary")).sendKeys(bugName);

		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("issuelinks-field-label")));
		 driver.findElement(By.xpath("//*[@id='issuelinks-container']/div/div/div/div[2]/div/div/div[1]/div[2]/div/span")).click();
		 driver.findElement(By.xpath("//span[text()='SAM-7 "+issueName+"']")).click();
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(2000);
		 WebElement source= driver.findElement(By.xpath("//span[text()='Bug2']"));
		 WebElement target= driver.findElement(By.xpath("(//*[@data-testid='software-board.board-container.board.virtual-board.fast-virtual-list.fast-virtual-list-wrapper'])[3]"));
		 //To drag and drop the bug
		 Actions ac= new Actions(driver);
		 ac.dragAndDrop(source, target).build().perform();
		 
	 
	 driver.quit();
}
}
