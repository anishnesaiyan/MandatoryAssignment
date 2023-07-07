package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MMT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		ChromeDriver dvr = new ChromeDriver(options);
		dvr.manage().window().maximize();

		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		dvr.get("https://www.makemytrip.com/");

		dvr.findElement(By.xpath("//span[@class='chNavText darkGreyText']")).click();

		dvr.findElement(By.xpath("//span[text()='From']")).click();

		dvr.findElement(By.xpath("//ul[@role='listbox']/li[8]")).click();

		dvr.findElement(By.xpath("//span[text()='To']")).click();

		dvr.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();

		dvr.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[3]")).click();

		dvr.findElement(By.xpath("(//div[@class='DayPicker-Week'])[4]/div[2]")).click();

		dvr.findElement(By.xpath("(//div[@class='DayPicker-Week'])[4]/div[2]")).click();

		dvr.findElement(By.xpath("//span[text()='Travellers & Class']")).click();

		dvr.findElement(By.xpath("//ul[@class='guestCounter font12 darkText gbCounter']/li[2]")).click();

		dvr.findElement(By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[2]/li[1]")).click();

		dvr.findElement(By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[3]/li[2]")).click();

		dvr.findElement(By.xpath("//button[text()='APPLY']")).click();

		dvr.findElement(By.xpath("//a[text()='Search']")).click();

		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		dvr.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();

		String searchresult = dvr.findElement(By.xpath("//div[@class='listingRhs']/p")).getText();
		System.out.println("Search results are fetched as" + " " + searchresult);

		dvr.findElement(By.xpath("(//span[text()='View Flight Details'])[1]")).click();

		Boolean flightdetails = dvr.findElement(By.xpath("(//a[text()='FLIGHT DETAILS'])[1]")).isDisplayed();
		System.out.println(flightdetails + "flight details are displayed");

		dvr.findElement(By.xpath("(//span[text()='View Prices'])[1]")).click();

		dvr.findElement(By.xpath("(//div[@class='viewFareBtnCol  ']/div/following-sibling::button)[2]")).click();


		Set<String> allWindows = dvr.getWindowHandles();

		for (String allwindows : allWindows) {
			dvr.switchTo().window(allwindows);
		}

		JavascriptExecutor js = (JavascriptExecutor) dvr;
		js.executeScript("window.scrollBy(0,200)", "");
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		dvr.findElement(By.xpath("//button[text()='+ ADD NEW ADULT']")).click();

		WebElement firstname = dvr.findElement(By.xpath("(//input[@placeholder='First & Middle Name'])[1]"));
		firstname.sendKeys("Priyanka");

		WebElement lastname = dvr.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]"));
		lastname.sendKeys("G");

		WebElement gender = dvr.findElement(By.xpath("(//div[@class='adultItem']/div/div/label[2])[1]"));
		gender.click();

		//

		dvr.findElement(By.xpath("//button[text()='+ ADD NEW INFANT']")).click();

		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement firstname1 = dvr.findElement(By.xpath("(//input[@placeholder='First & Middle Name'])[2]"));
		firstname1.sendKeys("Shalu");

		WebElement lastname1 = dvr.findElement(By.xpath("(//input[@placeholder='Last Name'])[2]"));
		lastname1.sendKeys("A");

		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		dvr.findElement(By.xpath("(//div[@class='adultItem']/div/div/label[2])[2]")).click();

		dvr.findElement(By.xpath("//div[text()='Date']")).click();

		dvr.findElement(By.xpath("//div[@class='dropdown__menu-list css-11unzgr']/div[2]")).click();

		dvr.findElement(By.xpath("//div[text()='Month']")).click();
		dvr.findElement(By.xpath("(//div[@class='dropdown__menu-list css-11unzgr']/div[2]")).click();

		dvr.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys("999999999");

		dvr.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test@gmail.com");

		dvr.findElement(By.xpath("//div[@class='emailIds-dropdown']/div[@class='emailId']")).click();

		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		dvr.findElement(By.xpath("//button[text()='Continue']")).click();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dvr.quit();

	}

}
